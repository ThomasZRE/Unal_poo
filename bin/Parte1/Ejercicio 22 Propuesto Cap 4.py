# Datos
nombre = input("Ingrese el nombre del empleado: ")
salario_hora = float(input("Ingrese el salario básico por hora: "))
horas_trabajadas = int(input("Ingrese el número de horas trabajadas en el mes: "))

# salario mensual
salario_mensual = salario_hora * horas_trabajadas

if salario_mensual > 450000:
    print(f"Nombre: {nombre}, Salario Mensual: ${salario_mensual:.2f}")
else:
    print(f"Nombre: {nombre}")
