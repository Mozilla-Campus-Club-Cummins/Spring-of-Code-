# Issue No : 20 
# Issue Name : Spam Detection
# By : Rasika Kanitkar



#Spam dataset link:
#https://www.kaggle.com/datasets/uciml/sms-spam-collection-dataset


# Using Multinomial Naive Bayes(The classifier which uses a multinomial distribution for each of its features) to predict the spam or not spam

#importing necessary Libraries and classes
import pandas as pd
import numpy as np
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import MultinomialNB
from sklearn.metrics import accuracy_score, precision_score, recall_score, f1_score




#loading the spam.csv file into a dataframe and giving the necessary attributes(giving text category as latin-1)
spam_data= pd.read_csv('/content/spam.csv', encoding='latin-1')





# Preprocessing the data


#dropping the unnecessary columns
spam_data = spam_data.drop(['Unnamed: 2', 'Unnamed: 3', 'Unnamed: 4'], axis=1)
# Renaming for our use or ease
spam_data = spam_data.rename(columns={'v1': 'Category', 'v2': 'User_Text'})
#labelling the spam with 1 and not-spam(ham) with 0
spam_data['Category'] = np.where(spam_data['Category']=='spam', 1, 0)





# Extracting the features
vectorizer_of_model = CountVectorizer(stop_words='english')
X= vectorizer_of_model.fit_transform(spam_data['User_Text'])
Y = spam_data['Category']




# Splitting the data into training and testing datasets
X_train, X_test, y_train, y_test = train_test_split(X, Y, test_size=0.2, random_state=42)





# Training the model, Here naive bayes algorithm is used
model = MultinomialNB()
model.fit(X_train, y_train)





# Making Predictions for Testing dataset
y_pred = model.predict(X_test)





# Checking the performance of the model using below things
accuracy_of_model = accuracy_score(y_test, y_pred)
precision_of_model = precision_score(y_test, y_pred)
f1_model= f1_score(y_test, y_pred)
recall_of_model = recall_score(y_test, y_pred)





print('Accuracy of Model   :', accuracy_of_model)
print('Precision of Model  :', precision_of_model)
print('F1-score of Model   :', f1_model)
print('Recall of Model     :', recall_of_model)




print("\n--------------Testing the model with user inputs now-------------\n")
n=1

while(n!=0):
  # Testing the model with user Inputs now
  input_mail= input("\nKindly Enter a mail to classify as spam or not-spam : ")

  # Preprocessing the input message by bringing to necessary format
  input_mail = [input_mail]
  input_mail = vectorizer_of_model.transform(input_mail)

  # making prediction of user input
  prediction_of_model = model.predict(input_mail)[0]

  # Printing the prediction
  if prediction_of_model == 1:
      print("The Email is classified as spam.")
  else:
      print("The Email is classified as not-spam(ham).")
  n=int(input("\nDo you want to continue to take inputs for classifying spam or not-spam(put 1-yes, 0 - No)\n"))

