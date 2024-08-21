public class SmartTV {
   boolean ligada = true;
   int canal = 1;
   int volume = 19;

   public void ligar(){
    ligada=true;
   }
   public void desligar(){
    ligada=false;
   }
   public void AumentarVolume () {
    volume++;
   }
   public void AbaixarVolume (){
    volume--;
   }

   public void aumentarCanal (){
    canal++;
   }
   public void diminuirCanal(){
    canal--;
   }
   public void mudarCanal (int novoCanal){
    canal = novoCanal;
   }
}
