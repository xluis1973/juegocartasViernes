
package juegocartasviernes;


public enum Palo {
    ORO(1,"GOLD"), COPA(10,"CUP"), ESPADA(100,"SPADE"), BASTO(1000,"CLUB");
    private int valor;
    private String english;
    private Palo(int nro, String english){
        this.valor=nro;
        this.english=english;
    }

    public int getValor() {
        return valor;
    }

    public String getEnglish() {
        return english;
    }

   

    
    
    
    
    
}
