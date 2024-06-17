package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Mediator KNF
 */

@Schema(name = "KnfMediator", description = "Mediator KNF")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class KnfMediator {

  private Long id;

  private String identyfikatorKnf;

  private String imie;

  private String nazwisko;

  private String status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dostepnyOd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dostepnyDo;

  public KnfMediator id(Long id) {
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

  public KnfMediator identyfikatorKnf(String identyfikatorKnf) {
    this.identyfikatorKnf = identyfikatorKnf;
    return this;
  }

  /**
   * 
   * @return identyfikatorKnf
  */
  
  @Schema(name = "identyfikatorKnf", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identyfikatorKnf")
  public String getIdentyfikatorKnf() {
    return identyfikatorKnf;
  }

  public void setIdentyfikatorKnf(String identyfikatorKnf) {
    this.identyfikatorKnf = identyfikatorKnf;
  }

  public KnfMediator imie(String imie) {
    this.imie = imie;
    return this;
  }

  /**
   * 
   * @return imie
  */
  
  @Schema(name = "imie", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imie")
  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public KnfMediator nazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
    return this;
  }

  /**
   * 
   * @return nazwisko
  */
  
  @Schema(name = "nazwisko", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nazwisko")
  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public KnfMediator status(String status) {
    this.status = status;
    return this;
  }

  /**
   * 
   * @return status
  */
  
  @Schema(name = "status", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public KnfMediator dostepnyOd(LocalDate dostepnyOd) {
    this.dostepnyOd = dostepnyOd;
    return this;
  }

  /**
   * yyyy-MM-dd
   * @return dostepnyOd
  */
  @Valid 
  @Schema(name = "dostepnyOd", description = "yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dostepnyOd")
  public LocalDate getDostepnyOd() {
    return dostepnyOd;
  }

  public void setDostepnyOd(LocalDate dostepnyOd) {
    this.dostepnyOd = dostepnyOd;
  }

  public KnfMediator dostepnyDo(LocalDate dostepnyDo) {
    this.dostepnyDo = dostepnyDo;
    return this;
  }

  /**
   * yyyy-MM-dd
   * @return dostepnyDo
  */
  @Valid 
  @Schema(name = "dostepnyDo", description = "yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dostepnyDo")
  public LocalDate getDostepnyDo() {
    return dostepnyDo;
  }

  public void setDostepnyDo(LocalDate dostepnyDo) {
    this.dostepnyDo = dostepnyDo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnfMediator knfMediator = (KnfMediator) o;
    return Objects.equals(this.id, knfMediator.id) &&
        Objects.equals(this.identyfikatorKnf, knfMediator.identyfikatorKnf) &&
        Objects.equals(this.imie, knfMediator.imie) &&
        Objects.equals(this.nazwisko, knfMediator.nazwisko) &&
        Objects.equals(this.status, knfMediator.status) &&
        Objects.equals(this.dostepnyOd, knfMediator.dostepnyOd) &&
        Objects.equals(this.dostepnyDo, knfMediator.dostepnyDo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identyfikatorKnf, imie, nazwisko, status, dostepnyOd, dostepnyDo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnfMediator {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identyfikatorKnf: ").append(toIndentedString(identyfikatorKnf)).append("\n");
    sb.append("    imie: ").append(toIndentedString(imie)).append("\n");
    sb.append("    nazwisko: ").append(toIndentedString(nazwisko)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dostepnyOd: ").append(toIndentedString(dostepnyOd)).append("\n");
    sb.append("    dostepnyDo: ").append(toIndentedString(dostepnyDo)).append("\n");
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

