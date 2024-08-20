public class relacionais {
    public static void main(String[] args) {
        //para comparar objetos
        String nomeUm = "LUAN";
        String nomeDois = new String("LUAN");
        System.out.println(nomeUm.equals(nomeDois));

        //para comparar numeros
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);
    }
}
