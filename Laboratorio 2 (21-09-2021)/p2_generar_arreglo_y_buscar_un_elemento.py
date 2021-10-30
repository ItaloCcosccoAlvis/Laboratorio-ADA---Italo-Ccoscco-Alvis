# Problema 2

# Generar una arreglo invertido de n números y después buscar un elemento
def generateList(size):
    return list(range(size,0,-1))

def searchInvertArray(array, element):
    for i in range(0,len(array)):
        if array[i] == element:
            return True
    return False

# Casos de prueba
test1 = generateList(18)
test2 = generateList(89)

print(searchInvertArray(test1,78))
print(searchInvertArray(test2,15))