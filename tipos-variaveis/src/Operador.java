public class Operador {
    public static void main(String[] args){

        String nome1 = "Felipe";
        String nome2 = new String("Felipe");

        System.out.println(nome1.equals(nome2));

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1==num2;

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = num1>num2;

        System.out.println("numero1 é maior a numero2? " + simNao);

        simNao = num1<num2;

        System.out.println("numero1 é menor a numero2? " + simNao);

        simNao = num1 != num2;

        System.out.println("numero1 é diferente de numero2? " + simNao);

        if (num1 == num2){
            System.out.println("Verdadeira");
        }

    }
}
