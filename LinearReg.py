#Author - Snigdha Srivastava
# 21/03/2003
#Implementing the gradient descent algorithm
#----------------------------------------

import math, copy
import numpy as np
import matplotlib.pyplot as plt

#-----------------------------------------------------------------------------
#training data set

# Alternative inputs
#x_train = np.array([1.0, 2.0])   
#y_train = np.array([300.0, 500.0])   

x_train = np.array([1.0, 1.7, 2.0, 2.5, 3.0, 3.2]) #features
y_train = np.array([250, 300, 480,  430,   630, 730,]) #target value


#----------------------------------------------------------------

#Function to calculate the cost (J)
def compute_cost(x, y, w, b):
   
    m = x.shape[0] 
    cost = 0
    
    for i in range(m):
        f_wb = w * x[i] + b
        cost = cost + (f_wb - y[i])**2
    total_cost = 1 / (2 * m) * cost

    return total_cost

#------------------------------------------------------------------
#function to return derivaties of cost function
def compute_gradient(x, y, w, b): 
    
    # Number of training examples
    m = x.shape[0]    
    dj_dw = 0
    dj_db = 0
    
    for i in range(m):  
        f_wb = w * x[i] + b 
        dj_dw_i = (f_wb - y[i]) * x[i] 
        dj_db_i = f_wb - y[i] 
        dj_db += dj_db_i
        dj_dw += dj_dw_i 
    dj_dw = dj_dw / m 
    dj_db = dj_db / m 
        
    return dj_dw, dj_db

#--------------------------------------------------------------------
def gradient_descent(x, y, w_in, b_in, alpha, num_iters, cost_function, gradient_function): 
    
    w = copy.deepcopy(w_in) # avoid modifying global w_in
    # An array to store cost J and w's at each iteration primarily for graphing later
    J_history = []
    p_history = []
    b = b_in
    w = w_in
    
    for i in range(num_iters):
        # Calculate the gradient and update the parameters using gradient_function
        dj_dw, dj_db = gradient_function(x, y, w , b)     

        # Update Parameters
        b = b - alpha * dj_db                            
        w = w - alpha * dj_dw                            

        # Save history cost J at each iteration
        if i<100000:      # prevent resource exhaustion 
            J_history.append( cost_function(x, y, w , b))
            p_history.append([w,b])

        # Print cost every at intervals 10 times or as many iterations if < 10
        if i% math.ceil(num_iters/10) == 0:
            print(f"Iteration {i:4}: Cost: {J_history[-1]:0.2e} ",
                  f"dj_dw: {dj_dw: 0.3e}, dj_db: {dj_db: 0.3e}  ",
                  f"w: {w: 0.3e}, b:{b: 0.5e}")
            print("\n")
 
    return w, b, J_history, p_history #return w and J,w history for graphing

#------------------------------------------------------------------------------------------

#calling all the functions

# initialize parameters
w_init = 0
b_init = 0
# some gradient descent settings
iterations = 10000
tmp_alpha = 1.0e-2
# run gradient descent
w_final, b_final, J_hist, p_hist = gradient_descent(x_train ,y_train, w_init, b_init, tmp_alpha, 
                                                    iterations, compute_cost, compute_gradient)
print("------------------------------------------------------------------------------")
print(f"The final values of (w,b) found by gradient descent: ({w_final:8.4f},{b_final:8.4f})")

#--------------------------------------------------------------------------------------------

# Using the w and b values:

w = w_final
b = b_final


m = len(x_train)

# Plot the data points
plt.scatter(x_train, y_train, marker='x', c='r')
# Set the title
plt.title("Housing Prices")
# Set the y-axis label
plt.ylabel('Price (in Lakhs of Rupees)')
# Set the x-axis label
plt.xlabel('Size (1000 sqft)')


#to find the predicted points
def compute_model_output(x, w, b):
    m = x.shape[0]
    f_wb = np.zeros(m)
    for i in range(m):
        f_wb[i] = w * x[i] + b
        
    return f_wb

predicted_y = compute_model_output(x_train, w, b,)

# Plot our model prediction
plt.plot(x_train, predicted_y, c='b',label='Our Prediction')

# Plot the data points
plt.scatter(x_train, y_train, marker='x', c='r',label='Actual Values')

# Set the title
plt.title("Housing Prices")
# Set the y-axis label
plt.ylabel('Price (in Lakhs of Rupees)')
# Set the x-axis label
plt.xlabel('Size (1000 sqft)')
plt.legend()
plt.show()


#---------------------------------