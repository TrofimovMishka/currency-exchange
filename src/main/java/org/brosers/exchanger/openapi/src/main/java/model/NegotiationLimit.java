package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import model.DecyzjaRbi;
import model.RodzajUgody;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Limit negocjacyjny w ramach kalkulacji (CalculationSummary). Dodajac nowy limit negocjacyjny: nowa sekcja zaciągnie się z wartościami z sekcji poprzedniej, jeżeli któreś pola będą wymagały korekty, zostaną zmienione ręcznie
 */

@Schema(name = "NegotiationLimit", description = "Limit negocjacyjny w ramach kalkulacji (CalculationSummary). Dodajac nowy limit negocjacyjny: nowa sekcja zaciągnie się z wartościami z sekcji poprzedniej, jeżeli któreś pola będą wymagały korekty, zostaną zmienione ręcznie")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class NegotiationLimit {

  private Long id;

  private Long caseId;

  private BigDecimal kwotaDoJakiejMoznaObnizycSaldoKredytu;

  private BigDecimal roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu;

  private BigDecimal marzaMinimalna;

  private BigDecimal roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna;

  private BigDecimal roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna;

  /**
   * 
   */
  public enum NegocjacjaEnum {
    MARZA("MARZA"),
    
    KWOTA("KWOTA"),
    
    INNE("INNE");

    private String value;

    NegocjacjaEnum(String value) {
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
    public static NegocjacjaEnum fromValue(String value) {
      for (NegocjacjaEnum b : NegocjacjaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NegocjacjaEnum negocjacja;

  private String dodatkoweUzgodnienia;

  private BigDecimal saldoKapitaluPoUgodzie;

  private BigDecimal marzaPP;

  private String inne;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataUzytkownika;

  private DecyzjaRbi decyzjaRbi;

  private RodzajUgody rodzajUgody;

  public NegotiationLimit id(Long id) {
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

  public NegotiationLimit caseId(Long caseId) {
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

  public NegotiationLimit kwotaDoJakiejMoznaObnizycSaldoKredytu(BigDecimal kwotaDoJakiejMoznaObnizycSaldoKredytu) {
    this.kwotaDoJakiejMoznaObnizycSaldoKredytu = kwotaDoJakiejMoznaObnizycSaldoKredytu;
    return this;
  }

  /**
   * Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -1.0E+20
   * maximum: 1.0E+20
   * @return kwotaDoJakiejMoznaObnizycSaldoKredytu
  */
  @Valid @DecimalMin("-1.0E+20") @DecimalMax("1.0E+20") 
  @Schema(name = "kwotaDoJakiejMoznaObnizycSaldoKredytu", description = "Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kwotaDoJakiejMoznaObnizycSaldoKredytu")
  public BigDecimal getKwotaDoJakiejMoznaObnizycSaldoKredytu() {
    return kwotaDoJakiejMoznaObnizycSaldoKredytu;
  }

  public void setKwotaDoJakiejMoznaObnizycSaldoKredytu(BigDecimal kwotaDoJakiejMoznaObnizycSaldoKredytu) {
    this.kwotaDoJakiejMoznaObnizycSaldoKredytu = kwotaDoJakiejMoznaObnizycSaldoKredytu;
  }

  public NegotiationLimit roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu(BigDecimal roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu) {
    this.roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu = roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu;
    return this;
  }

  /**
   * Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -1.0E+20
   * maximum: 1.0E+20
   * @return roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu
  */
  @Valid @DecimalMin("-1.0E+20") @DecimalMax("1.0E+20") 
  @Schema(name = "roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu", description = "Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu")
  public BigDecimal getRoznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu() {
    return roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu;
  }

  public void setRoznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu(BigDecimal roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu) {
    this.roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu = roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu;
  }

  public NegotiationLimit marzaMinimalna(BigDecimal marzaMinimalna) {
    this.marzaMinimalna = marzaMinimalna;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return marzaMinimalna
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "marzaMinimalna", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marzaMinimalna")
  public BigDecimal getMarzaMinimalna() {
    return marzaMinimalna;
  }

  public void setMarzaMinimalna(BigDecimal marzaMinimalna) {
    this.marzaMinimalna = marzaMinimalna;
  }

  public NegotiationLimit roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna(BigDecimal roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna) {
    this.roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna = roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna")
  public BigDecimal getRoznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna() {
    return roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna;
  }

  public void setRoznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna(BigDecimal roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna) {
    this.roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna = roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna;
  }

  public NegotiationLimit roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna(BigDecimal roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna) {
    this.roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna = roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna")
  public BigDecimal getRoznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna() {
    return roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna;
  }

  public void setRoznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna(BigDecimal roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna) {
    this.roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna = roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna;
  }

  public NegotiationLimit negocjacja(NegocjacjaEnum negocjacja) {
    this.negocjacja = negocjacja;
    return this;
  }

  /**
   * 
   * @return negocjacja
  */
  
  @Schema(name = "negocjacja", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negocjacja")
  public NegocjacjaEnum getNegocjacja() {
    return negocjacja;
  }

  public void setNegocjacja(NegocjacjaEnum negocjacja) {
    this.negocjacja = negocjacja;
  }

  public NegotiationLimit dodatkoweUzgodnienia(String dodatkoweUzgodnienia) {
    this.dodatkoweUzgodnienia = dodatkoweUzgodnienia;
    return this;
  }

  /**
   * 
   * @return dodatkoweUzgodnienia
  */
  @Size(min = 0, max = 1000) 
  @Schema(name = "dodatkoweUzgodnienia", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dodatkoweUzgodnienia")
  public String getDodatkoweUzgodnienia() {
    return dodatkoweUzgodnienia;
  }

  public void setDodatkoweUzgodnienia(String dodatkoweUzgodnienia) {
    this.dodatkoweUzgodnienia = dodatkoweUzgodnienia;
  }

  public NegotiationLimit saldoKapitaluPoUgodzie(BigDecimal saldoKapitaluPoUgodzie) {
    this.saldoKapitaluPoUgodzie = saldoKapitaluPoUgodzie;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -1.0E+20
   * maximum: 1.0E+20
   * @return saldoKapitaluPoUgodzie
  */
  @Valid @DecimalMin("-1.0E+20") @DecimalMax("1.0E+20") 
  @Schema(name = "saldoKapitaluPoUgodzie", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("saldoKapitaluPoUgodzie")
  public BigDecimal getSaldoKapitaluPoUgodzie() {
    return saldoKapitaluPoUgodzie;
  }

  public void setSaldoKapitaluPoUgodzie(BigDecimal saldoKapitaluPoUgodzie) {
    this.saldoKapitaluPoUgodzie = saldoKapitaluPoUgodzie;
  }

  public NegotiationLimit marzaPP(BigDecimal marzaPP) {
    this.marzaPP = marzaPP;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return marzaPP
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "marzaPP", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marzaPP")
  public BigDecimal getMarzaPP() {
    return marzaPP;
  }

  public void setMarzaPP(BigDecimal marzaPP) {
    this.marzaPP = marzaPP;
  }

  public NegotiationLimit inne(String inne) {
    this.inne = inne;
    return this;
  }

  /**
   * 
   * @return inne
  */
  @Size(min = 0, max = 1000) 
  @Schema(name = "inne", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inne")
  public String getInne() {
    return inne;
  }

  public void setInne(String inne) {
    this.inne = inne;
  }

  public NegotiationLimit dataUzytkownika(OffsetDateTime dataUzytkownika) {
    this.dataUzytkownika = dataUzytkownika;
    return this;
  }

  /**
   * uzupełnione automatycznie datą bieżącą po wyborze jakiejkolwiek wartości w polu decyzja
   * @return dataUzytkownika
  */
  @Valid 
  @Schema(name = "dataUzytkownika", description = "uzupełnione automatycznie datą bieżącą po wyborze jakiejkolwiek wartości w polu decyzja", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataUzytkownika")
  public OffsetDateTime getDataUzytkownika() {
    return dataUzytkownika;
  }

  public void setDataUzytkownika(OffsetDateTime dataUzytkownika) {
    this.dataUzytkownika = dataUzytkownika;
  }

  public NegotiationLimit decyzjaRbi(DecyzjaRbi decyzjaRbi) {
    this.decyzjaRbi = decyzjaRbi;
    return this;
  }

  /**
   * Get decyzjaRbi
   * @return decyzjaRbi
  */
  @Valid 
  @Schema(name = "decyzjaRbi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decyzjaRbi")
  public DecyzjaRbi getDecyzjaRbi() {
    return decyzjaRbi;
  }

  public void setDecyzjaRbi(DecyzjaRbi decyzjaRbi) {
    this.decyzjaRbi = decyzjaRbi;
  }

  public NegotiationLimit rodzajUgody(RodzajUgody rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
    return this;
  }

  /**
   * Get rodzajUgody
   * @return rodzajUgody
  */
  @Valid 
  @Schema(name = "rodzajUgody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rodzajUgody")
  public RodzajUgody getRodzajUgody() {
    return rodzajUgody;
  }

  public void setRodzajUgody(RodzajUgody rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationLimit negotiationLimit = (NegotiationLimit) o;
    return Objects.equals(this.id, negotiationLimit.id) &&
        Objects.equals(this.caseId, negotiationLimit.caseId) &&
        Objects.equals(this.kwotaDoJakiejMoznaObnizycSaldoKredytu, negotiationLimit.kwotaDoJakiejMoznaObnizycSaldoKredytu) &&
        Objects.equals(this.roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu, negotiationLimit.roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu) &&
        Objects.equals(this.marzaMinimalna, negotiationLimit.marzaMinimalna) &&
        Objects.equals(this.roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna, negotiationLimit.roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna) &&
        Objects.equals(this.roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna, negotiationLimit.roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna) &&
        Objects.equals(this.negocjacja, negotiationLimit.negocjacja) &&
        Objects.equals(this.dodatkoweUzgodnienia, negotiationLimit.dodatkoweUzgodnienia) &&
        Objects.equals(this.saldoKapitaluPoUgodzie, negotiationLimit.saldoKapitaluPoUgodzie) &&
        Objects.equals(this.marzaPP, negotiationLimit.marzaPP) &&
        Objects.equals(this.inne, negotiationLimit.inne) &&
        Objects.equals(this.dataUzytkownika, negotiationLimit.dataUzytkownika) &&
        Objects.equals(this.decyzjaRbi, negotiationLimit.decyzjaRbi) &&
        Objects.equals(this.rodzajUgody, negotiationLimit.rodzajUgody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, kwotaDoJakiejMoznaObnizycSaldoKredytu, roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu, marzaMinimalna, roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna, roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna, negocjacja, dodatkoweUzgodnienia, saldoKapitaluPoUgodzie, marzaPP, inne, dataUzytkownika, decyzjaRbi, rodzajUgody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationLimit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    kwotaDoJakiejMoznaObnizycSaldoKredytu: ").append(toIndentedString(kwotaDoJakiejMoznaObnizycSaldoKredytu)).append("\n");
    sb.append("    roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu: ").append(toIndentedString(roznicaPomiedzyPozostalyKapitalDoSplatyPLNAKwotaDoJakiejMoznaObnizycSaldoKredytu)).append("\n");
    sb.append("    marzaMinimalna: ").append(toIndentedString(marzaMinimalna)).append("\n");
    sb.append("    roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna: ").append(toIndentedString(roznicaMiedzyWysokoscMarzyZmienneOprocentowanieAMarzaMinimalna)).append("\n");
    sb.append("    roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna: ").append(toIndentedString(roznicaMiedzyWysokoscMarzyStalaStopaProcentowaAMarzaMinimalna)).append("\n");
    sb.append("    negocjacja: ").append(toIndentedString(negocjacja)).append("\n");
    sb.append("    dodatkoweUzgodnienia: ").append(toIndentedString(dodatkoweUzgodnienia)).append("\n");
    sb.append("    saldoKapitaluPoUgodzie: ").append(toIndentedString(saldoKapitaluPoUgodzie)).append("\n");
    sb.append("    marzaPP: ").append(toIndentedString(marzaPP)).append("\n");
    sb.append("    inne: ").append(toIndentedString(inne)).append("\n");
    sb.append("    dataUzytkownika: ").append(toIndentedString(dataUzytkownika)).append("\n");
    sb.append("    decyzjaRbi: ").append(toIndentedString(decyzjaRbi)).append("\n");
    sb.append("    rodzajUgody: ").append(toIndentedString(rodzajUgody)).append("\n");
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

