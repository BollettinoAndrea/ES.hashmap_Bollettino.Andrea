import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        HashMap<Targa,Proprietario> targaProprietario = new HashMap<Targa,Proprietario>();
        for (int i=0; i<3; i++){
            System.out.println("Inserisci Targa: ");
            Targa t = new Targa(in.nextLine().trim());
            System.out.println("Inserisci Nome, Cognome, Codice Fiscale");
            Proprietario p=new Proprietario(in.nextLine().trim(),in.nextLine().trim(),in.nextLine().trim());
            targaProprietario.put(t,p);
        }
        System.out.println(targaProprietario);

        System.out.println("Inserisci Targa: ");
        Targa t = new Targa(in.nextLine().trim());
        Proprietario precedente = targaProprietario.get(t);

        System.out.println("Inserisci Nome, Cognome, Codice Fiscale");
        Proprietario p = new Proprietario(in.nextLine().trim(),in.nextLine().trim(),in.nextLine().trim());
        targaProprietario.put(t,p);
        System.out.println(targaProprietario);
    }
}