public class UseCase{
    private final int TAILLE=5;
    private Service[] tabService=new Service[TAILLE];
    private int nbreServ;
    private Employe[] tabEmploye=new Employe[TAILLE];
    private int nbreEmploye;

    public void ajouterService(Service serv){
        if(nbreServ<TAILLE){
            tabService[nbreServ]=serv;
            nbreServ++;
        }else{
            System.out.println("Tableau rempli");
        }
    }
    public void listerService(){
        for(Service sesrv:tabService){
            if(serv!=null)
            System.out.println(serv.affiche());
        }
    }
    public void ajouterEmploye(Employe emp){
        if(nbreEmploye<TAILLE){
            tabEmploye[nbreEmploye]=emp;
            nbreEmploye++;
        }else{
            system.out.println("Impossible de rajouter");
        }
    }
}