package wad.asunnot.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author kviiri
 */
@Entity
public class Asunto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
     
    @Column(name="KOKO")
    Integer koko;
    @Column(name="OSOITE")
    String osoite;
    @Column(name="POSTINUMERO")
    String postinumero;
    @Column(name="KAUPUNKI")
    String kaupunki;
    @Column(name="VUOSI")
    Integer vuosi;
    @Column(name="KUNTO")
    String kunto;
    
    @ManyToOne(cascade = {CascadeType.ALL})
    Henkilo henkilo;

    public Henkilo getHenkilo() {
        return henkilo;
    }

    public void setHenkilo(Henkilo henkilo) {
        this.henkilo = henkilo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKaupunki() {
        return kaupunki;
    }

    public void setKaupunki(String kaupunki) {
        this.kaupunki = kaupunki;
    }

    public Integer getKoko() {
        return koko;
    }

    public void setKoko(Integer koko) {
        this.koko = koko;
    }

    public String getKunto() {
        return kunto;
    }

    public void setKunto(String kunto) {
        this.kunto = kunto;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String getPostinumero() {
        return postinumero;
    }

    public void setPostinumero(String postinumero) {
        this.postinumero = postinumero;
    }

    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }
    
    
}
