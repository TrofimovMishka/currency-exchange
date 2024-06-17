package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Represent reopen case history
 */

@Schema(name = "ReopenCaseHistory", description = "Represent reopen case history")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class ReopenCaseHistory {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime closeDate;

  private Integer oldCaseId;

  public ReopenCaseHistory closeDate(OffsetDateTime closeDate) {
    this.closeDate = closeDate;
    return this;
  }

  /**
   * data zamkniecia sprawy
   * @return closeDate
  */
  @Valid 
  @Schema(name = "closeDate", description = "data zamkniecia sprawy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closeDate")
  public OffsetDateTime getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(OffsetDateTime closeDate) {
    this.closeDate = closeDate;
  }

  public ReopenCaseHistory oldCaseId(Integer oldCaseId) {
    this.oldCaseId = oldCaseId;
    return this;
  }

  /**
   * id starej sprawy
   * @return oldCaseId
  */
  
  @Schema(name = "oldCaseId", description = "id starej sprawy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oldCaseId")
  public Integer getOldCaseId() {
    return oldCaseId;
  }

  public void setOldCaseId(Integer oldCaseId) {
    this.oldCaseId = oldCaseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReopenCaseHistory reopenCaseHistory = (ReopenCaseHistory) o;
    return Objects.equals(this.closeDate, reopenCaseHistory.closeDate) &&
        Objects.equals(this.oldCaseId, reopenCaseHistory.oldCaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closeDate, oldCaseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReopenCaseHistory {\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    oldCaseId: ").append(toIndentedString(oldCaseId)).append("\n");
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

