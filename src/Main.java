public class Main {
    public static void main(String[] args) {

        switchSemana();
        switchNumero();

    }
    
    private static void switchSemana(){

        String dia = "Terça";

        switch (dia){

            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido!\n");
        }

    }
        
    private static void switchNumero() {
    
        int numero = 4;

         switch (numero){

            case 1:
            case 2:
            case 3: 
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido!\n");
                break;
        }
    }
}