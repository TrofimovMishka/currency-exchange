package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Encja wykorzystywana do listowania spraw na Lista Spraw
 */

@Schema(name = "CaseDataBrief", description = "Encja wykorzystywana do listowania spraw na Lista Spraw")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CaseDataBrief {

  private String przypisanyUzytkownik;

  private Long caseId;

  private String numerSprawy;

  private String numerTelefonuKomorkowy;

  private String numerTelefonuSluzbowy;

  private String numerTelefonuDomowy;

  private String numerKontraktu;

  private String numerUmowy;

  private String idKlienta;

  /**
   * 
   */
  public enum TypSprawyEnum {
    MEDIACJE("MEDIACJE");

    private String value;

    TypSprawyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypSprawyEnum fromValue(String value) {
      for (TypSprawyEnum b : TypSprawyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypSprawyEnum typSprawy;

  private String sygnaturaSprawy;

  private String pesel;

  private String regon;

  private String statusTechniczny;

  private String etapProcesu;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataRejestracji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataWyslaniaOnePagera;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataOdeslaniaDokumentow;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataSpotkania;

  private String nazwiskoImieILiczba;

  private String kredytobiorcaImie;

  private String kredytobiorcaNazwisko;

  private String nazwaFirmy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataAktualizacjiStatusu;

  public CaseDataBrief przypisanyUzytkownik(String przypisanyUzytkownik) {
    this.przypisanyUzytkownik = przypisanyUzytkownik;
    return this;
  }

  /**
   * 
   * @return przypisanyUzytkownik
  */
  
  @Schema(name = "przypisanyUzytkownik", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("przypisanyUzytkownik")
  public String getPrzypisanyUzytkownik() {
    return przypisanyUzytkownik;
  }

  public void setPrzypisanyUzytkownik(String przypisanyUzytkownik) {
    this.przypisanyUzytkownik = przypisanyUzytkownik;
  }

  public CaseDataBrief caseId(Long caseId) {
    this.caseId = caseId;
    return this;
  }

  /**
   * 
   * @return caseId
  */
  
  @Schema(name = "caseId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseId")
  public Long getCaseId() {
    return caseId;
  }

  public void setCaseId(Long caseId) {
    this.caseId = caseId;
  }

  public CaseDataBrief numerSprawy(String numerSprawy) {
    this.numerSprawy = numerSprawy;
    return this;
  }

  /**
   * 
   * @return numerSprawy
  */
  
  @Schema(name = "numerSprawy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerSprawy")
  public String getNumerSprawy() {
    return numerSprawy;
  }

  public void setNumerSprawy(String numerSprawy) {
    this.numerSprawy = numerSprawy;
  }

  public CaseDataBrief numerTelefonuKomorkowy(String numerTelefonuKomorkowy) {
    this.numerTelefonuKomorkowy = numerTelefonuKomorkowy;
    return this;
  }

  /**
   * 
   * @return numerTelefonuKomorkowy
  */
  @Pattern(regexp = "^\\+[0-9]{1,6} [0-9]{3,14}$") 
  @Schema(name = "numerTelefonuKomorkowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerTelefonuKomorkowy")
  public String getNumerTelefonuKomorkowy() {
    return numerTelefonuKomorkowy;
  }

  public void setNumerTelefonuKomorkowy(String numerTelefonuKomorkowy) {
    this.numerTelefonuKomorkowy = numerTelefonuKomorkowy;
  }

  public CaseDataBrief numerTelefonuSluzbowy(String numerTelefonuSluzbowy) {
    this.numerTelefonuSluzbowy = numerTelefonuSluzbowy;
    return this;
  }

  /**
   * 
   * @return numerTelefonuSluzbowy
  */
  @Pattern(regexp = "^\\+[0-9]{1,6} [0-9]{3,14}$") 
  @Schema(name = "numerTelefonuSluzbowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerTelefonuSluzbowy")
  public String getNumerTelefonuSluzbowy() {
    return numerTelefonuSluzbowy;
  }

  public void setNumerTelefonuSluzbowy(String numerTelefonuSluzbowy) {
    this.numerTelefonuSluzbowy = numerTelefonuSluzbowy;
  }

  public CaseDataBrief numerTelefonuDomowy(String numerTelefonuDomowy) {
    this.numerTelefonuDomowy = numerTelefonuDomowy;
    return this;
  }

  /**
   * 
   * @return numerTelefonuDomowy
  */
  @Pattern(regexp = "^\\+[0-9]{1,6} [0-9]{3,14}$") 
  @Schema(name = "numerTelefonuDomowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerTelefonuDomowy")
  public String getNumerTelefonuDomowy() {
    return numerTelefonuDomowy;
  }

  public void setNumerTelefonuDomowy(String numerTelefonuDomowy) {
    this.numerTelefonuDomowy = numerTelefonuDomowy;
  }

  public CaseDataBrief numerKontraktu(String numerKontraktu) {
    this.numerKontraktu = numerKontraktu;
    return this;
  }

  /**
   * 
   * @return numerKontraktu
  */
  
  @Schema(name = "numerKontraktu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerKontraktu")
  public String getNumerKontraktu() {
    return numerKontraktu;
  }

  public void setNumerKontraktu(String numerKontraktu) {
    this.numerKontraktu = numerKontraktu;
  }

  public CaseDataBrief numerUmowy(String numerUmowy) {
    this.numerUmowy = numerUmowy;
    return this;
  }

  /**
   * 
   * @return numerUmowy
  */
  
  @Schema(name = "numerUmowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerUmowy")
  public String getNumerUmowy() {
    return numerUmowy;
  }

  public void setNumerUmowy(String numerUmowy) {
    this.numerUmowy = numerUmowy;
  }

  public CaseDataBrief idKlienta(String idKlienta) {
    this.idKlienta = idKlienta;
    return this;
  }

  /**
   * 
   * @return idKlienta
  */
  
  @Schema(name = "idKlienta", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idKlienta")
  public String getIdKlienta() {
    return idKlienta;
  }

  public void setIdKlienta(String idKlienta) {
    this.idKlienta = idKlienta;
  }

  public CaseDataBrief typSprawy(TypSprawyEnum typSprawy) {
    this.typSprawy = typSprawy;
    return this;
  }

  /**
   * 
   * @return typSprawy
  */
  
  @Schema(name = "typSprawy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("typSprawy")
  public TypSprawyEnum getTypSprawy() {
    return typSprawy;
  }

  public void setTypSprawy(TypSprawyEnum typSprawy) {
    this.typSprawy = typSprawy;
  }

  public CaseDataBrief sygnaturaSprawy(String sygnaturaSprawy) {
    this.sygnaturaSprawy = sygnaturaSprawy;
    return this;
  }

  /**
   * 
   * @return sygnaturaSprawy
  */
  
  @Schema(name = "sygnaturaSprawy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sygnaturaSprawy")
  public String getSygnaturaSprawy() {
    return sygnaturaSprawy;
  }

  public void setSygnaturaSprawy(String sygnaturaSprawy) {
    this.sygnaturaSprawy = sygnaturaSprawy;
  }

  public CaseDataBrief pesel(String pesel) {
    this.pesel = pesel;
    return this;
  }

  /**
   * 
   * @return pesel
  */
  
  @Schema(name = "pesel", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pesel")
  public String getPesel() {
    return pesel;
  }

  public void setPesel(String pesel) {
    this.pesel = pesel;
  }

  public CaseDataBrief regon(String regon) {
    this.regon = regon;
    return this;
  }

  /**
   * 
   * @return regon
  */
  
  @Schema(name = "regon", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regon")
  public String getRegon() {
    return regon;
  }

  public void setRegon(String regon) {
    this.regon = regon;
  }

  public CaseDataBrief statusTechniczny(String statusTechniczny) {
    this.statusTechniczny = statusTechniczny;
    return this;
  }

  /**
   * UI friendly technical status name
   * @return statusTechniczny
  */
  
  @Schema(name = "statusTechniczny", description = "UI friendly technical status name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusTechniczny")
  public String getStatusTechniczny() {
    return statusTechniczny;
  }

  public void setStatusTechniczny(String statusTechniczny) {
    this.statusTechniczny = statusTechniczny;
  }

  public CaseDataBrief etapProcesu(String etapProcesu) {
    this.etapProcesu = etapProcesu;
    return this;
  }

  /**
   * UI friendly etap name
   * @return etapProcesu
  */
  
  @Schema(name = "etapProcesu", description = "UI friendly etap name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etapProcesu")
  public String getEtapProcesu() {
    return etapProcesu;
  }

  public void setEtapProcesu(String etapProcesu) {
    this.etapProcesu = etapProcesu;
  }

  public CaseDataBrief dataRejestracji(OffsetDateTime dataRejestracji) {
    this.dataRejestracji = dataRejestracji;
    return this;
  }

  /**
   * yyyy-MM-dd HH:mm:ss
   * @return dataRejestracji
  */
  @Valid 
  @Schema(name = "dataRejestracji", description = "yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataRejestracji")
  public OffsetDateTime getDataRejestracji() {
    return dataRejestracji;
  }

  public void setDataRejestracji(OffsetDateTime dataRejestracji) {
    this.dataRejestracji = dataRejestracji;
  }

  public CaseDataBrief dataWyslaniaOnePagera(OffsetDateTime dataWyslaniaOnePagera) {
    this.dataWyslaniaOnePagera = dataWyslaniaOnePagera;
    return this;
  }

  /**
   * yyyy-MM-dd HH:mm:ss
   * @return dataWyslaniaOnePagera
  */
  @Valid 
  @Schema(name = "dataWyslaniaOnePagera", description = "yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataWyslaniaOnePagera")
  public OffsetDateTime getDataWyslaniaOnePagera() {
    return dataWyslaniaOnePagera;
  }

  public void setDataWyslaniaOnePagera(OffsetDateTime dataWyslaniaOnePagera) {
    this.dataWyslaniaOnePagera = dataWyslaniaOnePagera;
  }

  public CaseDataBrief dataOdeslaniaDokumentow(OffsetDateTime dataOdeslaniaDokumentow) {
    this.dataOdeslaniaDokumentow = dataOdeslaniaDokumentow;
    return this;
  }

  /**
   * yyyy-MM-dd HH:mm:ss
   * @return dataOdeslaniaDokumentow
  */
  @Valid 
  @Schema(name = "dataOdeslaniaDokumentow", description = "yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataOdeslaniaDokumentow")
  public OffsetDateTime getDataOdeslaniaDokumentow() {
    return dataOdeslaniaDokumentow;
  }

  public void setDataOdeslaniaDokumentow(OffsetDateTime dataOdeslaniaDokumentow) {
    this.dataOdeslaniaDokumentow = dataOdeslaniaDokumentow;
  }

  public CaseDataBrief dataSpotkania(OffsetDateTime dataSpotkania) {
    this.dataSpotkania = dataSpotkania;
    return this;
  }

  /**
   * yyyy-MM-dd HH:mm:ss
   * @return dataSpotkania
  */
  @Valid 
  @Schema(name = "dataSpotkania", description = "yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSpotkania")
  public OffsetDateTime getDataSpotkania() {
    return dataSpotkania;
  }

  public void setDataSpotkania(OffsetDateTime dataSpotkania) {
    this.dataSpotkania = dataSpotkania;
  }

  public CaseDataBrief nazwiskoImieILiczba(String nazwiskoImieILiczba) {
    this.nazwiskoImieILiczba = nazwiskoImieILiczba;
    return this;
  }

  /**
   * Pole jak najwczesniej w tabeli na UI jako kolumna, Imie i nazwisko glownego kredytobiorcy (oznaczony flaga boolean). jesli jest wiecej kredytobiorcow, to pozniej pozniej w nawiiasie liczba pozostalych kredytobiorcow np (+2) jesli jest jeszcze 2 kredytobiorcow. Jesli nie jest ustawiony glowny kredytobiorca - pokazywac pierwszego kredytobiorce sortujac najpierw po imieniu a pozniej po nazwisku w liscie i pokazac pierwsza osoba np Aleksandra Allowska (+2)
   * @return nazwiskoImieILiczba
  */
  
  @Schema(name = "nazwiskoImieILiczba", description = "Pole jak najwczesniej w tabeli na UI jako kolumna, Imie i nazwisko glownego kredytobiorcy (oznaczony flaga boolean). jesli jest wiecej kredytobiorcow, to pozniej pozniej w nawiiasie liczba pozostalych kredytobiorcow np (+2) jesli jest jeszcze 2 kredytobiorcow. Jesli nie jest ustawiony glowny kredytobiorca - pokazywac pierwszego kredytobiorce sortujac najpierw po imieniu a pozniej po nazwisku w liscie i pokazac pierwsza osoba np Aleksandra Allowska (+2)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nazwiskoImieILiczba")
  public String getNazwiskoImieILiczba() {
    return nazwiskoImieILiczba;
  }

  public void setNazwiskoImieILiczba(String nazwiskoImieILiczba) {
    this.nazwiskoImieILiczba = nazwiskoImieILiczba;
  }

  public CaseDataBrief kredytobiorcaImie(String kredytobiorcaImie) {
    this.kredytobiorcaImie = kredytobiorcaImie;
    return this;
  }

  /**
   * przedostatnie pole w tabeli na liscie
   * @return kredytobiorcaImie
  */
  
  @Schema(name = "kredytobiorcaImie", description = "przedostatnie pole w tabeli na liscie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kredytobiorcaImie")
  public String getKredytobiorcaImie() {
    return kredytobiorcaImie;
  }

  public void setKredytobiorcaImie(String kredytobiorcaImie) {
    this.kredytobiorcaImie = kredytobiorcaImie;
  }

  public CaseDataBrief kredytobiorcaNazwisko(String kredytobiorcaNazwisko) {
    this.kredytobiorcaNazwisko = kredytobiorcaNazwisko;
    return this;
  }

  /**
   * ostatnie pole w tabeli na liscie
   * @return kredytobiorcaNazwisko
  */
  
  @Schema(name = "kredytobiorcaNazwisko", description = "ostatnie pole w tabeli na liscie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kredytobiorcaNazwisko")
  public String getKredytobiorcaNazwisko() {
    return kredytobiorcaNazwisko;
  }

  public void setKredytobiorcaNazwisko(String kredytobiorcaNazwisko) {
    this.kredytobiorcaNazwisko = kredytobiorcaNazwisko;
  }

  public CaseDataBrief nazwaFirmy(String nazwaFirmy) {
    this.nazwaFirmy = nazwaFirmy;
    return this;
  }

  /**
   * 
   * @return nazwaFirmy
  */
  
  @Schema(name = "nazwaFirmy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nazwaFirmy")
  public String getNazwaFirmy() {
    return nazwaFirmy;
  }

  public void setNazwaFirmy(String nazwaFirmy) {
    this.nazwaFirmy = nazwaFirmy;
  }

  public CaseDataBrief dataAktualizacjiStatusu(OffsetDateTime dataAktualizacjiStatusu) {
    this.dataAktualizacjiStatusu = dataAktualizacjiStatusu;
    return this;
  }

  /**
   * Represents the date-time when state KOMPLETNY was sent to KNF
   * @return dataAktualizacjiStatusu
  */
  @Valid 
  @Schema(name = "dataAktualizacjiStatusu", description = "Represents the date-time when state KOMPLETNY was sent to KNF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataAktualizacjiStatusu")
  public OffsetDateTime getDataAktualizacjiStatusu() {
    return dataAktualizacjiStatusu;
  }

  public void setDataAktualizacjiStatusu(OffsetDateTime dataAktualizacjiStatusu) {
    this.dataAktualizacjiStatusu = dataAktualizacjiStatusu;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseDataBrief caseDataBrief = (CaseDataBrief) o;
    return Objects.equals(this.przypisanyUzytkownik, caseDataBrief.przypisanyUzytkownik) &&
        Objects.equals(this.caseId, caseDataBrief.caseId) &&
        Objects.equals(this.numerSprawy, caseDataBrief.numerSprawy) &&
        Objects.equals(this.numerTelefonuKomorkowy, caseDataBrief.numerTelefonuKomorkowy) &&
        Objects.equals(this.numerTelefonuSluzbowy, caseDataBrief.numerTelefonuSluzbowy) &&
        Objects.equals(this.numerTelefonuDomowy, caseDataBrief.numerTelefonuDomowy) &&
        Objects.equals(this.numerKontraktu, caseDataBrief.numerKontraktu) &&
        Objects.equals(this.numerUmowy, caseDataBrief.numerUmowy) &&
        Objects.equals(this.idKlienta, caseDataBrief.idKlienta) &&
        Objects.equals(this.typSprawy, caseDataBrief.typSprawy) &&
        Objects.equals(this.sygnaturaSprawy, caseDataBrief.sygnaturaSprawy) &&
        Objects.equals(this.pesel, caseDataBrief.pesel) &&
        Objects.equals(this.regon, caseDataBrief.regon) &&
        Objects.equals(this.statusTechniczny, caseDataBrief.statusTechniczny) &&
        Objects.equals(this.etapProcesu, caseDataBrief.etapProcesu) &&
        Objects.equals(this.dataRejestracji, caseDataBrief.dataRejestracji) &&
        Objects.equals(this.dataWyslaniaOnePagera, caseDataBrief.dataWyslaniaOnePagera) &&
        Objects.equals(this.dataOdeslaniaDokumentow, caseDataBrief.dataOdeslaniaDokumentow) &&
        Objects.equals(this.dataSpotkania, caseDataBrief.dataSpotkania) &&
        Objects.equals(this.nazwiskoImieILiczba, caseDataBrief.nazwiskoImieILiczba) &&
        Objects.equals(this.kredytobiorcaImie, caseDataBrief.kredytobiorcaImie) &&
        Objects.equals(this.kredytobiorcaNazwisko, caseDataBrief.kredytobiorcaNazwisko) &&
        Objects.equals(this.nazwaFirmy, caseDataBrief.nazwaFirmy) &&
        Objects.equals(this.dataAktualizacjiStatusu, caseDataBrief.dataAktualizacjiStatusu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(przypisanyUzytkownik, caseId, numerSprawy, numerTelefonuKomorkowy, numerTelefonuSluzbowy, numerTelefonuDomowy, numerKontraktu, numerUmowy, idKlienta, typSprawy, sygnaturaSprawy, pesel, regon, statusTechniczny, etapProcesu, dataRejestracji, dataWyslaniaOnePagera, dataOdeslaniaDokumentow, dataSpotkania, nazwiskoImieILiczba, kredytobiorcaImie, kredytobiorcaNazwisko, nazwaFirmy, dataAktualizacjiStatusu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseDataBrief {\n");
    sb.append("    przypisanyUzytkownik: ").append(toIndentedString(przypisanyUzytkownik)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    numerSprawy: ").append(toIndentedString(numerSprawy)).append("\n");
    sb.append("    numerTelefonuKomorkowy: ").append(toIndentedString(numerTelefonuKomorkowy)).append("\n");
    sb.append("    numerTelefonuSluzbowy: ").append(toIndentedString(numerTelefonuSluzbowy)).append("\n");
    sb.append("    numerTelefonuDomowy: ").append(toIndentedString(numerTelefonuDomowy)).append("\n");
    sb.append("    numerKontraktu: ").append(toIndentedString(numerKontraktu)).append("\n");
    sb.append("    numerUmowy: ").append(toIndentedString(numerUmowy)).append("\n");
    sb.append("    idKlienta: ").append(toIndentedString(idKlienta)).append("\n");
    sb.append("    typSprawy: ").append(toIndentedString(typSprawy)).append("\n");
    sb.append("    sygnaturaSprawy: ").append(toIndentedString(sygnaturaSprawy)).append("\n");
    sb.append("    pesel: ").append(toIndentedString(pesel)).append("\n");
    sb.append("    regon: ").append(toIndentedString(regon)).append("\n");
    sb.append("    statusTechniczny: ").append(toIndentedString(statusTechniczny)).append("\n");
    sb.append("    etapProcesu: ").append(toIndentedString(etapProcesu)).append("\n");
    sb.append("    dataRejestracji: ").append(toIndentedString(dataRejestracji)).append("\n");
    sb.append("    dataWyslaniaOnePagera: ").append(toIndentedString(dataWyslaniaOnePagera)).append("\n");
    sb.append("    dataOdeslaniaDokumentow: ").append(toIndentedString(dataOdeslaniaDokumentow)).append("\n");
    sb.append("    dataSpotkania: ").append(toIndentedString(dataSpotkania)).append("\n");
    sb.append("    nazwiskoImieILiczba: ").append(toIndentedString(nazwiskoImieILiczba)).append("\n");
    sb.append("    kredytobiorcaImie: ").append(toIndentedString(kredytobiorcaImie)).append("\n");
    sb.append("    kredytobiorcaNazwisko: ").append(toIndentedString(kredytobiorcaNazwisko)).append("\n");
    sb.append("    nazwaFirmy: ").append(toIndentedString(nazwaFirmy)).append("\n");
    sb.append("    dataAktualizacjiStatusu: ").append(toIndentedString(dataAktualizacjiStatusu)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

