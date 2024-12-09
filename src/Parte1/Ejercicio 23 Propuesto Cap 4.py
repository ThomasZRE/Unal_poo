import math

# Datos
A = float(input("Ingrese el coeficiente A: "))
B = float(input("Ingrese el coeficiente B: "))
C = float(input("Ingrese el coeficiente C: "))

# Calcular el discriminante
discriminante = B**2 - 4 * A * C

if discriminante > 0:
    x1 = (-B + math.sqrt(discriminante)) / (2 * A)
    x2 = (-B - math.sqrt(discriminante)) / (2 * A)
    print(f"Las soluciones son x1 = {x1} y x2 = {x2}")
elif discriminante == 0:
    x = -B / (2 * A)
    print(f"La solución única es x = {x}")
else:
    print("No hay soluciones reales.")
