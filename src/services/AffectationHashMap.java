package services;

import entity.Departement;
import entity.Employe;

import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> employeDepartementMap;
    public AffectationHashMap() {
        employeDepartementMap = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d){
        employeDepartementMap.put(e, d);
    }

    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employe, Departement> entry : employeDepartementMap.entrySet()) {
            System.out.println(entry.getKey()+" affecter à "+entry.getValue()+"\n");
        }
    }
   public void supprimerEmploye (Employe e){
        employeDepartementMap.remove(e);
   }
   public void supprimerEmployeEtDepartement (Employe e, Departement d){
        employeDepartementMap.remove(e,d);
   }
    public void supprimerEmployeEtDepartement1 (Employe e, Departement d){
        for (Map.Entry<Employe, Departement> entry : employeDepartementMap.entrySet()) {
            if (entry.getValue().equals(d) && entry.getKey().equals(e)){
                employeDepartementMap.remove(e);
            }
        }
    }

    public void afficherEmployes(){
        Set<Employe> employeSet = employeDepartementMap.keySet();
       System.out.println(employeSet);
    }
    public void afficherDepartements(){
        Collection<Departement> departementCollection = employeDepartementMap.values();
        System.out.println(departementCollection);
    }
    public boolean rechercherEmploye (Employe e){
        return employeDepartementMap.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d){
        return employeDepartementMap.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap(){
        Comparator<Employe> comparator =new Comparator<Employe>(){
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        };
        TreeMap<Employe, Departement> map = new TreeMap<>(comparator);
        map.putAll(employeDepartementMap);
        return map;
    }
}
