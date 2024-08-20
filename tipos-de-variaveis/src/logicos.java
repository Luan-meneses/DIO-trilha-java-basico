public class logicos {
    public static void main(String[] args) {
        boolean condicao1=true;

        boolean condicao2=false;
        //E as duas condicoes tem que ser verdadeira
        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }
        //OU uma ou outra deve ser verdadeira
        if(condicao1 || condicao2){
            System.out.println("Uma das condicoes e verdadeira");
        }
        System.out.println("fiim");
    }
}
