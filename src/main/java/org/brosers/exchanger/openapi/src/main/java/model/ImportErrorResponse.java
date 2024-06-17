package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.RowProcessingError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Excel import error with list of problems
 */

@Schema(name = "ImportErrorResponse", description = "Excel import error with list of problems")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class ImportErrorResponse {

  private String message;

  @Valid
  private List<@Valid RowProcessingError> errorList;

  public ImportErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ImportErrorResponse errorList(List<@Valid RowProcessingError> errorList) {
    this.errorList = errorList;
    return this;
  }

  public ImportErrorResponse addErrorListItem(RowProcessingError errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

  /**
   * Get errorList
   * @return errorList
  */
  @Valid 
  @Schema(name = "errorList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorList")
  public List<@Valid RowProcessingError> getErrorList() {
    return errorList;
  }

  public void setErrorList(List<@Valid RowProcessingError> errorList) {
    this.errorList = errorList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportErrorResponse importErrorResponse = (ImportErrorResponse) o;
    return Objects.equals(this.message, importErrorResponse.message) &&
        Objects.equals(this.errorList, importErrorResponse.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportErrorResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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

