package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.NegotiationLimit;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Kalkulacje
 */

@Schema(name = "CalculationSummary", description = "Kalkulacje")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CalculationSummary {

  private Long id;

  private Long caseId;

  private BigDecimal kwotaUmorzenia;

  private BigDecimal pozostalyKapitalDoSplatyPLN;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime ostatecznyTerminSplatyKredytu;

  private BigDecimal marzaKredytu;

  private BigDecimal wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji;

  private BigDecimal wysokoscPierwszegoWIBORuZKalkulacji;

  private BigDecimal wysokoscMarzyZmienneOprocentowanie;

  private BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu;

  private BigDecimal procentowyWzrostObnizenieWysokosciRaty;

  private BigDecimal wysokoscMarzyStalaStopaProcentowa;

  private BigDecimal stalaStopaProcentowa;

  private BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie;

  private String notatka;

  @Valid
  private List<@Valid NegotiationLimit> limitNegocjacyjny;

  public CalculationSummary id(Long id) {
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

  public CalculationSummary caseId(Long caseId) {
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

  public CalculationSummary kwotaUmorzenia(BigDecimal kwotaUmorzenia) {
    this.kwotaUmorzenia = kwotaUmorzenia;
    return this;
  }

  /**
   * Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -1.0E+20
   * maximum: 1.0E+20
   * @return kwotaUmorzenia
  */
  @Valid @DecimalMin("-1.0E+20") @DecimalMax("1.0E+20") 
  @Schema(name = "kwotaUmorzenia", description = "Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kwotaUmorzenia")
  public BigDecimal getKwotaUmorzenia() {
    return kwotaUmorzenia;
  }

  public void setKwotaUmorzenia(BigDecimal kwotaUmorzenia) {
    this.kwotaUmorzenia = kwotaUmorzenia;
  }

  public CalculationSummary pozostalyKapitalDoSplatyPLN(BigDecimal pozostalyKapitalDoSplatyPLN) {
    this.pozostalyKapitalDoSplatyPLN = pozostalyKapitalDoSplatyPLN;
    return this;
  }

  /**
   * 
   * minimum: -1.0E+20
   * maximum: 1.0E+20
   * @return pozostalyKapitalDoSplatyPLN
  */
  @Valid @DecimalMin("-1.0E+20") @DecimalMax("1.0E+20") 
  @Schema(name = "pozostalyKapitalDoSplatyPLN", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pozostalyKapitalDoSplatyPLN")
  public BigDecimal getPozostalyKapitalDoSplatyPLN() {
    return pozostalyKapitalDoSplatyPLN;
  }

  public void setPozostalyKapitalDoSplatyPLN(BigDecimal pozostalyKapitalDoSplatyPLN) {
    this.pozostalyKapitalDoSplatyPLN = pozostalyKapitalDoSplatyPLN;
  }

  public CalculationSummary ostatecznyTerminSplatyKredytu(OffsetDateTime ostatecznyTerminSplatyKredytu) {
    this.ostatecznyTerminSplatyKredytu = ostatecznyTerminSplatyKredytu;
    return this;
  }

  /**
   * Wybor z kalendarza yyyy-MM-dd
   * @return ostatecznyTerminSplatyKredytu
  */
  @Valid 
  @Schema(name = "ostatecznyTerminSplatyKredytu", description = "Wybor z kalendarza yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ostatecznyTerminSplatyKredytu")
  public OffsetDateTime getOstatecznyTerminSplatyKredytu() {
    return ostatecznyTerminSplatyKredytu;
  }

  public void setOstatecznyTerminSplatyKredytu(OffsetDateTime ostatecznyTerminSplatyKredytu) {
    this.ostatecznyTerminSplatyKredytu = ostatecznyTerminSplatyKredytu;
  }

  public CalculationSummary marzaKredytu(BigDecimal marzaKredytu) {
    this.marzaKredytu = marzaKredytu;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return marzaKredytu
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "marzaKredytu", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marzaKredytu")
  public BigDecimal getMarzaKredytu() {
    return marzaKredytu;
  }

  public void setMarzaKredytu(BigDecimal marzaKredytu) {
    this.marzaKredytu = marzaKredytu;
  }

  public CalculationSummary wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji(BigDecimal wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji) {
    this.wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji = wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji;
    return this;
  }

  /**
   * Wyrażone w %. Format: XX,XX znaki dziesiętne oddzielone przecinkiem
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji", description = "Wyrażone w %. Format: XX,XX znaki dziesiętne oddzielone przecinkiem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji")
  public BigDecimal getWysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji() {
    return wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji;
  }

  public void setWysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji(BigDecimal wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji) {
    this.wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji = wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji;
  }

  public CalculationSummary wysokoscPierwszegoWIBORuZKalkulacji(BigDecimal wysokoscPierwszegoWIBORuZKalkulacji) {
    this.wysokoscPierwszegoWIBORuZKalkulacji = wysokoscPierwszegoWIBORuZKalkulacji;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return wysokoscPierwszegoWIBORuZKalkulacji
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "wysokoscPierwszegoWIBORuZKalkulacji", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscPierwszegoWIBORuZKalkulacji")
  public BigDecimal getWysokoscPierwszegoWIBORuZKalkulacji() {
    return wysokoscPierwszegoWIBORuZKalkulacji;
  }

  public void setWysokoscPierwszegoWIBORuZKalkulacji(BigDecimal wysokoscPierwszegoWIBORuZKalkulacji) {
    this.wysokoscPierwszegoWIBORuZKalkulacji = wysokoscPierwszegoWIBORuZKalkulacji;
  }

  public CalculationSummary wysokoscMarzyZmienneOprocentowanie(BigDecimal wysokoscMarzyZmienneOprocentowanie) {
    this.wysokoscMarzyZmienneOprocentowanie = wysokoscMarzyZmienneOprocentowanie;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return wysokoscMarzyZmienneOprocentowanie
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "wysokoscMarzyZmienneOprocentowanie", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscMarzyZmienneOprocentowanie")
  public BigDecimal getWysokoscMarzyZmienneOprocentowanie() {
    return wysokoscMarzyZmienneOprocentowanie;
  }

  public void setWysokoscMarzyZmienneOprocentowanie(BigDecimal wysokoscMarzyZmienneOprocentowanie) {
    this.wysokoscMarzyZmienneOprocentowanie = wysokoscMarzyZmienneOprocentowanie;
  }

  public CalculationSummary szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu(BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu) {
    this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu = szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu")
  public BigDecimal getSzacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu() {
    return szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu;
  }

  public void setSzacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu(BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu) {
    this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu = szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu;
  }

  public CalculationSummary procentowyWzrostObnizenieWysokosciRaty(BigDecimal procentowyWzrostObnizenieWysokosciRaty) {
    this.procentowyWzrostObnizenieWysokosciRaty = procentowyWzrostObnizenieWysokosciRaty;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999.9999
   * maximum: 99999.9999
   * @return procentowyWzrostObnizenieWysokosciRaty
  */
  @Valid @DecimalMin("-99999.9999") @DecimalMax("99999.9999") 
  @Schema(name = "procentowyWzrostObnizenieWysokosciRaty", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("procentowyWzrostObnizenieWysokosciRaty")
  public BigDecimal getProcentowyWzrostObnizenieWysokosciRaty() {
    return procentowyWzrostObnizenieWysokosciRaty;
  }

  public void setProcentowyWzrostObnizenieWysokosciRaty(BigDecimal procentowyWzrostObnizenieWysokosciRaty) {
    this.procentowyWzrostObnizenieWysokosciRaty = procentowyWzrostObnizenieWysokosciRaty;
  }

  public CalculationSummary wysokoscMarzyStalaStopaProcentowa(BigDecimal wysokoscMarzyStalaStopaProcentowa) {
    this.wysokoscMarzyStalaStopaProcentowa = wysokoscMarzyStalaStopaProcentowa;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return wysokoscMarzyStalaStopaProcentowa
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "wysokoscMarzyStalaStopaProcentowa", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscMarzyStalaStopaProcentowa")
  public BigDecimal getWysokoscMarzyStalaStopaProcentowa() {
    return wysokoscMarzyStalaStopaProcentowa;
  }

  public void setWysokoscMarzyStalaStopaProcentowa(BigDecimal wysokoscMarzyStalaStopaProcentowa) {
    this.wysokoscMarzyStalaStopaProcentowa = wysokoscMarzyStalaStopaProcentowa;
  }

  public CalculationSummary stalaStopaProcentowa(BigDecimal stalaStopaProcentowa) {
    this.stalaStopaProcentowa = stalaStopaProcentowa;
    return this;
  }

  /**
   * Wyrażone w %. Format: XX,XX znaki dziesiętne oddzielone przecinkiem
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return stalaStopaProcentowa
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "stalaStopaProcentowa", description = "Wyrażone w %. Format: XX,XX znaki dziesiętne oddzielone przecinkiem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stalaStopaProcentowa")
  public BigDecimal getStalaStopaProcentowa() {
    return stalaStopaProcentowa;
  }

  public void setStalaStopaProcentowa(BigDecimal stalaStopaProcentowa) {
    this.stalaStopaProcentowa = stalaStopaProcentowa;
  }

  public CalculationSummary szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie(BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie) {
    this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie = szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * minimum: -9999999999.9999
   * maximum: 9999999999.9999
   * @return szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie
  */
  @Valid @DecimalMin("-9999999999.9999") @DecimalMax("9999999999.9999") 
  @Schema(name = "szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie")
  public BigDecimal getSzacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie() {
    return szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie;
  }

  public void setSzacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie(BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie) {
    this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie = szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie;
  }

  public CalculationSummary notatka(String notatka) {
    this.notatka = notatka;
    return this;
  }

  /**
   * 
   * @return notatka
  */
  @Size(min = 0, max = 5000) 
  @Schema(name = "notatka", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notatka")
  public String getNotatka() {
    return notatka;
  }

  public void setNotatka(String notatka) {
    this.notatka = notatka;
  }

  public CalculationSummary limitNegocjacyjny(List<@Valid NegotiationLimit> limitNegocjacyjny) {
    this.limitNegocjacyjny = limitNegocjacyjny;
    return this;
  }

  public CalculationSummary addLimitNegocjacyjnyItem(NegotiationLimit limitNegocjacyjnyItem) {
    if (this.limitNegocjacyjny == null) {
      this.limitNegocjacyjny = new ArrayList<>();
    }
    this.limitNegocjacyjny.add(limitNegocjacyjnyItem);
    return this;
  }

  /**
   * 
   * @return limitNegocjacyjny
  */
  @Valid 
  @Schema(name = "limitNegocjacyjny", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limitNegocjacyjny")
  public List<@Valid NegotiationLimit> getLimitNegocjacyjny() {
    return limitNegocjacyjny;
  }

  public void setLimitNegocjacyjny(List<@Valid NegotiationLimit> limitNegocjacyjny) {
    this.limitNegocjacyjny = limitNegocjacyjny;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationSummary calculationSummary = (CalculationSummary) o;
    return Objects.equals(this.id, calculationSummary.id) &&
        Objects.equals(this.caseId, calculationSummary.caseId) &&
        Objects.equals(this.kwotaUmorzenia, calculationSummary.kwotaUmorzenia) &&
        Objects.equals(this.pozostalyKapitalDoSplatyPLN, calculationSummary.pozostalyKapitalDoSplatyPLN) &&
        Objects.equals(this.ostatecznyTerminSplatyKredytu, calculationSummary.ostatecznyTerminSplatyKredytu) &&
        Objects.equals(this.marzaKredytu, calculationSummary.marzaKredytu) &&
        Objects.equals(this.wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji, calculationSummary.wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji) &&
        Objects.equals(this.wysokoscPierwszegoWIBORuZKalkulacji, calculationSummary.wysokoscPierwszegoWIBORuZKalkulacji) &&
        Objects.equals(this.wysokoscMarzyZmienneOprocentowanie, calculationSummary.wysokoscMarzyZmienneOprocentowanie) &&
        Objects.equals(this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu, calculationSummary.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu) &&
        Objects.equals(this.procentowyWzrostObnizenieWysokosciRaty, calculationSummary.procentowyWzrostObnizenieWysokosciRaty) &&
        Objects.equals(this.wysokoscMarzyStalaStopaProcentowa, calculationSummary.wysokoscMarzyStalaStopaProcentowa) &&
        Objects.equals(this.stalaStopaProcentowa, calculationSummary.stalaStopaProcentowa) &&
        Objects.equals(this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie, calculationSummary.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie) &&
        Objects.equals(this.notatka, calculationSummary.notatka) &&
        Objects.equals(this.limitNegocjacyjny, calculationSummary.limitNegocjacyjny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, kwotaUmorzenia, pozostalyKapitalDoSplatyPLN, ostatecznyTerminSplatyKredytu, marzaKredytu, wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji, wysokoscPierwszegoWIBORuZKalkulacji, wysokoscMarzyZmienneOprocentowanie, szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu, procentowyWzrostObnizenieWysokosciRaty, wysokoscMarzyStalaStopaProcentowa, stalaStopaProcentowa, szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie, notatka, limitNegocjacyjny);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    kwotaUmorzenia: ").append(toIndentedString(kwotaUmorzenia)).append("\n");
    sb.append("    pozostalyKapitalDoSplatyPLN: ").append(toIndentedString(pozostalyKapitalDoSplatyPLN)).append("\n");
    sb.append("    ostatecznyTerminSplatyKredytu: ").append(toIndentedString(ostatecznyTerminSplatyKredytu)).append("\n");
    sb.append("    marzaKredytu: ").append(toIndentedString(marzaKredytu)).append("\n");
    sb.append("    wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji: ").append(toIndentedString(wysokoscOprocentowaniaPierwszejRatyPoUruchomieniuZKalkulacji)).append("\n");
    sb.append("    wysokoscPierwszegoWIBORuZKalkulacji: ").append(toIndentedString(wysokoscPierwszegoWIBORuZKalkulacji)).append("\n");
    sb.append("    wysokoscMarzyZmienneOprocentowanie: ").append(toIndentedString(wysokoscMarzyZmienneOprocentowanie)).append("\n");
    sb.append("    szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu: ").append(toIndentedString(szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu)).append("\n");
    sb.append("    procentowyWzrostObnizenieWysokosciRaty: ").append(toIndentedString(procentowyWzrostObnizenieWysokosciRaty)).append("\n");
    sb.append("    wysokoscMarzyStalaStopaProcentowa: ").append(toIndentedString(wysokoscMarzyStalaStopaProcentowa)).append("\n");
    sb.append("    stalaStopaProcentowa: ").append(toIndentedString(stalaStopaProcentowa)).append("\n");
    sb.append("    szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie: ").append(toIndentedString(szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie)).append("\n");
    sb.append("    notatka: ").append(toIndentedString(notatka)).append("\n");
    sb.append("    limitNegocjacyjny: ").append(toIndentedString(limitNegocjacyjny)).append("\n");
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

