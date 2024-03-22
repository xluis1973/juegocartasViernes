
package juegocartasviernes;

enum Numero {
    AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7),
    SOTA(10), CABALLO(11), REY(12);
    private final int valor;
    private Numero(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
}

public class Carta {
  
         private final Palo palo;
        private final Numero numero;

        public Carta(Palo palo, Numero numero) {
            this.palo = palo;
            this.numero = numero;
        }

        public Palo getPalo() {
            return palo;
        }

        public Numero getNumero() {
            return numero;
        }

        @Override
        public String toString() {
            return numero + " de " + palo;
        }
    
}
