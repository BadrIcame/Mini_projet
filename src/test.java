import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

public class test {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employe> employes = new ArrayList<>();

    public static void main(String[] args) {
        Employe.menu();
        System.out.println("donner votre choix");
        int choix = sc.nextInt();

        while(choix < 1 || choix > 9){
            Employe.menu();
            System.out.println("Saisir à nouveau votre choix qui doit être entre 1 et 9: ");
            choix = sc.nextInt();
        }
        while (choix>=1 && choix<=9){
            switch (choix){
                case 1:
                    ajouterEmploye();
                    Employe.menu();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

                case 2 :
                    modifierunEmploye();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

                case 3 :
                    supprimerunEmploye();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

                case 4 :
                    afficherunEmploye();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

                case 5 :
                    affichertouslesEmployes();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

                case 6 :
                    afficherSalaire();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

                case 7 :
                    maxAge();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

                case 8 :
                    minAge();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

                case 9 :
                    quitter();
                    System.out.println("donnez votre choix ");
                    choix = sc.nextInt();
                    break;

            }
        }
    }
    static void ajouterEmploye(){
        System.out.println("Entrez le matricule: ");
        int matricule = sc.nextInt();
        System.out.println("Entrez le nom: ");
        String nom = sc.next();
        System.out.print("Entrer le prenom :");
        String prenom = sc.next();
        System.out.print("Entrer l'age :");
        int age = sc.nextInt();
        System.out.print("Entrer le salaire :");
        double salaire = sc.nextDouble();
        Employe e = new Employe(matricule, nom, prenom, age, salaire);
        employes.add(e);
    }

    static void modifierunEmploye(){
        System.out.println("Entrez le matricule d'employe pour le modifier: ");
        int matricule = sc.nextInt();
        boolean exist = false;
        int i=0 ;
        int ind = 1;
        for (Employe e: employes){

            if (e.getMatricule()==matricule){
                ++i;
                exist = true;
                ind = i;
            }
        }
        if (exist){
            System.out.println("Modification: ");
            System.out.println("Entrez le matricule: ");
            matricule= sc.nextInt();
            System.out.println("Entrez le nom");
            String nom = sc.next();
            System.out.print("Enter le prenom :");
            String prenom=sc.next();
            System.out.print("Entrer l'age :");
            int age=sc.nextInt();
            System.out.print("Entre le salaire :");
            double salaire=sc.nextDouble();
            Employe e = new Employe(matricule,nom,prenom,age,salaire);
            employes.set(ind, e);
        }
        else {
            System.out.println("Employe introuvable!!");
        }


    }

    static void supprimerunEmploye(){
        if (employes.isEmpty()){
            System.out.println("La base de données est vide: ");
        }else{
            System.out.println("Saisir le matricule d'employé que vous voulez supprimer:");
            int matricule = sc.nextInt();

            for (int i = 0; i < employes.size(); i++ ){
                if (matricule == employes.get(i).getMatricule()){
                    employes.remove(i);
                    System.out.println("Employé supprimé avec succés");
                    System.out.println("\n");
                }else {
                    System.out.println("Matricule introuvable!!");
                    System.out.println("\n");
                }
            }
        }

    }

    static void afficherunEmploye(){
        if (employes.isEmpty()){
            System.out.println("la base de données est vide:");
        }else {
        System.out.println("Entrer le matricule d'employe que vous voulez afficher:");
        int matricule = sc.nextInt();
        int i = 0;
        for(Employe e: employes){
            i++;
            if (e.getMatricule()==matricule){
                System.out.println("le matricule est " +e.getMatricule()+ " le Nom est " +e.getNom()+ " le prenom est " +e.getPrenom()+ " l'age est " +e.getAge()+ " le salaire est  " +e.getSalaire());
            }else {
                System.out.println("Employé introuvable:");
            }
        }
        }
    }

    static void affichertouslesEmployes(){
        if (employes.isEmpty()){
            System.out.println("La base de données est vide:");
        }else {
            System.out.println(employes);
        }
    }

    static void afficherSalaire(){
        int nb = 0;
        if (employes.isEmpty()){
            System.out.println("La base de données est vide!");
        }else {
            for (int i = 0; i<employes.size(); i++){
                if (employes.get(i).getSalaire() > 10000){
                    nb += 1;
                }
            }
            System.out.println("Le nombre des employés ayant un salaire qui dépasse 10000 est:" + nb + "\n");
        }
    }

    static void maxAge(){
        int max = 0;
        if (employes.isEmpty()){
            System.out.println("La base de données est vide: ");
        }else {
            for (int i=0; i<employes.size(); i++){
                if (employes.get(i).getAge()>max){
                    max = employes.get(i).getAge();

                }


            }
            System.out.println("L'employé le plus âgé a " + max + " ans");
        }
    }

    static void minAge(){
        int min = 100;
        if (employes.isEmpty()){
            System.out.println("La base de données est vide: ");
        }else {
            for (int i=0; i<employes.size(); i++){
                if (employes.get(i).getAge()<min){
                    min = employes.get(i).getAge();

                }


            }
            System.out.println("L'employé le moins âgé a " + min + " ans");
        }
    }
    static void quitter(){
        System.exit(0);
    }
}
