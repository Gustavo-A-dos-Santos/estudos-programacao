valor = float(input("Digite o valor do produto: "))*100
pagamento = float(input("Digite o valor do pagamento: "))*100

troco = pagamento - valor

reais = int(troco/100)
centavos = troco%100

#Notas
n_100=int(reais/100)
reais=reais%100
n_50=int(reais/50)
reais=reais%50
n_20=int(reais/20)
reais=reais%20
n_10=int(reais/10)
reais=reais%10
n_5=int(reais/5)
reais=reais%5
n_2=int(reais/2)
reais=reais%2

#Moedas
m_50=int(centavos/50)
centavos=centavos%50
m_25=int(centavos/25)
centavos=centavos%25
m_10=int(centavos/10)
centavos=centavos%10
m_5=int(centavos/5)
centavos=centavos%5
m_2=int(centavos/2)
centavos=centavos%2

print(f"O troco é igual a {n_100} notas de 100, {n_50} notas de 50, {n_20} notas de 20, {n_10} notas de 10, {n_5} notas de 5, {n_2} notas de 2, {reais} moedas de 1, {m_50} moedas de 50, {m_25} moedas de 25, {m_10} moedas de 10, {m_5} moedas de 5, {centavos} moedas de 1")
