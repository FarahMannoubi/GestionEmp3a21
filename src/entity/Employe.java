package entity;

import java.io.Serializable;
import java.util.Objects;

public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    private String prenom;
    private String nomDep;
    private int grade;

    public Employe() {}
    public Employe(int id ,String nom, String prenom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }
    public Employe(int id ,String nom) {
        this.id = id;
        this.nom = nom;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    public boolean equals(Object object){
        if (object == this)
            return true;
        if(object==null)
            return false;
        if(object instanceof Employe employe){
            return employe.getId()==this.getId()&&employe.nom.equals(this.nom);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDep='" + nomDep + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
        return this.id-o.id;
    }
}
