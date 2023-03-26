
<!--ISSUE #71-->
#    **** DECISION TREE DOCUMENTATION****

## Description:

- The documentation gives u a brief idea about DECISION TREE ALGORIHTM AND ITS IMPLEMENTATION.
- Advantages and Disadvantages
- Real-life examples
- Python implementation of decision tree algorithm


## Documentation

[Documentation](https://linktodocumentation)


## Introduction 
* Decision Tree is a Supervised learning technique that can be used for both classification and Regression problems, but mostly it is preferred for solving Classification problems. It is a tree-structured classifier, where internal nodes represent the features of a dataset, branches represent the decision rules and each leaf node represents the outcome.

* In a Decision tree, there are two nodes, which are the Decision Node and Leaf Node. Decision nodes are used to make any decision and have multiple branches, whereas Leaf nodes are the output of those decisions and do not contain any further branches.

* It is a graphical representation for getting all the possible solutions to a problem/decision based on given conditions.
It is called a decision tree because, similar to a tree, it starts with the root node, which expands on further branches and constructs a tree-like structure.

![image](https://static.javatpoint.com/tutorial/machine-learning/images/decision-tree-classification-algorithm.png)


## Working

Step-1: Begin the tree with the root node, says S, which contains the complete dataset.

Step-2: Find the best attribute in the dataset using Attribute Selection Measure (ASM).

Step-3: Divide the S into subsets that contains possible values for the best attributes.

Step-4: Generate the decision tree node, which contains the best attribute.

Step-5: Recursively make new decision trees using the subsets of the dataset created in step -3. 
Continue this process until a stage is reached where you cannot further classify the nodes and called the final node as a leaf node.

## Real Life Example
Suppose there is a candidate who has a job offer and wants to decide whether he should accept the offer or Not. So, to solve this problem, the decision tree starts with the root node (Salary attribute by ASM). The root node splits further into the next decision node (distance from the office) and one leaf node based on the corresponding labels. The next decision node further gets split into one decision node (Cab facility) and one leaf node. Finally, the decision node splits into two leaf nodes (Accepted offers and Declined offer). Consider the below diagram:

![image](https://static.javatpoint.com/tutorial/machine-learning/images/decision-tree-classification-algorithm2.png)

# Advantages:
1)It is simple to understand as it follows the same process which a human follow while making any decision in real-life.

2)It can be very useful for solving decision-related problems.

3)It helps to think about all the possible outcomes for a problem.

4)There is less requirement of data cleaning compared to other algorithms.

# Disadvantages:
1)The decision tree contains lots of layers, which makes it complex.

2)It may have an overfitting issue, which can be resolved using the Random Forest algorithm.

3)For more class labels, the computational complexity of the decision tree may increase.

# Dataset:
https://drive.google.com/open?id=13nw-uRXPY8XIZQxKRNZ3yYlho-CYm_Qt


 

# Python Implementation of Decision Tree

Importing libraries
```bash

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
%matplotlib inline

dataset = pd.read_csv("D:/Datasets/bill_authentication.csv")
dataset.shape
dataset.head()

X = dataset.drop('Class', axis=1)
y = dataset['Class']
```
Split the data into training and testing sets
```bash
from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.20)
```
Training and Making Predictions
```bash 
from sklearn.tree import DecisionTreeClassifier
classifier = DecisionTreeClassifier()
classifier.fit(X_train, y_train)

y_pred = classifier.predict(X_test)
```
Evaluating the Algorithm

```bash
from sklearn.metrics import classification_report, confusion_matrix
print("Confusion matrix:",confusion_matrix(y_test, y_pred))
print("Classification Report:",classification_report(y_test, y_pred))
```

OUTPUT:

Confusion matrix:

[[142    2]

   [2  129]]

Classification Report:

              precision   recall   f1-score   support

           0       0.99     0.99       0.99       144
           1       0.98     0.98       0.98       131


 avg / total       0.99     0.99       0.99       275
