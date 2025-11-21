package entity;

import java.util.Objects;

public class Departement implements Comparable<Departement> {
    @Override
    public int compareTo(Departement o) {
        return id - o.id;
    }

    private int id;
    private String nomDepartement;
    private int nbrEmp;
    public Departement() {}
    public Departement(int id, String nomDepartement, int nbrEmp) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmp = nbrEmp;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getNbrEmp() {
        return nbrEmp;

    }
    public void setNbrEmp(int nbrEmp) {
        this.nbrEmp = nbrEmp;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Departement that)) return false;
        return id == that.id && nomDepartement.equals( that.nbrEmp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbrEmp=" + nbrEmp +
                '}';
    }
}
