# 1. Convert from O(n^2) to O(n)
def greatestNumber(array):
    for i in array:
        isIValTheGreatest = True
        for i in array:
            if j > i:
                isIValTheGreatest = False
            if isIValTheGreatest:
                return i
