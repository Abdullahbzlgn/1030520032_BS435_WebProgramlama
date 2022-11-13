package org.webp;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name= "TblPersonel")
public class TblPersonel  {


    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @GeneratedValue
    private Long ID;
    @NotBlank
    @Size(min = 2,max = 50)
    private String Adi;
    @NotBlank
    @Size(min = 2,max = 50)
    private String Soyadi;
    @NotBlank
    @javax.validation.constraints.Email
    @Size(min = 2,max = 50)
    private String Email;
    @NotNull
    @Size(min = 2,max = 50)
    private String Sifre;
    @NotNull
    private LocalDate DogumTarihi;
    @Size(min = 2,max = 50)
    private String Telefon;
    @NotBlank
    @Size(min = 2,max = 50)
    private String TcKimlik;

    public TblPersonel() {

    }

    public TblPersonel(Long id, String adi, String soyadi, String email, String sifre, String telefon, String tcKimlik, String dogumTarihi) {
        this.ID= id;
        this.Adi= adi;
        this.Soyadi= soyadi;
        this.Email= email;
        this.Sifre= sifre;
        this.Telefon= telefon;
        this.TcKimlik= tcKimlik;
        this.DogumTarihi= LocalDate.parse(dogumTarihi);
    }
    public Long getID() {return ID;}
    public void setID(Long ID) {this.ID = ID;}
    public String getAdi() {return Adi;}
    public void setAdi(String adi) {Adi = adi;}
    public String getSoyadi() {return Soyadi;}
    public void setSoyadi(String soyadi) {Soyadi = soyadi;}
    public String getEmail() {return Email;}
    public void setEmail(String email) {Email = email;}
    public String getSifre() {return Sifre;}
    public void setSifre(String sifre) {Sifre = sifre;}
    public String getTelefon() {return Telefon;}
    public void setTelefon(String telefon) {Telefon = telefon;}
    public String getTcKimlik() {return TcKimlik;}
    public void setTcKimlik(String tcKimlik) {TcKimlik = tcKimlik;}
    public LocalDate getDogumTarihi() {return DogumTarihi;}
    public void setDogumTarihi(LocalDate dogumTarihi) {DogumTarihi = dogumTarihi;}
}

