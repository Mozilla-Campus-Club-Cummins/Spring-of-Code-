#Issue#23
def NGE(arr):
    n = len(arr)
    l = []
 
    l.append(arr[0])

    for i in range(1, n):
 
        if (len(l)>0):
          
            while (len(l)> 0 and arr[i] > l[-1]):
                print(str(l[-1]) + " -> " + str(arr[i]))
                l.pop()
            l.append(arr[i])
 
        else:
            l.append(arr[i])
 
    while (len(l) > 0):
        print(str(l[-1]) + " -> " + "-1")
        l.pop()



lst = []
n = int(input("Enter number of elements : "))     #Accepting Elements from user
  
for i in range(0, n):
    element = int(input())
    # adding the element
    lst.append(element)  
  
print("\nOriginal Array :",lst,"\n")
#arr = [4, 6, 3, 2, 8, 1, 9, 9, 5]
print("Next Greater Element for Every Element :-")
NGE(lst)
