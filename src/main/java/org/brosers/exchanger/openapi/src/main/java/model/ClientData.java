package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dane Klienta Wybór kredytobiorcy - przy zaczytaniu danych powinno się pojawić tylu kredytobiorców co w pliku wgrywanym do sprawy
 */

@Schema(name = "ClientData", description = "Dane Klienta Wybór kredytobiorcy - przy zaczytaniu danych powinno się pojawić tylu kredytobiorców co w pliku wgrywanym do sprawy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class ClientData {

  private Long id;

  private Long caseId;

  private String idKlienta;

  private Boolean deleted;

  private String nazwaFirmy;

  private String imie;

  private String nazwisko;

  private String nazwiskoPanienskieMatki;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataUrodzenia;

  private String miejsceUrodzenia;

  private String adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu;

  private String adresZamieszkaniaMiasto;

  private String adresZamieszkaniaKodPocztowy;

  private String adresZamieszkaniaKraj;

  private String adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu;

  private String adresKorespondencyjnyMiasto;

  private String adresKorespondencyjnyKodPocztowy;

  private String adresKorespondencyjnyKraj;

  private String regon;

  private String pesel;

  private String rodzajDokumentuTozsamosci;

  private String numerISeriaDokumentu;

  private String numerTelefonuKomorkowy;

  private String numerTelefonuSluzbowy;

  private String numerTelefonuStacjonarny;

  private String adresMailowy;

  private Boolean zgodaEmail;

  private Boolean kredytobiorcaDoKontaktu;

  private String adresDoKnfUlica;

  private String adresDoKnfNumerBudynku;

  private String adresDoKnfNumerLocalu;

  private String adresDoKnfMiasto;

  private String adresDoKnfKodPocztowy;

  private String adresDoKnfKraj;

  private Boolean klientPodpisalOswiadczeniePit;

  public ClientData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClientData(String adresDoKnfUlica, String adresDoKnfNumerBudynku) {
    this.adresDoKnfUlica = adresDoKnfUlica;
    this.adresDoKnfNumerBudynku = adresDoKnfNumerBudynku;
  }

  public ClientData id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * identyfikator wewnetrzny Mediator
   * @return id
  */
  
  @Schema(name = "id", description = "identyfikator wewnetrzny Mediator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ClientData caseId(Long caseId) {
    this.caseId = caseId;
    return this;
  }

  /**
   * identyfikator sprawy wewnatrz Mediator
   * @return caseId
  */
  
  @Schema(name = "caseId", description = "identyfikator sprawy wewnatrz Mediator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseId")
  public Long getCaseId() {
    return caseId;
  }

  public void setCaseId(Long caseId) {
    this.caseId = caseId;
  }

  public ClientData idKlienta(String idKlienta) {
    this.idKlienta = idKlienta;
    return this;
  }

  /**
   * id klienta w systemach organizacji - nie w Mediatorze
   * @return idKlienta
  */
  @Size(min = 0, max = 15) 
  @Schema(name = "idKlienta", description = "id klienta w systemach organizacji - nie w Mediatorze", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idKlienta")
  public String getIdKlienta() {
    return idKlienta;
  }

  public void setIdKlienta(String idKlienta) {
    this.idKlienta = idKlienta;
  }

  public ClientData deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * czy encja usunieta
   * @return deleted
  */
  
  @Schema(name = "deleted", description = "czy encja usunieta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public ClientData nazwaFirmy(String nazwaFirmy) {
    this.nazwaFirmy = nazwaFirmy;
    return this;
  }

  /**
   * 
   * @return nazwaFirmy
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "nazwaFirmy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nazwaFirmy")
  public String getNazwaFirmy() {
    return nazwaFirmy;
  }

  public void setNazwaFirmy(String nazwaFirmy) {
    this.nazwaFirmy = nazwaFirmy;
  }

  public ClientData imie(String imie) {
    this.imie = imie;
    return this;
  }

  /**
   * 
   * @return imie
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "imie", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imie")
  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public ClientData nazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
    return this;
  }

  /**
   * 
   * @return nazwisko
  */
  @Size(min = 0, max = 40) 
  @Schema(name = "nazwisko", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nazwisko")
  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public ClientData nazwiskoPanienskieMatki(String nazwiskoPanienskieMatki) {
    this.nazwiskoPanienskieMatki = nazwiskoPanienskieMatki;
    return this;
  }

  /**
   * 
   * @return nazwiskoPanienskieMatki
  */
  @Size(min = 0, max = 40) 
  @Schema(name = "nazwiskoPanienskieMatki", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nazwiskoPanienskieMatki")
  public String getNazwiskoPanienskieMatki() {
    return nazwiskoPanienskieMatki;
  }

  public void setNazwiskoPanienskieMatki(String nazwiskoPanienskieMatki) {
    this.nazwiskoPanienskieMatki = nazwiskoPanienskieMatki;
  }

  public ClientData dataUrodzenia(LocalDate dataUrodzenia) {
    this.dataUrodzenia = dataUrodzenia;
    return this;
  }

  /**
   * wybor z kalendarza. yyyy-MM-dd
   * @return dataUrodzenia
  */
  @Valid 
  @Schema(name = "dataUrodzenia", description = "wybor z kalendarza. yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataUrodzenia")
  public LocalDate getDataUrodzenia() {
    return dataUrodzenia;
  }

  public void setDataUrodzenia(LocalDate dataUrodzenia) {
    this.dataUrodzenia = dataUrodzenia;
  }

  public ClientData miejsceUrodzenia(String miejsceUrodzenia) {
    this.miejsceUrodzenia = miejsceUrodzenia;
    return this;
  }

  /**
   * 
   * @return miejsceUrodzenia
  */
  @Size(min = 0, max = 30) 
  @Schema(name = "miejsceUrodzenia", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("miejsceUrodzenia")
  public String getMiejsceUrodzenia() {
    return miejsceUrodzenia;
  }

  public void setMiejsceUrodzenia(String miejsceUrodzenia) {
    this.miejsceUrodzenia = miejsceUrodzenia;
  }

  public ClientData adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu(String adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu) {
    this.adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu = adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu;
    return this;
  }

  /**
   * 
   * @return adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu
  */
  @Size(min = 0, max = 50) 
  @Schema(name = "adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu")
  public String getAdresZamieszkaniaUlicaNrBudynkuOrazNrLokalu() {
    return adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu;
  }

  public void setAdresZamieszkaniaUlicaNrBudynkuOrazNrLokalu(String adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu) {
    this.adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu = adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu;
  }

  public ClientData adresZamieszkaniaMiasto(String adresZamieszkaniaMiasto) {
    this.adresZamieszkaniaMiasto = adresZamieszkaniaMiasto;
    return this;
  }

  /**
   * 
   * @return adresZamieszkaniaMiasto
  */
  @Size(min = 0, max = 30) 
  @Schema(name = "adresZamieszkaniaMiasto", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresZamieszkaniaMiasto")
  public String getAdresZamieszkaniaMiasto() {
    return adresZamieszkaniaMiasto;
  }

  public void setAdresZamieszkaniaMiasto(String adresZamieszkaniaMiasto) {
    this.adresZamieszkaniaMiasto = adresZamieszkaniaMiasto;
  }

  public ClientData adresZamieszkaniaKodPocztowy(String adresZamieszkaniaKodPocztowy) {
    this.adresZamieszkaniaKodPocztowy = adresZamieszkaniaKodPocztowy;
    return this;
  }

  /**
   * 
   * @return adresZamieszkaniaKodPocztowy
  */
  @Size(min = 0, max = 10) 
  @Schema(name = "adresZamieszkaniaKodPocztowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresZamieszkaniaKodPocztowy")
  public String getAdresZamieszkaniaKodPocztowy() {
    return adresZamieszkaniaKodPocztowy;
  }

  public void setAdresZamieszkaniaKodPocztowy(String adresZamieszkaniaKodPocztowy) {
    this.adresZamieszkaniaKodPocztowy = adresZamieszkaniaKodPocztowy;
  }

  public ClientData adresZamieszkaniaKraj(String adresZamieszkaniaKraj) {
    this.adresZamieszkaniaKraj = adresZamieszkaniaKraj;
    return this;
  }

  /**
   * 
   * @return adresZamieszkaniaKraj
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "adresZamieszkaniaKraj", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresZamieszkaniaKraj")
  public String getAdresZamieszkaniaKraj() {
    return adresZamieszkaniaKraj;
  }

  public void setAdresZamieszkaniaKraj(String adresZamieszkaniaKraj) {
    this.adresZamieszkaniaKraj = adresZamieszkaniaKraj;
  }

  public ClientData adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu(String adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu) {
    this.adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu = adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu;
    return this;
  }

  /**
   * 
   * @return adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu
  */
  @Size(min = 0, max = 50) 
  @Schema(name = "adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu")
  public String getAdresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu() {
    return adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu;
  }

  public void setAdresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu(String adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu) {
    this.adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu = adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu;
  }

  public ClientData adresKorespondencyjnyMiasto(String adresKorespondencyjnyMiasto) {
    this.adresKorespondencyjnyMiasto = adresKorespondencyjnyMiasto;
    return this;
  }

  /**
   * 
   * @return adresKorespondencyjnyMiasto
  */
  @Size(min = 0, max = 30) 
  @Schema(name = "adresKorespondencyjnyMiasto", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresKorespondencyjnyMiasto")
  public String getAdresKorespondencyjnyMiasto() {
    return adresKorespondencyjnyMiasto;
  }

  public void setAdresKorespondencyjnyMiasto(String adresKorespondencyjnyMiasto) {
    this.adresKorespondencyjnyMiasto = adresKorespondencyjnyMiasto;
  }

  public ClientData adresKorespondencyjnyKodPocztowy(String adresKorespondencyjnyKodPocztowy) {
    this.adresKorespondencyjnyKodPocztowy = adresKorespondencyjnyKodPocztowy;
    return this;
  }

  /**
   * 
   * @return adresKorespondencyjnyKodPocztowy
  */
  @Size(min = 0, max = 10) 
  @Schema(name = "adresKorespondencyjnyKodPocztowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresKorespondencyjnyKodPocztowy")
  public String getAdresKorespondencyjnyKodPocztowy() {
    return adresKorespondencyjnyKodPocztowy;
  }

  public void setAdresKorespondencyjnyKodPocztowy(String adresKorespondencyjnyKodPocztowy) {
    this.adresKorespondencyjnyKodPocztowy = adresKorespondencyjnyKodPocztowy;
  }

  public ClientData adresKorespondencyjnyKraj(String adresKorespondencyjnyKraj) {
    this.adresKorespondencyjnyKraj = adresKorespondencyjnyKraj;
    return this;
  }

  /**
   * 
   * @return adresKorespondencyjnyKraj
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "adresKorespondencyjnyKraj", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresKorespondencyjnyKraj")
  public String getAdresKorespondencyjnyKraj() {
    return adresKorespondencyjnyKraj;
  }

  public void setAdresKorespondencyjnyKraj(String adresKorespondencyjnyKraj) {
    this.adresKorespondencyjnyKraj = adresKorespondencyjnyKraj;
  }

  public ClientData regon(String regon) {
    this.regon = regon;
    return this;
  }

  /**
   * tylko cyfry
   * @return regon
  */
  @Size(min = 0, max = 9) 
  @Schema(name = "regon", description = "tylko cyfry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regon")
  public String getRegon() {
    return regon;
  }

  public void setRegon(String regon) {
    this.regon = regon;
  }

  public ClientData pesel(String pesel) {
    this.pesel = pesel;
    return this;
  }

  /**
   * tylko cyfry
   * @return pesel
  */
  @Size(min = 0, max = 11) 
  @Schema(name = "pesel", description = "tylko cyfry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pesel")
  public String getPesel() {
    return pesel;
  }

  public void setPesel(String pesel) {
    this.pesel = pesel;
  }

  public ClientData rodzajDokumentuTozsamosci(String rodzajDokumentuTozsamosci) {
    this.rodzajDokumentuTozsamosci = rodzajDokumentuTozsamosci;
    return this;
  }

  /**
   * Do uzupelnienia w przypadku obcokrajowca
   * @return rodzajDokumentuTozsamosci
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "rodzajDokumentuTozsamosci", description = "Do uzupelnienia w przypadku obcokrajowca", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rodzajDokumentuTozsamosci")
  public String getRodzajDokumentuTozsamosci() {
    return rodzajDokumentuTozsamosci;
  }

  public void setRodzajDokumentuTozsamosci(String rodzajDokumentuTozsamosci) {
    this.rodzajDokumentuTozsamosci = rodzajDokumentuTozsamosci;
  }

  public ClientData numerISeriaDokumentu(String numerISeriaDokumentu) {
    this.numerISeriaDokumentu = numerISeriaDokumentu;
    return this;
  }

  /**
   * 
   * @return numerISeriaDokumentu
  */
  @Size(min = 0, max = 50) 
  @Schema(name = "numerISeriaDokumentu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerISeriaDokumentu")
  public String getNumerISeriaDokumentu() {
    return numerISeriaDokumentu;
  }

  public void setNumerISeriaDokumentu(String numerISeriaDokumentu) {
    this.numerISeriaDokumentu = numerISeriaDokumentu;
  }

  public ClientData numerTelefonuKomorkowy(String numerTelefonuKomorkowy) {
    this.numerTelefonuKomorkowy = numerTelefonuKomorkowy;
    return this;
  }

  /**
   * cyfry oraz znak specjalny +
   * @return numerTelefonuKomorkowy
  */
  @Pattern(regexp = "^\\+[0-9]{1,6} [0-9]{3,14}$") 
  @Schema(name = "numerTelefonuKomorkowy", description = "cyfry oraz znak specjalny +", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerTelefonuKomorkowy")
  public String getNumerTelefonuKomorkowy() {
    return numerTelefonuKomorkowy;
  }

  public void setNumerTelefonuKomorkowy(String numerTelefonuKomorkowy) {
    this.numerTelefonuKomorkowy = numerTelefonuKomorkowy;
  }

  public ClientData numerTelefonuSluzbowy(String numerTelefonuSluzbowy) {
    this.numerTelefonuSluzbowy = numerTelefonuSluzbowy;
    return this;
  }

  /**
   * cyfry oraz znak specjalny +
   * @return numerTelefonuSluzbowy
  */
  @Pattern(regexp = "^\\+[0-9]{1,6} [0-9]{3,14}$") 
  @Schema(name = "numerTelefonuSluzbowy", description = "cyfry oraz znak specjalny +", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerTelefonuSluzbowy")
  public String getNumerTelefonuSluzbowy() {
    return numerTelefonuSluzbowy;
  }

  public void setNumerTelefonuSluzbowy(String numerTelefonuSluzbowy) {
    this.numerTelefonuSluzbowy = numerTelefonuSluzbowy;
  }

  public ClientData numerTelefonuStacjonarny(String numerTelefonuStacjonarny) {
    this.numerTelefonuStacjonarny = numerTelefonuStacjonarny;
    return this;
  }

  /**
   * cyfry oraz znak specjalny +
   * @return numerTelefonuStacjonarny
  */
  @Pattern(regexp = "^\\+[0-9]{1,6} [0-9]{3,14}$") 
  @Schema(name = "numerTelefonuStacjonarny", description = "cyfry oraz znak specjalny +", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerTelefonuStacjonarny")
  public String getNumerTelefonuStacjonarny() {
    return numerTelefonuStacjonarny;
  }

  public void setNumerTelefonuStacjonarny(String numerTelefonuStacjonarny) {
    this.numerTelefonuStacjonarny = numerTelefonuStacjonarny;
  }

  public ClientData adresMailowy(String adresMailowy) {
    this.adresMailowy = adresMailowy;
    return this;
  }

  /**
   * 
   * @return adresMailowy
  */
  @Pattern(regexp = "^$|^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") @Size(min = 0, max = 100) 
  @Schema(name = "adresMailowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresMailowy")
  public String getAdresMailowy() {
    return adresMailowy;
  }

  public void setAdresMailowy(String adresMailowy) {
    this.adresMailowy = adresMailowy;
  }

  public ClientData zgodaEmail(Boolean zgodaEmail) {
    this.zgodaEmail = zgodaEmail;
    return this;
  }

  /**
   * checkbox
   * @return zgodaEmail
  */
  
  @Schema(name = "zgodaEmail", description = "checkbox", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zgodaEmail")
  public Boolean getZgodaEmail() {
    return zgodaEmail;
  }

  public void setZgodaEmail(Boolean zgodaEmail) {
    this.zgodaEmail = zgodaEmail;
  }

  public ClientData kredytobiorcaDoKontaktu(Boolean kredytobiorcaDoKontaktu) {
    this.kredytobiorcaDoKontaktu = kredytobiorcaDoKontaktu;
    return this;
  }

  /**
   * checkbox
   * @return kredytobiorcaDoKontaktu
  */
  
  @Schema(name = "kredytobiorcaDoKontaktu", description = "checkbox", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kredytobiorcaDoKontaktu")
  public Boolean getKredytobiorcaDoKontaktu() {
    return kredytobiorcaDoKontaktu;
  }

  public void setKredytobiorcaDoKontaktu(Boolean kredytobiorcaDoKontaktu) {
    this.kredytobiorcaDoKontaktu = kredytobiorcaDoKontaktu;
  }

  public ClientData adresDoKnfUlica(String adresDoKnfUlica) {
    this.adresDoKnfUlica = adresDoKnfUlica;
    return this;
  }

  /**
   * Ulica klienta, wysylany do KNF
   * @return adresDoKnfUlica
  */
  @NotNull @Size(min = 0, max = 100) 
  @Schema(name = "adresDoKnfUlica", description = "Ulica klienta, wysylany do KNF", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("adresDoKnfUlica")
  public String getAdresDoKnfUlica() {
    return adresDoKnfUlica;
  }

  public void setAdresDoKnfUlica(String adresDoKnfUlica) {
    this.adresDoKnfUlica = adresDoKnfUlica;
  }

  public ClientData adresDoKnfNumerBudynku(String adresDoKnfNumerBudynku) {
    this.adresDoKnfNumerBudynku = adresDoKnfNumerBudynku;
    return this;
  }

  /**
   * Numer budynku klienta, wysylany do KNF
   * @return adresDoKnfNumerBudynku
  */
  @NotNull @Size(min = 0, max = 50) 
  @Schema(name = "adresDoKnfNumerBudynku", description = "Numer budynku klienta, wysylany do KNF", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("adresDoKnfNumerBudynku")
  public String getAdresDoKnfNumerBudynku() {
    return adresDoKnfNumerBudynku;
  }

  public void setAdresDoKnfNumerBudynku(String adresDoKnfNumerBudynku) {
    this.adresDoKnfNumerBudynku = adresDoKnfNumerBudynku;
  }

  public ClientData adresDoKnfNumerLocalu(String adresDoKnfNumerLocalu) {
    this.adresDoKnfNumerLocalu = adresDoKnfNumerLocalu;
    return this;
  }

  /**
   * Numer localu klienta, wysylany do KNF
   * @return adresDoKnfNumerLocalu
  */
  @Size(min = 0, max = 50) 
  @Schema(name = "adresDoKnfNumerLocalu", description = "Numer localu klienta, wysylany do KNF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresDoKnfNumerLocalu")
  public String getAdresDoKnfNumerLocalu() {
    return adresDoKnfNumerLocalu;
  }

  public void setAdresDoKnfNumerLocalu(String adresDoKnfNumerLocalu) {
    this.adresDoKnfNumerLocalu = adresDoKnfNumerLocalu;
  }

  public ClientData adresDoKnfMiasto(String adresDoKnfMiasto) {
    this.adresDoKnfMiasto = adresDoKnfMiasto;
    return this;
  }

  /**
   * Miasto klienta, wysylany do KNF
   * @return adresDoKnfMiasto
  */
  @Size(min = 0, max = 50) 
  @Schema(name = "adresDoKnfMiasto", description = "Miasto klienta, wysylany do KNF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresDoKnfMiasto")
  public String getAdresDoKnfMiasto() {
    return adresDoKnfMiasto;
  }

  public void setAdresDoKnfMiasto(String adresDoKnfMiasto) {
    this.adresDoKnfMiasto = adresDoKnfMiasto;
  }

  public ClientData adresDoKnfKodPocztowy(String adresDoKnfKodPocztowy) {
    this.adresDoKnfKodPocztowy = adresDoKnfKodPocztowy;
    return this;
  }

  /**
   * Kod pocztowy klienta, wysylany do KNF
   * @return adresDoKnfKodPocztowy
  */
  @Size(min = 0, max = 10) 
  @Schema(name = "adresDoKnfKodPocztowy", description = "Kod pocztowy klienta, wysylany do KNF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresDoKnfKodPocztowy")
  public String getAdresDoKnfKodPocztowy() {
    return adresDoKnfKodPocztowy;
  }

  public void setAdresDoKnfKodPocztowy(String adresDoKnfKodPocztowy) {
    this.adresDoKnfKodPocztowy = adresDoKnfKodPocztowy;
  }

  public ClientData adresDoKnfKraj(String adresDoKnfKraj) {
    this.adresDoKnfKraj = adresDoKnfKraj;
    return this;
  }

  /**
   * Kraj klienta, wysylany do KNF
   * @return adresDoKnfKraj
  */
  @Size(min = 0, max = 50) 
  @Schema(name = "adresDoKnfKraj", description = "Kraj klienta, wysylany do KNF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresDoKnfKraj")
  public String getAdresDoKnfKraj() {
    return adresDoKnfKraj;
  }

  public void setAdresDoKnfKraj(String adresDoKnfKraj) {
    this.adresDoKnfKraj = adresDoKnfKraj;
  }

  public ClientData klientPodpisalOswiadczeniePit(Boolean klientPodpisalOswiadczeniePit) {
    this.klientPodpisalOswiadczeniePit = klientPodpisalOswiadczeniePit;
    return this;
  }

  /**
   * Czy podpisal klient oswiadczenie PIT
   * @return klientPodpisalOswiadczeniePit
  */
  
  @Schema(name = "klientPodpisalOswiadczeniePit", description = "Czy podpisal klient oswiadczenie PIT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("klientPodpisalOswiadczeniePit")
  public Boolean getKlientPodpisalOswiadczeniePit() {
    return klientPodpisalOswiadczeniePit;
  }

  public void setKlientPodpisalOswiadczeniePit(Boolean klientPodpisalOswiadczeniePit) {
    this.klientPodpisalOswiadczeniePit = klientPodpisalOswiadczeniePit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientData clientData = (ClientData) o;
    return Objects.equals(this.id, clientData.id) &&
        Objects.equals(this.caseId, clientData.caseId) &&
        Objects.equals(this.idKlienta, clientData.idKlienta) &&
        Objects.equals(this.deleted, clientData.deleted) &&
        Objects.equals(this.nazwaFirmy, clientData.nazwaFirmy) &&
        Objects.equals(this.imie, clientData.imie) &&
        Objects.equals(this.nazwisko, clientData.nazwisko) &&
        Objects.equals(this.nazwiskoPanienskieMatki, clientData.nazwiskoPanienskieMatki) &&
        Objects.equals(this.dataUrodzenia, clientData.dataUrodzenia) &&
        Objects.equals(this.miejsceUrodzenia, clientData.miejsceUrodzenia) &&
        Objects.equals(this.adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu, clientData.adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu) &&
        Objects.equals(this.adresZamieszkaniaMiasto, clientData.adresZamieszkaniaMiasto) &&
        Objects.equals(this.adresZamieszkaniaKodPocztowy, clientData.adresZamieszkaniaKodPocztowy) &&
        Objects.equals(this.adresZamieszkaniaKraj, clientData.adresZamieszkaniaKraj) &&
        Objects.equals(this.adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu, clientData.adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu) &&
        Objects.equals(this.adresKorespondencyjnyMiasto, clientData.adresKorespondencyjnyMiasto) &&
        Objects.equals(this.adresKorespondencyjnyKodPocztowy, clientData.adresKorespondencyjnyKodPocztowy) &&
        Objects.equals(this.adresKorespondencyjnyKraj, clientData.adresKorespondencyjnyKraj) &&
        Objects.equals(this.regon, clientData.regon) &&
        Objects.equals(this.pesel, clientData.pesel) &&
        Objects.equals(this.rodzajDokumentuTozsamosci, clientData.rodzajDokumentuTozsamosci) &&
        Objects.equals(this.numerISeriaDokumentu, clientData.numerISeriaDokumentu) &&
        Objects.equals(this.numerTelefonuKomorkowy, clientData.numerTelefonuKomorkowy) &&
        Objects.equals(this.numerTelefonuSluzbowy, clientData.numerTelefonuSluzbowy) &&
        Objects.equals(this.numerTelefonuStacjonarny, clientData.numerTelefonuStacjonarny) &&
        Objects.equals(this.adresMailowy, clientData.adresMailowy) &&
        Objects.equals(this.zgodaEmail, clientData.zgodaEmail) &&
        Objects.equals(this.kredytobiorcaDoKontaktu, clientData.kredytobiorcaDoKontaktu) &&
        Objects.equals(this.adresDoKnfUlica, clientData.adresDoKnfUlica) &&
        Objects.equals(this.adresDoKnfNumerBudynku, clientData.adresDoKnfNumerBudynku) &&
        Objects.equals(this.adresDoKnfNumerLocalu, clientData.adresDoKnfNumerLocalu) &&
        Objects.equals(this.adresDoKnfMiasto, clientData.adresDoKnfMiasto) &&
        Objects.equals(this.adresDoKnfKodPocztowy, clientData.adresDoKnfKodPocztowy) &&
        Objects.equals(this.adresDoKnfKraj, clientData.adresDoKnfKraj) &&
        Objects.equals(this.klientPodpisalOswiadczeniePit, clientData.klientPodpisalOswiadczeniePit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, idKlienta, deleted, nazwaFirmy, imie, nazwisko, nazwiskoPanienskieMatki, dataUrodzenia, miejsceUrodzenia, adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu, adresZamieszkaniaMiasto, adresZamieszkaniaKodPocztowy, adresZamieszkaniaKraj, adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu, adresKorespondencyjnyMiasto, adresKorespondencyjnyKodPocztowy, adresKorespondencyjnyKraj, regon, pesel, rodzajDokumentuTozsamosci, numerISeriaDokumentu, numerTelefonuKomorkowy, numerTelefonuSluzbowy, numerTelefonuStacjonarny, adresMailowy, zgodaEmail, kredytobiorcaDoKontaktu, adresDoKnfUlica, adresDoKnfNumerBudynku, adresDoKnfNumerLocalu, adresDoKnfMiasto, adresDoKnfKodPocztowy, adresDoKnfKraj, klientPodpisalOswiadczeniePit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    idKlienta: ").append(toIndentedString(idKlienta)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    nazwaFirmy: ").append(toIndentedString(nazwaFirmy)).append("\n");
    sb.append("    imie: ").append(toIndentedString(imie)).append("\n");
    sb.append("    nazwisko: ").append(toIndentedString(nazwisko)).append("\n");
    sb.append("    nazwiskoPanienskieMatki: ").append(toIndentedString(nazwiskoPanienskieMatki)).append("\n");
    sb.append("    dataUrodzenia: ").append(toIndentedString(dataUrodzenia)).append("\n");
    sb.append("    miejsceUrodzenia: ").append(toIndentedString(miejsceUrodzenia)).append("\n");
    sb.append("    adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu: ").append(toIndentedString(adresZamieszkaniaUlicaNrBudynkuOrazNrLokalu)).append("\n");
    sb.append("    adresZamieszkaniaMiasto: ").append(toIndentedString(adresZamieszkaniaMiasto)).append("\n");
    sb.append("    adresZamieszkaniaKodPocztowy: ").append(toIndentedString(adresZamieszkaniaKodPocztowy)).append("\n");
    sb.append("    adresZamieszkaniaKraj: ").append(toIndentedString(adresZamieszkaniaKraj)).append("\n");
    sb.append("    adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu: ").append(toIndentedString(adresKorespondencyjnyUlicaNrBudynkuOrazNrLokalu)).append("\n");
    sb.append("    adresKorespondencyjnyMiasto: ").append(toIndentedString(adresKorespondencyjnyMiasto)).append("\n");
    sb.append("    adresKorespondencyjnyKodPocztowy: ").append(toIndentedString(adresKorespondencyjnyKodPocztowy)).append("\n");
    sb.append("    adresKorespondencyjnyKraj: ").append(toIndentedString(adresKorespondencyjnyKraj)).append("\n");
    sb.append("    regon: ").append(toIndentedString(regon)).append("\n");
    sb.append("    pesel: ").append(toIndentedString(pesel)).append("\n");
    sb.append("    rodzajDokumentuTozsamosci: ").append(toIndentedString(rodzajDokumentuTozsamosci)).append("\n");
    sb.append("    numerISeriaDokumentu: ").append(toIndentedString(numerISeriaDokumentu)).append("\n");
    sb.append("    numerTelefonuKomorkowy: ").append(toIndentedString(numerTelefonuKomorkowy)).append("\n");
    sb.append("    numerTelefonuSluzbowy: ").append(toIndentedString(numerTelefonuSluzbowy)).append("\n");
    sb.append("    numerTelefonuStacjonarny: ").append(toIndentedString(numerTelefonuStacjonarny)).append("\n");
    sb.append("    adresMailowy: ").append(toIndentedString(adresMailowy)).append("\n");
    sb.append("    zgodaEmail: ").append(toIndentedString(zgodaEmail)).append("\n");
    sb.append("    kredytobiorcaDoKontaktu: ").append(toIndentedString(kredytobiorcaDoKontaktu)).append("\n");
    sb.append("    adresDoKnfUlica: ").append(toIndentedString(adresDoKnfUlica)).append("\n");
    sb.append("    adresDoKnfNumerBudynku: ").append(toIndentedString(adresDoKnfNumerBudynku)).append("\n");
    sb.append("    adresDoKnfNumerLocalu: ").append(toIndentedString(adresDoKnfNumerLocalu)).append("\n");
    sb.append("    adresDoKnfMiasto: ").append(toIndentedString(adresDoKnfMiasto)).append("\n");
    sb.append("    adresDoKnfKodPocztowy: ").append(toIndentedString(adresDoKnfKodPocztowy)).append("\n");
    sb.append("    adresDoKnfKraj: ").append(toIndentedString(adresDoKnfKraj)).append("\n");
    sb.append("    klientPodpisalOswiadczeniePit: ").append(toIndentedString(klientPodpisalOswiadczeniePit)).append("\n");
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

