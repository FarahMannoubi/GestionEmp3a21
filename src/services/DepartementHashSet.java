package services;

import entity.Departement;
import interfaces.IDepartement;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;
    public DepartementHashSet() {
        departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);

    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : departements) {
            if(departement.getNomDepartement().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
    departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(departements);

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> departementsTree = new TreeSet<>(departements);
        return departementsTree;
    }


    public TreeSet<Departement> trierDepartementByNomDepartementByComparator() {
        Comparator<Departement> comparator = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        };
        TreeSet<Departement> departementsTree = new TreeSet<>(comparator);
        departementsTree.addAll(departements);
        return departementsTree;
    }
}
