package org.webp;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name= "TblFirma")
public class TblFirma  {


    @Id
    @GeneratedValue
    private Long ID;
    @Size(min = 2,max = 50)
    @NotNull
    @OneToMany(fetch = FetchType.EAGER)
    private List<String> Musteri;
    @NotNull
    @Size(min = 2,max = 50)
    @OneToMany(fetch = FetchType.EAGER)
    private List<String> Personel;
    public TblFirma() {

    }
    public TblFirma(Long id,String musteri,String personel) {
        this.ID= id;
        this.Musteri= Collections.singletonList(musteri);
        this.Personel= Collections.singletonList(personel);
    }

    public Long getID() {return ID;}

    public void setID(Long ID) {this.ID = ID;}

    public String getMusteri() {return Musteri.toString();}

    public void setMusteri(String musteri) {Musteri = Collections.singletonList(musteri);}

    public String getPersonel() {return Personel.toString();}

    public void setPersonel(String personel) {Personel = Collections.singletonList(personel);}


}

