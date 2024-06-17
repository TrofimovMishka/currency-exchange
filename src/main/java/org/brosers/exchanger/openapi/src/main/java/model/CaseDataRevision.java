package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import model.CaseDataHistory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CaseDataRevision
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CaseDataRevision {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    UNKNOWN("UNKNOWN"),
    
    INSERT("INSERT"),
    
    UPDATE("UPDATE"),
    
    DELETE("DELETE");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private CaseDataHistory caseData;

  public CaseDataRevision type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CaseDataRevision caseData(CaseDataHistory caseData) {
    this.caseData = caseData;
    return this;
  }

  /**
   * Get caseData
   * @return caseData
  */
  @Valid 
  @Schema(name = "caseData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseData")
  public CaseDataHistory getCaseData() {
    return caseData;
  }

  public void setCaseData(CaseDataHistory caseData) {
    this.caseData = caseData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseDataRevision caseDataRevision = (CaseDataRevision) o;
    return Objects.equals(this.type, caseDataRevision.type) &&
        Objects.equals(this.caseData, caseDataRevision.caseData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, caseData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseDataRevision {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    caseData: ").append(toIndentedString(caseData)).append("\n");
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

