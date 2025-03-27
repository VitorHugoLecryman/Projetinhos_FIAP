print('--------------------------------')
print('|         Calculo de média     |')
print('--------------------------------')

nome = input('Digite o seu nome: ')

nota1 = int(input('Digite a sua primeira nota: '))

nota2 = int(input('Digite a sua segunda nota: '))

nota3 = int(input('Digite a sua terceira nota: '))

media = (nota1 + nota2 + nota3 )/3


match media:
    case 9|10:
        print(f"O aluno:'{nome}. Foi aprovado obtendo a média: {media}. E o seu atual status é: A")
    case 8:
        print(f"O aluno:'{nome}. Foi aprovado obtendo a média: {media}. E o seu atual status é: B")
    case 7:
        print(f"O aluno:'{nome}. Foi aprovado obtendo a média: {media}. E o seu atual status é: C")
    case 6:
        print(f"O aluno:'{nome}. Foi aprovado obtendo a média: {media}. E o seu atual status é: D")
    case 1|2|3|4|5:
        print(f"O aluno:'{nome}. Não foi aprovado obtendo a média: {media}. E o seu atual status é: E")


