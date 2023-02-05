/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.MedicineCatalog;
import Model.VitalSignHistory;

/**
 *
 * @author Arun
 */
public class Application {
    VitalSignHistory history;
    MedicineCatalog catalog;
    public Application(){
        this.catalog=new MedicineCatalog();
        this.history= new VitalSignHistory();
    }

    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }

    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }

    public VitalSignHistory getHistory() {
        return history;
    }

    public MedicineCatalog getCatalog() {
        return catalog;
    }
    
}