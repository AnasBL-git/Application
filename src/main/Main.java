package main;
import Entites.Employe;
import Entites.SocieteArrayList;
import Interfaces.RechercheAvancee;
import Interfaces.IGestion;
import java.util.List;




public class Main {

    public static void main(String[] args) {
                SocieteArrayList maSociete = new SocieteArrayList();

                Employe e1 = new Employe(3, "Ben Salah", "Ahmed", "RH", 2);
                Employe e2 = new Employe(1, "Trabelsi", "Sonia", "Informatique", 5);
                Employe e3 = new Employe(2, "Mejri", "Ali", "RH", 1);
                Employe e4 = new Employe(4, "Zidi", "Mouna", "Informatique", 3);

                maSociete.ajouterEmploye(e1);
                maSociete.ajouterEmploye(e2);
                maSociete.ajouterEmploye(e3);
                maSociete.ajouterEmploye(e4);

                System.out.println("--- Liste initiale ---");
                maSociete.displayEmploye();

                System.out.println("\n--- Tri par ID ---");
                maSociete.trierEmployeParId();
                maSociete.displayEmploye();

                System.out.println("\n--- Tri par Département / Grade / Nom ---");
                maSociete.trierEmployeParNomDepartementEtGrade();
                maSociete.displayEmploye();

                System.out.println("\n--- Recherche Avancée (Département Informatique) ---");
                List<Employe> infoEmps = maSociete.rechercherParDepartement("Informatique");
                for (Employe e : infoEmps) {
                    System.out.println(e);
                }

                System.out.println("\nRecherche de 'Mejri': " + maSociete.rechercherEmploye("Mejri"));

                maSociete.supprimerEmploye(e1);
                System.out.println("\n--- Après suppression de Ben Salah ---");
                maSociete.displayEmploye();
    }
}

