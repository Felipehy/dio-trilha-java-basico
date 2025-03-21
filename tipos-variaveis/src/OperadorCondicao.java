public class OperadorCondicao {
    public static void main(String[] args){
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("as duas condiçoes são verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("uma das duas condiçoes é verdadeiras");
        }

        System.out.println("fim");
    }
}
