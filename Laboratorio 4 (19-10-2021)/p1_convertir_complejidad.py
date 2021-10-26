# 1. Convert from O(n^2) to O(n)
def greatestNumber(array):
    for i in array:
        isIValTheGreatest = True
        for i in array:
            if j > i:
                isIValTheGreatest = False
            if isIValTheGreatest:
                return i
            
# Conversión de función O(n^2) to O(n) 
def greatestNumber(array):
    greatest = array[0]
    for i in range(len(array)-1):
        if array[i] > greatest:
            greatest = array[i]
    return greatest
