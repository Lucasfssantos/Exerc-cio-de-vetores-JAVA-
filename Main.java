import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        Locale.setDefault(Locale.US);
//        System.out.println("*****************************");
//        System.out.println("*         Exercício 1       *");
//        System.out.println("*****************************");
//
//        System.out.println("Quantos números deseja digitar ?");
//        int q = z.nextInt();
//        int[] num = new int [q];
//        for(int i = 0;i<num.length;i++){
//            System.out.println("Digite um número: ");
//            num[i]=z.nextInt();
//        }
//        System.out.println("Números NEGATIVOS:");
//        for(int i=0;i<num.length;i++){
//            if(num[i]<0){
//                System.out.println(num[i]);
//            }
//        }
//
//        System.out.println("*****************************");
//        System.out.println("*         Exercício 2       *");
//        System.out.println("*****************************");
//
//        System.out.println("Quantos números deseja digitar?");
//        int q = z.nextInt();
//        double num1[] = new double [q];
//        for(int i=0; i<num1.length;i++){
//            System.out.println("Digite um número:");
//            num1[i]=z.nextDouble();
//        }
//        String prov = " ";
//        for(int i=0; i<num1.length;i++){
//            prov+=num1[i] +" ";
//        }
//
//        System.out.println("VALORES = "+ prov);
//
//        double soma=0;
//        for(int i=0;i<num1.length;i++){
//            soma+=num1[i];
//        }
//        System.out.print("SOMA = "+soma);
//
//        double media = soma/num1.length;
//        System.out.print("MÉDIA = "+media);
//
//        System.out.println("*****************************");
//        System.out.println("*         Exercício 3       *");
//        System.out.println("*****************************");
//
//        System.out.println("Quantas pessoas serão digitadas? ");
//        int p = z.nextInt();
//        String [] nome = new String[p];
//        int [] idade = new int[p];
//        double [] altura = new double [p];
//
//        for(int i=0; i<altura.length;i++){
//            System.out.println("Dados da "+(i+1)+"° pessoa:");
//            System.out.print("Nome: ");
//            nome[i]=z.next();
//            System.out.print("idade: ");
//            idade[i]=z.nextInt();
//            System.out.print("altura: ");
//            altura[i]=z.nextDouble();
//        }
//
//        double media1 = 0;
//        for(int i=0;i<altura.length;i++){
//            media1+= altura[i]/ altura.length;
//        }
//        System.out.println("Altura média: "+ media1);
//
//        int temp=0;
//        String temp1 =" ";
//        for(int i=0;i<idade.length;i++){
//            if(idade[i]<16){
//                temp++;
//                System.out.println(nome[i]);
//            }
//        }
//        double porcent = temp * 100/nome.length;
//        System.out.println("Pessoas com menos de 16 anos: "+porcent+"%");
//
//        for(int i=0;i<idade.length;i++){
//            if(idade[i]<16){
//                System.out.println(nome[i]);
//            }
//        }
//
//        System.out.println("*****************************");
//        System.out.println("*         Exercício 4       *");
//        System.out.println("*****************************");
//
//        System.out.print("Quantos numeros deseja digitar? ");
//        int q3 = z.nextInt();
//
//        int num2 [] = new int[q3];
//
//        for(int i=0;i<num2.length;i++){
//            System.out.print("Digite um número: ");
//            num2[i] = z.nextInt();
//        }
//        System.out.println("Números Pares:");
//
//        String temp = " ";
//        int cont=0;
//        for(int i=0;i<num2.length;i++){
//            if(num2[i] % 2 ==0){
//                temp+= num2[i]+" ";
//                cont++;
//            }
//        }
//        System.out.println(temp);
//        System.out.println("Quantidade de Pares  = "+cont);

          System.out.println("*****************************");
          System.out.println("*         Exercício 6       *");
          System.out.println("*****************************");

        System.out.print("Quantos valores vai ter cada vetor? ");
        int q4 = z.nextInt();
        int vetA[] = new int [q4];
        int vetB[] = new int [q4];
        int vetC[] = new int [q4];
        System.out.println("Digite os valores do vetor A: ");
        for(int i=0;i<vetA.length;i++){

            vetA[i]= z.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for(int i=0;i<vetB.length;i++){

            vetB[i]= z.nextInt();
        }
        System.out.println("VETOR RESULTANTE:");

        for(int i=0;i< vetC.length;i++){
            vetC[i] = vetA[i] + vetB[i];
            System.out.println(vetC[i]);
        }

        z.close();
    }
}
