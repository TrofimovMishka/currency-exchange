package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.ClientInteractionEvent;
import model.InteractionStatusEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Kontakt z Klientem
 */

@Schema(name = "ClientInteractionSummary", description = "Kontakt z Klientem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class ClientInteractionSummary {

  private Long id;

  private Long caseId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataWyslaniaOnePager;

  private String liczbaKontaktowZKlientemFirmaZewnetrzna;

  private String liczbaProbKontaktuZKlientemFirmaZewnetrzna;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPozytywnejRozmowyZKlientemFirmaZewnetrzna;

  private InteractionStatusEnum statusRozmowyZKlientemFirmaZewnetrzna;

  private String statusDokumentacjiKlienta;

  private String liczbaKontaktowZKlientemRbi;

  private String liczbaProbKontaktuZKlientemRbi;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPozytywnejRozmowyZKlientemRbi;

  private InteractionStatusEnum statusRozmowyZKlientemRbi;

  /**
   * 
   */
  public enum PrzyczynaOdmowyEnum {
    BRAK_ZAINTERESOWANIA_UGODA("BRAK_ZAINTERESOWANIA_UGODA"),
    
    OFERTA_ZA_MALA_KWOTA_UMORZENIA("OFERTA_ZA_MALA_KWOTA_UMORZENIA"),
    
    OFERTA_CHCE_ROZLICZENIA_DO_KAPITALU("OFERTA_CHCE_ROZLICZENIA_DO_KAPITALU"),
    
    OFERTA_MA_SWOJA_PROPOZYCJE("OFERTA_MA_SWOJA_PROPOZYCJE"),
    
    POZEW("POZEW"),
    
    NIE_MA_CZASU_ZASTANOWI_SIE("NIE_MA_CZASU_ZASTANOWI_SIE");

    private String value;

    PrzyczynaOdmowyEnum(String value) {
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
    public static PrzyczynaOdmowyEnum fromValue(String value) {
      for (PrzyczynaOdmowyEnum b : PrzyczynaOdmowyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PrzyczynaOdmowyEnum przyczynaOdmowy;

  @Valid
  private List<@Valid ClientInteractionEvent> rozmowyIds;

  public ClientInteractionSummary id(Long id) {
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

  public ClientInteractionSummary caseId(Long caseId) {
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

  public ClientInteractionSummary dataWyslaniaOnePager(LocalDate dataWyslaniaOnePager) {
    this.dataWyslaniaOnePager = dataWyslaniaOnePager;
    return this;
  }

  /**
   * Wybor z kalendarza yyyy-MM-dd. Od tej daty będzie się liczył czas do follow up
   * @return dataWyslaniaOnePager
  */
  @Valid 
  @Schema(name = "dataWyslaniaOnePager", description = "Wybor z kalendarza yyyy-MM-dd. Od tej daty będzie się liczył czas do follow up", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataWyslaniaOnePager")
  public LocalDate getDataWyslaniaOnePager() {
    return dataWyslaniaOnePager;
  }

  public void setDataWyslaniaOnePager(LocalDate dataWyslaniaOnePager) {
    this.dataWyslaniaOnePager = dataWyslaniaOnePager;
  }

  public ClientInteractionSummary liczbaKontaktowZKlientemFirmaZewnetrzna(String liczbaKontaktowZKlientemFirmaZewnetrzna) {
    this.liczbaKontaktowZKlientemFirmaZewnetrzna = liczbaKontaktowZKlientemFirmaZewnetrzna;
    return this;
  }

  /**
   * zlicza automatycznie liczbe kontaktow w sekcji rozmowa
   * @return liczbaKontaktowZKlientemFirmaZewnetrzna
  */
  @Size(min = 0, max = 2) 
  @Schema(name = "liczbaKontaktowZKlientemFirmaZewnetrzna", description = "zlicza automatycznie liczbe kontaktow w sekcji rozmowa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liczbaKontaktowZKlientemFirmaZewnetrzna")
  public String getLiczbaKontaktowZKlientemFirmaZewnetrzna() {
    return liczbaKontaktowZKlientemFirmaZewnetrzna;
  }

  public void setLiczbaKontaktowZKlientemFirmaZewnetrzna(String liczbaKontaktowZKlientemFirmaZewnetrzna) {
    this.liczbaKontaktowZKlientemFirmaZewnetrzna = liczbaKontaktowZKlientemFirmaZewnetrzna;
  }

  public ClientInteractionSummary liczbaProbKontaktuZKlientemFirmaZewnetrzna(String liczbaProbKontaktuZKlientemFirmaZewnetrzna) {
    this.liczbaProbKontaktuZKlientemFirmaZewnetrzna = liczbaProbKontaktuZKlientemFirmaZewnetrzna;
    return this;
  }

  /**
   * 
   * @return liczbaProbKontaktuZKlientemFirmaZewnetrzna
  */
  @Size(min = 0, max = 2) 
  @Schema(name = "liczbaProbKontaktuZKlientemFirmaZewnetrzna", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liczbaProbKontaktuZKlientemFirmaZewnetrzna")
  public String getLiczbaProbKontaktuZKlientemFirmaZewnetrzna() {
    return liczbaProbKontaktuZKlientemFirmaZewnetrzna;
  }

  public void setLiczbaProbKontaktuZKlientemFirmaZewnetrzna(String liczbaProbKontaktuZKlientemFirmaZewnetrzna) {
    this.liczbaProbKontaktuZKlientemFirmaZewnetrzna = liczbaProbKontaktuZKlientemFirmaZewnetrzna;
  }

  public ClientInteractionSummary dataPozytywnejRozmowyZKlientemFirmaZewnetrzna(LocalDate dataPozytywnejRozmowyZKlientemFirmaZewnetrzna) {
    this.dataPozytywnejRozmowyZKlientemFirmaZewnetrzna = dataPozytywnejRozmowyZKlientemFirmaZewnetrzna;
    return this;
  }

  /**
   * Wybor z kalendarza yyyy-MM-dd
   * @return dataPozytywnejRozmowyZKlientemFirmaZewnetrzna
  */
  @Valid 
  @Schema(name = "dataPozytywnejRozmowyZKlientemFirmaZewnetrzna", description = "Wybor z kalendarza yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPozytywnejRozmowyZKlientemFirmaZewnetrzna")
  public LocalDate getDataPozytywnejRozmowyZKlientemFirmaZewnetrzna() {
    return dataPozytywnejRozmowyZKlientemFirmaZewnetrzna;
  }

  public void setDataPozytywnejRozmowyZKlientemFirmaZewnetrzna(LocalDate dataPozytywnejRozmowyZKlientemFirmaZewnetrzna) {
    this.dataPozytywnejRozmowyZKlientemFirmaZewnetrzna = dataPozytywnejRozmowyZKlientemFirmaZewnetrzna;
  }

  public ClientInteractionSummary statusRozmowyZKlientemFirmaZewnetrzna(InteractionStatusEnum statusRozmowyZKlientemFirmaZewnetrzna) {
    this.statusRozmowyZKlientemFirmaZewnetrzna = statusRozmowyZKlientemFirmaZewnetrzna;
    return this;
  }

  /**
   * Get statusRozmowyZKlientemFirmaZewnetrzna
   * @return statusRozmowyZKlientemFirmaZewnetrzna
  */
  @Valid 
  @Schema(name = "statusRozmowyZKlientemFirmaZewnetrzna", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusRozmowyZKlientemFirmaZewnetrzna")
  public InteractionStatusEnum getStatusRozmowyZKlientemFirmaZewnetrzna() {
    return statusRozmowyZKlientemFirmaZewnetrzna;
  }

  public void setStatusRozmowyZKlientemFirmaZewnetrzna(InteractionStatusEnum statusRozmowyZKlientemFirmaZewnetrzna) {
    this.statusRozmowyZKlientemFirmaZewnetrzna = statusRozmowyZKlientemFirmaZewnetrzna;
  }

  public ClientInteractionSummary statusDokumentacjiKlienta(String statusDokumentacjiKlienta) {
    this.statusDokumentacjiKlienta = statusDokumentacjiKlienta;
    return this;
  }

  /**
   * w momencie odznaczenia miejsca w sekcji dokumentacja powinno w tym polu pojawić się dokumentacja otrzymana, jeżeli nie ma zmiany w polu sekcja dokumentacja pole pozostaje puste
   * @return statusDokumentacjiKlienta
  */
  @Size(min = 0, max = 1000) 
  @Schema(name = "statusDokumentacjiKlienta", description = "w momencie odznaczenia miejsca w sekcji dokumentacja powinno w tym polu pojawić się dokumentacja otrzymana, jeżeli nie ma zmiany w polu sekcja dokumentacja pole pozostaje puste", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusDokumentacjiKlienta")
  public String getStatusDokumentacjiKlienta() {
    return statusDokumentacjiKlienta;
  }

  public void setStatusDokumentacjiKlienta(String statusDokumentacjiKlienta) {
    this.statusDokumentacjiKlienta = statusDokumentacjiKlienta;
  }

  public ClientInteractionSummary liczbaKontaktowZKlientemRbi(String liczbaKontaktowZKlientemRbi) {
    this.liczbaKontaktowZKlientemRbi = liczbaKontaktowZKlientemRbi;
    return this;
  }

  /**
   * zlicza automatycznie liczbe kontaktow w sekcji rozmowa
   * @return liczbaKontaktowZKlientemRbi
  */
  @Size(min = 0, max = 2) 
  @Schema(name = "liczbaKontaktowZKlientemRbi", description = "zlicza automatycznie liczbe kontaktow w sekcji rozmowa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liczbaKontaktowZKlientemRbi")
  public String getLiczbaKontaktowZKlientemRbi() {
    return liczbaKontaktowZKlientemRbi;
  }

  public void setLiczbaKontaktowZKlientemRbi(String liczbaKontaktowZKlientemRbi) {
    this.liczbaKontaktowZKlientemRbi = liczbaKontaktowZKlientemRbi;
  }

  public ClientInteractionSummary liczbaProbKontaktuZKlientemRbi(String liczbaProbKontaktuZKlientemRbi) {
    this.liczbaProbKontaktuZKlientemRbi = liczbaProbKontaktuZKlientemRbi;
    return this;
  }

  /**
   * 
   * @return liczbaProbKontaktuZKlientemRbi
  */
  @Size(min = 0, max = 2) 
  @Schema(name = "liczbaProbKontaktuZKlientemRbi", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liczbaProbKontaktuZKlientemRbi")
  public String getLiczbaProbKontaktuZKlientemRbi() {
    return liczbaProbKontaktuZKlientemRbi;
  }

  public void setLiczbaProbKontaktuZKlientemRbi(String liczbaProbKontaktuZKlientemRbi) {
    this.liczbaProbKontaktuZKlientemRbi = liczbaProbKontaktuZKlientemRbi;
  }

  public ClientInteractionSummary dataPozytywnejRozmowyZKlientemRbi(LocalDate dataPozytywnejRozmowyZKlientemRbi) {
    this.dataPozytywnejRozmowyZKlientemRbi = dataPozytywnejRozmowyZKlientemRbi;
    return this;
  }

  /**
   * Wybor z kalendarza yyyy-MM-dd
   * @return dataPozytywnejRozmowyZKlientemRbi
  */
  @Valid 
  @Schema(name = "dataPozytywnejRozmowyZKlientemRbi", description = "Wybor z kalendarza yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPozytywnejRozmowyZKlientemRbi")
  public LocalDate getDataPozytywnejRozmowyZKlientemRbi() {
    return dataPozytywnejRozmowyZKlientemRbi;
  }

  public void setDataPozytywnejRozmowyZKlientemRbi(LocalDate dataPozytywnejRozmowyZKlientemRbi) {
    this.dataPozytywnejRozmowyZKlientemRbi = dataPozytywnejRozmowyZKlientemRbi;
  }

  public ClientInteractionSummary statusRozmowyZKlientemRbi(InteractionStatusEnum statusRozmowyZKlientemRbi) {
    this.statusRozmowyZKlientemRbi = statusRozmowyZKlientemRbi;
    return this;
  }

  /**
   * Get statusRozmowyZKlientemRbi
   * @return statusRozmowyZKlientemRbi
  */
  @Valid 
  @Schema(name = "statusRozmowyZKlientemRbi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusRozmowyZKlientemRbi")
  public InteractionStatusEnum getStatusRozmowyZKlientemRbi() {
    return statusRozmowyZKlientemRbi;
  }

  public void setStatusRozmowyZKlientemRbi(InteractionStatusEnum statusRozmowyZKlientemRbi) {
    this.statusRozmowyZKlientemRbi = statusRozmowyZKlientemRbi;
  }

  public ClientInteractionSummary przyczynaOdmowy(PrzyczynaOdmowyEnum przyczynaOdmowy) {
    this.przyczynaOdmowy = przyczynaOdmowy;
    return this;
  }

  /**
   * 
   * @return przyczynaOdmowy
  */
  
  @Schema(name = "przyczynaOdmowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("przyczynaOdmowy")
  public PrzyczynaOdmowyEnum getPrzyczynaOdmowy() {
    return przyczynaOdmowy;
  }

  public void setPrzyczynaOdmowy(PrzyczynaOdmowyEnum przyczynaOdmowy) {
    this.przyczynaOdmowy = przyczynaOdmowy;
  }

  public ClientInteractionSummary rozmowyIds(List<@Valid ClientInteractionEvent> rozmowyIds) {
    this.rozmowyIds = rozmowyIds;
    return this;
  }

  public ClientInteractionSummary addRozmowyIdsItem(ClientInteractionEvent rozmowyIdsItem) {
    if (this.rozmowyIds == null) {
      this.rozmowyIds = new ArrayList<>();
    }
    this.rozmowyIds.add(rozmowyIdsItem);
    return this;
  }

  /**
   * 
   * @return rozmowyIds
  */
  @Valid 
  @Schema(name = "rozmowyIds", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rozmowyIds")
  public List<@Valid ClientInteractionEvent> getRozmowyIds() {
    return rozmowyIds;
  }

  public void setRozmowyIds(List<@Valid ClientInteractionEvent> rozmowyIds) {
    this.rozmowyIds = rozmowyIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInteractionSummary clientInteractionSummary = (ClientInteractionSummary) o;
    return Objects.equals(this.id, clientInteractionSummary.id) &&
        Objects.equals(this.caseId, clientInteractionSummary.caseId) &&
        Objects.equals(this.dataWyslaniaOnePager, clientInteractionSummary.dataWyslaniaOnePager) &&
        Objects.equals(this.liczbaKontaktowZKlientemFirmaZewnetrzna, clientInteractionSummary.liczbaKontaktowZKlientemFirmaZewnetrzna) &&
        Objects.equals(this.liczbaProbKontaktuZKlientemFirmaZewnetrzna, clientInteractionSummary.liczbaProbKontaktuZKlientemFirmaZewnetrzna) &&
        Objects.equals(this.dataPozytywnejRozmowyZKlientemFirmaZewnetrzna, clientInteractionSummary.dataPozytywnejRozmowyZKlientemFirmaZewnetrzna) &&
        Objects.equals(this.statusRozmowyZKlientemFirmaZewnetrzna, clientInteractionSummary.statusRozmowyZKlientemFirmaZewnetrzna) &&
        Objects.equals(this.statusDokumentacjiKlienta, clientInteractionSummary.statusDokumentacjiKlienta) &&
        Objects.equals(this.liczbaKontaktowZKlientemRbi, clientInteractionSummary.liczbaKontaktowZKlientemRbi) &&
        Objects.equals(this.liczbaProbKontaktuZKlientemRbi, clientInteractionSummary.liczbaProbKontaktuZKlientemRbi) &&
        Objects.equals(this.dataPozytywnejRozmowyZKlientemRbi, clientInteractionSummary.dataPozytywnejRozmowyZKlientemRbi) &&
        Objects.equals(this.statusRozmowyZKlientemRbi, clientInteractionSummary.statusRozmowyZKlientemRbi) &&
        Objects.equals(this.przyczynaOdmowy, clientInteractionSummary.przyczynaOdmowy) &&
        Objects.equals(this.rozmowyIds, clientInteractionSummary.rozmowyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, dataWyslaniaOnePager, liczbaKontaktowZKlientemFirmaZewnetrzna, liczbaProbKontaktuZKlientemFirmaZewnetrzna, dataPozytywnejRozmowyZKlientemFirmaZewnetrzna, statusRozmowyZKlientemFirmaZewnetrzna, statusDokumentacjiKlienta, liczbaKontaktowZKlientemRbi, liczbaProbKontaktuZKlientemRbi, dataPozytywnejRozmowyZKlientemRbi, statusRozmowyZKlientemRbi, przyczynaOdmowy, rozmowyIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInteractionSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    dataWyslaniaOnePager: ").append(toIndentedString(dataWyslaniaOnePager)).append("\n");
    sb.append("    liczbaKontaktowZKlientemFirmaZewnetrzna: ").append(toIndentedString(liczbaKontaktowZKlientemFirmaZewnetrzna)).append("\n");
    sb.append("    liczbaProbKontaktuZKlientemFirmaZewnetrzna: ").append(toIndentedString(liczbaProbKontaktuZKlientemFirmaZewnetrzna)).append("\n");
    sb.append("    dataPozytywnejRozmowyZKlientemFirmaZewnetrzna: ").append(toIndentedString(dataPozytywnejRozmowyZKlientemFirmaZewnetrzna)).append("\n");
    sb.append("    statusRozmowyZKlientemFirmaZewnetrzna: ").append(toIndentedString(statusRozmowyZKlientemFirmaZewnetrzna)).append("\n");
    sb.append("    statusDokumentacjiKlienta: ").append(toIndentedString(statusDokumentacjiKlienta)).append("\n");
    sb.append("    liczbaKontaktowZKlientemRbi: ").append(toIndentedString(liczbaKontaktowZKlientemRbi)).append("\n");
    sb.append("    liczbaProbKontaktuZKlientemRbi: ").append(toIndentedString(liczbaProbKontaktuZKlientemRbi)).append("\n");
    sb.append("    dataPozytywnejRozmowyZKlientemRbi: ").append(toIndentedString(dataPozytywnejRozmowyZKlientemRbi)).append("\n");
    sb.append("    statusRozmowyZKlientemRbi: ").append(toIndentedString(statusRozmowyZKlientemRbi)).append("\n");
    sb.append("    przyczynaOdmowy: ").append(toIndentedString(przyczynaOdmowy)).append("\n");
    sb.append("    rozmowyIds: ").append(toIndentedString(rozmowyIds)).append("\n");
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

