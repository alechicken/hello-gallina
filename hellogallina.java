import java.util.Vector;
public class hellogallina {
        public static void main(String[] args){
        Vector<String> v = new Vector<String>();
        v.add("A");
        v.add("l");
        v.add("e");
        v.add("s");
        v.add("s");
        v.add("i");
        v.add("o");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        
        System.out.println("Hello Alessio");
        System.out.println("Hello Alessio");
        System.out.println("Hello Alessio");//stampa 3 volte nome
        System.out.println("23 Gennaio 2008");//stampa data di nascita
        System.out.println("Forza Roma");//stampa "Forza Roma"
    }
}