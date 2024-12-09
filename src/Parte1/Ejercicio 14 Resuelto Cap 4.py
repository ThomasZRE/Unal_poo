# Datos de entrada
ventas_dpto1 = float(input("Ingrese las ventas del departamento 1: "))
ventas_dpto2 = float(input("Ingrese las ventas del departamento 2: "))
ventas_dpto3 = float(input("Ingrese las ventas del departamento 3: "))

salario_dpto1 = float(input("Ingrese el salario de los vendedores del departamento 1: "))
salario_dpto2 = float(input("Ingrese el salario de los vendedores del departamento 2: "))
salario_dpto3 = float(input("Ingrese el salario de los vendedores del departamento 3: "))

# ventas totales
ventas_totales = ventas_dpto1 + ventas_dpto2 + ventas_dpto3

# salario final para cada departamento
# Departamento 1
if ventas_dpto1 > 0.33 * ventas_totales:
    salario_final_dpto1 = salario_dpto1 + 0.20 * salario_dpto1
else:
    salario_final_dpto1 = salario_dpto1

# Departamento 2
if ventas_dpto2 > 0.33 * ventas_totales:
    salario_final_dpto2 = salario_dpto2 + 0.20 * salario_dpto2
else:
    salario_final_dpto2 = salario_dpto2

# Departamento 3
if ventas_dpto3 > 0.33 * ventas_totales:
    salario_final_dpto3 = salario_dpto3 + 0.20 * salario_dpto3
else:
    salario_final_dpto3 = salario_dpto3


print(f"Salario final del departamento 1: ${salario_final_dpto1:.2f}")
print(f"Salario final del departamento 2: ${salario_final_dpto2:.2f}")
print(f"Salario final del departamento 3: ${salario_final_dpto3:.2f}")
