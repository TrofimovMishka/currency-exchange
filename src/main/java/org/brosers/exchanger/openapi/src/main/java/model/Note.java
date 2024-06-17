package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import model.NoteSectionEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Notatka
 */

@Schema(name = "Note", description = "Notatka")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class Note {

  private Long id;

  private Long caseId;

  private String notatki;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataDodania;

  private String authorUiName;

  private JsonNullable<NoteSectionEnum> section = JsonNullable.<NoteSectionEnum>undefined();

  public Note id(Long id) {
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

  public Note caseId(Long caseId) {
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

  public Note notatki(String notatki) {
    this.notatki = notatki;
    return this;
  }

  /**
   * 
   * @return notatki
  */
  @Size(min = 0) 
  @Schema(name = "notatki", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notatki")
  public String getNotatki() {
    return notatki;
  }

  public void setNotatki(String notatki) {
    this.notatki = notatki;
  }

  public Note dataDodania(OffsetDateTime dataDodania) {
    this.dataDodania = dataDodania;
    return this;
  }

  /**
   * yyyy-MM-dd HH:ss
   * @return dataDodania
  */
  @Valid 
  @Schema(name = "dataDodania", description = "yyyy-MM-dd HH:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataDodania")
  public OffsetDateTime getDataDodania() {
    return dataDodania;
  }

  public void setDataDodania(OffsetDateTime dataDodania) {
    this.dataDodania = dataDodania;
  }

  public Note authorUiName(String authorUiName) {
    this.authorUiName = authorUiName;
    return this;
  }

  /**
   * Imie i nazwisko autora komentarza jesli edytowal rowniez superuser w nawiasie takze imie i nazwisko superusera ktory modyfikowal wpis
   * @return authorUiName
  */
  @Size(max = 100) 
  @Schema(name = "authorUiName", description = "Imie i nazwisko autora komentarza jesli edytowal rowniez superuser w nawiasie takze imie i nazwisko superusera ktory modyfikowal wpis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorUiName")
  public String getAuthorUiName() {
    return authorUiName;
  }

  public void setAuthorUiName(String authorUiName) {
    this.authorUiName = authorUiName;
  }

  public Note section(NoteSectionEnum section) {
    this.section = JsonNullable.of(section);
    return this;
  }

  /**
   * Get section
   * @return section
  */
  @Valid 
  @Schema(name = "section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("section")
  public JsonNullable<NoteSectionEnum> getSection() {
    return section;
  }

  public void setSection(JsonNullable<NoteSectionEnum> section) {
    this.section = section;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.caseId, note.caseId) &&
        Objects.equals(this.notatki, note.notatki) &&
        Objects.equals(this.dataDodania, note.dataDodania) &&
        Objects.equals(this.authorUiName, note.authorUiName) &&
        equalsNullable(this.section, note.section);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, notatki, dataDodania, authorUiName, hashCodeNullable(section));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    notatki: ").append(toIndentedString(notatki)).append("\n");
    sb.append("    dataDodania: ").append(toIndentedString(dataDodania)).append("\n");
    sb.append("    authorUiName: ").append(toIndentedString(authorUiName)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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

