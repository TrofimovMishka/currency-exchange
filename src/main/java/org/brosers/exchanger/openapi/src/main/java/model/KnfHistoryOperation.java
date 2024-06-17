package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import model.KnfOperationTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Describe operation done in KNF
 */

@Schema(name = "KnfHistoryOperation", description = "Describe operation done in KNF")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class KnfHistoryOperation {

  private Long caseId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDate;

  private String creatorId;

  private KnfOperationTypeEnum type;

  private Object dataIn;

  private Object dataOut;

  public KnfHistoryOperation caseId(Long caseId) {
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

  public KnfHistoryOperation createDate(OffsetDateTime createDate) {
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

  public KnfHistoryOperation creatorId(String creatorId) {
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

  public KnfHistoryOperation type(KnfOperationTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public KnfOperationTypeEnum getType() {
    return type;
  }

  public void setType(KnfOperationTypeEnum type) {
    this.type = type;
  }

  public KnfHistoryOperation dataIn(Object dataIn) {
    this.dataIn = dataIn;
    return this;
  }

  /**
   * Get dataIn
   * @return dataIn
  */
  
  @Schema(name = "dataIn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataIn")
  public Object getDataIn() {
    return dataIn;
  }

  public void setDataIn(Object dataIn) {
    this.dataIn = dataIn;
  }

  public KnfHistoryOperation dataOut(Object dataOut) {
    this.dataOut = dataOut;
    return this;
  }

  /**
   * Get dataOut
   * @return dataOut
  */
  
  @Schema(name = "dataOut", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataOut")
  public Object getDataOut() {
    return dataOut;
  }

  public void setDataOut(Object dataOut) {
    this.dataOut = dataOut;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnfHistoryOperation knfHistoryOperation = (KnfHistoryOperation) o;
    return Objects.equals(this.caseId, knfHistoryOperation.caseId) &&
        Objects.equals(this.createDate, knfHistoryOperation.createDate) &&
        Objects.equals(this.creatorId, knfHistoryOperation.creatorId) &&
        Objects.equals(this.type, knfHistoryOperation.type) &&
        Objects.equals(this.dataIn, knfHistoryOperation.dataIn) &&
        Objects.equals(this.dataOut, knfHistoryOperation.dataOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseId, createDate, creatorId, type, dataIn, dataOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnfHistoryOperation {\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dataIn: ").append(toIndentedString(dataIn)).append("\n");
    sb.append("    dataOut: ").append(toIndentedString(dataOut)).append("\n");
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

