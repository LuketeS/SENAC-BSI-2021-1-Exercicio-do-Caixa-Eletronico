/*
Crie um algoritmo de caixa eletrônico que dispense o menor número de notas para um dado valor solicitado.

Notas disponíveis:

R$ 100,00 R$ 50,00 R$ 20,00 R$ 10,00 R$ 5,00 R$ 2,00 R$ 1,00

Enviar a resposta via Pull Request!
 */
package aulaheredia;

import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args){
    Scanner leitura1 = new Scanner(System.in);
    System.out.println("Digite o valor para saque: ");
    int saque = leitura1.nextInt();
    int nota100 = 100;
    int nota20= 20;
    int nota50 = 50;
    int nota10 = 10;
    int nota5 = 5;
    int nota2= 2;
    int nota1= 1;

if(nota100>= nota100) {
nota100 = saque / 100;
saque = saque % 100;
if (nota100 != 0)
System.out.println(nota100+ " notas de R$ 100,00");
}

if(nota50>= nota50) {
nota50= saque/ 50;
saque = saque % 50;
if (nota50 != 0)
System.out.println(nota50 + " notas de R$ 50,00");
}

if(nota20 >= nota20) {
nota20 = saque / 20;
saque = saque % 20;
if (nota20 != 0)
System.out.println(nota20 + " notas de R$ 20,00");
}

if(nota10>= nota10) {
nota10 = saque / 10;
saque = saque % 10;
if (nota10 != 0)
System.out.println(nota10+ " notas de R$ 10,00");
}

if(nota5 >= nota5) {
nota5= saque / 5;
saque = saque % 5;
if (nota5 != 0)
System.out.println(nota5 + " notas de R$ 5,00");
}

if(nota2 >= nota2) {
nota2= saque / 2;
saque = saque % 2;
if (nota2!= 0)
System.out.println(nota2 + " notas de R$ 2,00");
}
if(nota1 >= nota1) {
nota1= saque / 1;
saque = saque % 1;
if (nota1!= 0)
System.out.println(nota1 + " notas de R$ 1,00");
}
}
    
    
    
    
    
    
    
    
}
