
package wad.asunnot.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Henkilo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    
    @Column(name = "NIMI")
    private String nimi;
    @Column(name = "PUHELINNUMERO")
    private String puhelinnumero;
    @Column(name = "SAHKOPOSTIOSOITE")
    private String sahkopostiosoite;
    @OneToMany(mappedBy = "henkilo", cascade={CascadeType.MERGE, CascadeType.PERSIST})
    private List<Asunto> kohteet;

    public Henkilo() {
        kohteet = new ArrayList<Asunto>();
    }
    
    public void setKohteet(List<Asunto> kohteet) {
        this.kohteet = kohteet;
    }
    public List<Asunto> getKohteet() {
        return kohteet;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPuhelinnumero(String puhelinnumero) {
        this.puhelinnumero = puhelinnumero;
    }

    public void setSahkopostiosoite(String sahkopostiosoite) {
        this.sahkopostiosoite = sahkopostiosoite;
    }

    public String getNimi() {
        return nimi;
    }

    public String getPuhelinnumero() {
        return puhelinnumero;
    }

    public String getSahkopostiosoite() {
        return sahkopostiosoite;
    }
    public void lisaaKohde(Asunto asunto) {
        this.kohteet.add(asunto);
    }
}
