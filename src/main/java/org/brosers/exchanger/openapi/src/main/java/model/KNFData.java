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
 * Dane KNF
 */

@Schema(name = "KNFData", description = "Dane KNF")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class KNFData {

  private Long id;

  private Long caseId;

  private String sygnaturaSprawy;

  private String technicznyIdentyfikatorSprawyWKnf;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPrzekazaniaUmowyDoKnf;

  public KNFData id(Long id) {
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

  public KNFData caseId(Long caseId) {
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

  public KNFData sygnaturaSprawy(String sygnaturaSprawy) {
    this.sygnaturaSprawy = sygnaturaSprawy;
    return this;
  }

  /**
   * 
   * @return sygnaturaSprawy
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "sygnaturaSprawy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sygnaturaSprawy")
  public String getSygnaturaSprawy() {
    return sygnaturaSprawy;
  }

  public void setSygnaturaSprawy(String sygnaturaSprawy) {
    this.sygnaturaSprawy = sygnaturaSprawy;
  }

  public KNFData technicznyIdentyfikatorSprawyWKnf(String technicznyIdentyfikatorSprawyWKnf) {
    this.technicznyIdentyfikatorSprawyWKnf = technicznyIdentyfikatorSprawyWKnf;
    return this;
  }

  /**
   * confirmationId
   * @return technicznyIdentyfikatorSprawyWKnf
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "technicznyIdentyfikatorSprawyWKnf", description = "confirmationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("technicznyIdentyfikatorSprawyWKnf")
  public String getTechnicznyIdentyfikatorSprawyWKnf() {
    return technicznyIdentyfikatorSprawyWKnf;
  }

  public void setTechnicznyIdentyfikatorSprawyWKnf(String technicznyIdentyfikatorSprawyWKnf) {
    this.technicznyIdentyfikatorSprawyWKnf = technicznyIdentyfikatorSprawyWKnf;
  }

  public KNFData dataPrzekazaniaUmowyDoKnf(LocalDate dataPrzekazaniaUmowyDoKnf) {
    this.dataPrzekazaniaUmowyDoKnf = dataPrzekazaniaUmowyDoKnf;
    return this;
  }

  /**
   * yyyy-MM-dd
   * @return dataPrzekazaniaUmowyDoKnf
  */
  @Valid 
  @Schema(name = "dataPrzekazaniaUmowyDoKnf", description = "yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPrzekazaniaUmowyDoKnf")
  public LocalDate getDataPrzekazaniaUmowyDoKnf() {
    return dataPrzekazaniaUmowyDoKnf;
  }

  public void setDataPrzekazaniaUmowyDoKnf(LocalDate dataPrzekazaniaUmowyDoKnf) {
    this.dataPrzekazaniaUmowyDoKnf = dataPrzekazaniaUmowyDoKnf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KNFData knFData = (KNFData) o;
    return Objects.equals(this.id, knFData.id) &&
        Objects.equals(this.caseId, knFData.caseId) &&
        Objects.equals(this.sygnaturaSprawy, knFData.sygnaturaSprawy) &&
        Objects.equals(this.technicznyIdentyfikatorSprawyWKnf, knFData.technicznyIdentyfikatorSprawyWKnf) &&
        Objects.equals(this.dataPrzekazaniaUmowyDoKnf, knFData.dataPrzekazaniaUmowyDoKnf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, sygnaturaSprawy, technicznyIdentyfikatorSprawyWKnf, dataPrzekazaniaUmowyDoKnf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KNFData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    sygnaturaSprawy: ").append(toIndentedString(sygnaturaSprawy)).append("\n");
    sb.append("    technicznyIdentyfikatorSprawyWKnf: ").append(toIndentedString(technicznyIdentyfikatorSprawyWKnf)).append("\n");
    sb.append("    dataPrzekazaniaUmowyDoKnf: ").append(toIndentedString(dataPrzekazaniaUmowyDoKnf)).append("\n");
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

