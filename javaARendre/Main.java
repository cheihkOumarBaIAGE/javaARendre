import java.util.Scanner;
public class Main{
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        int choix;
        UseCase uc=new UseCase();
        do{
            choix=menu();
            switch (choix) {
                case 1:
                System.out.println("Entrez le libelle");
                String libelle=scanner.nextLine();
                Service serv=new Service();
                serv.setLibelle(libelle);
                uc.ajoutService(serv);
                    break;
                case 2:
                uc.listerService();
                    break;
                case 3:
                System.out.println("Entrer le nom complet");
                String nomComplet=scanner.nextline();
                System.out.println("Entrer la date d'embauche");
                String dateEmbauche=scanner.nextline();
                Employe emp=new Employe();
                emp.setNomComplet(nomComplet);
                emp.setDateEmbauche(dateEmbauche);
                uc.ajoutEmploye(emp);
                    break;
                case 4:
                System.out.println("Merci...");
            
                default:
                System.out.println("Choisissez");
                    break;
            }
        }
        while(choix!=6);
    }
    public static int menu(){
        System.out.println("1-Ajouter un service"
                            +"\n 2-lister Service"
                            +"\n 3-Ajouter un employé"
                            +"\n 4-Quitter"
                            +"\n Choisissez: ");
                            String choix;
                            choix=scanner.nextLine();
                            return Integer.parseInt(choix);
        
        }
    
}