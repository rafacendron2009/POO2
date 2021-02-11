
public class Carta {
   
    private String numeroCarta;
    private String naipeCarta;
    
    public String carta(String nu,String na){
        
        String c = "";
        
        try {
            this.numeroCarta = nu;
            this.naipeCarta = na;
            c = this.numeroCarta + " de " + this.naipeCarta;
            
        }catch(Exception e){
            System.err.println("Parâmetros inválidos!");
            System.exit(0);
        }
        
        return c;
    }
    
}
