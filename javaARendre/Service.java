public class Service implements IEmploye{
    private int id;
    private String libelle;    
    private static int nbreService;
    private Employe[] tabEmploye=new Employe[10];
    private int nbreEmploye;

        // public Service(){
        //     nbreService++;
        //     id=nbreService;
        // }
    public Service(){
        nbreService++;
        id=nbreService;
        setLibelle(Libelle);
    }

    private int getId(){
        return id;
    }
    private String getLibelle(){
        return Libelle;
    }
    private int getNbreService(){
        return nbreService;
    }
    private Employe[] getTabEmploye(){
        return tabEmploye;
    }


    public void setId(int id){
        this.id=id;
    }
    public void setLibelle( String libelle){
        this.Libelle=Libelle;
    }
    public void setNbreService(int nbreService){
        this.nbreService=nbreService;
    }
    public void setTabEmploye(Employe employe){
        tabEmploye[nbreEmploye]=employe;
        nbreEmploye++;
        employe.setService(this);
    }

    @Override
    public String affiche(){
        return "ID: "+id+"\n Libelle: "+ibelle;
    }   

}