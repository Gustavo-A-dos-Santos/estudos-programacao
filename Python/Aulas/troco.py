notas_calc=[100,50,20,10,5,2]
notas_r = [0,0,0,0,0,0]
mod_calc= [1, 0.5, 0.25, 0.10, 0.05, 0.01]
mod_r = [0,0,0,0,0,0]


valor = float(input("Digite o valor do produto: "))
pago = float(input("Digite o valor pago: "))
if valor > pago:
    print("Valor pago insuficiente falta: ", valor-pago)
    exit(0)
troc =pago-valor

for n in range(6):
    notas_r[n] = int(troc/notas_calc[n])
    troc=troc%notas_calc[n]

for n in range(6):
    mod_r[n] = int(troc/mod_calc[n])
    troc=troc%mod_calc[n]

for n in range(6):
    print(f'{notas_r[n]:.0f} notas de {notas_calc[n]}\n')
for n in range(6):
    print(f'{mod_r[n]:.0f} notas de {mod_calc[n]}\n')

