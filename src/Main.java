import entity.Departement;
import entity.Employe;
import services.AffectationHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectationHashMap = new AffectationHashMap();
        affectationHashMap.ajouterEmployeDepartement(new Employe(1,"Ali"),new Departement(1,"RH"));
        affectationHashMap.ajouterEmployeDepartement(new Employe(2,"Asma"),new Departement(1,"RH"));
        affectationHashMap.ajouterEmployeDepartement(new Employe(2,"Asma"),new Departement(1,"RH"));
        affectationHashMap.afficherEmployesEtDepartements();
    }
}