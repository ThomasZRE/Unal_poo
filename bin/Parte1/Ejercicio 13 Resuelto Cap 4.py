# Preguntar al usuario el valor total de la compra
valor_compra = float(input("Ingrese el valor total de la compra: "))

# Preguntar al usuario el color de la bolita
color_bolita = input("Ingrese el color de la bolita (blanca, verde, amarilla, azul, roja): ").lower()

# Calcular el descuento según el color de la bolita
if color_bolita == "blanca":
    descuento = 0
elif color_bolita == "verde":
    descuento = 0.10 * valor_compra
elif color_bolita == "amarilla":
    descuento = 0.25 * valor_compra
elif color_bolita == "azul":
    descuento = 0.50 * valor_compra
elif color_bolita == "roja":
    descuento = valor_compra  
else:
    print("Color de bolita no válido. Asegúrese de elegir entre los colores mencionados.")
    exit()  # Salir del programa si el color no es válido

# total a pagar después del descuento
total_pagar = valor_compra - descuento
print(f"Total a pagar después del descuento: ${total_pagar:.2f}")
