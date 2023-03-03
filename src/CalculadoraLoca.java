import java.util.Scanner;

class CalculadoraLoca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        String operator;
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Introduce el operador (+, -, *, /): ");
        //EL ERROR SE ENCONTRABA SCANNER.NEXTLINE
        operator = scanner.next();
        double result = calculate(num1, num2, operator);
        System.out.println("Resultado: " + result);

        if (result > 10) {
            System.out.println("El resultado es mayor de 10.");
        } else {
            System.out.println("El resultado es igual o menor de 10.");
        }

        if (result < 0) {
            System.out.println("El resultado es negativo.");
        } else if (result == 0) {
            System.out.println("El resultado es 0.");
        } else {
            System.out.println("El resultado es positivo.");
        }

    }

    public static double calculate(int num1, int num2, String operator) {

        double result = 0;

        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                int[][] biderkatzeTaula = new int[num1][num2];
                int lerroa = 1, zutabea = 1;
                int lerroaIni = 1, zutabeaIni = 1;
                for (int a = 0; a < biderkatzeTaula.length; a++) {
                    for (int b = 0; b < biderkatzeTaula[a].length; b++) {
                        biderkatzeTaula[a][b] = lerroa * zutabea;
                        zutabea = zutabea + 1;

                    }
                    lerroa = lerroa + 1;
                    zutabea = zutabeaIni;


                }

                result = biderkatzeTaula[num1 - 1][num2 - 1];
                break;
            case "/":
                //el contador tiene que empezar en 1
                int zatiketa=1;

                while(num1>num2){
                    num1-=num2;
                    ++zatiketa;
                }

                result = zatiketa;
                break;
            default:
                System.out.println("Operador no válido!");
        }

        return result;

    }


}
