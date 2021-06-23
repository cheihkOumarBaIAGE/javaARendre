public class Employe implements IEmploye{
    private int id;
    private String nomComplet;    
    private String dateEmbauche;
    private final int FORMAT=10;
    private static int nbreEmploye;
    // private Service service;

    // public Employe(){
        
    //     nbreEmploye++;
    //     id=nbreEmploye;

    // }
    
    public Employe(){
        nbreEmploye++;
        id=nbreEmploye;
        setNomComplet(nomComplet);
        setDateEmbauche(dateEmbauche);
    }

    private int getId(){
        return id;
    }
    private String getNomComplet(){
        return nomComplet;
    }
    private String getDateEmbauche(){
        return dateEmbauche;
    }
    private static int getNbreEmploye(){
        return nbreEmploye;
    }
    // public Service getService(){
    //     return service;
    // }


    public void setId(int id){
        this.id=id;
    }
    public void setNomComplet(String nomComplet){
        this.nomComplet=nomComplet;
    }
    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche=dateEmbauche;
    }
    public void setNbreEmploye(int nbreEmploye){
        this.nbreEmploye=nbreEmploye;
    }

    @Override
    public String affiche(){
        return "ID est : "+id+"\n Le Nom au complet: "+nomComplet+"\n Sa Date d'embauche: "+dateEmbauche;
    }


}