# Datos
pesoA = float(input("Ingrese el peso de la esfera A: "))
pesoB = float(input("Ingrese el peso de la esfera B: "))
pesoC = float(input("Ingrese el peso de la esfera C: "))

# Comparar los pesos
if pesoA > pesoB and pesoA > pesoC:
    print("La esfera A es la de mayor peso.")
elif pesoB > pesoA and pesoB > pesoC:
    print("La esfera B es la de mayor peso.")
else:
    print("La esfera C es la de mayor peso.")
