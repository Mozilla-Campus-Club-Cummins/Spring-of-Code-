import numpy as np
import matplotlib.pyplot as plt

# plt.style.use('./deeplearning.mplstyle')

# input
x_train = np.array([1.0, 1.7, 2.0, 2.5, 3.0, 3.2])
y_train = np.array(
    [
        250,
        300,
        480,
        430,
        630,
        730,
    ]
)

m = len(x_train)

# Plot the data points
plt.scatter(x_train, y_train, marker="x", c="r")
# Set the title
plt.title("Housing Prices")
# Set the y-axis label
plt.ylabel("Price (in Lakhs of Rupees)")
# Set the x-axis label
plt.xlabel("Size (1000 sqft)")


w = 175
b = 200


# to find the predicted points
def compute_model_output(x, w, b):
    m = x.shape[0]
    f_wb = np.zeros(m)
    for i in range(m):
        f_wb[i] = w * x[i] + b

    return f_wb


predicted_y = compute_model_output(
    x_train,
    w,
    b,
)

# Plot our model prediction
plt.plot(x_train, predicted_y, c="b", label="Prediction")

# Plot the data points
plt.scatter(x_train, y_train, marker="x", c="r", label="Actual Values")

# Set the title
plt.title("Housing Prices")
# Set the y-axis label
plt.ylabel("Price (in Lakhs of rupees)")
# Set the x-axis label
plt.xlabel("Size (1000 sqft)")
plt.legend()
plt.show()
