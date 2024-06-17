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
import model.EtapProcesu;
import model.LabelValue;
import model.ReopenCaseHistory;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dane Sprawy
 */

@Schema(name = "CaseData", description = "Dane Sprawy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CaseData {

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

  private String godzinaRejestracji;

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
  private List<Long> creditDataIds;

  @Valid
  private List<Long> clientDataIds;

  private Long clientInteractionSummaryId;

  private Long calculationSummaryId;

  @Valid
  private List<Long> courtHearingMeetingsIds;

  @Valid
  private List<Long> organizationAttorneyIds;

  @Valid
  private List<Long> mediatorIds;

  private Long knfDataId;

  private Long mediationOutcomeId;

  private Long finalizationParametersId;

  @Valid
  private List<Long> notatkiIds;

  private Long documentationDataId;

  private Long creditDecisionId;

  @Valid
  private List<Long> negotiationLimitIds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataAktualizacjiStatusu;

  private Boolean sprawaZmigrowana;

  private EtapProcesu etapDoMigracji;

  @Valid
  private List<ReopenCaseHistory> reopenCaseHistory;

  public CaseData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CaseData(LabelValue przypisanyUzytkownik, TypSprawyEnum typSprawy, EtapProcesuEnum etapProcesu, StatusTechnicznyEnum statusTechniczny, OffsetDateTime dataRejestracji, String organisationId, String numerKontraktu, String numerUmowy, Boolean umowaIndywidualna, String opisPrzedmiotuMediacji, String wartoscKredytu, WalutaKredytuEnum walutaKredytu, Boolean sprawaPrzekazanaDoObslugiZewnetrznej, InicjatorProcesuEnum inicjatorProcesu) {
    this.przypisanyUzytkownik = przypisanyUzytkownik;
    this.typSprawy = typSprawy;
    this.etapProcesu = etapProcesu;
    this.statusTechniczny = statusTechniczny;
    this.dataRejestracji = dataRejestracji;
    this.organisationId = organisationId;
    this.numerKontraktu = numerKontraktu;
    this.numerUmowy = numerUmowy;
    this.umowaIndywidualna = umowaIndywidualna;
    this.opisPrzedmiotuMediacji = opisPrzedmiotuMediacji;
    this.wartoscKredytu = wartoscKredytu;
    this.walutaKredytu = walutaKredytu;
    this.sprawaPrzekazanaDoObslugiZewnetrznej = sprawaPrzekazanaDoObslugiZewnetrznej;
    this.inicjatorProcesu = inicjatorProcesu;
  }

  public CaseData id(Long id) {
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

  public CaseData przypisanyUzytkownik(LabelValue przypisanyUzytkownik) {
    this.przypisanyUzytkownik = przypisanyUzytkownik;
    return this;
  }

  /**
   * Get przypisanyUzytkownik
   * @return przypisanyUzytkownik
  */
  @NotNull @Valid 
  @Schema(name = "przypisanyUzytkownik", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("przypisanyUzytkownik")
  public LabelValue getPrzypisanyUzytkownik() {
    return przypisanyUzytkownik;
  }

  public void setPrzypisanyUzytkownik(LabelValue przypisanyUzytkownik) {
    this.przypisanyUzytkownik = przypisanyUzytkownik;
  }

  public CaseData typSprawy(TypSprawyEnum typSprawy) {
    this.typSprawy = typSprawy;
    return this;
  }

  /**
   * 
   * @return typSprawy
  */
  @NotNull 
  @Schema(name = "typSprawy", description = "", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typSprawy")
  public TypSprawyEnum getTypSprawy() {
    return typSprawy;
  }

  public void setTypSprawy(TypSprawyEnum typSprawy) {
    this.typSprawy = typSprawy;
  }

  public CaseData etapProcesu(EtapProcesuEnum etapProcesu) {
    this.etapProcesu = etapProcesu;
    return this;
  }

  /**
   * Default value: NOWA
   * @return etapProcesu
  */
  @NotNull 
  @Schema(name = "etapProcesu", description = "Default value: NOWA", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("etapProcesu")
  public EtapProcesuEnum getEtapProcesu() {
    return etapProcesu;
  }

  public void setEtapProcesu(EtapProcesuEnum etapProcesu) {
    this.etapProcesu = etapProcesu;
  }

  public CaseData statusTechniczny(StatusTechnicznyEnum statusTechniczny) {
    this.statusTechniczny = statusTechniczny;
    return this;
  }

  /**
   * 
   * @return statusTechniczny
  */
  @NotNull 
  @Schema(name = "statusTechniczny", description = "", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusTechniczny")
  public StatusTechnicznyEnum getStatusTechniczny() {
    return statusTechniczny;
  }

  public void setStatusTechniczny(StatusTechnicznyEnum statusTechniczny) {
    this.statusTechniczny = statusTechniczny;
  }

  public CaseData dataRejestracji(OffsetDateTime dataRejestracji) {
    this.dataRejestracji = dataRejestracji;
    return this;
  }

  /**
   * yyyy-MM-dd HH:mm:ss
   * @return dataRejestracji
  */
  @NotNull @Valid 
  @Schema(name = "dataRejestracji", description = "yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dataRejestracji")
  public OffsetDateTime getDataRejestracji() {
    return dataRejestracji;
  }

  public void setDataRejestracji(OffsetDateTime dataRejestracji) {
    this.dataRejestracji = dataRejestracji;
  }

  public CaseData godzinaRejestracji(String godzinaRejestracji) {
    this.godzinaRejestracji = godzinaRejestracji;
    return this;
  }

  /**
   * HH:mm:ss
   * @return godzinaRejestracji
  */
  @Pattern(regexp = "^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$") 
  @Schema(name = "godzinaRejestracji", description = "HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("godzinaRejestracji")
  public String getGodzinaRejestracji() {
    return godzinaRejestracji;
  }

  public void setGodzinaRejestracji(String godzinaRejestracji) {
    this.godzinaRejestracji = godzinaRejestracji;
  }

  public CaseData organisationId(String organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * identyfikator produktu_date (yyyy-MM-dd)
   * @return organisationId
  */
  @NotNull @Size(min = 0, max = 100) 
  @Schema(name = "organisationId", description = "identyfikator produktu_date (yyyy-MM-dd)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("organisationId")
  public String getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }

  public CaseData numerKontraktu(String numerKontraktu) {
    this.numerKontraktu = numerKontraktu;
    return this;
  }

  /**
   * 
   * @return numerKontraktu
  */
  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "numerKontraktu", description = "", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("numerKontraktu")
  public String getNumerKontraktu() {
    return numerKontraktu;
  }

  public void setNumerKontraktu(String numerKontraktu) {
    this.numerKontraktu = numerKontraktu;
  }

  public CaseData numerUmowy(String numerUmowy) {
    this.numerUmowy = numerUmowy;
    return this;
  }

  /**
   * 
   * @return numerUmowy
  */
  @NotNull @Size(min = 0, max = 30) 
  @Schema(name = "numerUmowy", description = "", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("numerUmowy")
  public String getNumerUmowy() {
    return numerUmowy;
  }

  public void setNumerUmowy(String numerUmowy) {
    this.numerUmowy = numerUmowy;
  }

  public CaseData numerSprawy(String numerSprawy) {
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

  public CaseData umowaIndywidualna(Boolean umowaIndywidualna) {
    this.umowaIndywidualna = umowaIndywidualna;
    return this;
  }

  /**
   * 
   * @return umowaIndywidualna
  */
  @NotNull 
  @Schema(name = "umowaIndywidualna", description = "", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("umowaIndywidualna")
  public Boolean getUmowaIndywidualna() {
    return umowaIndywidualna;
  }

  public void setUmowaIndywidualna(Boolean umowaIndywidualna) {
    this.umowaIndywidualna = umowaIndywidualna;
  }

  public CaseData opisPrzedmiotuMediacji(String opisPrzedmiotuMediacji) {
    this.opisPrzedmiotuMediacji = opisPrzedmiotuMediacji;
    return this;
  }

  /**
   * opis przedmiotu sporu
   * @return opisPrzedmiotuMediacji
  */
  @NotNull @Size(min = 0, max = 400) 
  @Schema(name = "opisPrzedmiotuMediacji", description = "opis przedmiotu sporu", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("opisPrzedmiotuMediacji")
  public String getOpisPrzedmiotuMediacji() {
    return opisPrzedmiotuMediacji;
  }

  public void setOpisPrzedmiotuMediacji(String opisPrzedmiotuMediacji) {
    this.opisPrzedmiotuMediacji = opisPrzedmiotuMediacji;
  }

  public CaseData wartoscKredytu(String wartoscKredytu) {
    this.wartoscKredytu = wartoscKredytu;
    return this;
  }

  /**
   * wartosc sporu, tylko cyfry
   * @return wartoscKredytu
  */
  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "wartoscKredytu", description = "wartosc sporu, tylko cyfry", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("wartoscKredytu")
  public String getWartoscKredytu() {
    return wartoscKredytu;
  }

  public void setWartoscKredytu(String wartoscKredytu) {
    this.wartoscKredytu = wartoscKredytu;
  }

  public CaseData walutaKredytu(WalutaKredytuEnum walutaKredytu) {
    this.walutaKredytu = walutaKredytu;
    return this;
  }

  /**
   * waluta sporu
   * @return walutaKredytu
  */
  @NotNull 
  @Schema(name = "walutaKredytu", description = "waluta sporu", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("walutaKredytu")
  public WalutaKredytuEnum getWalutaKredytu() {
    return walutaKredytu;
  }

  public void setWalutaKredytu(WalutaKredytuEnum walutaKredytu) {
    this.walutaKredytu = walutaKredytu;
  }

  public CaseData sprawaPrzekazanaDoObslugiZewnetrznej(Boolean sprawaPrzekazanaDoObslugiZewnetrznej) {
    this.sprawaPrzekazanaDoObslugiZewnetrznej = sprawaPrzekazanaDoObslugiZewnetrznej;
    return this;
  }

  /**
   * Widok spraw przekazanych do EY tylko dla EY - brak wgladu w sprawy Banku
   * @return sprawaPrzekazanaDoObslugiZewnetrznej
  */
  @NotNull 
  @Schema(name = "sprawaPrzekazanaDoObslugiZewnetrznej", description = "Widok spraw przekazanych do EY tylko dla EY - brak wgladu w sprawy Banku", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sprawaPrzekazanaDoObslugiZewnetrznej")
  public Boolean getSprawaPrzekazanaDoObslugiZewnetrznej() {
    return sprawaPrzekazanaDoObslugiZewnetrznej;
  }

  public void setSprawaPrzekazanaDoObslugiZewnetrznej(Boolean sprawaPrzekazanaDoObslugiZewnetrznej) {
    this.sprawaPrzekazanaDoObslugiZewnetrznej = sprawaPrzekazanaDoObslugiZewnetrznej;
  }

  public CaseData inicjatorProcesu(InicjatorProcesuEnum inicjatorProcesu) {
    this.inicjatorProcesu = inicjatorProcesu;
    return this;
  }

  /**
   * 
   * @return inicjatorProcesu
  */
  @NotNull 
  @Schema(name = "inicjatorProcesu", description = "", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("inicjatorProcesu")
  public InicjatorProcesuEnum getInicjatorProcesu() {
    return inicjatorProcesu;
  }

  public void setInicjatorProcesu(InicjatorProcesuEnum inicjatorProcesu) {
    this.inicjatorProcesu = inicjatorProcesu;
  }

  public CaseData wnioskujacyKlient(String wnioskujacyKlient) {
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

  public CaseData creditDataIds(List<Long> creditDataIds) {
    this.creditDataIds = creditDataIds;
    return this;
  }

  public CaseData addCreditDataIdsItem(Long creditDataIdsItem) {
    if (this.creditDataIds == null) {
      this.creditDataIds = new ArrayList<>();
    }
    this.creditDataIds.add(creditDataIdsItem);
    return this;
  }

  /**
   * 
   * @return creditDataIds
  */
  
  @Schema(name = "creditDataIds", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditDataIds")
  public List<Long> getCreditDataIds() {
    return creditDataIds;
  }

  public void setCreditDataIds(List<Long> creditDataIds) {
    this.creditDataIds = creditDataIds;
  }

  public CaseData clientDataIds(List<Long> clientDataIds) {
    this.clientDataIds = clientDataIds;
    return this;
  }

  public CaseData addClientDataIdsItem(Long clientDataIdsItem) {
    if (this.clientDataIds == null) {
      this.clientDataIds = new ArrayList<>();
    }
    this.clientDataIds.add(clientDataIdsItem);
    return this;
  }

  /**
   * List of ClientData IDs
   * @return clientDataIds
  */
  
  @Schema(name = "clientDataIds", description = "List of ClientData IDs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientDataIds")
  public List<Long> getClientDataIds() {
    return clientDataIds;
  }

  public void setClientDataIds(List<Long> clientDataIds) {
    this.clientDataIds = clientDataIds;
  }

  public CaseData clientInteractionSummaryId(Long clientInteractionSummaryId) {
    this.clientInteractionSummaryId = clientInteractionSummaryId;
    return this;
  }

  /**
   * 
   * @return clientInteractionSummaryId
  */
  
  @Schema(name = "clientInteractionSummaryId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientInteractionSummaryId")
  public Long getClientInteractionSummaryId() {
    return clientInteractionSummaryId;
  }

  public void setClientInteractionSummaryId(Long clientInteractionSummaryId) {
    this.clientInteractionSummaryId = clientInteractionSummaryId;
  }

  public CaseData calculationSummaryId(Long calculationSummaryId) {
    this.calculationSummaryId = calculationSummaryId;
    return this;
  }

  /**
   * 
   * @return calculationSummaryId
  */
  
  @Schema(name = "calculationSummaryId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("calculationSummaryId")
  public Long getCalculationSummaryId() {
    return calculationSummaryId;
  }

  public void setCalculationSummaryId(Long calculationSummaryId) {
    this.calculationSummaryId = calculationSummaryId;
  }

  public CaseData courtHearingMeetingsIds(List<Long> courtHearingMeetingsIds) {
    this.courtHearingMeetingsIds = courtHearingMeetingsIds;
    return this;
  }

  public CaseData addCourtHearingMeetingsIdsItem(Long courtHearingMeetingsIdsItem) {
    if (this.courtHearingMeetingsIds == null) {
      this.courtHearingMeetingsIds = new ArrayList<>();
    }
    this.courtHearingMeetingsIds.add(courtHearingMeetingsIdsItem);
    return this;
  }

  /**
   * 
   * @return courtHearingMeetingsIds
  */
  
  @Schema(name = "courtHearingMeetingsIds", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("courtHearingMeetingsIds")
  public List<Long> getCourtHearingMeetingsIds() {
    return courtHearingMeetingsIds;
  }

  public void setCourtHearingMeetingsIds(List<Long> courtHearingMeetingsIds) {
    this.courtHearingMeetingsIds = courtHearingMeetingsIds;
  }

  public CaseData organizationAttorneyIds(List<Long> organizationAttorneyIds) {
    this.organizationAttorneyIds = organizationAttorneyIds;
    return this;
  }

  public CaseData addOrganizationAttorneyIdsItem(Long organizationAttorneyIdsItem) {
    if (this.organizationAttorneyIds == null) {
      this.organizationAttorneyIds = new ArrayList<>();
    }
    this.organizationAttorneyIds.add(organizationAttorneyIdsItem);
    return this;
  }

  /**
   * 
   * @return organizationAttorneyIds
  */
  
  @Schema(name = "organizationAttorneyIds", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationAttorneyIds")
  public List<Long> getOrganizationAttorneyIds() {
    return organizationAttorneyIds;
  }

  public void setOrganizationAttorneyIds(List<Long> organizationAttorneyIds) {
    this.organizationAttorneyIds = organizationAttorneyIds;
  }

  public CaseData mediatorIds(List<Long> mediatorIds) {
    this.mediatorIds = mediatorIds;
    return this;
  }

  public CaseData addMediatorIdsItem(Long mediatorIdsItem) {
    if (this.mediatorIds == null) {
      this.mediatorIds = new ArrayList<>();
    }
    this.mediatorIds.add(mediatorIdsItem);
    return this;
  }

  /**
   * 
   * @return mediatorIds
  */
  
  @Schema(name = "mediatorIds", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediatorIds")
  public List<Long> getMediatorIds() {
    return mediatorIds;
  }

  public void setMediatorIds(List<Long> mediatorIds) {
    this.mediatorIds = mediatorIds;
  }

  public CaseData knfDataId(Long knfDataId) {
    this.knfDataId = knfDataId;
    return this;
  }

  /**
   * 
   * @return knfDataId
  */
  
  @Schema(name = "knfDataId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("knfDataId")
  public Long getKnfDataId() {
    return knfDataId;
  }

  public void setKnfDataId(Long knfDataId) {
    this.knfDataId = knfDataId;
  }

  public CaseData mediationOutcomeId(Long mediationOutcomeId) {
    this.mediationOutcomeId = mediationOutcomeId;
    return this;
  }

  /**
   * 
   * @return mediationOutcomeId
  */
  
  @Schema(name = "mediationOutcomeId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediationOutcomeId")
  public Long getMediationOutcomeId() {
    return mediationOutcomeId;
  }

  public void setMediationOutcomeId(Long mediationOutcomeId) {
    this.mediationOutcomeId = mediationOutcomeId;
  }

  public CaseData finalizationParametersId(Long finalizationParametersId) {
    this.finalizationParametersId = finalizationParametersId;
    return this;
  }

  /**
   * 
   * @return finalizationParametersId
  */
  
  @Schema(name = "finalizationParametersId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finalizationParametersId")
  public Long getFinalizationParametersId() {
    return finalizationParametersId;
  }

  public void setFinalizationParametersId(Long finalizationParametersId) {
    this.finalizationParametersId = finalizationParametersId;
  }

  public CaseData notatkiIds(List<Long> notatkiIds) {
    this.notatkiIds = notatkiIds;
    return this;
  }

  public CaseData addNotatkiIdsItem(Long notatkiIdsItem) {
    if (this.notatkiIds == null) {
      this.notatkiIds = new ArrayList<>();
    }
    this.notatkiIds.add(notatkiIdsItem);
    return this;
  }

  /**
   * Ids of Note entities related to Case
   * @return notatkiIds
  */
  
  @Schema(name = "notatkiIds", description = "Ids of Note entities related to Case", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notatkiIds")
  public List<Long> getNotatkiIds() {
    return notatkiIds;
  }

  public void setNotatkiIds(List<Long> notatkiIds) {
    this.notatkiIds = notatkiIds;
  }

  public CaseData documentationDataId(Long documentationDataId) {
    this.documentationDataId = documentationDataId;
    return this;
  }

  /**
   * 
   * @return documentationDataId
  */
  
  @Schema(name = "documentationDataId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentationDataId")
  public Long getDocumentationDataId() {
    return documentationDataId;
  }

  public void setDocumentationDataId(Long documentationDataId) {
    this.documentationDataId = documentationDataId;
  }

  public CaseData creditDecisionId(Long creditDecisionId) {
    this.creditDecisionId = creditDecisionId;
    return this;
  }

  /**
   * 
   * @return creditDecisionId
  */
  
  @Schema(name = "creditDecisionId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditDecisionId")
  public Long getCreditDecisionId() {
    return creditDecisionId;
  }

  public void setCreditDecisionId(Long creditDecisionId) {
    this.creditDecisionId = creditDecisionId;
  }

  public CaseData negotiationLimitIds(List<Long> negotiationLimitIds) {
    this.negotiationLimitIds = negotiationLimitIds;
    return this;
  }

  public CaseData addNegotiationLimitIdsItem(Long negotiationLimitIdsItem) {
    if (this.negotiationLimitIds == null) {
      this.negotiationLimitIds = new ArrayList<>();
    }
    this.negotiationLimitIds.add(negotiationLimitIdsItem);
    return this;
  }

  /**
   * List of NegotiationLimit IDs
   * @return negotiationLimitIds
  */
  
  @Schema(name = "negotiationLimitIds", description = "List of NegotiationLimit IDs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negotiationLimitIds")
  public List<Long> getNegotiationLimitIds() {
    return negotiationLimitIds;
  }

  public void setNegotiationLimitIds(List<Long> negotiationLimitIds) {
    this.negotiationLimitIds = negotiationLimitIds;
  }

  public CaseData dataAktualizacjiStatusu(OffsetDateTime dataAktualizacjiStatusu) {
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

  public CaseData sprawaZmigrowana(Boolean sprawaZmigrowana) {
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

  public CaseData etapDoMigracji(EtapProcesu etapDoMigracji) {
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

  public CaseData reopenCaseHistory(List<ReopenCaseHistory> reopenCaseHistory) {
    this.reopenCaseHistory = reopenCaseHistory;
    return this;
  }

  public CaseData addReopenCaseHistoryItem(ReopenCaseHistory reopenCaseHistoryItem) {
    if (this.reopenCaseHistory == null) {
      this.reopenCaseHistory = new ArrayList<>();
    }
    this.reopenCaseHistory.add(reopenCaseHistoryItem);
    return this;
  }

  /**
   * Reopen case history
   * @return reopenCaseHistory
  */
  @Valid 
  @Schema(name = "reopenCaseHistory", description = "Reopen case history", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reopenCaseHistory")
  public List<ReopenCaseHistory> getReopenCaseHistory() {
    return reopenCaseHistory;
  }

  public void setReopenCaseHistory(List<ReopenCaseHistory> reopenCaseHistory) {
    this.reopenCaseHistory = reopenCaseHistory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseData caseData = (CaseData) o;
    return Objects.equals(this.id, caseData.id) &&
        Objects.equals(this.przypisanyUzytkownik, caseData.przypisanyUzytkownik) &&
        Objects.equals(this.typSprawy, caseData.typSprawy) &&
        Objects.equals(this.etapProcesu, caseData.etapProcesu) &&
        Objects.equals(this.statusTechniczny, caseData.statusTechniczny) &&
        Objects.equals(this.dataRejestracji, caseData.dataRejestracji) &&
        Objects.equals(this.godzinaRejestracji, caseData.godzinaRejestracji) &&
        Objects.equals(this.organisationId, caseData.organisationId) &&
        Objects.equals(this.numerKontraktu, caseData.numerKontraktu) &&
        Objects.equals(this.numerUmowy, caseData.numerUmowy) &&
        Objects.equals(this.numerSprawy, caseData.numerSprawy) &&
        Objects.equals(this.umowaIndywidualna, caseData.umowaIndywidualna) &&
        Objects.equals(this.opisPrzedmiotuMediacji, caseData.opisPrzedmiotuMediacji) &&
        Objects.equals(this.wartoscKredytu, caseData.wartoscKredytu) &&
        Objects.equals(this.walutaKredytu, caseData.walutaKredytu) &&
        Objects.equals(this.sprawaPrzekazanaDoObslugiZewnetrznej, caseData.sprawaPrzekazanaDoObslugiZewnetrznej) &&
        Objects.equals(this.inicjatorProcesu, caseData.inicjatorProcesu) &&
        Objects.equals(this.wnioskujacyKlient, caseData.wnioskujacyKlient) &&
        Objects.equals(this.creditDataIds, caseData.creditDataIds) &&
        Objects.equals(this.clientDataIds, caseData.clientDataIds) &&
        Objects.equals(this.clientInteractionSummaryId, caseData.clientInteractionSummaryId) &&
        Objects.equals(this.calculationSummaryId, caseData.calculationSummaryId) &&
        Objects.equals(this.courtHearingMeetingsIds, caseData.courtHearingMeetingsIds) &&
        Objects.equals(this.organizationAttorneyIds, caseData.organizationAttorneyIds) &&
        Objects.equals(this.mediatorIds, caseData.mediatorIds) &&
        Objects.equals(this.knfDataId, caseData.knfDataId) &&
        Objects.equals(this.mediationOutcomeId, caseData.mediationOutcomeId) &&
        Objects.equals(this.finalizationParametersId, caseData.finalizationParametersId) &&
        Objects.equals(this.notatkiIds, caseData.notatkiIds) &&
        Objects.equals(this.documentationDataId, caseData.documentationDataId) &&
        Objects.equals(this.creditDecisionId, caseData.creditDecisionId) &&
        Objects.equals(this.negotiationLimitIds, caseData.negotiationLimitIds) &&
        Objects.equals(this.dataAktualizacjiStatusu, caseData.dataAktualizacjiStatusu) &&
        Objects.equals(this.sprawaZmigrowana, caseData.sprawaZmigrowana) &&
        Objects.equals(this.etapDoMigracji, caseData.etapDoMigracji) &&
        Objects.equals(this.reopenCaseHistory, caseData.reopenCaseHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, przypisanyUzytkownik, typSprawy, etapProcesu, statusTechniczny, dataRejestracji, godzinaRejestracji, organisationId, numerKontraktu, numerUmowy, numerSprawy, umowaIndywidualna, opisPrzedmiotuMediacji, wartoscKredytu, walutaKredytu, sprawaPrzekazanaDoObslugiZewnetrznej, inicjatorProcesu, wnioskujacyKlient, creditDataIds, clientDataIds, clientInteractionSummaryId, calculationSummaryId, courtHearingMeetingsIds, organizationAttorneyIds, mediatorIds, knfDataId, mediationOutcomeId, finalizationParametersId, notatkiIds, documentationDataId, creditDecisionId, negotiationLimitIds, dataAktualizacjiStatusu, sprawaZmigrowana, etapDoMigracji, reopenCaseHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    przypisanyUzytkownik: ").append(toIndentedString(przypisanyUzytkownik)).append("\n");
    sb.append("    typSprawy: ").append(toIndentedString(typSprawy)).append("\n");
    sb.append("    etapProcesu: ").append(toIndentedString(etapProcesu)).append("\n");
    sb.append("    statusTechniczny: ").append(toIndentedString(statusTechniczny)).append("\n");
    sb.append("    dataRejestracji: ").append(toIndentedString(dataRejestracji)).append("\n");
    sb.append("    godzinaRejestracji: ").append(toIndentedString(godzinaRejestracji)).append("\n");
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
    sb.append("    creditDataIds: ").append(toIndentedString(creditDataIds)).append("\n");
    sb.append("    clientDataIds: ").append(toIndentedString(clientDataIds)).append("\n");
    sb.append("    clientInteractionSummaryId: ").append(toIndentedString(clientInteractionSummaryId)).append("\n");
    sb.append("    calculationSummaryId: ").append(toIndentedString(calculationSummaryId)).append("\n");
    sb.append("    courtHearingMeetingsIds: ").append(toIndentedString(courtHearingMeetingsIds)).append("\n");
    sb.append("    organizationAttorneyIds: ").append(toIndentedString(organizationAttorneyIds)).append("\n");
    sb.append("    mediatorIds: ").append(toIndentedString(mediatorIds)).append("\n");
    sb.append("    knfDataId: ").append(toIndentedString(knfDataId)).append("\n");
    sb.append("    mediationOutcomeId: ").append(toIndentedString(mediationOutcomeId)).append("\n");
    sb.append("    finalizationParametersId: ").append(toIndentedString(finalizationParametersId)).append("\n");
    sb.append("    notatkiIds: ").append(toIndentedString(notatkiIds)).append("\n");
    sb.append("    documentationDataId: ").append(toIndentedString(documentationDataId)).append("\n");
    sb.append("    creditDecisionId: ").append(toIndentedString(creditDecisionId)).append("\n");
    sb.append("    negotiationLimitIds: ").append(toIndentedString(negotiationLimitIds)).append("\n");
    sb.append("    dataAktualizacjiStatusu: ").append(toIndentedString(dataAktualizacjiStatusu)).append("\n");
    sb.append("    sprawaZmigrowana: ").append(toIndentedString(sprawaZmigrowana)).append("\n");
    sb.append("    etapDoMigracji: ").append(toIndentedString(etapDoMigracji)).append("\n");
    sb.append("    reopenCaseHistory: ").append(toIndentedString(reopenCaseHistory)).append("\n");
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

