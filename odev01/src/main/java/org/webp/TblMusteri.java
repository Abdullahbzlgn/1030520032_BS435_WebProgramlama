package org.webp;
import Age.Age;
import jdk.jfr.Percentage;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name= "TblMusteri")
public class TblMusteri  {


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
    @Column(unique = true)
    @NotBlank
    @Email
    @Size(min = 2,max = 50)
    private String Email;
    @NotNull
    @Size(min = 2,max = 50)
    private String Sifre;
    @Size(min = 2,max = 50)
    private String Telefon;
    @NotNull
    private LocalDate DogumTarihi;

    public TblMusteri() {

    }
    public TblMusteri(Long id,String adi,String soyadi,String email,String sifre, String telefon,String dogumTarihi) {
        this.ID= id;
        this.Adi= adi;
        this.Soyadi= soyadi;
        this.Email= email;
        this.Sifre= sifre;
        this.Telefon= telefon;
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
    public LocalDate getDogumTarihi() {return DogumTarihi;}
    public void setDogumTarihi(LocalDate dogumTarihi) {DogumTarihi = dogumTarihi;}
}

