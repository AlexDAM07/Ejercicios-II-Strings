import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exercici1();
        exercici2();
        exercici3();
        exercici4();
        exercici5();
    }

    // Exercici 1
    static void exercici1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Diga'm una paraula");
        String frase = input.nextLine();
        System.out.println(frase.length());
    }

    // Exercici 2
    static void exercici2() {
        String cadena = "google.com";
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    // Exercici 3
    static void exercici3() {
        String paraula = "w3resource";
        if (paraula.length() < 2) {
            System.out.println();
        } else {
            String part1 = paraula.substring(0, 2);
            String part2 = paraula.substring(paraula.length() - 2);
            System.out.println(part1 + part2);
        }
    }

    // Exercici 4
    static void exercici4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Diga'm una paraula");
        String paraula = input.nextLine();

        if (paraula.length() < 3) {
            System.out.println(paraula);
            return;
        }

        String ultimTros = paraula.substring(paraula.length() - 3);

        if (ultimTros.equals("ing")) {
            System.out.println(paraula + "ly");
        } else {
            System.out.println(paraula + "ing");
        }
    }

    // Exercici 5
    static void exercici5() {
        String[] paraules = {"gat", "girafa", "gos"};
        String mesLlarga = paraules[0];

        for (int i = 1; i < paraules.length; i++) {
            if (paraules[i].length() > mesLlarga.length()) {
                mesLlarga = paraules[i];
            }
        }

        System.out.println("Paraula més llarga: " + mesLlarga);
        System.out.println("Longitud: " + mesLlarga.length());
    }
}