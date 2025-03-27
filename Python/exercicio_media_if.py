print('--------------------------------')
print('|         Calculo de média     |')
print('--------------------------------')

nome = input('Digite o seu nome: ')

nota1 = float(input('Digite a sua primeira nota: '))

nota2 = float(input('Digite a sua segunda nota: '))

nota3 = float(input('Digite a sua terceira nota: '))

media = (nota1 + nota2 + nota3 )/3


if media >= 9 and media <= 10:
    status = 'Aprovado'
    conceito = 'A'
elif media >= 8 and media < 9:
    status = 'Aprovado'
    conceito = 'B'
elif media >= 7 and media < 8:
    status = 'Aprovado'
    conceito = 'C'
elif media >= 6 and media < 7:
    status = 'Aprovado'
    conceito = 'D'
elif media < 6:
    status = 'Reprovado'
    conceito = 'E'

match conceito:
        case 'A':
            print(f"O aluno:'{nome}. O status do aluno:{status} obtendo a média: {media:.1f}. E o seu atual status: {conceito}")
        case 'B':
            print(f"O aluno:'{nome}. O status do aluno:{status} obtendo a média: {media:.1f}. E o seu atual status: {conceito}")
        case 'C':
            print(f"O aluno:'{nome}. O status do aluno:{status} obtendo a média: {media:.1f}. E o seu atual status: {conceito}")
        case 'D':
            print(f"O aluno:'{nome}. O status do aluno:{status} obtendo a média: {media:.1f}. E o seu atual status: {conceito}")
        case 'E':
            print(f"O aluno:'{nome}. O status do aluno:{status} obtendo a média: {media:.1f}. E o seu atual status: {conceito}")


