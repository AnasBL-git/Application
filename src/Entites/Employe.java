package Entites;

public class Employe {

    int id;
    String nom;
    String prenom;
    String nomDept;
    int grade;
    public Employe(int id, String nom, String prenom, String nomDept, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDept = nomDept;
        this.grade = grade;
    }
    public Employe() {}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public String getNomDept() {return nomDept;}
    public void setNomDept(String nomDept) {this.nomDept = nomDept;}
    public  int getGrade() {return grade;}
    public void setGrade(int grade) {this.grade = grade;}

    @Override
    public String toString() {
        return id+" "+nom+" "+prenom+" "+nomDept+" "+grade;
    }


}
