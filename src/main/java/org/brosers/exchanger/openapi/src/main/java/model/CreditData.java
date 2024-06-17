package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
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
 * Dane Kredytu
 */

@Schema(name = "CreditData", description = "Dane Kredytu")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CreditData {

  private Long id;

  private Long caseId;

  private String numerKontraktu;

  private String numerUmowy;

  /**
   * 
   */
  public enum IndeksowanyCzyDenominowanyEnum {
    INDEKSOWANY("INDEKSOWANY"),
    
    DENOMINOWANY("DENOMINOWANY");

    private String value;

    IndeksowanyCzyDenominowanyEnum(String value) {
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
    public static IndeksowanyCzyDenominowanyEnum fromValue(String value) {
      for (IndeksowanyCzyDenominowanyEnum b : IndeksowanyCzyDenominowanyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IndeksowanyCzyDenominowanyEnum indeksowanyCzyDenominowany;

  /**
   * 
   */
  public enum WalutaKredytuEnum {
    PLN("PLN"),
    
    CHF("CHF"),
    
    EUR("EUR"),
    
    GBP("GBP"),
    
    USD("USD");

    private String value;

    WalutaKredytuEnum(String value) {
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
    public static WalutaKredytuEnum fromValue(String value) {
      for (WalutaKredytuEnum b : WalutaKredytuEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private WalutaKredytuEnum walutaKredytu;

  /**
   * 
   */
  public enum StatusUmowyKredytowejEnum {
    AKTYWNA("AKTYWNA"),
    
    SPLACONA("SPLACONA"),
    
    PRZENIESIONA_POZA_BILANS("PRZENIESIONA_POZA_BILANS"),
    
    SEKURYTYZACJA("SEKURYTYZACJA"),
    
    WYPOWIEDZIANA("WYPOWIEDZIANA"),
    
    UNIEWAZNIONA("UNIEWAZNIONA"),
    
    SPISANA("SPISANA"),
    
    OGLOSZONA_UPADLOSC("OGLOSZONA_UPADLOSC"),
    
    ZGON("ZGON");

    private String value;

    StatusUmowyKredytowejEnum(String value) {
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
    public static StatusUmowyKredytowejEnum fromValue(String value) {
      for (StatusUmowyKredytowejEnum b : StatusUmowyKredytowejEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusUmowyKredytowejEnum statusUmowyKredytowej;

  /**
   * lista z jedna wartoscia, tylko raty stale, automatycznie wybierana jedna wartosc
   */
  public enum FormulaSplatyEnum {
    STALE("RATY_STALE"),
    
    ZMIENNE_ANNUITET("RATY_ZMIENNE_ANNUITET");

    private String value;

    FormulaSplatyEnum(String value) {
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
    public static FormulaSplatyEnum fromValue(String value) {
      for (FormulaSplatyEnum b : FormulaSplatyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FormulaSplatyEnum formulaSplaty;

  private String dzienPlatnosciRaty;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataZapadalnosciKredytu;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataDanychSekcji;

  private BigDecimal kwotaWyplaconegoKredytuWPln;

  private String aktualneSaldoZadluzeniaWWalucieChfKapital;

  private String aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp;

  private String aktualnaWymaganaRataKapitalowoOdsetkowaChf;

  private String aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataKursuNbp;

  private BigDecimal wysokoscKursu;

  private Boolean zalegloscWInsNieruchomosc;

  private Boolean zalegloscWInsZycie;

  private String inneKredytyKlientaPowiazaneZIns;

  private Boolean sprawaSadowaCourtCase4;

  private Boolean fwk;

  private Boolean aktywnaRestrukturyzacja;

  private Boolean upadloscKonsumencka;

  private Boolean zgon;

  private Boolean aktywnyCovid3Moratorium;

  private String informacjaODpd;

  private String inneAktywneKredytyKlientaWChf;

  public CreditData id(Long id) {
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

  public CreditData caseId(Long caseId) {
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

  public CreditData numerKontraktu(String numerKontraktu) {
    this.numerKontraktu = numerKontraktu;
    return this;
  }

  /**
   * 
   * @return numerKontraktu
  */
  @Size(min = 0, max = 30) 
  @Schema(name = "numerKontraktu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerKontraktu")
  public String getNumerKontraktu() {
    return numerKontraktu;
  }

  public void setNumerKontraktu(String numerKontraktu) {
    this.numerKontraktu = numerKontraktu;
  }

  public CreditData numerUmowy(String numerUmowy) {
    this.numerUmowy = numerUmowy;
    return this;
  }

  /**
   * 
   * @return numerUmowy
  */
  @Size(min = 0, max = 30) 
  @Schema(name = "numerUmowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerUmowy")
  public String getNumerUmowy() {
    return numerUmowy;
  }

  public void setNumerUmowy(String numerUmowy) {
    this.numerUmowy = numerUmowy;
  }

  public CreditData indeksowanyCzyDenominowany(IndeksowanyCzyDenominowanyEnum indeksowanyCzyDenominowany) {
    this.indeksowanyCzyDenominowany = indeksowanyCzyDenominowany;
    return this;
  }

  /**
   * 
   * @return indeksowanyCzyDenominowany
  */
  
  @Schema(name = "indeksowanyCzyDenominowany", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indeksowanyCzyDenominowany")
  public IndeksowanyCzyDenominowanyEnum getIndeksowanyCzyDenominowany() {
    return indeksowanyCzyDenominowany;
  }

  public void setIndeksowanyCzyDenominowany(IndeksowanyCzyDenominowanyEnum indeksowanyCzyDenominowany) {
    this.indeksowanyCzyDenominowany = indeksowanyCzyDenominowany;
  }

  public CreditData walutaKredytu(WalutaKredytuEnum walutaKredytu) {
    this.walutaKredytu = walutaKredytu;
    return this;
  }

  /**
   * 
   * @return walutaKredytu
  */
  
  @Schema(name = "walutaKredytu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("walutaKredytu")
  public WalutaKredytuEnum getWalutaKredytu() {
    return walutaKredytu;
  }

  public void setWalutaKredytu(WalutaKredytuEnum walutaKredytu) {
    this.walutaKredytu = walutaKredytu;
  }

  public CreditData statusUmowyKredytowej(StatusUmowyKredytowejEnum statusUmowyKredytowej) {
    this.statusUmowyKredytowej = statusUmowyKredytowej;
    return this;
  }

  /**
   * 
   * @return statusUmowyKredytowej
  */
  
  @Schema(name = "statusUmowyKredytowej", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusUmowyKredytowej")
  public StatusUmowyKredytowejEnum getStatusUmowyKredytowej() {
    return statusUmowyKredytowej;
  }

  public void setStatusUmowyKredytowej(StatusUmowyKredytowejEnum statusUmowyKredytowej) {
    this.statusUmowyKredytowej = statusUmowyKredytowej;
  }

  public CreditData formulaSplaty(FormulaSplatyEnum formulaSplaty) {
    this.formulaSplaty = formulaSplaty;
    return this;
  }

  /**
   * lista z jedna wartoscia, tylko raty stale, automatycznie wybierana jedna wartosc
   * @return formulaSplaty
  */
  
  @Schema(name = "formulaSplaty", description = "lista z jedna wartoscia, tylko raty stale, automatycznie wybierana jedna wartosc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formulaSplaty")
  public FormulaSplatyEnum getFormulaSplaty() {
    return formulaSplaty;
  }

  public void setFormulaSplaty(FormulaSplatyEnum formulaSplaty) {
    this.formulaSplaty = formulaSplaty;
  }

  public CreditData dzienPlatnosciRaty(String dzienPlatnosciRaty) {
    this.dzienPlatnosciRaty = dzienPlatnosciRaty;
    return this;
  }

  /**
   * tylko cyfry
   * @return dzienPlatnosciRaty
  */
  @Size(min = 0, max = 2) 
  @Schema(name = "dzienPlatnosciRaty", description = "tylko cyfry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dzienPlatnosciRaty")
  public String getDzienPlatnosciRaty() {
    return dzienPlatnosciRaty;
  }

  public void setDzienPlatnosciRaty(String dzienPlatnosciRaty) {
    this.dzienPlatnosciRaty = dzienPlatnosciRaty;
  }

  public CreditData dataZapadalnosciKredytu(LocalDate dataZapadalnosciKredytu) {
    this.dataZapadalnosciKredytu = dataZapadalnosciKredytu;
    return this;
  }

  /**
   * wybor z kalendarza, yyyy-MM-dd
   * @return dataZapadalnosciKredytu
  */
  @Valid 
  @Schema(name = "dataZapadalnosciKredytu", description = "wybor z kalendarza, yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataZapadalnosciKredytu")
  public LocalDate getDataZapadalnosciKredytu() {
    return dataZapadalnosciKredytu;
  }

  public void setDataZapadalnosciKredytu(LocalDate dataZapadalnosciKredytu) {
    this.dataZapadalnosciKredytu = dataZapadalnosciKredytu;
  }

  public CreditData dataDanychSekcji(LocalDate dataDanychSekcji) {
    this.dataDanychSekcji = dataDanychSekcji;
    return this;
  }

  /**
   * wybor z kalendarza, yyyy-MM-dd
   * @return dataDanychSekcji
  */
  @Valid 
  @Schema(name = "dataDanychSekcji", description = "wybor z kalendarza, yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataDanychSekcji")
  public LocalDate getDataDanychSekcji() {
    return dataDanychSekcji;
  }

  public void setDataDanychSekcji(LocalDate dataDanychSekcji) {
    this.dataDanychSekcji = dataDanychSekcji;
  }

  public CreditData kwotaWyplaconegoKredytuWPln(BigDecimal kwotaWyplaconegoKredytuWPln) {
    this.kwotaWyplaconegoKredytuWPln = kwotaWyplaconegoKredytuWPln;
    return this;
  }

  /**
   * Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return kwotaWyplaconegoKredytuWPln
  */
  @Valid 
  @Schema(name = "kwotaWyplaconegoKredytuWPln", description = "Format X XXX,XX tysiące oddzielone spacją znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kwotaWyplaconegoKredytuWPln")
  public BigDecimal getKwotaWyplaconegoKredytuWPln() {
    return kwotaWyplaconegoKredytuWPln;
  }

  public void setKwotaWyplaconegoKredytuWPln(BigDecimal kwotaWyplaconegoKredytuWPln) {
    this.kwotaWyplaconegoKredytuWPln = kwotaWyplaconegoKredytuWPln;
  }

  public CreditData aktualneSaldoZadluzeniaWWalucieChfKapital(String aktualneSaldoZadluzeniaWWalucieChfKapital) {
    this.aktualneSaldoZadluzeniaWWalucieChfKapital = aktualneSaldoZadluzeniaWWalucieChfKapital;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return aktualneSaldoZadluzeniaWWalucieChfKapital
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "aktualneSaldoZadluzeniaWWalucieChfKapital", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aktualneSaldoZadluzeniaWWalucieChfKapital")
  public String getAktualneSaldoZadluzeniaWWalucieChfKapital() {
    return aktualneSaldoZadluzeniaWWalucieChfKapital;
  }

  public void setAktualneSaldoZadluzeniaWWalucieChfKapital(String aktualneSaldoZadluzeniaWWalucieChfKapital) {
    this.aktualneSaldoZadluzeniaWWalucieChfKapital = aktualneSaldoZadluzeniaWWalucieChfKapital;
  }

  public CreditData aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp(String aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp) {
    this.aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp = aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp")
  public String getAktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp() {
    return aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp;
  }

  public void setAktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp(String aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp) {
    this.aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp = aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp;
  }

  public CreditData aktualnaWymaganaRataKapitalowoOdsetkowaChf(String aktualnaWymaganaRataKapitalowoOdsetkowaChf) {
    this.aktualnaWymaganaRataKapitalowoOdsetkowaChf = aktualnaWymaganaRataKapitalowoOdsetkowaChf;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return aktualnaWymaganaRataKapitalowoOdsetkowaChf
  */
  @Size(min = 0, max = 10) 
  @Schema(name = "aktualnaWymaganaRataKapitalowoOdsetkowaChf", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aktualnaWymaganaRataKapitalowoOdsetkowaChf")
  public String getAktualnaWymaganaRataKapitalowoOdsetkowaChf() {
    return aktualnaWymaganaRataKapitalowoOdsetkowaChf;
  }

  public void setAktualnaWymaganaRataKapitalowoOdsetkowaChf(String aktualnaWymaganaRataKapitalowoOdsetkowaChf) {
    this.aktualnaWymaganaRataKapitalowoOdsetkowaChf = aktualnaWymaganaRataKapitalowoOdsetkowaChf;
  }

  public CreditData aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp(String aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp) {
    this.aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp = aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp
  */
  @Size(min = 0, max = 10) 
  @Schema(name = "aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp")
  public String getAktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp() {
    return aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp;
  }

  public void setAktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp(String aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp) {
    this.aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp = aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp;
  }

  public CreditData dataKursuNbp(LocalDate dataKursuNbp) {
    this.dataKursuNbp = dataKursuNbp;
    return this;
  }

  /**
   * wybor z kalendarza. yyyy-MM-dd
   * @return dataKursuNbp
  */
  @Valid 
  @Schema(name = "dataKursuNbp", description = "wybor z kalendarza. yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataKursuNbp")
  public LocalDate getDataKursuNbp() {
    return dataKursuNbp;
  }

  public void setDataKursuNbp(LocalDate dataKursuNbp) {
    this.dataKursuNbp = dataKursuNbp;
  }

  public CreditData wysokoscKursu(BigDecimal wysokoscKursu) {
    this.wysokoscKursu = wysokoscKursu;
    return this;
  }

  /**
   * format XX,XXXX
   * @return wysokoscKursu
  */
  @Valid 
  @Schema(name = "wysokoscKursu", description = "format XX,XXXX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wysokoscKursu")
  public BigDecimal getWysokoscKursu() {
    return wysokoscKursu;
  }

  public void setWysokoscKursu(BigDecimal wysokoscKursu) {
    this.wysokoscKursu = wysokoscKursu;
  }

  public CreditData zalegloscWInsNieruchomosc(Boolean zalegloscWInsNieruchomosc) {
    this.zalegloscWInsNieruchomosc = zalegloscWInsNieruchomosc;
    return this;
  }

  /**
   * 
   * @return zalegloscWInsNieruchomosc
  */
  
  @Schema(name = "zalegloscWInsNieruchomosc", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zalegloscWInsNieruchomosc")
  public Boolean getZalegloscWInsNieruchomosc() {
    return zalegloscWInsNieruchomosc;
  }

  public void setZalegloscWInsNieruchomosc(Boolean zalegloscWInsNieruchomosc) {
    this.zalegloscWInsNieruchomosc = zalegloscWInsNieruchomosc;
  }

  public CreditData zalegloscWInsZycie(Boolean zalegloscWInsZycie) {
    this.zalegloscWInsZycie = zalegloscWInsZycie;
    return this;
  }

  /**
   * 
   * @return zalegloscWInsZycie
  */
  
  @Schema(name = "zalegloscWInsZycie", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zalegloscWInsZycie")
  public Boolean getZalegloscWInsZycie() {
    return zalegloscWInsZycie;
  }

  public void setZalegloscWInsZycie(Boolean zalegloscWInsZycie) {
    this.zalegloscWInsZycie = zalegloscWInsZycie;
  }

  public CreditData inneKredytyKlientaPowiazaneZIns(String inneKredytyKlientaPowiazaneZIns) {
    this.inneKredytyKlientaPowiazaneZIns = inneKredytyKlientaPowiazaneZIns;
    return this;
  }

  /**
   * 
   * @return inneKredytyKlientaPowiazaneZIns
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "inneKredytyKlientaPowiazaneZIns", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inneKredytyKlientaPowiazaneZIns")
  public String getInneKredytyKlientaPowiazaneZIns() {
    return inneKredytyKlientaPowiazaneZIns;
  }

  public void setInneKredytyKlientaPowiazaneZIns(String inneKredytyKlientaPowiazaneZIns) {
    this.inneKredytyKlientaPowiazaneZIns = inneKredytyKlientaPowiazaneZIns;
  }

  public CreditData sprawaSadowaCourtCase4(Boolean sprawaSadowaCourtCase4) {
    this.sprawaSadowaCourtCase4 = sprawaSadowaCourtCase4;
    return this;
  }

  /**
   * 
   * @return sprawaSadowaCourtCase4
  */
  
  @Schema(name = "sprawaSadowaCourtCase4", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sprawaSadowaCourtCase4")
  public Boolean getSprawaSadowaCourtCase4() {
    return sprawaSadowaCourtCase4;
  }

  public void setSprawaSadowaCourtCase4(Boolean sprawaSadowaCourtCase4) {
    this.sprawaSadowaCourtCase4 = sprawaSadowaCourtCase4;
  }

  public CreditData fwk(Boolean fwk) {
    this.fwk = fwk;
    return this;
  }

  /**
   * 
   * @return fwk
  */
  
  @Schema(name = "fwk", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fwk")
  public Boolean getFwk() {
    return fwk;
  }

  public void setFwk(Boolean fwk) {
    this.fwk = fwk;
  }

  public CreditData aktywnaRestrukturyzacja(Boolean aktywnaRestrukturyzacja) {
    this.aktywnaRestrukturyzacja = aktywnaRestrukturyzacja;
    return this;
  }

  /**
   * 
   * @return aktywnaRestrukturyzacja
  */
  
  @Schema(name = "aktywnaRestrukturyzacja", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aktywnaRestrukturyzacja")
  public Boolean getAktywnaRestrukturyzacja() {
    return aktywnaRestrukturyzacja;
  }

  public void setAktywnaRestrukturyzacja(Boolean aktywnaRestrukturyzacja) {
    this.aktywnaRestrukturyzacja = aktywnaRestrukturyzacja;
  }

  public CreditData upadloscKonsumencka(Boolean upadloscKonsumencka) {
    this.upadloscKonsumencka = upadloscKonsumencka;
    return this;
  }

  /**
   * 
   * @return upadloscKonsumencka
  */
  
  @Schema(name = "upadloscKonsumencka", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("upadloscKonsumencka")
  public Boolean getUpadloscKonsumencka() {
    return upadloscKonsumencka;
  }

  public void setUpadloscKonsumencka(Boolean upadloscKonsumencka) {
    this.upadloscKonsumencka = upadloscKonsumencka;
  }

  public CreditData zgon(Boolean zgon) {
    this.zgon = zgon;
    return this;
  }

  /**
   * 
   * @return zgon
  */
  
  @Schema(name = "zgon", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zgon")
  public Boolean getZgon() {
    return zgon;
  }

  public void setZgon(Boolean zgon) {
    this.zgon = zgon;
  }

  public CreditData aktywnyCovid3Moratorium(Boolean aktywnyCovid3Moratorium) {
    this.aktywnyCovid3Moratorium = aktywnyCovid3Moratorium;
    return this;
  }

  /**
   * 
   * @return aktywnyCovid3Moratorium
  */
  
  @Schema(name = "aktywnyCovid3Moratorium", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aktywnyCovid3Moratorium")
  public Boolean getAktywnyCovid3Moratorium() {
    return aktywnyCovid3Moratorium;
  }

  public void setAktywnyCovid3Moratorium(Boolean aktywnyCovid3Moratorium) {
    this.aktywnyCovid3Moratorium = aktywnyCovid3Moratorium;
  }

  public CreditData informacjaODpd(String informacjaODpd) {
    this.informacjaODpd = informacjaODpd;
    return this;
  }

  /**
   * tylko cyfry (od 1 do 3)
   * @return informacjaODpd
  */
  @Pattern(regexp = "^[0-9]{1,3}$") 
  @Schema(name = "informacjaODpd", description = "tylko cyfry (od 1 do 3)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("informacjaODpd")
  public String getInformacjaODpd() {
    return informacjaODpd;
  }

  public void setInformacjaODpd(String informacjaODpd) {
    this.informacjaODpd = informacjaODpd;
  }

  public CreditData inneAktywneKredytyKlientaWChf(String inneAktywneKredytyKlientaWChf) {
    this.inneAktywneKredytyKlientaWChf = inneAktywneKredytyKlientaWChf;
    return this;
  }

  /**
   * 
   * @return inneAktywneKredytyKlientaWChf
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "inneAktywneKredytyKlientaWChf", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inneAktywneKredytyKlientaWChf")
  public String getInneAktywneKredytyKlientaWChf() {
    return inneAktywneKredytyKlientaWChf;
  }

  public void setInneAktywneKredytyKlientaWChf(String inneAktywneKredytyKlientaWChf) {
    this.inneAktywneKredytyKlientaWChf = inneAktywneKredytyKlientaWChf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditData creditData = (CreditData) o;
    return Objects.equals(this.id, creditData.id) &&
        Objects.equals(this.caseId, creditData.caseId) &&
        Objects.equals(this.numerKontraktu, creditData.numerKontraktu) &&
        Objects.equals(this.numerUmowy, creditData.numerUmowy) &&
        Objects.equals(this.indeksowanyCzyDenominowany, creditData.indeksowanyCzyDenominowany) &&
        Objects.equals(this.walutaKredytu, creditData.walutaKredytu) &&
        Objects.equals(this.statusUmowyKredytowej, creditData.statusUmowyKredytowej) &&
        Objects.equals(this.formulaSplaty, creditData.formulaSplaty) &&
        Objects.equals(this.dzienPlatnosciRaty, creditData.dzienPlatnosciRaty) &&
        Objects.equals(this.dataZapadalnosciKredytu, creditData.dataZapadalnosciKredytu) &&
        Objects.equals(this.dataDanychSekcji, creditData.dataDanychSekcji) &&
        Objects.equals(this.kwotaWyplaconegoKredytuWPln, creditData.kwotaWyplaconegoKredytuWPln) &&
        Objects.equals(this.aktualneSaldoZadluzeniaWWalucieChfKapital, creditData.aktualneSaldoZadluzeniaWWalucieChfKapital) &&
        Objects.equals(this.aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp, creditData.aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp) &&
        Objects.equals(this.aktualnaWymaganaRataKapitalowoOdsetkowaChf, creditData.aktualnaWymaganaRataKapitalowoOdsetkowaChf) &&
        Objects.equals(this.aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp, creditData.aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp) &&
        Objects.equals(this.dataKursuNbp, creditData.dataKursuNbp) &&
        Objects.equals(this.wysokoscKursu, creditData.wysokoscKursu) &&
        Objects.equals(this.zalegloscWInsNieruchomosc, creditData.zalegloscWInsNieruchomosc) &&
        Objects.equals(this.zalegloscWInsZycie, creditData.zalegloscWInsZycie) &&
        Objects.equals(this.inneKredytyKlientaPowiazaneZIns, creditData.inneKredytyKlientaPowiazaneZIns) &&
        Objects.equals(this.sprawaSadowaCourtCase4, creditData.sprawaSadowaCourtCase4) &&
        Objects.equals(this.fwk, creditData.fwk) &&
        Objects.equals(this.aktywnaRestrukturyzacja, creditData.aktywnaRestrukturyzacja) &&
        Objects.equals(this.upadloscKonsumencka, creditData.upadloscKonsumencka) &&
        Objects.equals(this.zgon, creditData.zgon) &&
        Objects.equals(this.aktywnyCovid3Moratorium, creditData.aktywnyCovid3Moratorium) &&
        Objects.equals(this.informacjaODpd, creditData.informacjaODpd) &&
        Objects.equals(this.inneAktywneKredytyKlientaWChf, creditData.inneAktywneKredytyKlientaWChf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, numerKontraktu, numerUmowy, indeksowanyCzyDenominowany, walutaKredytu, statusUmowyKredytowej, formulaSplaty, dzienPlatnosciRaty, dataZapadalnosciKredytu, dataDanychSekcji, kwotaWyplaconegoKredytuWPln, aktualneSaldoZadluzeniaWWalucieChfKapital, aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp, aktualnaWymaganaRataKapitalowoOdsetkowaChf, aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp, dataKursuNbp, wysokoscKursu, zalegloscWInsNieruchomosc, zalegloscWInsZycie, inneKredytyKlientaPowiazaneZIns, sprawaSadowaCourtCase4, fwk, aktywnaRestrukturyzacja, upadloscKonsumencka, zgon, aktywnyCovid3Moratorium, informacjaODpd, inneAktywneKredytyKlientaWChf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    numerKontraktu: ").append(toIndentedString(numerKontraktu)).append("\n");
    sb.append("    numerUmowy: ").append(toIndentedString(numerUmowy)).append("\n");
    sb.append("    indeksowanyCzyDenominowany: ").append(toIndentedString(indeksowanyCzyDenominowany)).append("\n");
    sb.append("    walutaKredytu: ").append(toIndentedString(walutaKredytu)).append("\n");
    sb.append("    statusUmowyKredytowej: ").append(toIndentedString(statusUmowyKredytowej)).append("\n");
    sb.append("    formulaSplaty: ").append(toIndentedString(formulaSplaty)).append("\n");
    sb.append("    dzienPlatnosciRaty: ").append(toIndentedString(dzienPlatnosciRaty)).append("\n");
    sb.append("    dataZapadalnosciKredytu: ").append(toIndentedString(dataZapadalnosciKredytu)).append("\n");
    sb.append("    dataDanychSekcji: ").append(toIndentedString(dataDanychSekcji)).append("\n");
    sb.append("    kwotaWyplaconegoKredytuWPln: ").append(toIndentedString(kwotaWyplaconegoKredytuWPln)).append("\n");
    sb.append("    aktualneSaldoZadluzeniaWWalucieChfKapital: ").append(toIndentedString(aktualneSaldoZadluzeniaWWalucieChfKapital)).append("\n");
    sb.append("    aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp: ").append(toIndentedString(aktualneSaldoZadluzaniaWPlnPrzeliczonePoKursieSrednimNbp)).append("\n");
    sb.append("    aktualnaWymaganaRataKapitalowoOdsetkowaChf: ").append(toIndentedString(aktualnaWymaganaRataKapitalowoOdsetkowaChf)).append("\n");
    sb.append("    aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp: ").append(toIndentedString(aktualnaWymaganaRataKapitalowoOdsetkowaPrzeliczonaPoKursieSrednimNbp)).append("\n");
    sb.append("    dataKursuNbp: ").append(toIndentedString(dataKursuNbp)).append("\n");
    sb.append("    wysokoscKursu: ").append(toIndentedString(wysokoscKursu)).append("\n");
    sb.append("    zalegloscWInsNieruchomosc: ").append(toIndentedString(zalegloscWInsNieruchomosc)).append("\n");
    sb.append("    zalegloscWInsZycie: ").append(toIndentedString(zalegloscWInsZycie)).append("\n");
    sb.append("    inneKredytyKlientaPowiazaneZIns: ").append(toIndentedString(inneKredytyKlientaPowiazaneZIns)).append("\n");
    sb.append("    sprawaSadowaCourtCase4: ").append(toIndentedString(sprawaSadowaCourtCase4)).append("\n");
    sb.append("    fwk: ").append(toIndentedString(fwk)).append("\n");
    sb.append("    aktywnaRestrukturyzacja: ").append(toIndentedString(aktywnaRestrukturyzacja)).append("\n");
    sb.append("    upadloscKonsumencka: ").append(toIndentedString(upadloscKonsumencka)).append("\n");
    sb.append("    zgon: ").append(toIndentedString(zgon)).append("\n");
    sb.append("    aktywnyCovid3Moratorium: ").append(toIndentedString(aktywnyCovid3Moratorium)).append("\n");
    sb.append("    informacjaODpd: ").append(toIndentedString(informacjaODpd)).append("\n");
    sb.append("    inneAktywneKredytyKlientaWChf: ").append(toIndentedString(inneAktywneKredytyKlientaWChf)).append("\n");
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

