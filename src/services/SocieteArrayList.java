package services;

import entity.Employe;
import entity.TriEmpParGrade;
import entity.TriEmpParNomDep;
import interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes;
    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
        this.employes.add(employe);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    public boolean rechercherEmployefori(String nom) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);

    }

    @Override
    public void displayEmploye() {
        System.out.println(employes);

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
       Collections.sort(employes,new TriEmpParNomDep().thenComparing(new TriEmpParGrade()));

    }
}
