package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Terminy spotkan w sadzie
 */

@Schema(name = "CourtHearingMeeting", description = "Terminy spotkan w sadzie")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CourtHearingMeeting {

  private Long id;

  private Long caseId;

  private String godzinaSpotkania;

  @Valid
  private List<String> uczestnicy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataSpotkania;

  public CourtHearingMeeting id(Long id) {
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

  public CourtHearingMeeting caseId(Long caseId) {
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

  public CourtHearingMeeting godzinaSpotkania(String godzinaSpotkania) {
    this.godzinaSpotkania = godzinaSpotkania;
    return this;
  }

  /**
   * HH:mm
   * @return godzinaSpotkania
  */
  @Pattern(regexp = "^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$") 
  @Schema(name = "godzinaSpotkania", description = "HH:mm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("godzinaSpotkania")
  public String getGodzinaSpotkania() {
    return godzinaSpotkania;
  }

  public void setGodzinaSpotkania(String godzinaSpotkania) {
    this.godzinaSpotkania = godzinaSpotkania;
  }

  public CourtHearingMeeting uczestnicy(List<String> uczestnicy) {
    this.uczestnicy = uczestnicy;
    return this;
  }

  public CourtHearingMeeting addUczestnicyItem(String uczestnicyItem) {
    if (this.uczestnicy == null) {
      this.uczestnicy = new ArrayList<>();
    }
    this.uczestnicy.add(uczestnicyItem);
    return this;
  }

  /**
   * pole wyboru ze zdefiniowanej listy, a jesli tos nie wybierze niczego z listy moze dodac dowolny tekst recznie. zdefiniowana lista powinna być pobierana z encji dane kredytobiorców, pole \"Nazwa\", z encji \"pełnomocnik banku\" z pól \"Imię\" oraz \"Nazwisko\" oraz z encji \"Mediator\" z pól \"Imię\" oraz \"Nazwisko\"
   * @return uczestnicy
  */
  
  @Schema(name = "uczestnicy", description = "pole wyboru ze zdefiniowanej listy, a jesli tos nie wybierze niczego z listy moze dodac dowolny tekst recznie. zdefiniowana lista powinna być pobierana z encji dane kredytobiorców, pole \"Nazwa\", z encji \"pełnomocnik banku\" z pól \"Imię\" oraz \"Nazwisko\" oraz z encji \"Mediator\" z pól \"Imię\" oraz \"Nazwisko\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uczestnicy")
  public List<String> getUczestnicy() {
    return uczestnicy;
  }

  public void setUczestnicy(List<String> uczestnicy) {
    this.uczestnicy = uczestnicy;
  }

  public CourtHearingMeeting dataSpotkania(LocalDate dataSpotkania) {
    this.dataSpotkania = dataSpotkania;
    return this;
  }

  /**
   * wybor z kalendarza yyyy-MM-dd
   * @return dataSpotkania
  */
  @Valid 
  @Schema(name = "dataSpotkania", description = "wybor z kalendarza yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSpotkania")
  public LocalDate getDataSpotkania() {
    return dataSpotkania;
  }

  public void setDataSpotkania(LocalDate dataSpotkania) {
    this.dataSpotkania = dataSpotkania;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourtHearingMeeting courtHearingMeeting = (CourtHearingMeeting) o;
    return Objects.equals(this.id, courtHearingMeeting.id) &&
        Objects.equals(this.caseId, courtHearingMeeting.caseId) &&
        Objects.equals(this.godzinaSpotkania, courtHearingMeeting.godzinaSpotkania) &&
        Objects.equals(this.uczestnicy, courtHearingMeeting.uczestnicy) &&
        Objects.equals(this.dataSpotkania, courtHearingMeeting.dataSpotkania);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, godzinaSpotkania, uczestnicy, dataSpotkania);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourtHearingMeeting {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    godzinaSpotkania: ").append(toIndentedString(godzinaSpotkania)).append("\n");
    sb.append("    uczestnicy: ").append(toIndentedString(uczestnicy)).append("\n");
    sb.append("    dataSpotkania: ").append(toIndentedString(dataSpotkania)).append("\n");
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

