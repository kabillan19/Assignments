# 1st Qeustion 

import pandas as pd
df = pd.read_csv("aerofit_treadmill.txt")
print("Shape of the DataFrame:")
print(df.shape)
print()
print("Data types of all attributes:")
print(df.dtypes)
print()
print("Summary statistics:")
print(df.describe())
print()
print("Detailed information about the DataFrame:")
print(df.info())

# 2nd Question 

import pandas as pd

file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path)

print("Domain of each attribute:")
for column in df.columns:
    print(f"{column}:")
    print(df[column].value_counts())
    print()

print("Range (unique values) of each attribute:")
for column in df.columns:
    print(f"{column}:")
    print(df[column].unique())
    print()


# 3rd Question

import pandas as pd
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path)
object_columns = df.select_dtypes(include=['object']).columns
df[object_columns] = df[object_columns].astype('category')
int_columns = df.select_dtypes(include=['int']).columns

for column in int_columns:
    if len(df[column].unique()) < len(df):
        df[column] = df[column].astype('category')

print("Columns changed to 'category' datatype:")
print(object_columns)

print("\nColumns changed to 'category' due to low unique values in 'int' datatype:")
print(int_columns)


# 4th Question
import pandas as pd
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path)
null_values = df.isnull().sum()
print("Total null values in each column:")
print(null_values)


# 5th Question 

import pandas as pd
df = pd.read_csv('aerofit_treadmill.txt')
sample = df.sample(n=1, random_state=1)

print("Original sample:")
print(sample)
print()
for column in sample.columns:
    if sample[column].dtype == 'int64' or sample[column].dtype == 'float64':
        sample[column].fillna(sample[column].mean(), inplace=True)
    elif sample[column].dtype == 'category':
        sample[column].fillna(sample[column].mode()[0], inplace=True)
    elif sample[column].dtype == 'object':
        sample[column].fillna('Unknown', inplace=True)

print("Sample after replacing null values:")
print(sample)



# 6th Question

import pandas as pd
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Col5', 'Col6', 'Income', 'Col8']
df.columns = columns
df['Age'] = df['Age'].astype(int)
df['Fitness'] = df['Fitness'].astype(int)
df['Income'] = df['Income'].astype(int)

# 1. Gender Distribution by Age Group
insight1 = pd.crosstab(index=df['Age'], columns=df['Gender'])
print("Gender Distribution by Age Group:")
print(insight1)
print()

# 2. Marital Status Distribution by Age Group
insight2 = pd.crosstab(index=df['Age'], columns=df['Marital_Status'])
print("Marital Status Distribution by Age Group:")
print(insight2)
print()

# 3. Fitness Level Distribution by Age Group
insight3 = pd.crosstab(index=df['Age'], columns=df['Fitness'])
print("Fitness Level Distribution by Age Group:")
print(insight3)
print()

# 4. Income Distribution by Marital Status
insight4 = pd.crosstab(index=df['Marital_Status'], columns=df['Income'])
print("Income Distribution by Marital Status:")
print(insight4)



#7th Question

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Reading data from the text file
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)

# Naming the columns
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Col5', 'Col6', 'Income', 'Col8']
df.columns = columns

# Convert numeric columns to appropriate data types
df['Age'] = df['Age'].astype(int)
df['Fitness'] = df['Fitness'].astype(int)
df['Income'] = df['Income'].astype(int)

# Set the style for the plots
sns.set(style="whitegrid")

# Histogram for Age
plt.figure(figsize=(10, 6))
sns.histplot(df['Age'], bins=20, kde=True, color='blue')
plt.title('Distribution of Age')
plt.xlabel('Age')
plt.ylabel('Frequency')
plt.show()

# Histogram for Fitness Level
plt.figure(figsize=(10, 6))
sns.histplot(df['Fitness'], bins=10, kde=True, color='green')
plt.title('Distribution of Fitness Level')
plt.xlabel('Fitness Level')
plt.ylabel('Frequency')
plt.show()

# Histogram for Income
plt.figure(figsize=(10, 6))
sns.histplot(df['Income'], bins=20, kde=True, color='orange')
plt.title('Distribution of Income')
plt.xlabel('Income')
plt.ylabel('Frequency')
plt.show()

# Since 'Gender' and 'Marital_Status' are categorical variables, we can use countplots
# Countplot for Gender
plt.figure(figsize=(10, 6))
sns.countplot(data=df, x='Gender', palette='Set2')
plt.title('Gender Distribution')
plt.xlabel('Gender')
plt.ylabel('Count')
plt.show()

# Countplot for Marital Status
plt.figure(figsize=(10, 6))
sns.countplot(data=df, x='Marital_Status', palette='Set1')
plt.title('Marital Status Distribution')
plt.xlabel('Marital Status')
plt.ylabel('Count')
plt.show()


#8th Question

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Reading data from the text file
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)

# Naming the columns
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Miles', 'Col6', 'Income', 'Col8']
df.columns = columns

# Convert numeric columns to appropriate data types
df['Age'] = df['Age'].astype(int)
df['Miles'] = df['Miles'].astype(float)
df['Income'] = df['Income'].astype(int)

# Set the style for the plots
sns.set(style="whitegrid")

# Boxplot for Age
plt.figure(figsize=(10, 6))
sns.boxplot(x=df['Age'], color='blue')
plt.title('Boxplot of Age')
plt.xlabel('Age')
plt.show()

# Boxplot for Income
plt.figure(figsize=(10, 6))
sns.boxplot(x=df['Income'], color='orange')
plt.title('Boxplot of Income')
plt.xlabel('Income')
plt.show()

# Boxplot for Miles
plt.figure(figsize=(10, 6))
sns.boxplot(x=df['Miles'], color='green')
plt.title('Boxplot of Miles')
plt.xlabel('Miles')
plt.show()

# Since 'Gender' and 'Marital_Status' are categorical variables, we can use boxplots
# Boxplot for Gender and Age
plt.figure(figsize=(10, 6))
sns.boxplot(data=df, x='Gender', y='Age', palette='Set2')
plt.title('Boxplot of Age by Gender')
plt.xlabel('Gender')
plt.ylabel('Age')
plt.show()

# Boxplot for Marital Status and Income
plt.figure(figsize=(10, 6))
sns.boxplot(data=df, x='Marital_Status', y='Income', palette='Set1')
plt.title('Boxplot of Income by Marital Status')
plt.xlabel('Marital Status')
plt.ylabel('Income')
plt.show()


# 9th Question

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Reading data from the text file
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)

# Naming the columns
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Miles', 'Product', 'Income', 'Col8']
df.columns = columns

# Convert numeric columns to appropriate data types
df['Age'] = df['Age'].astype(int)
df['Miles'] = df['Miles'].astype(float)
df['Income'] = df['Income'].astype(int)

# Set the style for the plots
sns.set(style="whitegrid")

# Boxplot for Product and Miles by Gender
plt.figure(figsize=(12, 8))
sns.boxplot(data=df, x='Product', y='Miles', hue='Gender', palette='Set2')
plt.title('Boxplot of Miles by Product and Gender')
plt.xlabel('Product')
plt.ylabel('Miles')
plt.legend(title='Gender')
plt.show()


# 10th Question

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Reading data from the text file
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)

# Naming the columns
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Miles', 'Product', 'Income', 'Col8']
df.columns = columns

# Convert numeric columns to appropriate data types
df['Age'] = df['Age'].astype(int)
df['Miles'] = df['Miles'].astype(float)
df['Income'] = df['Income'].astype(int)

# Set the style for the plots
sns.set(style="whitegrid")

# Boxplot for Product and Miles by Marital Status
plt.figure(figsize=(12, 8))
sns.boxplot(data=df, x='Product', y='Miles', hue='Marital_Status', palette='Set3')
plt.title('Boxplot of Miles by Product and Marital Status')
plt.xlabel('Product')
plt.ylabel('Miles')
plt.legend(title='Marital Status')
plt.show()


# 11th Question

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Reading data from the text file
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)

# Naming the columns
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Education', 'Product', 'Income', 'Col8']
df.columns = columns

# Set the style for the plots
sns.set(style="whitegrid")

# Countplot for Education
plt.figure(figsize=(10, 6))
sns.countplot(data=df, x='Education', palette='Set2', order=df['Education'].value_counts().index)
plt.title('Countplot of Education Levels')
plt.xlabel('Education Level')
plt.ylabel('Count')
plt.xticks(rotation=45)
plt.show()

"""
### Analysis:

The countplot visualizes the distribution of the 'Education' attribute, providing insights into the education levels of individuals within the dataset.

- **X-axis (Education Level):** Displays the different levels of education, such as 'High School', 'Some College', 'Bachelor's Degree', etc.
- **Y-axis (Count):** Represents the number of individuals belonging to each education category.

From the countplot:

- You can observe the most prevalent education levels among the individuals using the treadmill.
- The countplot allows for a quick comparison of the education distribution, highlighting which education levels are more common in the dataset.
- This visualization can help in understanding the educational background of the users, which might provide insights into their fitness behaviors or preferences.

In summary, the countplot of the 'Education' attribute offers a straightforward and visual representation of the education distribution within the dataset, aiding in understanding the educational profile of the individuals using the treadmill.
"""


# 12th Question

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Reading data from the text file
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)

# Naming the columns
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Education', 'Product', 'Income', 'Col8']
df.columns = columns

# Set the style for the plots
sns.set(style="whitegrid")

# Distplot for Age
plt.figure(figsize=(10, 6))
sns.distplot(df['Age'], bins=30, kde=True, color='blue')
plt.title('Distribution of Age')
plt.xlabel('Age')
plt.ylabel('Frequency')
plt.show()

"""
### Analysis:

The distplot visualizes the distribution of the 'Age' attribute, offering insights into the age distribution of individuals within the dataset.

- **X-axis (Age):** Represents the age values of the individuals.
- **Y-axis (Frequency):** Displays the frequency or density of the age values.

From the distplot:

- The distribution appears to be somewhat right-skewed, with a majority of the individuals falling within a specific age range.
- The peak in the distribution indicates the most common age group among the individuals.
- The KDE (Kernel Density Estimation) curve provides a smoothed representation of the age distribution, highlighting the density of age values.

In summary, the distplot of the 'Age' attribute offers a visual representation of the age distribution within the dataset, aiding in understanding the age profile of the individuals using the treadmill. This visualization can help in targeting specific age groups for fitness programs or promotions.
"""

# 13th Question

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Reading data from the text file
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)

# Naming the columns
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Education', 'Product', 'Income', 'Miles']
df.columns = columns

# Set the style for the plots
sns.set(style="whitegrid")

# Distplot for Miles
plt.figure(figsize=(10, 6))
sns.distplot(df['Miles'], bins=30, kde=True, color='green')
plt.title('Distribution of Miles')
plt.xlabel('Miles')
plt.ylabel('Frequency')
plt.show()

"""
### Analysis:

The distplot visualizes the distribution of the 'Miles' attribute, offering insights into the miles covered by individuals on the treadmill.

- **X-axis (Miles):** Represents the miles values recorded by the individuals.
- **Y-axis (Frequency):** Displays the frequency or density of the miles values.

From the distplot:

- The distribution appears to be somewhat right-skewed, with a majority of the individuals covering a specific range of miles.
- The peak in the distribution indicates the most common range of miles covered by the individuals.
- The KDE (Kernel Density Estimation) curve provides a smoothed representation of the miles distribution, highlighting the density of miles values.

In summary, the distplot of the 'Miles' attribute offers a visual representation of the miles covered by individuals on the treadmill within the dataset. This visualization can help in understanding the average distance individuals are willing to cover, aiding in tailoring fitness programs or promotions related to treadmill usage.
"""


# 14th Question

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Reading data from the text file
file_path = 'aerofit_treadmill.txt'
df = pd.read_csv(file_path, header=None)

# Naming the columns
columns = ['ID', 'Age', 'Gender', 'Fitness', 'Marital_Status', 'Education', 'Product', 'Income', 'Miles']
df.columns = columns

# Set the style for the plots
sns.set(style="whitegrid")

# Distplot for Miles
plt.figure(figsize=(10, 6))
sns.distplot(df['Miles'], bins=30, kde=True, color='green')
plt.title('Distribution of Miles')
plt.xlabel('Miles')
plt.ylabel('Frequency')
plt.show()

"""
### Analysis:

The distplot visualizes the distribution of the 'Miles' attribute, offering insights into the miles covered by individuals on the treadmill.

- **X-axis (Miles):** Represents the miles values recorded by the individuals.
- **Y-axis (Frequency):** Displays the frequency or density of the miles values.

From the distplot:

- The distribution appears to be somewhat right-skewed, with a majority of the individuals covering a specific range of miles.
- The peak in the distribution indicates the most common range of miles covered by the individuals.
- The KDE (Kernel Density Estimation) curve provides a smoothed representation of the miles distribution, highlighting the density of miles values.

In summary, the distplot of the 'Miles' attribute offers a visual representation of the miles covered by individuals on the treadmill within the dataset. This visualization can help in understanding the average distance individuals are willing to cover, aiding in tailoring fitness programs or promotions related to treadmill usage.
"""
