public class Employe {
    private int matricule;
    private String nom;
    private String prenom;
    private int age;
    private double salaire;

    public Employe(int matricule, String nom, String prenom, int age, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", salaire=" + salaire +
                '}';
    }

    public static void menu(){
        System.out.println("Menu du programme: ");
        System.out.println("1 - Ajouter un nouvel employé");
        System.out.println("2 - Modifier un employé");
        System.out.println("3 - Supprimer un employé");
        System.out.println("4 - Afficher un employé");
        System.out.println("5 - Afficher tous les employés");
        System.out.println("6 - Calculer le nombre des employés ayant un salaire qui dépasse 10000");
        System.out.println("7 - Afficher l'employé le plus âgé");
        System.out.println("8 - Afficher l'mployé le moins âgé");
        System.out.println("9 - Quitter");

    }

}

