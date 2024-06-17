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
 * Import error description
 */

@Schema(name = "RowProcessingError", description = "Import error description")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class RowProcessingError {

  private Long line;

  private String message;

  public RowProcessingError line(Long line) {
    this.line = line;
    return this;
  }

  /**
   * Get line
   * @return line
  */
  
  @Schema(name = "line", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line")
  public Long getLine() {
    return line;
  }

  public void setLine(Long line) {
    this.line = line;
  }

  public RowProcessingError message(String message) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowProcessingError rowProcessingError = (RowProcessingError) o;
    return Objects.equals(this.line, rowProcessingError.line) &&
        Objects.equals(this.message, rowProcessingError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowProcessingError {\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

