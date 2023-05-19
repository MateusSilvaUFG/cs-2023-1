# Leitura dos dados
ipi = float(input("Digite a porcentagem do IPI a ser acrescido: "))
codigo_peca1 = input("Digite o código da peça 1: ")
valor_unitario1 = float(input("Digite o valor unitário da peça 1: "))
quantidade1 = int(input("Digite a quantidade de peças 1: "))
codigo_peca2 = input("Digite o código da peça 2: ")
valor_unitario2 = float(input("Digite o valor unitário da peça 2: "))
quantidade2 = int(input("Digite a quantidade de peças 2: "))

# Cálculo do valor total a ser pago
valor_total = (valor_unitario1 * quantidade1 + valor_unitario2 * quantidade2) * (ipi / 100 + 1)

# Impressão do resultado
print("Valor total a ser pago:", valor_total)
