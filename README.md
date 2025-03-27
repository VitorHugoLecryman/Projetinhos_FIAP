# 💻 Projetos_FIAP

Hello world 🤖

Seja bem vindo aos meus projetos criados na FIAP.

## 📚 Contéudo
 
Os conteúdos disponíveis:

* Java
```
package br.com.fiap;

import javax.swing.*;

public class MediaAritmeticaJanela {
    public static void main(String[] args) {
        float prova1, prova2, prova3, prova4,media;
        String auxiliar;
        try{
            auxiliar = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
            prova1 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
            prova2 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da terceira prova: ");
            prova3 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da quarta prova: ");
            prova4 = Float.parseFloat(auxiliar);

            media = (prova1+prova2+prova3+prova4)/4;

            JOptionPane.showMessageDialog(null,"Prova 1: "+prova1+ "\nProva 2: "+prova2+ "\nProva 3: "+ prova3+ "\nProva 4: "+prova4+ "\nA sua média serã: " +media);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número incorreto");
        }
    }
}
```

* Python
```

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


```

Python

## 📱 Contato

E-mail para contato: vhsouzatavares@gmail.com
