public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("new status -> TV Ligada ? " + smartTv.ligada);

        smartTv.AumentarVolume();
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("Canal Atual ? " + smartTv.canal);
    }
}
