package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Mediator KNF w sprawie
 */

@Schema(name = "CaseMediator", description = "Mediator KNF w sprawie")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CaseMediator {

  private Long id;

  private Long caseId;

  private String mediatorImie;

  private String mediatorNazwisko;

  private String numerTelefonuKomorkowy;

  private String adresMailowy;

  private Long knfMediatorId;

  public CaseMediator id(Long id) {
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

  public CaseMediator caseId(Long caseId) {
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

  public CaseMediator mediatorImie(String mediatorImie) {
    this.mediatorImie = mediatorImie;
    return this;
  }

  /**
   * 
   * @return mediatorImie
  */
  @Size(min = 0, max = 50) 
  @Schema(name = "mediatorImie", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediatorImie")
  public String getMediatorImie() {
    return mediatorImie;
  }

  public void setMediatorImie(String mediatorImie) {
    this.mediatorImie = mediatorImie;
  }

  public CaseMediator mediatorNazwisko(String mediatorNazwisko) {
    this.mediatorNazwisko = mediatorNazwisko;
    return this;
  }

  /**
   * 
   * @return mediatorNazwisko
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "mediatorNazwisko", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediatorNazwisko")
  public String getMediatorNazwisko() {
    return mediatorNazwisko;
  }

  public void setMediatorNazwisko(String mediatorNazwisko) {
    this.mediatorNazwisko = mediatorNazwisko;
  }

  public CaseMediator numerTelefonuKomorkowy(String numerTelefonuKomorkowy) {
    this.numerTelefonuKomorkowy = numerTelefonuKomorkowy;
    return this;
  }

  /**
   * 
   * @return numerTelefonuKomorkowy
  */
  @Pattern(regexp = "^\\+[0-9]{1,6} [0-9]{3,14}$") 
  @Schema(name = "numerTelefonuKomorkowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerTelefonuKomorkowy")
  public String getNumerTelefonuKomorkowy() {
    return numerTelefonuKomorkowy;
  }

  public void setNumerTelefonuKomorkowy(String numerTelefonuKomorkowy) {
    this.numerTelefonuKomorkowy = numerTelefonuKomorkowy;
  }

  public CaseMediator adresMailowy(String adresMailowy) {
    this.adresMailowy = adresMailowy;
    return this;
  }

  /**
   * 
   * @return adresMailowy
  */
  @Pattern(regexp = "(^$)|(^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$)") 
  @Schema(name = "adresMailowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresMailowy")
  public String getAdresMailowy() {
    return adresMailowy;
  }

  public void setAdresMailowy(String adresMailowy) {
    this.adresMailowy = adresMailowy;
  }

  public CaseMediator knfMediatorId(Long knfMediatorId) {
    this.knfMediatorId = knfMediatorId;
    return this;
  }

  /**
   * identyfikator KNF Mediatora
   * @return knfMediatorId
  */
  
  @Schema(name = "knfMediatorId", description = "identyfikator KNF Mediatora", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("knfMediatorId")
  public Long getKnfMediatorId() {
    return knfMediatorId;
  }

  public void setKnfMediatorId(Long knfMediatorId) {
    this.knfMediatorId = knfMediatorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseMediator caseMediator = (CaseMediator) o;
    return Objects.equals(this.id, caseMediator.id) &&
        Objects.equals(this.caseId, caseMediator.caseId) &&
        Objects.equals(this.mediatorImie, caseMediator.mediatorImie) &&
        Objects.equals(this.mediatorNazwisko, caseMediator.mediatorNazwisko) &&
        Objects.equals(this.numerTelefonuKomorkowy, caseMediator.numerTelefonuKomorkowy) &&
        Objects.equals(this.adresMailowy, caseMediator.adresMailowy) &&
        Objects.equals(this.knfMediatorId, caseMediator.knfMediatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, mediatorImie, mediatorNazwisko, numerTelefonuKomorkowy, adresMailowy, knfMediatorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseMediator {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    mediatorImie: ").append(toIndentedString(mediatorImie)).append("\n");
    sb.append("    mediatorNazwisko: ").append(toIndentedString(mediatorNazwisko)).append("\n");
    sb.append("    numerTelefonuKomorkowy: ").append(toIndentedString(numerTelefonuKomorkowy)).append("\n");
    sb.append("    adresMailowy: ").append(toIndentedString(adresMailowy)).append("\n");
    sb.append("    knfMediatorId: ").append(toIndentedString(knfMediatorId)).append("\n");
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

