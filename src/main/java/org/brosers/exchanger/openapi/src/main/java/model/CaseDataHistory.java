package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Attachment;
import model.CalculationSummary;
import model.CaseMediator;
import model.ClientData;
import model.ClientInteractionSummary;
import model.CourtHearingMeeting;
import model.CreditData;
import model.CreditDecision;
import model.DocumentationData;
import model.EtapProcesu;
import model.FinalizationParameters;
import model.KNFData;
import model.LabelValue;
import model.MediationOutcome;
import model.NegotiationLimit;
import model.Note;
import model.OrganizationAttorney;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CaseDataHistory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CaseDataHistory {

  private String creatorId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDate;

  private String lastModifyUserId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModifyChangeDate;

  private Long id;

  private LabelValue przypisanyUzytkownik;

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

  /**
   * Default value: NOWA
   */
  public enum EtapProcesuEnum {
    NOWA("NOWA"),
    
    W_ANALIZIE("W_ANALIZIE"),
    
    PO_DECYZJI("PO_DECYZJI"),
    
    DO_KONTAKTU_Z_KLIENTEM("DO_KONTAKTU_Z_KLIENTEM"),
    
    DECYZJA_NEGATYWNA_RYZYKA("DECYZJA_NEGATYWNA_RYZYKA"),
    
    OCZEKUJE_NA_UMOWE_MEDIACYJNA("OCZEKUJE_NA_UMOWE_MEDIACYJNA"),
    
    BRAK_KONTAKTU("BRAK_KONTAKTU"),
    
    ODMOWA_MEDIACJI("ODMOWA_MEDIACJI"),
    
    ZAREJESTROWANA_W_KNF("ZAREJESTROWANA_W_KNF"),
    
    OCZEKUJE_NA_MEDIACJE_KALKULACJA("OCZEKUJE_NA_MEDIACJE_KALKULACJA"),
    
    OCZEKUJE_NA_MEDIACJE_DOKUMENTACJA("OCZEKUJE_NA_MEDIACJE_DOKUMENTACJA"),
    
    OCZEKUJE_NA_MEDIACJE("OCZEKUJE_NA_MEDIACJE"),
    
    MEDIACJE("MEDIACJE"),
    
    DECYZJA_NEGOCJACYJNA_RBI("DECYZJA_NEGOCJACYJNA_RBI"),
    
    OCZEKUJE_NA_KOLEJNE_SPOTKANIE("OCZEKUJE_NA_KOLEJNE_SPOTKANIE"),
    
    BRAK_POROZUMIENIA("BRAK_POROZUMIENIA"),
    
    MEDIACJA_ZAKONCZONA_NEGATYWNIE("MEDIACJA_ZAKONCZONA_NEGATYWNIE"),
    
    PRZYGOTOWYWANIE_UGODY_REKALKULACJA("PRZYGOTOWYWANIE_UGODY_REKALKULACJA"),
    
    REZYGNACJA_KLIENTA_PO_MEDIACJI("REZYGNACJA_KLIENTA_PO_MEDIACJI"),
    
    PRZYGOTOWYWANIE_UGODY("PRZYGOTOWYWANIE_UGODY"),
    
    DOKUMENTY_WYSLANE("DOKUMENTY_WYSLANE"),
    
    DOKUMENTY_OTRZYMANE("DOKUMENTY_OTRZYMANE"),
    
    DOKUMENTY_NIEKOMPLETNE("DOKUMENTY_NIEKOMPLETNE"),
    
    DOKUMENTY_OTRZYMANE_KOMPLETNE("DOKUMENTY_OTRZYMANE_KOMPLETNE"),
    
    DOKUMENTY_OTRZYMANE_DO_REKALKULACJI("DOKUMENTY_OTRZYMANE_DO_REKALKULACJI"),
    
    OCZEKUJE_NA_REALIZACJE("OCZEKUJE_NA_REALIZACJE"),
    
    UGODA_URUCHOMIONA_W_SYSTEMIE("UGODA_URUCHOMIONA_W_SYSTEMIE"),
    
    UGODA_URUCHOMIONA_W_SYSTEMIE_KONIEC_PROCESU("UGODA_URUCHOMIONA_W_SYSTEMIE_KONIEC_PROCESU"),
    
    BRAK_SPELNIENIA_WARUNKOW_PO_MEDIACJI("BRAK_SPELNIENIA_WARUNKOW_PO_MEDIACJI"),
    
    ANULOWANA("ANULOWANA");

    private String value;

    EtapProcesuEnum(String value) {
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
    public static EtapProcesuEnum fromValue(String value) {
      for (EtapProcesuEnum b : EtapProcesuEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EtapProcesuEnum etapProcesu;

  /**
   * 
   */
  public enum StatusTechnicznyEnum {
    NOWA("NOWA"),
    
    W_TRAKCIE_PRZETWARZANIA("W_TRAKCIE_PRZETWARZANIA"),
    
    BLAD("BLAD"),
    
    ANULOWANA("ANULOWANA"),
    
    ZAKONCZONA("ZAKONCZONA");

    private String value;

    StatusTechnicznyEnum(String value) {
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
    public static StatusTechnicznyEnum fromValue(String value) {
      for (StatusTechnicznyEnum b : StatusTechnicznyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusTechnicznyEnum statusTechniczny;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataRejestracji;

  private String organisationId;

  private String numerKontraktu;

  private String numerUmowy;

  private String numerSprawy;

  private Boolean umowaIndywidualna;

  private String opisPrzedmiotuMediacji;

  private String wartoscKredytu;

  /**
   * waluta sporu
   */
  public enum WalutaKredytuEnum {
    CHF("CHF"),
    
    PLN("PLN");

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

  private Boolean sprawaPrzekazanaDoObslugiZewnetrznej;

  /**
   * 
   */
  public enum InicjatorProcesuEnum {
    BANK("BANK"),
    
    KLIENT("KLIENT");

    private String value;

    InicjatorProcesuEnum(String value) {
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
    public static InicjatorProcesuEnum fromValue(String value) {
      for (InicjatorProcesuEnum b : InicjatorProcesuEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private InicjatorProcesuEnum inicjatorProcesu;

  private String wnioskujacyKlient;

  @Valid
  private List<@Valid CreditData> creditDataEntities;

  @Valid
  private List<@Valid ClientData> clientDataEntities;

  private ClientInteractionSummary clientInteractionSummary;

  private CalculationSummary calculationSummary;

  @Valid
  private List<@Valid NegotiationLimit> negotiationLimits;

  @Valid
  private List<@Valid CourtHearingMeeting> courtHearingMeetings;

  @Valid
  private List<@Valid OrganizationAttorney> attorneyEntities;

  @Valid
  private List<@Valid CaseMediator> caseMediators;

  private KNFData knfData;

  private MediationOutcome mediationOutcome;

  private FinalizationParameters finalizationParameters;

  @Valid
  private List<@Valid Attachment> attachments;

  @Valid
  private List<@Valid Note> noteEntities;

  private DocumentationData documentationData;

  private CreditDecision creditDecision;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataAktualizacjiStatusu;

  private Boolean sprawaZmigrowana;

  private EtapProcesu etapDoMigracji;

  public CaseDataHistory creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * Get creatorId
   * @return creatorId
  */
  
  @Schema(name = "creatorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorId")
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public CaseDataHistory createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * yyyy-MM-dd HH:mm:ss
   * @return createDate
  */
  @Valid 
  @Schema(name = "createDate", description = "yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public CaseDataHistory lastModifyUserId(String lastModifyUserId) {
    this.lastModifyUserId = lastModifyUserId;
    return this;
  }

  /**
   * Get lastModifyUserId
   * @return lastModifyUserId
  */
  
  @Schema(name = "lastModifyUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifyUserId")
  public String getLastModifyUserId() {
    return lastModifyUserId;
  }

  public void setLastModifyUserId(String lastModifyUserId) {
    this.lastModifyUserId = lastModifyUserId;
  }

  public CaseDataHistory lastModifyChangeDate(OffsetDateTime lastModifyChangeDate) {
    this.lastModifyChangeDate = lastModifyChangeDate;
    return this;
  }

  /**
   * yyyy-MM-dd HH:mm:ss
   * @return lastModifyChangeDate
  */
  @Valid 
  @Schema(name = "lastModifyChangeDate", description = "yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifyChangeDate")
  public OffsetDateTime getLastModifyChangeDate() {
    return lastModifyChangeDate;
  }

  public void setLastModifyChangeDate(OffsetDateTime lastModifyChangeDate) {
    this.lastModifyChangeDate = lastModifyChangeDate;
  }

  public CaseDataHistory id(Long id) {
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

  public CaseDataHistory przypisanyUzytkownik(LabelValue przypisanyUzytkownik) {
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

  public CaseDataHistory typSprawy(TypSprawyEnum typSprawy) {
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

  public CaseDataHistory etapProcesu(EtapProcesuEnum etapProcesu) {
    this.etapProcesu = etapProcesu;
    return this;
  }

  /**
   * Default value: NOWA
   * @return etapProcesu
  */
  
  @Schema(name = "etapProcesu", description = "Default value: NOWA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etapProcesu")
  public EtapProcesuEnum getEtapProcesu() {
    return etapProcesu;
  }

  public void setEtapProcesu(EtapProcesuEnum etapProcesu) {
    this.etapProcesu = etapProcesu;
  }

  public CaseDataHistory statusTechniczny(StatusTechnicznyEnum statusTechniczny) {
    this.statusTechniczny = statusTechniczny;
    return this;
  }

  /**
   * 
   * @return statusTechniczny
  */
  
  @Schema(name = "statusTechniczny", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusTechniczny")
  public StatusTechnicznyEnum getStatusTechniczny() {
    return statusTechniczny;
  }

  public void setStatusTechniczny(StatusTechnicznyEnum statusTechniczny) {
    this.statusTechniczny = statusTechniczny;
  }

  public CaseDataHistory dataRejestracji(OffsetDateTime dataRejestracji) {
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

  public CaseDataHistory organisationId(String organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * identyfikator produktu_date (yyyy-MM-dd)
   * @return organisationId
  */
  
  @Schema(name = "organisationId", description = "identyfikator produktu_date (yyyy-MM-dd)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organisationId")
  public String getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }

  public CaseDataHistory numerKontraktu(String numerKontraktu) {
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

  public CaseDataHistory numerUmowy(String numerUmowy) {
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

  public CaseDataHistory numerSprawy(String numerSprawy) {
    this.numerSprawy = numerSprawy;
    return this;
  }

  /**
   * Unikalny numer dyspozycji. ID klucz złożony (human readable) - nr kontraktu_data rejstracji_numer kolejny sekwencji
   * @return numerSprawy
  */
  
  @Schema(name = "numerSprawy", description = "Unikalny numer dyspozycji. ID klucz złożony (human readable) - nr kontraktu_data rejstracji_numer kolejny sekwencji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerSprawy")
  public String getNumerSprawy() {
    return numerSprawy;
  }

  public void setNumerSprawy(String numerSprawy) {
    this.numerSprawy = numerSprawy;
  }

  public CaseDataHistory umowaIndywidualna(Boolean umowaIndywidualna) {
    this.umowaIndywidualna = umowaIndywidualna;
    return this;
  }

  /**
   * 
   * @return umowaIndywidualna
  */
  
  @Schema(name = "umowaIndywidualna", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("umowaIndywidualna")
  public Boolean getUmowaIndywidualna() {
    return umowaIndywidualna;
  }

  public void setUmowaIndywidualna(Boolean umowaIndywidualna) {
    this.umowaIndywidualna = umowaIndywidualna;
  }

  public CaseDataHistory opisPrzedmiotuMediacji(String opisPrzedmiotuMediacji) {
    this.opisPrzedmiotuMediacji = opisPrzedmiotuMediacji;
    return this;
  }

  /**
   * opis przedmiotu sporu
   * @return opisPrzedmiotuMediacji
  */
  
  @Schema(name = "opisPrzedmiotuMediacji", description = "opis przedmiotu sporu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opisPrzedmiotuMediacji")
  public String getOpisPrzedmiotuMediacji() {
    return opisPrzedmiotuMediacji;
  }

  public void setOpisPrzedmiotuMediacji(String opisPrzedmiotuMediacji) {
    this.opisPrzedmiotuMediacji = opisPrzedmiotuMediacji;
  }

  public CaseDataHistory wartoscKredytu(String wartoscKredytu) {
    this.wartoscKredytu = wartoscKredytu;
    return this;
  }

  /**
   * wartosc sporu, tylko cyfry
   * @return wartoscKredytu
  */
  
  @Schema(name = "wartoscKredytu", description = "wartosc sporu, tylko cyfry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wartoscKredytu")
  public String getWartoscKredytu() {
    return wartoscKredytu;
  }

  public void setWartoscKredytu(String wartoscKredytu) {
    this.wartoscKredytu = wartoscKredytu;
  }

  public CaseDataHistory walutaKredytu(WalutaKredytuEnum walutaKredytu) {
    this.walutaKredytu = walutaKredytu;
    return this;
  }

  /**
   * waluta sporu
   * @return walutaKredytu
  */
  
  @Schema(name = "walutaKredytu", description = "waluta sporu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("walutaKredytu")
  public WalutaKredytuEnum getWalutaKredytu() {
    return walutaKredytu;
  }

  public void setWalutaKredytu(WalutaKredytuEnum walutaKredytu) {
    this.walutaKredytu = walutaKredytu;
  }

  public CaseDataHistory sprawaPrzekazanaDoObslugiZewnetrznej(Boolean sprawaPrzekazanaDoObslugiZewnetrznej) {
    this.sprawaPrzekazanaDoObslugiZewnetrznej = sprawaPrzekazanaDoObslugiZewnetrznej;
    return this;
  }

  /**
   * Widok spraw przekazanych do EY tylko dla EY - brak wgladu w sprawy Banku
   * @return sprawaPrzekazanaDoObslugiZewnetrznej
  */
  
  @Schema(name = "sprawaPrzekazanaDoObslugiZewnetrznej", description = "Widok spraw przekazanych do EY tylko dla EY - brak wgladu w sprawy Banku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sprawaPrzekazanaDoObslugiZewnetrznej")
  public Boolean getSprawaPrzekazanaDoObslugiZewnetrznej() {
    return sprawaPrzekazanaDoObslugiZewnetrznej;
  }

  public void setSprawaPrzekazanaDoObslugiZewnetrznej(Boolean sprawaPrzekazanaDoObslugiZewnetrznej) {
    this.sprawaPrzekazanaDoObslugiZewnetrznej = sprawaPrzekazanaDoObslugiZewnetrznej;
  }

  public CaseDataHistory inicjatorProcesu(InicjatorProcesuEnum inicjatorProcesu) {
    this.inicjatorProcesu = inicjatorProcesu;
    return this;
  }

  /**
   * 
   * @return inicjatorProcesu
  */
  
  @Schema(name = "inicjatorProcesu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inicjatorProcesu")
  public InicjatorProcesuEnum getInicjatorProcesu() {
    return inicjatorProcesu;
  }

  public void setInicjatorProcesu(InicjatorProcesuEnum inicjatorProcesu) {
    this.inicjatorProcesu = inicjatorProcesu;
  }

  public CaseDataHistory wnioskujacyKlient(String wnioskujacyKlient) {
    this.wnioskujacyKlient = wnioskujacyKlient;
    return this;
  }

  /**
   * Pole uzupełniane gdy inicjator procesu to klient
   * @return wnioskujacyKlient
  */
  
  @Schema(name = "wnioskujacyKlient", description = "Pole uzupełniane gdy inicjator procesu to klient", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wnioskujacyKlient")
  public String getWnioskujacyKlient() {
    return wnioskujacyKlient;
  }

  public void setWnioskujacyKlient(String wnioskujacyKlient) {
    this.wnioskujacyKlient = wnioskujacyKlient;
  }

  public CaseDataHistory creditDataEntities(List<@Valid CreditData> creditDataEntities) {
    this.creditDataEntities = creditDataEntities;
    return this;
  }

  public CaseDataHistory addCreditDataEntitiesItem(CreditData creditDataEntitiesItem) {
    if (this.creditDataEntities == null) {
      this.creditDataEntities = new ArrayList<>();
    }
    this.creditDataEntities.add(creditDataEntitiesItem);
    return this;
  }

  /**
   * 
   * @return creditDataEntities
  */
  @Valid 
  @Schema(name = "creditDataEntities", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditDataEntities")
  public List<@Valid CreditData> getCreditDataEntities() {
    return creditDataEntities;
  }

  public void setCreditDataEntities(List<@Valid CreditData> creditDataEntities) {
    this.creditDataEntities = creditDataEntities;
  }

  public CaseDataHistory clientDataEntities(List<@Valid ClientData> clientDataEntities) {
    this.clientDataEntities = clientDataEntities;
    return this;
  }

  public CaseDataHistory addClientDataEntitiesItem(ClientData clientDataEntitiesItem) {
    if (this.clientDataEntities == null) {
      this.clientDataEntities = new ArrayList<>();
    }
    this.clientDataEntities.add(clientDataEntitiesItem);
    return this;
  }

  /**
   * Get clientDataEntities
   * @return clientDataEntities
  */
  @Valid 
  @Schema(name = "clientDataEntities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientDataEntities")
  public List<@Valid ClientData> getClientDataEntities() {
    return clientDataEntities;
  }

  public void setClientDataEntities(List<@Valid ClientData> clientDataEntities) {
    this.clientDataEntities = clientDataEntities;
  }

  public CaseDataHistory clientInteractionSummary(ClientInteractionSummary clientInteractionSummary) {
    this.clientInteractionSummary = clientInteractionSummary;
    return this;
  }

  /**
   * Get clientInteractionSummary
   * @return clientInteractionSummary
  */
  @Valid 
  @Schema(name = "clientInteractionSummary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientInteractionSummary")
  public ClientInteractionSummary getClientInteractionSummary() {
    return clientInteractionSummary;
  }

  public void setClientInteractionSummary(ClientInteractionSummary clientInteractionSummary) {
    this.clientInteractionSummary = clientInteractionSummary;
  }

  public CaseDataHistory calculationSummary(CalculationSummary calculationSummary) {
    this.calculationSummary = calculationSummary;
    return this;
  }

  /**
   * Get calculationSummary
   * @return calculationSummary
  */
  @Valid 
  @Schema(name = "calculationSummary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("calculationSummary")
  public CalculationSummary getCalculationSummary() {
    return calculationSummary;
  }

  public void setCalculationSummary(CalculationSummary calculationSummary) {
    this.calculationSummary = calculationSummary;
  }

  public CaseDataHistory negotiationLimits(List<@Valid NegotiationLimit> negotiationLimits) {
    this.negotiationLimits = negotiationLimits;
    return this;
  }

  public CaseDataHistory addNegotiationLimitsItem(NegotiationLimit negotiationLimitsItem) {
    if (this.negotiationLimits == null) {
      this.negotiationLimits = new ArrayList<>();
    }
    this.negotiationLimits.add(negotiationLimitsItem);
    return this;
  }

  /**
   * Get negotiationLimits
   * @return negotiationLimits
  */
  @Valid 
  @Schema(name = "negotiationLimits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negotiationLimits")
  public List<@Valid NegotiationLimit> getNegotiationLimits() {
    return negotiationLimits;
  }

  public void setNegotiationLimits(List<@Valid NegotiationLimit> negotiationLimits) {
    this.negotiationLimits = negotiationLimits;
  }

  public CaseDataHistory courtHearingMeetings(List<@Valid CourtHearingMeeting> courtHearingMeetings) {
    this.courtHearingMeetings = courtHearingMeetings;
    return this;
  }

  public CaseDataHistory addCourtHearingMeetingsItem(CourtHearingMeeting courtHearingMeetingsItem) {
    if (this.courtHearingMeetings == null) {
      this.courtHearingMeetings = new ArrayList<>();
    }
    this.courtHearingMeetings.add(courtHearingMeetingsItem);
    return this;
  }

  /**
   * 
   * @return courtHearingMeetings
  */
  @Valid 
  @Schema(name = "courtHearingMeetings", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("courtHearingMeetings")
  public List<@Valid CourtHearingMeeting> getCourtHearingMeetings() {
    return courtHearingMeetings;
  }

  public void setCourtHearingMeetings(List<@Valid CourtHearingMeeting> courtHearingMeetings) {
    this.courtHearingMeetings = courtHearingMeetings;
  }

  public CaseDataHistory attorneyEntities(List<@Valid OrganizationAttorney> attorneyEntities) {
    this.attorneyEntities = attorneyEntities;
    return this;
  }

  public CaseDataHistory addAttorneyEntitiesItem(OrganizationAttorney attorneyEntitiesItem) {
    if (this.attorneyEntities == null) {
      this.attorneyEntities = new ArrayList<>();
    }
    this.attorneyEntities.add(attorneyEntitiesItem);
    return this;
  }

  /**
   * 
   * @return attorneyEntities
  */
  @Valid 
  @Schema(name = "attorneyEntities", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attorneyEntities")
  public List<@Valid OrganizationAttorney> getAttorneyEntities() {
    return attorneyEntities;
  }

  public void setAttorneyEntities(List<@Valid OrganizationAttorney> attorneyEntities) {
    this.attorneyEntities = attorneyEntities;
  }

  public CaseDataHistory caseMediators(List<@Valid CaseMediator> caseMediators) {
    this.caseMediators = caseMediators;
    return this;
  }

  public CaseDataHistory addCaseMediatorsItem(CaseMediator caseMediatorsItem) {
    if (this.caseMediators == null) {
      this.caseMediators = new ArrayList<>();
    }
    this.caseMediators.add(caseMediatorsItem);
    return this;
  }

  /**
   * 
   * @return caseMediators
  */
  @Valid 
  @Schema(name = "caseMediators", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseMediators")
  public List<@Valid CaseMediator> getCaseMediators() {
    return caseMediators;
  }

  public void setCaseMediators(List<@Valid CaseMediator> caseMediators) {
    this.caseMediators = caseMediators;
  }

  public CaseDataHistory knfData(KNFData knfData) {
    this.knfData = knfData;
    return this;
  }

  /**
   * Get knfData
   * @return knfData
  */
  @Valid 
  @Schema(name = "knfData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("knfData")
  public KNFData getKnfData() {
    return knfData;
  }

  public void setKnfData(KNFData knfData) {
    this.knfData = knfData;
  }

  public CaseDataHistory mediationOutcome(MediationOutcome mediationOutcome) {
    this.mediationOutcome = mediationOutcome;
    return this;
  }

  /**
   * Get mediationOutcome
   * @return mediationOutcome
  */
  @Valid 
  @Schema(name = "mediationOutcome", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediationOutcome")
  public MediationOutcome getMediationOutcome() {
    return mediationOutcome;
  }

  public void setMediationOutcome(MediationOutcome mediationOutcome) {
    this.mediationOutcome = mediationOutcome;
  }

  public CaseDataHistory finalizationParameters(FinalizationParameters finalizationParameters) {
    this.finalizationParameters = finalizationParameters;
    return this;
  }

  /**
   * Get finalizationParameters
   * @return finalizationParameters
  */
  @Valid 
  @Schema(name = "finalizationParameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finalizationParameters")
  public FinalizationParameters getFinalizationParameters() {
    return finalizationParameters;
  }

  public void setFinalizationParameters(FinalizationParameters finalizationParameters) {
    this.finalizationParameters = finalizationParameters;
  }

  public CaseDataHistory attachments(List<@Valid Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public CaseDataHistory addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Get attachments
   * @return attachments
  */
  @Valid 
  @Schema(name = "attachments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachments")
  public List<@Valid Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<@Valid Attachment> attachments) {
    this.attachments = attachments;
  }

  public CaseDataHistory noteEntities(List<@Valid Note> noteEntities) {
    this.noteEntities = noteEntities;
    return this;
  }

  public CaseDataHistory addNoteEntitiesItem(Note noteEntitiesItem) {
    if (this.noteEntities == null) {
      this.noteEntities = new ArrayList<>();
    }
    this.noteEntities.add(noteEntitiesItem);
    return this;
  }

  /**
   * Ids of Note entities related to Case
   * @return noteEntities
  */
  @Valid 
  @Schema(name = "noteEntities", description = "Ids of Note entities related to Case", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteEntities")
  public List<@Valid Note> getNoteEntities() {
    return noteEntities;
  }

  public void setNoteEntities(List<@Valid Note> noteEntities) {
    this.noteEntities = noteEntities;
  }

  public CaseDataHistory documentationData(DocumentationData documentationData) {
    this.documentationData = documentationData;
    return this;
  }

  /**
   * Get documentationData
   * @return documentationData
  */
  @Valid 
  @Schema(name = "documentationData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentationData")
  public DocumentationData getDocumentationData() {
    return documentationData;
  }

  public void setDocumentationData(DocumentationData documentationData) {
    this.documentationData = documentationData;
  }

  public CaseDataHistory creditDecision(CreditDecision creditDecision) {
    this.creditDecision = creditDecision;
    return this;
  }

  /**
   * Get creditDecision
   * @return creditDecision
  */
  @Valid 
  @Schema(name = "creditDecision", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditDecision")
  public CreditDecision getCreditDecision() {
    return creditDecision;
  }

  public void setCreditDecision(CreditDecision creditDecision) {
    this.creditDecision = creditDecision;
  }

  public CaseDataHistory dataAktualizacjiStatusu(OffsetDateTime dataAktualizacjiStatusu) {
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

  public CaseDataHistory sprawaZmigrowana(Boolean sprawaZmigrowana) {
    this.sprawaZmigrowana = sprawaZmigrowana;
    return this;
  }

  /**
   * Represents the state, is case migrated or no
   * @return sprawaZmigrowana
  */
  
  @Schema(name = "sprawaZmigrowana", description = "Represents the state, is case migrated or no", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sprawaZmigrowana")
  public Boolean getSprawaZmigrowana() {
    return sprawaZmigrowana;
  }

  public void setSprawaZmigrowana(Boolean sprawaZmigrowana) {
    this.sprawaZmigrowana = sprawaZmigrowana;
  }

  public CaseDataHistory etapDoMigracji(EtapProcesu etapDoMigracji) {
    this.etapDoMigracji = etapDoMigracji;
    return this;
  }

  /**
   * Get etapDoMigracji
   * @return etapDoMigracji
  */
  @Valid 
  @Schema(name = "etapDoMigracji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etapDoMigracji")
  public EtapProcesu getEtapDoMigracji() {
    return etapDoMigracji;
  }

  public void setEtapDoMigracji(EtapProcesu etapDoMigracji) {
    this.etapDoMigracji = etapDoMigracji;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseDataHistory caseDataHistory = (CaseDataHistory) o;
    return Objects.equals(this.creatorId, caseDataHistory.creatorId) &&
        Objects.equals(this.createDate, caseDataHistory.createDate) &&
        Objects.equals(this.lastModifyUserId, caseDataHistory.lastModifyUserId) &&
        Objects.equals(this.lastModifyChangeDate, caseDataHistory.lastModifyChangeDate) &&
        Objects.equals(this.id, caseDataHistory.id) &&
        Objects.equals(this.przypisanyUzytkownik, caseDataHistory.przypisanyUzytkownik) &&
        Objects.equals(this.typSprawy, caseDataHistory.typSprawy) &&
        Objects.equals(this.etapProcesu, caseDataHistory.etapProcesu) &&
        Objects.equals(this.statusTechniczny, caseDataHistory.statusTechniczny) &&
        Objects.equals(this.dataRejestracji, caseDataHistory.dataRejestracji) &&
        Objects.equals(this.organisationId, caseDataHistory.organisationId) &&
        Objects.equals(this.numerKontraktu, caseDataHistory.numerKontraktu) &&
        Objects.equals(this.numerUmowy, caseDataHistory.numerUmowy) &&
        Objects.equals(this.numerSprawy, caseDataHistory.numerSprawy) &&
        Objects.equals(this.umowaIndywidualna, caseDataHistory.umowaIndywidualna) &&
        Objects.equals(this.opisPrzedmiotuMediacji, caseDataHistory.opisPrzedmiotuMediacji) &&
        Objects.equals(this.wartoscKredytu, caseDataHistory.wartoscKredytu) &&
        Objects.equals(this.walutaKredytu, caseDataHistory.walutaKredytu) &&
        Objects.equals(this.sprawaPrzekazanaDoObslugiZewnetrznej, caseDataHistory.sprawaPrzekazanaDoObslugiZewnetrznej) &&
        Objects.equals(this.inicjatorProcesu, caseDataHistory.inicjatorProcesu) &&
        Objects.equals(this.wnioskujacyKlient, caseDataHistory.wnioskujacyKlient) &&
        Objects.equals(this.creditDataEntities, caseDataHistory.creditDataEntities) &&
        Objects.equals(this.clientDataEntities, caseDataHistory.clientDataEntities) &&
        Objects.equals(this.clientInteractionSummary, caseDataHistory.clientInteractionSummary) &&
        Objects.equals(this.calculationSummary, caseDataHistory.calculationSummary) &&
        Objects.equals(this.negotiationLimits, caseDataHistory.negotiationLimits) &&
        Objects.equals(this.courtHearingMeetings, caseDataHistory.courtHearingMeetings) &&
        Objects.equals(this.attorneyEntities, caseDataHistory.attorneyEntities) &&
        Objects.equals(this.caseMediators, caseDataHistory.caseMediators) &&
        Objects.equals(this.knfData, caseDataHistory.knfData) &&
        Objects.equals(this.mediationOutcome, caseDataHistory.mediationOutcome) &&
        Objects.equals(this.finalizationParameters, caseDataHistory.finalizationParameters) &&
        Objects.equals(this.attachments, caseDataHistory.attachments) &&
        Objects.equals(this.noteEntities, caseDataHistory.noteEntities) &&
        Objects.equals(this.documentationData, caseDataHistory.documentationData) &&
        Objects.equals(this.creditDecision, caseDataHistory.creditDecision) &&
        Objects.equals(this.dataAktualizacjiStatusu, caseDataHistory.dataAktualizacjiStatusu) &&
        Objects.equals(this.sprawaZmigrowana, caseDataHistory.sprawaZmigrowana) &&
        Objects.equals(this.etapDoMigracji, caseDataHistory.etapDoMigracji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorId, createDate, lastModifyUserId, lastModifyChangeDate, id, przypisanyUzytkownik, typSprawy, etapProcesu, statusTechniczny, dataRejestracji, organisationId, numerKontraktu, numerUmowy, numerSprawy, umowaIndywidualna, opisPrzedmiotuMediacji, wartoscKredytu, walutaKredytu, sprawaPrzekazanaDoObslugiZewnetrznej, inicjatorProcesu, wnioskujacyKlient, creditDataEntities, clientDataEntities, clientInteractionSummary, calculationSummary, negotiationLimits, courtHearingMeetings, attorneyEntities, caseMediators, knfData, mediationOutcome, finalizationParameters, attachments, noteEntities, documentationData, creditDecision, dataAktualizacjiStatusu, sprawaZmigrowana, etapDoMigracji);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseDataHistory {\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastModifyUserId: ").append(toIndentedString(lastModifyUserId)).append("\n");
    sb.append("    lastModifyChangeDate: ").append(toIndentedString(lastModifyChangeDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    przypisanyUzytkownik: ").append(toIndentedString(przypisanyUzytkownik)).append("\n");
    sb.append("    typSprawy: ").append(toIndentedString(typSprawy)).append("\n");
    sb.append("    etapProcesu: ").append(toIndentedString(etapProcesu)).append("\n");
    sb.append("    statusTechniczny: ").append(toIndentedString(statusTechniczny)).append("\n");
    sb.append("    dataRejestracji: ").append(toIndentedString(dataRejestracji)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    numerKontraktu: ").append(toIndentedString(numerKontraktu)).append("\n");
    sb.append("    numerUmowy: ").append(toIndentedString(numerUmowy)).append("\n");
    sb.append("    numerSprawy: ").append(toIndentedString(numerSprawy)).append("\n");
    sb.append("    umowaIndywidualna: ").append(toIndentedString(umowaIndywidualna)).append("\n");
    sb.append("    opisPrzedmiotuMediacji: ").append(toIndentedString(opisPrzedmiotuMediacji)).append("\n");
    sb.append("    wartoscKredytu: ").append(toIndentedString(wartoscKredytu)).append("\n");
    sb.append("    walutaKredytu: ").append(toIndentedString(walutaKredytu)).append("\n");
    sb.append("    sprawaPrzekazanaDoObslugiZewnetrznej: ").append(toIndentedString(sprawaPrzekazanaDoObslugiZewnetrznej)).append("\n");
    sb.append("    inicjatorProcesu: ").append(toIndentedString(inicjatorProcesu)).append("\n");
    sb.append("    wnioskujacyKlient: ").append(toIndentedString(wnioskujacyKlient)).append("\n");
    sb.append("    creditDataEntities: ").append(toIndentedString(creditDataEntities)).append("\n");
    sb.append("    clientDataEntities: ").append(toIndentedString(clientDataEntities)).append("\n");
    sb.append("    clientInteractionSummary: ").append(toIndentedString(clientInteractionSummary)).append("\n");
    sb.append("    calculationSummary: ").append(toIndentedString(calculationSummary)).append("\n");
    sb.append("    negotiationLimits: ").append(toIndentedString(negotiationLimits)).append("\n");
    sb.append("    courtHearingMeetings: ").append(toIndentedString(courtHearingMeetings)).append("\n");
    sb.append("    attorneyEntities: ").append(toIndentedString(attorneyEntities)).append("\n");
    sb.append("    caseMediators: ").append(toIndentedString(caseMediators)).append("\n");
    sb.append("    knfData: ").append(toIndentedString(knfData)).append("\n");
    sb.append("    mediationOutcome: ").append(toIndentedString(mediationOutcome)).append("\n");
    sb.append("    finalizationParameters: ").append(toIndentedString(finalizationParameters)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    noteEntities: ").append(toIndentedString(noteEntities)).append("\n");
    sb.append("    documentationData: ").append(toIndentedString(documentationData)).append("\n");
    sb.append("    creditDecision: ").append(toIndentedString(creditDecision)).append("\n");
    sb.append("    dataAktualizacjiStatusu: ").append(toIndentedString(dataAktualizacjiStatusu)).append("\n");
    sb.append("    sprawaZmigrowana: ").append(toIndentedString(sprawaZmigrowana)).append("\n");
    sb.append("    etapDoMigracji: ").append(toIndentedString(etapDoMigracji)).append("\n");
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

