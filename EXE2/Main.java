
public class Main {
    
    public static void main(String[] args) {

        Baralho baralho = new Baralho();
        String carta = baralho.gerarCarta();
        int numCartas = baralho.getNumCartas();
        
        System.out.println(carta);
        
        if (numCartas != 0 ){
            System.out.println("O baralho tem " + numCartas + " Cartas");
        }else {
            System.out.print("Não foi possível gerar a carta!");
        }
        
        baralho.ListarCartas(); 
        
    }
        
}
