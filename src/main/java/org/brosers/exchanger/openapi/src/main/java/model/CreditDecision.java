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
import model.CreditDecisionEvent;
import model.LabelValue;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Decyzja kredytowa
 */

@Schema(name = "CreditDecision", description = "Decyzja kredytowa")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CreditDecision {

  private Long id;

  private Long caseId;

  private LabelValue przypisanyUzytkownik;

  private String idKlienta;

  private String numerKontraktu;

  private String numerSprawy;

  private String pozostalyKapitalDoSplatyPLN;

  private BigDecimal kwotaUmorzenia;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime ostatecznyTerminSplatyKredytu;

  private BigDecimal marzaKredytu;

  private BigDecimal wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu;

  private BigDecimal wysokoscPierwszegoWIBORuZKalkulacji;

  private BigDecimal wysokoscMarzyZmienneOprocentowanie;

  private BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu;

  private BigDecimal procentowyWzrostObnizenieWysokosciRaty;

  private BigDecimal wysokoscMarzyStalaStopaProcentowa;

  private BigDecimal stalaStopaProcentowa;

  private BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie;

  @Valid
  private List<@Valid CreditDecisionEvent> creditDecisionEvents;

  public CreditDecision id(Long id) {
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

  public CreditDecision caseId(Long caseId) {
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

  public CreditDecision przypisanyUzytkownik(LabelValue przypisanyUzytkownik) {
    this.przypisanyUzytkownik = przypisanyUzytkownik;
    return this;
  }

  /**
   * Get przypisanyUzytkownik
   * @return przypisanyUzytkownik
  */
  @Valid 
  @Schema(name = "przypisanyUzytkownik", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("przypisanyUzytkownik")
  public LabelValue getPrzypisanyUzytkownik() {
    return przypisanyUzytkownik;
  }

  public void setPrzypisanyUzytkownik(LabelValue przypisanyUzytkownik) {
    this.przypisanyUzytkownik = przypisanyUzytkownik;
  }

  public CreditDecision idKlienta(String idKlienta) {
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

  public CreditDecision numerKontraktu(String numerKontraktu) {
    this.numerKontraktu = numerKontraktu;
    return this;
  }

  /**
   * 
   * @return numerKontraktu
  */
  @Size(min = 0, max = 255) 
  @Schema(name = "numerKontraktu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerKontraktu")
  public String getNumerKontraktu() {
    return numerKontraktu;
  }

  public void setNumerKontraktu(String numerKontraktu) {
    this.numerKontraktu = numerKontraktu;
  }

  public CreditDecision numerSprawy(String numerSprawy) {
    this.numerSprawy = numerSprawy;
    return this;
  }

  /**
   * Unikalny numer dyspozycji. ID klucz złożony (human readable) - nr kontraktu_data rejstracji_numer kolejny sekwencji
   * @return numerSprawy
  */
  @Size(min = 0, max = 300) 
  @Schema(name = "numerSprawy", description = "Unikalny numer dyspozycji. ID klucz złożony (human readable) - nr kontraktu_data rejstracji_numer kolejny sekwencji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerSprawy")
  public String getNumerSprawy() {
    return numerSprawy;
  }

  public void setNumerSprawy(String numerSprawy) {
    this.numerSprawy = numerSprawy;
  }

  public CreditDecision pozostalyKapitalDoSplatyPLN(String pozostalyKapitalDoSplatyPLN) {
    this.pozostalyKapitalDoSplatyPLN = pozostalyKapitalDoSplatyPLN;
    return this;
  }

  /**
   * 
   * @return pozostalyKapitalDoSplatyPLN
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "pozostalyKapitalDoSplatyPLN", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pozostalyKapitalDoSplatyPLN")
  public String getPozostalyKapitalDoSplatyPLN() {
    return pozostalyKapitalDoSplatyPLN;
  }

  public void setPozostalyKapitalDoSplatyPLN(String pozostalyKapitalDoSplatyPLN) {
    this.pozostalyKapitalDoSplatyPLN = pozostalyKapitalDoSplatyPLN;
  }

  public CreditDecision kwotaUmorzenia(BigDecimal kwotaUmorzenia) {
    this.kwotaUmorzenia = kwotaUmorzenia;
    return this;
  }

  /**
   * Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return kwotaUmorzenia
  */
  @Valid 
  @Schema(name = "kwotaUmorzenia", description = "Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kwotaUmorzenia")
  public BigDecimal getKwotaUmorzenia() {
    return kwotaUmorzenia;
  }

  public void setKwotaUmorzenia(BigDecimal kwotaUmorzenia) {
    this.kwotaUmorzenia = kwotaUmorzenia;
  }

  public CreditDecision ostatecznyTerminSplatyKredytu(OffsetDateTime ostatecznyTerminSplatyKredytu) {
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

  public CreditDecision marzaKredytu(BigDecimal marzaKredytu) {
    this.marzaKredytu = marzaKredytu;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999999.9999
   * maximum: 99999999.9999
   * @return marzaKredytu
  */
  @Valid @DecimalMin("-99999999.9999") @DecimalMax("99999999.9999") 
  @Schema(name = "marzaKredytu", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marzaKredytu")
  public BigDecimal getMarzaKredytu() {
    return marzaKredytu;
  }

  public void setMarzaKredytu(BigDecimal marzaKredytu) {
    this.marzaKredytu = marzaKredytu;
  }

  public CreditDecision wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu(BigDecimal wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu) {
    this.wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu = wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999999.9999
   * maximum: 99999999.9999
   * @return wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu
  */
  @Valid @DecimalMin("-99999999.9999") @DecimalMax("99999999.9999") 
  @Schema(name = "wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu")
  public BigDecimal getWysokoscOprocentowaniaPierwszejRatyPoUruchomieniu() {
    return wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu;
  }

  public void setWysokoscOprocentowaniaPierwszejRatyPoUruchomieniu(BigDecimal wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu) {
    this.wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu = wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu;
  }

  public CreditDecision wysokoscPierwszegoWIBORuZKalkulacji(BigDecimal wysokoscPierwszegoWIBORuZKalkulacji) {
    this.wysokoscPierwszegoWIBORuZKalkulacji = wysokoscPierwszegoWIBORuZKalkulacji;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999999.9999
   * maximum: 99999999.9999
   * @return wysokoscPierwszegoWIBORuZKalkulacji
  */
  @Valid @DecimalMin("-99999999.9999") @DecimalMax("99999999.9999") 
  @Schema(name = "wysokoscPierwszegoWIBORuZKalkulacji", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscPierwszegoWIBORuZKalkulacji")
  public BigDecimal getWysokoscPierwszegoWIBORuZKalkulacji() {
    return wysokoscPierwszegoWIBORuZKalkulacji;
  }

  public void setWysokoscPierwszegoWIBORuZKalkulacji(BigDecimal wysokoscPierwszegoWIBORuZKalkulacji) {
    this.wysokoscPierwszegoWIBORuZKalkulacji = wysokoscPierwszegoWIBORuZKalkulacji;
  }

  public CreditDecision wysokoscMarzyZmienneOprocentowanie(BigDecimal wysokoscMarzyZmienneOprocentowanie) {
    this.wysokoscMarzyZmienneOprocentowanie = wysokoscMarzyZmienneOprocentowanie;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999999.9999
   * maximum: 99999999.9999
   * @return wysokoscMarzyZmienneOprocentowanie
  */
  @Valid @DecimalMin("-99999999.9999") @DecimalMax("99999999.9999") 
  @Schema(name = "wysokoscMarzyZmienneOprocentowanie", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscMarzyZmienneOprocentowanie")
  public BigDecimal getWysokoscMarzyZmienneOprocentowanie() {
    return wysokoscMarzyZmienneOprocentowanie;
  }

  public void setWysokoscMarzyZmienneOprocentowanie(BigDecimal wysokoscMarzyZmienneOprocentowanie) {
    this.wysokoscMarzyZmienneOprocentowanie = wysokoscMarzyZmienneOprocentowanie;
  }

  public CreditDecision szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu(BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu) {
    this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu = szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999999.9999
   * maximum: 99999999.9999
   * @return szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu
  */
  @Valid @DecimalMin("-99999999.9999") @DecimalMax("99999999.9999") 
  @Schema(name = "szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu")
  public BigDecimal getSzacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu() {
    return szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu;
  }

  public void setSzacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu(BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu) {
    this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu = szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu;
  }

  public CreditDecision procentowyWzrostObnizenieWysokosciRaty(BigDecimal procentowyWzrostObnizenieWysokosciRaty) {
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

  public CreditDecision wysokoscMarzyStalaStopaProcentowa(BigDecimal wysokoscMarzyStalaStopaProcentowa) {
    this.wysokoscMarzyStalaStopaProcentowa = wysokoscMarzyStalaStopaProcentowa;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999999.9999
   * maximum: 99999999.9999
   * @return wysokoscMarzyStalaStopaProcentowa
  */
  @Valid @DecimalMin("-99999999.9999") @DecimalMax("99999999.9999") 
  @Schema(name = "wysokoscMarzyStalaStopaProcentowa", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscMarzyStalaStopaProcentowa")
  public BigDecimal getWysokoscMarzyStalaStopaProcentowa() {
    return wysokoscMarzyStalaStopaProcentowa;
  }

  public void setWysokoscMarzyStalaStopaProcentowa(BigDecimal wysokoscMarzyStalaStopaProcentowa) {
    this.wysokoscMarzyStalaStopaProcentowa = wysokoscMarzyStalaStopaProcentowa;
  }

  public CreditDecision stalaStopaProcentowa(BigDecimal stalaStopaProcentowa) {
    this.stalaStopaProcentowa = stalaStopaProcentowa;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999999.9999
   * maximum: 99999999.9999
   * @return stalaStopaProcentowa
  */
  @Valid @DecimalMin("-99999999.9999") @DecimalMax("99999999.9999") 
  @Schema(name = "stalaStopaProcentowa", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stalaStopaProcentowa")
  public BigDecimal getStalaStopaProcentowa() {
    return stalaStopaProcentowa;
  }

  public void setStalaStopaProcentowa(BigDecimal stalaStopaProcentowa) {
    this.stalaStopaProcentowa = stalaStopaProcentowa;
  }

  public CreditDecision szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie(BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie) {
    this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie = szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie;
    return this;
  }

  /**
   * Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"
   * minimum: -99999999.9999
   * maximum: 99999999.9999
   * @return szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie
  */
  @Valid @DecimalMin("-99999999.9999") @DecimalMax("99999999.9999") 
  @Schema(name = "szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie", description = "Wyrażone w %. Format: +/- XX,XX znaki dziesiętne oddzielone przecinkiem. Dopuszczony  znak specjalny opisujące spadek \"-\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie")
  public BigDecimal getSzacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie() {
    return szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie;
  }

  public void setSzacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie(BigDecimal szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie) {
    this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie = szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie;
  }

  public CreditDecision creditDecisionEvents(List<@Valid CreditDecisionEvent> creditDecisionEvents) {
    this.creditDecisionEvents = creditDecisionEvents;
    return this;
  }

  public CreditDecision addCreditDecisionEventsItem(CreditDecisionEvent creditDecisionEventsItem) {
    if (this.creditDecisionEvents == null) {
      this.creditDecisionEvents = new ArrayList<>();
    }
    this.creditDecisionEvents.add(creditDecisionEventsItem);
    return this;
  }

  /**
   * 
   * @return creditDecisionEvents
  */
  @Valid 
  @Schema(name = "creditDecisionEvents", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditDecisionEvents")
  public List<@Valid CreditDecisionEvent> getCreditDecisionEvents() {
    return creditDecisionEvents;
  }

  public void setCreditDecisionEvents(List<@Valid CreditDecisionEvent> creditDecisionEvents) {
    this.creditDecisionEvents = creditDecisionEvents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditDecision creditDecision = (CreditDecision) o;
    return Objects.equals(this.id, creditDecision.id) &&
        Objects.equals(this.caseId, creditDecision.caseId) &&
        Objects.equals(this.przypisanyUzytkownik, creditDecision.przypisanyUzytkownik) &&
        Objects.equals(this.idKlienta, creditDecision.idKlienta) &&
        Objects.equals(this.numerKontraktu, creditDecision.numerKontraktu) &&
        Objects.equals(this.numerSprawy, creditDecision.numerSprawy) &&
        Objects.equals(this.pozostalyKapitalDoSplatyPLN, creditDecision.pozostalyKapitalDoSplatyPLN) &&
        Objects.equals(this.kwotaUmorzenia, creditDecision.kwotaUmorzenia) &&
        Objects.equals(this.ostatecznyTerminSplatyKredytu, creditDecision.ostatecznyTerminSplatyKredytu) &&
        Objects.equals(this.marzaKredytu, creditDecision.marzaKredytu) &&
        Objects.equals(this.wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu, creditDecision.wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu) &&
        Objects.equals(this.wysokoscPierwszegoWIBORuZKalkulacji, creditDecision.wysokoscPierwszegoWIBORuZKalkulacji) &&
        Objects.equals(this.wysokoscMarzyZmienneOprocentowanie, creditDecision.wysokoscMarzyZmienneOprocentowanie) &&
        Objects.equals(this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu, creditDecision.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu) &&
        Objects.equals(this.procentowyWzrostObnizenieWysokosciRaty, creditDecision.procentowyWzrostObnizenieWysokosciRaty) &&
        Objects.equals(this.wysokoscMarzyStalaStopaProcentowa, creditDecision.wysokoscMarzyStalaStopaProcentowa) &&
        Objects.equals(this.stalaStopaProcentowa, creditDecision.stalaStopaProcentowa) &&
        Objects.equals(this.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie, creditDecision.szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie) &&
        Objects.equals(this.creditDecisionEvents, creditDecision.creditDecisionEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, przypisanyUzytkownik, idKlienta, numerKontraktu, numerSprawy, pozostalyKapitalDoSplatyPLN, kwotaUmorzenia, ostatecznyTerminSplatyKredytu, marzaKredytu, wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu, wysokoscPierwszegoWIBORuZKalkulacji, wysokoscMarzyZmienneOprocentowanie, szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu, procentowyWzrostObnizenieWysokosciRaty, wysokoscMarzyStalaStopaProcentowa, stalaStopaProcentowa, szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie, creditDecisionEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditDecision {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    przypisanyUzytkownik: ").append(toIndentedString(przypisanyUzytkownik)).append("\n");
    sb.append("    idKlienta: ").append(toIndentedString(idKlienta)).append("\n");
    sb.append("    numerKontraktu: ").append(toIndentedString(numerKontraktu)).append("\n");
    sb.append("    numerSprawy: ").append(toIndentedString(numerSprawy)).append("\n");
    sb.append("    pozostalyKapitalDoSplatyPLN: ").append(toIndentedString(pozostalyKapitalDoSplatyPLN)).append("\n");
    sb.append("    kwotaUmorzenia: ").append(toIndentedString(kwotaUmorzenia)).append("\n");
    sb.append("    ostatecznyTerminSplatyKredytu: ").append(toIndentedString(ostatecznyTerminSplatyKredytu)).append("\n");
    sb.append("    marzaKredytu: ").append(toIndentedString(marzaKredytu)).append("\n");
    sb.append("    wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu: ").append(toIndentedString(wysokoscOprocentowaniaPierwszejRatyPoUruchomieniu)).append("\n");
    sb.append("    wysokoscPierwszegoWIBORuZKalkulacji: ").append(toIndentedString(wysokoscPierwszegoWIBORuZKalkulacji)).append("\n");
    sb.append("    wysokoscMarzyZmienneOprocentowanie: ").append(toIndentedString(wysokoscMarzyZmienneOprocentowanie)).append("\n");
    sb.append("    szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu: ").append(toIndentedString(szacunkowaWysokoscOstatniejZaplaconejRatyPrzyZmiennymOprocentowaniu)).append("\n");
    sb.append("    procentowyWzrostObnizenieWysokosciRaty: ").append(toIndentedString(procentowyWzrostObnizenieWysokosciRaty)).append("\n");
    sb.append("    wysokoscMarzyStalaStopaProcentowa: ").append(toIndentedString(wysokoscMarzyStalaStopaProcentowa)).append("\n");
    sb.append("    stalaStopaProcentowa: ").append(toIndentedString(stalaStopaProcentowa)).append("\n");
    sb.append("    szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie: ").append(toIndentedString(szacunkowaWysokoscOstatniejZaplaconejRatyPrzyStalymOprocentowaniuWOstatniejRacie)).append("\n");
    sb.append("    creditDecisionEvents: ").append(toIndentedString(creditDecisionEvents)).append("\n");
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

