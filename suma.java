package calculadora;
import java.util.Scanner;
public class suma {
    public static int tipoOperacion(int Operacion2) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Elija el tipo de operación:\n\n1=algebráica   2=trigonométrica");
        Operacion2=sc.nextInt();
        return Operacion2;
    }
    public static Double algebraica(Double algebraica2) {
        System.out.println(algebraica2);
        Scanner sc=new Scanner (System.in);
        int i;
        Double n1,n2;
        System.out.println("Escriba el primer número");
        n1=sc.nextDouble();
        System.out.println("Escriba el segundo número");
        n2=sc.nextDouble();
        System.out.println("Escriba la operación:\n\n1=Suma    2=Resta    3=Multiplicación    4=División");
        i=sc.nextInt(); 
        switch(i){
            case 1:
                algebraica2=n1+n2;
            break;
            case 2:
                algebraica2=n1-n2;
            break;
            case 3:
                algebraica2=n1*n2;
            break;
            case 4:
                if(n2==0) {
                    System.out.println("No se puede dividir entre cero");
                }
                else {
                    algebraica2=n1/n2;
                }
            break;
            default:
                System.out.println("Escriba un número válido");
            break;
        }
        return algebraica2;
    }
    public static Double trigonometrica(Double trigonometrica2) {
        Scanner sc=new Scanner (System.in);
        int i;
        Double n1;
        System.out.println("Escriba un número");
        n1=sc.nextDouble();
        System.out.println("Elija la función:\n\n1=Seno    2=Coseno    3=Tangente  4=Cotangente");
        i=sc.nextInt();
        switch(i){
            case 1:
                trigonometrica2=Math.sin(n1);
            break;
            case 2:
                trigonometrica2=Math.cos(n1);
            break;
            case 3:
                trigonometrica2=Math.tan(n1);
            break;
            case 4:
                trigonometrica2=(Math.cos(n1))/(Math.sin(n1));
            break;
        }
        return trigonometrica2;
    }
    public static void main(String[] args) {
        int Operacion,Operacion1=0;
        Double d,algebraica1=0.0,trigonometrica1=0.0;
        Operacion=tipoOperacion(Operacion1);
        if(Operacion==1) {
            d=algebraica(algebraica1);
            System.out.println("El resultado es:    "+d);
        }
        else {
            if(Operacion==2) {
                d=trigonometrica(trigonometrica1);
                System.out.println("El resultado es:    "+d);
            }
            else {
                System.out.println("Escriba un número válido");
            }
        }
    }
}