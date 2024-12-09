# Datos del estudiante
numero_inscripcion = input("Ingrese el número de inscripción: ")
nombre_estudiante = input("Ingrese el nombre del estudiante: ")
patrimonio_estudiante = float(input("Ingrese el patrimonio del estudiante: "))
estrato_social = int(input("Ingrese el estrato social del estudiante: "))

# Pago inicial de matrícula
pago_matricula = 50000

# Comprobar condiciones para aplicar un aumento en el pago de matrícula
if patrimonio_estudiante > 2000000 and estrato_social > 3:
    aumento = 0.03 * patrimonio_estudiante
    pago_matricula += aumento

# Mostrar el resultado
print(f"EL ESTUDIANTE CON NÚMERO DE INSCRIPCIÓN {numero_inscripcion} Y NOMBRE {nombre_estudiante} DEBE PAGAR: ${pago_matricula}")
