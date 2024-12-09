# Ingresar los datos del trabajador
nombre = input("Ingrese el nombre del trabajador: ")
horas_trabajadas = int(input("Ingrese el número de horas trabajadas: "))
valor_hora = float(input("Ingrese el valor de la hora normal trabajada: "))

# Inicializar las variables
horas_extras = 0  # Horas extras trabajadas
excedente = 0  # Horas extras que exceden de 8
salario = 0  # Salario total

# Calcular horas extras si las horas trabajadas exceden de 40
if horas_trabajadas > 40:
    horas_extras = horas_trabajadas - 40
    if horas_extras > 8:
        excedente = horas_extras - 8
        salario = 40 * valor_hora + 16 * valor_hora + excedente * 3 * valor_hora
    else:
        salario = 40 * valor_hora + horas_extras * 2 * valor_hora
else:
    salario = horas_trabajadas * valor_hora

# Mostrar el resultado
print(f"EL TRABAJADOR {nombre} DEVENGÓ: ${salario}")
