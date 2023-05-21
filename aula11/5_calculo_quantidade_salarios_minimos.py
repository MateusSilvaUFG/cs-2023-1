# Leitura dos dados
salario_minimo = float(input("Digite o valor do salário mínimo: "))
salario_usuario = float(input("Digite o valor do salário do usuário: "))

# Cálculo da quantidade de salários mínimos
quantidade_salarios_minimos = salario_usuario / salario_minimo

# Impressão do resultado
print("O usuário ganha", quantidade_salarios_minimos, "salários mínimos")
