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
 * Decyzja kredytowa wydarzenie
 */

@Schema(name = "CreditDecisionEvent", description = "Decyzja kredytowa wydarzenie")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CreditDecisionEvent {

  private Long id;

  private Long caseId;

  private Long creditDecisionId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataDecyzji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataWaznosciDecyzji;

  /**
   * status decyzji
   */
  public enum StatusDecyzjiEnum {
    POZYTYWNA("POZYTYWNA"),
    
    NEGATYWNA("NEGATYWNA"),
    
    BBF("BBF");

    private String value;

    StatusDecyzjiEnum(String value) {
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
    public static StatusDecyzjiEnum fromValue(String value) {
      for (StatusDecyzjiEnum b : StatusDecyzjiEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusDecyzjiEnum statusDecyzji;

  private String warunkiDecyzji;

  public CreditDecisionEvent id(Long id) {
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

  public CreditDecisionEvent caseId(Long caseId) {
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

  public CreditDecisionEvent creditDecisionId(Long creditDecisionId) {
    this.creditDecisionId = creditDecisionId;
    return this;
  }

  /**
   * identyfikator decyzji kredytowej wewnatrz Mediator
   * @return creditDecisionId
  */
  
  @Schema(name = "creditDecisionId", description = "identyfikator decyzji kredytowej wewnatrz Mediator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditDecisionId")
  public Long getCreditDecisionId() {
    return creditDecisionId;
  }

  public void setCreditDecisionId(Long creditDecisionId) {
    this.creditDecisionId = creditDecisionId;
  }

  public CreditDecisionEvent dataDecyzji(OffsetDateTime dataDecyzji) {
    this.dataDecyzji = dataDecyzji;
    return this;
  }

  /**
   * Wybor z kalendarza yyyy-MM-dd
   * @return dataDecyzji
  */
  @Valid 
  @Schema(name = "dataDecyzji", description = "Wybor z kalendarza yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataDecyzji")
  public OffsetDateTime getDataDecyzji() {
    return dataDecyzji;
  }

  public void setDataDecyzji(OffsetDateTime dataDecyzji) {
    this.dataDecyzji = dataDecyzji;
  }

  public CreditDecisionEvent dataWaznosciDecyzji(OffsetDateTime dataWaznosciDecyzji) {
    this.dataWaznosciDecyzji = dataWaznosciDecyzji;
    return this;
  }

  /**
   * Wybor z kalendarza yyyy-MM-dd
   * @return dataWaznosciDecyzji
  */
  @Valid 
  @Schema(name = "dataWaznosciDecyzji", description = "Wybor z kalendarza yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataWaznosciDecyzji")
  public OffsetDateTime getDataWaznosciDecyzji() {
    return dataWaznosciDecyzji;
  }

  public void setDataWaznosciDecyzji(OffsetDateTime dataWaznosciDecyzji) {
    this.dataWaznosciDecyzji = dataWaznosciDecyzji;
  }

  public CreditDecisionEvent statusDecyzji(StatusDecyzjiEnum statusDecyzji) {
    this.statusDecyzji = statusDecyzji;
    return this;
  }

  /**
   * status decyzji
   * @return statusDecyzji
  */
  
  @Schema(name = "statusDecyzji", description = "status decyzji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusDecyzji")
  public StatusDecyzjiEnum getStatusDecyzji() {
    return statusDecyzji;
  }

  public void setStatusDecyzji(StatusDecyzjiEnum statusDecyzji) {
    this.statusDecyzji = statusDecyzji;
  }

  public CreditDecisionEvent warunkiDecyzji(String warunkiDecyzji) {
    this.warunkiDecyzji = warunkiDecyzji;
    return this;
  }

  /**
   * 
   * @return warunkiDecyzji
  */
  @Size(min = 0, max = 5000) 
  @Schema(name = "warunkiDecyzji", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warunkiDecyzji")
  public String getWarunkiDecyzji() {
    return warunkiDecyzji;
  }

  public void setWarunkiDecyzji(String warunkiDecyzji) {
    this.warunkiDecyzji = warunkiDecyzji;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditDecisionEvent creditDecisionEvent = (CreditDecisionEvent) o;
    return Objects.equals(this.id, creditDecisionEvent.id) &&
        Objects.equals(this.caseId, creditDecisionEvent.caseId) &&
        Objects.equals(this.creditDecisionId, creditDecisionEvent.creditDecisionId) &&
        Objects.equals(this.dataDecyzji, creditDecisionEvent.dataDecyzji) &&
        Objects.equals(this.dataWaznosciDecyzji, creditDecisionEvent.dataWaznosciDecyzji) &&
        Objects.equals(this.statusDecyzji, creditDecisionEvent.statusDecyzji) &&
        Objects.equals(this.warunkiDecyzji, creditDecisionEvent.warunkiDecyzji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, creditDecisionId, dataDecyzji, dataWaznosciDecyzji, statusDecyzji, warunkiDecyzji);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditDecisionEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    creditDecisionId: ").append(toIndentedString(creditDecisionId)).append("\n");
    sb.append("    dataDecyzji: ").append(toIndentedString(dataDecyzji)).append("\n");
    sb.append("    dataWaznosciDecyzji: ").append(toIndentedString(dataWaznosciDecyzji)).append("\n");
    sb.append("    statusDecyzji: ").append(toIndentedString(statusDecyzji)).append("\n");
    sb.append("    warunkiDecyzji: ").append(toIndentedString(warunkiDecyzji)).append("\n");
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

