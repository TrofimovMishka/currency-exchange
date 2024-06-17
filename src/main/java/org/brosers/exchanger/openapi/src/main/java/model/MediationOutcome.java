package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * Wynik mediacji
 */

@Schema(name = "MediationOutcome", description = "Wynik mediacji")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class MediationOutcome {

  private Long id;

  private Long caseId;

  /**
   * 
   */
  public enum DecyzjaKlientaEnum {
    POZYTYWNA("POZYTYWNA"),
    
    NEGATYWNA("NEGATYWNA");

    private String value;

    DecyzjaKlientaEnum(String value) {
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
    public static DecyzjaKlientaEnum fromValue(String value) {
      for (DecyzjaKlientaEnum b : DecyzjaKlientaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DecyzjaKlientaEnum decyzjaKlienta;

  /**
   * 
   */
  public enum RodzajUgodyEnum {
    KONTYNUACJA_ZMIENNE_OPROCENTOWANIE("KONTYNUACJA_ZMIENNE_OPROCENTOWANIE"),
    
    KONTYNUACJA_STALE_OPROCENTOWANIE("KONTYNUACJA_STALE_OPROCENTOWANIE"),
    
    SPLATA("SPLATA"),
    
    ZWROT("ZWROT");

    private String value;

    RodzajUgodyEnum(String value) {
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
    public static RodzajUgodyEnum fromValue(String value) {
      for (RodzajUgodyEnum b : RodzajUgodyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RodzajUgodyEnum rodzajUgody;

  private Boolean wynegocjowaneWarunki;

  private BigDecimal wynegocjowanaKwotaDoSplaty;

  private String wynegocjowanaMarza;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPrzekazaniaDecyzjiPozytywnej;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataPrzekazaniaDecyzjiNegatywnej;

  public MediationOutcome id(Long id) {
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

  public MediationOutcome caseId(Long caseId) {
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

  public MediationOutcome decyzjaKlienta(DecyzjaKlientaEnum decyzjaKlienta) {
    this.decyzjaKlienta = decyzjaKlienta;
    return this;
  }

  /**
   * 
   * @return decyzjaKlienta
  */
  
  @Schema(name = "decyzjaKlienta", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decyzjaKlienta")
  public DecyzjaKlientaEnum getDecyzjaKlienta() {
    return decyzjaKlienta;
  }

  public void setDecyzjaKlienta(DecyzjaKlientaEnum decyzjaKlienta) {
    this.decyzjaKlienta = decyzjaKlienta;
  }

  public MediationOutcome rodzajUgody(RodzajUgodyEnum rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
    return this;
  }

  /**
   * 
   * @return rodzajUgody
  */
  
  @Schema(name = "rodzajUgody", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rodzajUgody")
  public RodzajUgodyEnum getRodzajUgody() {
    return rodzajUgody;
  }

  public void setRodzajUgody(RodzajUgodyEnum rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
  }

  public MediationOutcome wynegocjowaneWarunki(Boolean wynegocjowaneWarunki) {
    this.wynegocjowaneWarunki = wynegocjowaneWarunki;
    return this;
  }

  /**
   * 
   * @return wynegocjowaneWarunki
  */
  
  @Schema(name = "wynegocjowaneWarunki", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wynegocjowaneWarunki")
  public Boolean getWynegocjowaneWarunki() {
    return wynegocjowaneWarunki;
  }

  public void setWynegocjowaneWarunki(Boolean wynegocjowaneWarunki) {
    this.wynegocjowaneWarunki = wynegocjowaneWarunki;
  }

  public MediationOutcome wynegocjowanaKwotaDoSplaty(BigDecimal wynegocjowanaKwotaDoSplaty) {
    this.wynegocjowanaKwotaDoSplaty = wynegocjowanaKwotaDoSplaty;
    return this;
  }

  /**
   * Tylko cyfry. Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return wynegocjowanaKwotaDoSplaty
  */
  @Valid 
  @Schema(name = "wynegocjowanaKwotaDoSplaty", description = "Tylko cyfry. Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wynegocjowanaKwotaDoSplaty")
  public BigDecimal getWynegocjowanaKwotaDoSplaty() {
    return wynegocjowanaKwotaDoSplaty;
  }

  public void setWynegocjowanaKwotaDoSplaty(BigDecimal wynegocjowanaKwotaDoSplaty) {
    this.wynegocjowanaKwotaDoSplaty = wynegocjowanaKwotaDoSplaty;
  }

  public MediationOutcome wynegocjowanaMarza(String wynegocjowanaMarza) {
    this.wynegocjowanaMarza = wynegocjowanaMarza;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return wynegocjowanaMarza
  */
  @Size(min = 0, max = 10) 
  @Schema(name = "wynegocjowanaMarza", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wynegocjowanaMarza")
  public String getWynegocjowanaMarza() {
    return wynegocjowanaMarza;
  }

  public void setWynegocjowanaMarza(String wynegocjowanaMarza) {
    this.wynegocjowanaMarza = wynegocjowanaMarza;
  }

  public MediationOutcome dataPrzekazaniaDecyzjiPozytywnej(LocalDate dataPrzekazaniaDecyzjiPozytywnej) {
    this.dataPrzekazaniaDecyzjiPozytywnej = dataPrzekazaniaDecyzjiPozytywnej;
    return this;
  }

  /**
   * wybor z kalendarza. yyyy-MM-dd
   * @return dataPrzekazaniaDecyzjiPozytywnej
  */
  @Valid 
  @Schema(name = "dataPrzekazaniaDecyzjiPozytywnej", description = "wybor z kalendarza. yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPrzekazaniaDecyzjiPozytywnej")
  public LocalDate getDataPrzekazaniaDecyzjiPozytywnej() {
    return dataPrzekazaniaDecyzjiPozytywnej;
  }

  public void setDataPrzekazaniaDecyzjiPozytywnej(LocalDate dataPrzekazaniaDecyzjiPozytywnej) {
    this.dataPrzekazaniaDecyzjiPozytywnej = dataPrzekazaniaDecyzjiPozytywnej;
  }

  public MediationOutcome dataPrzekazaniaDecyzjiNegatywnej(OffsetDateTime dataPrzekazaniaDecyzjiNegatywnej) {
    this.dataPrzekazaniaDecyzjiNegatywnej = dataPrzekazaniaDecyzjiNegatywnej;
    return this;
  }

  /**
   * Date when agreement was negative
   * @return dataPrzekazaniaDecyzjiNegatywnej
  */
  @Valid 
  @Schema(name = "dataPrzekazaniaDecyzjiNegatywnej", description = "Date when agreement was negative", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPrzekazaniaDecyzjiNegatywnej")
  public OffsetDateTime getDataPrzekazaniaDecyzjiNegatywnej() {
    return dataPrzekazaniaDecyzjiNegatywnej;
  }

  public void setDataPrzekazaniaDecyzjiNegatywnej(OffsetDateTime dataPrzekazaniaDecyzjiNegatywnej) {
    this.dataPrzekazaniaDecyzjiNegatywnej = dataPrzekazaniaDecyzjiNegatywnej;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediationOutcome mediationOutcome = (MediationOutcome) o;
    return Objects.equals(this.id, mediationOutcome.id) &&
        Objects.equals(this.caseId, mediationOutcome.caseId) &&
        Objects.equals(this.decyzjaKlienta, mediationOutcome.decyzjaKlienta) &&
        Objects.equals(this.rodzajUgody, mediationOutcome.rodzajUgody) &&
        Objects.equals(this.wynegocjowaneWarunki, mediationOutcome.wynegocjowaneWarunki) &&
        Objects.equals(this.wynegocjowanaKwotaDoSplaty, mediationOutcome.wynegocjowanaKwotaDoSplaty) &&
        Objects.equals(this.wynegocjowanaMarza, mediationOutcome.wynegocjowanaMarza) &&
        Objects.equals(this.dataPrzekazaniaDecyzjiPozytywnej, mediationOutcome.dataPrzekazaniaDecyzjiPozytywnej) &&
        Objects.equals(this.dataPrzekazaniaDecyzjiNegatywnej, mediationOutcome.dataPrzekazaniaDecyzjiNegatywnej);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, decyzjaKlienta, rodzajUgody, wynegocjowaneWarunki, wynegocjowanaKwotaDoSplaty, wynegocjowanaMarza, dataPrzekazaniaDecyzjiPozytywnej, dataPrzekazaniaDecyzjiNegatywnej);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediationOutcome {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    decyzjaKlienta: ").append(toIndentedString(decyzjaKlienta)).append("\n");
    sb.append("    rodzajUgody: ").append(toIndentedString(rodzajUgody)).append("\n");
    sb.append("    wynegocjowaneWarunki: ").append(toIndentedString(wynegocjowaneWarunki)).append("\n");
    sb.append("    wynegocjowanaKwotaDoSplaty: ").append(toIndentedString(wynegocjowanaKwotaDoSplaty)).append("\n");
    sb.append("    wynegocjowanaMarza: ").append(toIndentedString(wynegocjowanaMarza)).append("\n");
    sb.append("    dataPrzekazaniaDecyzjiPozytywnej: ").append(toIndentedString(dataPrzekazaniaDecyzjiPozytywnej)).append("\n");
    sb.append("    dataPrzekazaniaDecyzjiNegatywnej: ").append(toIndentedString(dataPrzekazaniaDecyzjiNegatywnej)).append("\n");
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

