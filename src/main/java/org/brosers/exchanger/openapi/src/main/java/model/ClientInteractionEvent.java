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
 * Sekcja rozmowa w ramach Kotaktu z Klientem (ClientInteractionSummary)
 */

@Schema(name = "ClientInteractionEvent", description = "Sekcja rozmowa w ramach Kotaktu z Klientem (ClientInteractionSummary)")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class ClientInteractionEvent {

  private Long id;

  private Long caseId;

  private Long clientInteractionId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataRozmowy;

  /**
   * 
   */
  public enum TypPolaczeniaEnum {
    WYCHODZACE("WYCHODZACE"),
    
    PRZYCHODZACE("PRZYCHODZACE"),
    
    SMS("SMS");

    private String value;

    TypPolaczeniaEnum(String value) {
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
    public static TypPolaczeniaEnum fromValue(String value) {
      for (TypPolaczeniaEnum b : TypPolaczeniaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypPolaczeniaEnum typPolaczenia;

  private String rozmowca;

  private String doradca;

  /**
   * 
   */
  public enum StatusKontaktuEnum {
    BRAK_KONTAKTU("BRAK_KONTAKTU"),
    
    POCZTA_GLOSOWA("POCZTA_GLOSOWA"),
    
    KONTAKT_UDANY("KONTAKT_UDANY"),
    
    PONOWNY_KONTAKT("PONOWNY_KONTAKT"),
    
    ODMOWA_WERYFIKACJI("ODMOWA_WERYFIKACJI"),
    
    KONTAKT_Z_OSOBA_TRZECIA("KONTAKT_Z_OSOBA_TRZECIA"),
    
    NUMER_NIEAKTUALNY("NUMER_NIEAKTUALNY"),
    
    OSOBA_NIEDECYZYJNA("OSOBA_NIEDECYZYJNA"),
    
    ODMOWA_MEDIACJI("ODMOWA_MEDIACJI");

    private String value;

    StatusKontaktuEnum(String value) {
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
    public static StatusKontaktuEnum fromValue(String value) {
      for (StatusKontaktuEnum b : StatusKontaktuEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusKontaktuEnum statusKontaktu;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataZaplanowanegoKontaktu;

  private String notatkiPoRozmowie;

  public ClientInteractionEvent id(Long id) {
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

  public ClientInteractionEvent caseId(Long caseId) {
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

  public ClientInteractionEvent clientInteractionId(Long clientInteractionId) {
    this.clientInteractionId = clientInteractionId;
    return this;
  }

  /**
   * identyfikator kontaktu z klientem wewnatrz Mediator
   * @return clientInteractionId
  */
  
  @Schema(name = "clientInteractionId", description = "identyfikator kontaktu z klientem wewnatrz Mediator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientInteractionId")
  public Long getClientInteractionId() {
    return clientInteractionId;
  }

  public void setClientInteractionId(Long clientInteractionId) {
    this.clientInteractionId = clientInteractionId;
  }

  public ClientInteractionEvent dataRozmowy(OffsetDateTime dataRozmowy) {
    this.dataRozmowy = dataRozmowy;
    return this;
  }

  /**
   * wbor z kalendarza, yyyy-MM-dd HH:mm:ss
   * @return dataRozmowy
  */
  @Valid 
  @Schema(name = "dataRozmowy", description = "wbor z kalendarza, yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataRozmowy")
  public OffsetDateTime getDataRozmowy() {
    return dataRozmowy;
  }

  public void setDataRozmowy(OffsetDateTime dataRozmowy) {
    this.dataRozmowy = dataRozmowy;
  }

  public ClientInteractionEvent typPolaczenia(TypPolaczeniaEnum typPolaczenia) {
    this.typPolaczenia = typPolaczenia;
    return this;
  }

  /**
   * 
   * @return typPolaczenia
  */
  
  @Schema(name = "typPolaczenia", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("typPolaczenia")
  public TypPolaczeniaEnum getTypPolaczenia() {
    return typPolaczenia;
  }

  public void setTypPolaczenia(TypPolaczeniaEnum typPolaczenia) {
    this.typPolaczenia = typPolaczenia;
  }

  public ClientInteractionEvent rozmowca(String rozmowca) {
    this.rozmowca = rozmowca;
    return this;
  }

  /**
   * pole wyboru ze zdefiniowanej listy. zdefiniowana lista powinna być pobierana z encji dane kredytobiorców, pole Nazwa. jesli nie wybrano z listy wyboru to mozna wpisac tresc recznie jako wolny input text
   * @return rozmowca
  */
  @Size(min = 2, max = 150) 
  @Schema(name = "rozmowca", description = "pole wyboru ze zdefiniowanej listy. zdefiniowana lista powinna być pobierana z encji dane kredytobiorców, pole Nazwa. jesli nie wybrano z listy wyboru to mozna wpisac tresc recznie jako wolny input text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rozmowca")
  public String getRozmowca() {
    return rozmowca;
  }

  public void setRozmowca(String rozmowca) {
    this.rozmowca = rozmowca;
  }

  public ClientInteractionEvent doradca(String doradca) {
    this.doradca = doradca;
    return this;
  }

  /**
   * automatyczne uzupełnienie po zalogowanym użytkowniku -> user organizational id. wyswietlana jest nazwa z human rewadable czyli imie i nazwisko. do backendu wysylany jest id
   * @return doradca
  */
  @Size(min = 2, max = 200) 
  @Schema(name = "doradca", description = "automatyczne uzupełnienie po zalogowanym użytkowniku -> user organizational id. wyswietlana jest nazwa z human rewadable czyli imie i nazwisko. do backendu wysylany jest id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("doradca")
  public String getDoradca() {
    return doradca;
  }

  public void setDoradca(String doradca) {
    this.doradca = doradca;
  }

  public ClientInteractionEvent statusKontaktu(StatusKontaktuEnum statusKontaktu) {
    this.statusKontaktu = statusKontaktu;
    return this;
  }

  /**
   * 
   * @return statusKontaktu
  */
  
  @Schema(name = "statusKontaktu", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusKontaktu")
  public StatusKontaktuEnum getStatusKontaktu() {
    return statusKontaktu;
  }

  public void setStatusKontaktu(StatusKontaktuEnum statusKontaktu) {
    this.statusKontaktu = statusKontaktu;
  }

  public ClientInteractionEvent dataZaplanowanegoKontaktu(OffsetDateTime dataZaplanowanegoKontaktu) {
    this.dataZaplanowanegoKontaktu = dataZaplanowanegoKontaktu;
    return this;
  }

  /**
   * mozliwosc wyboru z kalendarza, yyyy-MM-dd HH:mm:ss
   * @return dataZaplanowanegoKontaktu
  */
  @Valid 
  @Schema(name = "dataZaplanowanegoKontaktu", description = "mozliwosc wyboru z kalendarza, yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataZaplanowanegoKontaktu")
  public OffsetDateTime getDataZaplanowanegoKontaktu() {
    return dataZaplanowanegoKontaktu;
  }

  public void setDataZaplanowanegoKontaktu(OffsetDateTime dataZaplanowanegoKontaktu) {
    this.dataZaplanowanegoKontaktu = dataZaplanowanegoKontaktu;
  }

  public ClientInteractionEvent notatkiPoRozmowie(String notatkiPoRozmowie) {
    this.notatkiPoRozmowie = notatkiPoRozmowie;
    return this;
  }

  /**
   * 
   * @return notatkiPoRozmowie
  */
  @Size(max = 5000) 
  @Schema(name = "notatkiPoRozmowie", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notatkiPoRozmowie")
  public String getNotatkiPoRozmowie() {
    return notatkiPoRozmowie;
  }

  public void setNotatkiPoRozmowie(String notatkiPoRozmowie) {
    this.notatkiPoRozmowie = notatkiPoRozmowie;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInteractionEvent clientInteractionEvent = (ClientInteractionEvent) o;
    return Objects.equals(this.id, clientInteractionEvent.id) &&
        Objects.equals(this.caseId, clientInteractionEvent.caseId) &&
        Objects.equals(this.clientInteractionId, clientInteractionEvent.clientInteractionId) &&
        Objects.equals(this.dataRozmowy, clientInteractionEvent.dataRozmowy) &&
        Objects.equals(this.typPolaczenia, clientInteractionEvent.typPolaczenia) &&
        Objects.equals(this.rozmowca, clientInteractionEvent.rozmowca) &&
        Objects.equals(this.doradca, clientInteractionEvent.doradca) &&
        Objects.equals(this.statusKontaktu, clientInteractionEvent.statusKontaktu) &&
        Objects.equals(this.dataZaplanowanegoKontaktu, clientInteractionEvent.dataZaplanowanegoKontaktu) &&
        Objects.equals(this.notatkiPoRozmowie, clientInteractionEvent.notatkiPoRozmowie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, clientInteractionId, dataRozmowy, typPolaczenia, rozmowca, doradca, statusKontaktu, dataZaplanowanegoKontaktu, notatkiPoRozmowie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInteractionEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    clientInteractionId: ").append(toIndentedString(clientInteractionId)).append("\n");
    sb.append("    dataRozmowy: ").append(toIndentedString(dataRozmowy)).append("\n");
    sb.append("    typPolaczenia: ").append(toIndentedString(typPolaczenia)).append("\n");
    sb.append("    rozmowca: ").append(toIndentedString(rozmowca)).append("\n");
    sb.append("    doradca: ").append(toIndentedString(doradca)).append("\n");
    sb.append("    statusKontaktu: ").append(toIndentedString(statusKontaktu)).append("\n");
    sb.append("    dataZaplanowanegoKontaktu: ").append(toIndentedString(dataZaplanowanegoKontaktu)).append("\n");
    sb.append("    notatkiPoRozmowie: ").append(toIndentedString(notatkiPoRozmowie)).append("\n");
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

