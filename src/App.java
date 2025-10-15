public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero (5 cifras como máximo): "));

        if ((num <= 0) && (num > -10)) {
            System.out.println("El número introducido tiene 1 dígitos.");
        } else if ((num <= -10) && (num > -100)) {
            System.out.println("El número introducido tiene 2 dígitos.");
        } else if ((num <= -100) && (num > -1000)) {
            System.out.println("El número introducido tiene 3 dígitos.");
        } else if ((num <= -1000) && (num > -10000)) {
            System.out.println("El número introducido tiene 4 dígitos.");
        } else if ((num <= -10000) && (num > -100000)) {
            System.out.println("El número introducido tiene 5 dígitos.");
        } else if ((num >= 0) && (num < 10)){
            System.out.println("El número introducido tiene 1 dígitos.");
        } else if ((num >= 10) && (num < 100)) {
            System.out.println("El número introducido tiene 2 dígitos.");
        } else if ((num >= 100) && (num < 1000)) {
            System.out.println("El número introducido tiene 3 dígitos.");
        } else if ((num >= 1000) && (num < 10000)) {
            System.out.println("El número introducido tiene 4 dígitos.");
        } else if ((num >= 10000) && (num < 100000)) {
            System.out.println("El número introducido tiene 5 dígitos.");
        }
    }
}
