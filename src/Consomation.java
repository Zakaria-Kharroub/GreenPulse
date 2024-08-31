import java.time.LocalDate;

public class Consomation {
    private int quantite;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Consomation(int quantite,LocalDate dateDebut,LocalDate dateFin){
        this.quantite=quantite;
        this.dateDebut=dateDebut;
        this.dateFin=dateFin;
    }

    public int getQuantite(){
        return quantite;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }
    public LocalDate getDateFin(){
        return dateFin;
    }

    public void setQuantite(int quantite){
        this.quantite=quantite;
    }
    public void setDateDebut(LocalDate dateDebut){
        this.dateDebut=dateDebut;
    }
    public void setDateFin(LocalDate dateFin){
        this.dateFin=dateFin;
    }
}
