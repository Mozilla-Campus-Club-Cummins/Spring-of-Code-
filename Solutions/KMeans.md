<h1>K-means </h1>

<h2>Definitions:</h2> 
K-means algorithm is a clustering algorithm used to group similar data points together into k number of clusters. It is an unsupervised learning algorithm, which means that it does not require labeled data to perform clustering. The algorithm aims to group a given set of data points into K clusters, where each data point belongs to the cluster with the nearest mean.


<hr>

![K-Means-Clustering](https://user-images.githubusercontent.com/95756364/227706221-f3dd3f0a-255b-4df6-9e10-f8c41ed798ef.png)


<h2> Advantages</h2>!

K-means is simple and computationally efficient, making it easy to implement on large datasets.

It is a fast and scalable algorithm that can handle large datasets with ease.

It works well on data that is well separated or with distinct clusters.

The results of the algorithm are easy to interpret and visualize.

The algorithm can be used for a wide range of applications, including image segmentation, document clustering, and customer segmentation



<h2>Disadvantages:</h2>

The algorithm is sensitive to the initial placement of centroids, which can lead to suboptimal solutions.

K-means assumes that clusters are spherical, equally sized, and have similar densities, which is not always true in real-world scenarios.

It is challenging to determine the optimal number of clusters K for a given dataset.

K-means can converge to local optima, meaning that it may not find the global optimal solution.

It can struggle with non-linearly separable data or data with overlapping clusters.

K-means is not suitable for categorical data or data with missing values.


<h2>Real-life Example </h2>

Image segmentation: K-means algorithm can be used to segment images into different regions based on the color and texture features of the image.

Customer segmentation: K-means algorithm can be used to segment customers into different groups based on their behavior, preferences, and demographics.

Anomaly detection: K-means algorithm can be used to detect anomalies or outliers in a dataset.

Clustering of social networks: K-means algorithm can be used to cluster social network users based on their interests and behavior.

Recommender systems: K-means algorithm can be used to cluster users based on their preferences and recommend items that are similar to their interests.

Natural language processing: K-means algorithm can be used to cluster text documents based on their content and topics.

Bioinformatics: K-means algorithm can be used to cluster genes or proteins based on their expression profiles.

Stock market analysis: K-means algorithm can be used to cluster stocks based on their price and volatility.

Generalised Python code for the algorithm:

<h2>Algorithm: </h2>

Randomly initialize k number of centroids.

Assign each data point to the nearest centroid.

Recalculate the centroids as the mean of all the data points in the corresponding cluster.

Repeat steps 2 and 3 until convergence, which is typically determined by a maximum number of iterations or when the centroids no longer change significantly.

<h2>Code:</h2>


    import numpy as np
  
    import matplotlib.pyplot as plt
  
    from sklearn.datasets import make_blobs

    class KMeans:
  
      def __init__(self, n_clusters=8, max_iter=300):
          self.n_clusters = n_clusters
          self.max_iter = max_iter

      def fit(self, X):
          self.centroids = X[np.random.choice(len(X), self.n_clusters, replace=False)]

          for i in range(self.max_iter):
              clusters = [[] for _ in range(self.n_clusters)]
              for x in X:
                  distances = [np.linalg.norm(x - c) for c in self.centroids]
                  cluster = np.argmin(distances)
                  clusters[cluster].append(x)

              prev_centroids = self.centroids.copy()
              for j, cluster in enumerate(clusters):
                  if len(cluster) != 0:
                      self.centroids[j] = np.mean(cluster, axis=0)

              if np.array_equal(prev_centroids, self.centroids):
                  break

      def predict(self, X):
          return [np.argmin([np.linalg.norm(x - c) for c in self.centroids]) for x in X]



    X, y = make_blobs(n_samples=300, centers=4, cluster_std=0.60, random_state=0)

    kmeans = KMeans(n_clusters=4)
    kmeans.fit(X)

    y_pred = kmeans.predict(X)

    plt.scatter(X[:, 0], X[:, 1], c=y_pred)
    plt.scatter(kmeans.centroids[:, 0], kmeans.centroids[:, 1], c='red', marker='x', s=200)
    plt.show()

