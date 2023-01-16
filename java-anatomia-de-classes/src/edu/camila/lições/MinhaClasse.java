package edu.camila.lições;
public class MinhaClasse {
    
public static void main(String [] args) {

   String primeiroNome = "Camila";
   String segundoNome = "Silva";

   String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
   System.out.print(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método" + " " + primeiroNome.concat(" ").concat(segundoNome);

}

}
