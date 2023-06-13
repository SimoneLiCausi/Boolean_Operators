package Boolean_Operators;

public class Exercise {
    public static void main(String[] args) {
        boolean a = 2 <= 2 && !true;
        //[A] si legge: 2 è minore o uguale a 2 E non è vero.
        // Quindi [A] attualmente è FALSO && FALSO, per far funzionare &&, dovrebbe essere VERO E VERO, quindi:
        // [A] 2 == 2 && !false (oppure poteva essere utilizzato sempicemente il true)

        // ----------------------------------------------------------------------------------------------


        boolean b = !false && 3 > 2;
        //[B] si legge: Non è falso E 3 è maggiore di 2.
        // In questo caso invece [B] è NON FALSO && VERO, quindi dovrebbe funzionare normalmente.


        // ----------------------------------------------------------------------------------------------

        boolean t = false;
        boolean f = true;
        boolean c = !(!t || f);
        //[C] si legge: Negazione(non è falso o è vero), quindi è falso o non è vero.
        // Per renderlo più comprensibile cambiamo i nomi delle variabili.
        // canPlay = false;
        // canRun = true;
        // !(!canPlay || canRun)  ---> Si nega tutto ciò che c'è all'interno delle parentesi e lo leggo così:
        // NON(NON è falso OR vero) --> vero OR NON è vero --> vero OR falso.


        // ----------------------------------------------------------------------------------------------


        boolean d = 6 > 6 ^ !(true && true);
        //[D] si legge: 6 è maggiore di 6 O ESCLUSIVAMENTE non è vero E non è vero.

    }
}
