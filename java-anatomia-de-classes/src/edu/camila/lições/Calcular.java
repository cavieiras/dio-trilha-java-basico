package edu.camila.lições;

public class Calcular {
    
    public static int add(int a, int b) {
        return a + b;           //neste primeiro public static, eu preciso definir como vai ser a função de soma.
    }

    public static void main(String[] args) {                //aqui em main, eu coloco os valores das variáveis e defino qual é a variável de soma

        int numero1 = 3;
        int numero2 = 88;
        int somar;  // Declare the somar variable with type int

        // Call the add method and assign the result to the somar variable
        somar = add(numero1, numero2);

        // Print the result
        System.out.println(somar);;

}

}
