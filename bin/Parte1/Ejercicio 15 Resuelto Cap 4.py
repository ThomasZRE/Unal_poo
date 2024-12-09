# pesos
pesoA = float(input("Ingrese el peso de la esfera A: "))
pesoB = float(input("Ingrese el peso de la esfera B: "))
pesoC = float(input("Ingrese el peso de la esfera C: "))
pesoD = float(input("Ingrese el peso de la esfera D: "))

# esfera diferente
if (pesoA == pesoB and pesoA == pesoC):
    if pesoD > pesoA:
        print("La esfera D es la diferente y es de mayor peso.")
    else:
        print("La esfera D es la diferente y es de menor peso.")
elif (pesoA == pesoB and pesoA == pesoD):
    if pesoC > pesoA:
        print("La esfera C es la diferente y es de mayor peso.")
    else:
        print("La esfera C es la diferente y es de menor peso.")
elif (pesoA == pesoC and pesoA == pesoD):
    if pesoB > pesoA:
        print("La esfera B es la diferente y es de mayor peso.")
    else:
        print("La esfera B es la diferente y es de menor peso.")
else:
    if pesoA > pesoB:
        print("La esfera A es la diferente y es de mayor peso.")
    else:
        print("La esfera A es la diferente y es de menor peso.")
