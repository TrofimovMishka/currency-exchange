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
 * LabelValue tuple  org.javatuples.javatuples
 */

@Schema(name = "LabelValue", description = "LabelValue tuple  org.javatuples.javatuples")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class LabelValue {

  private Long id;

  private String label;

  private String value;

  public LabelValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LabelValue(String label, String value) {
    this.label = label;
    this.value = value;
  }

  public LabelValue id(Long id) {
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

  public LabelValue label(String label) {
    this.label = label;
    return this;
  }

  /**
   * UI displayable name
   * @return label
  */
  @NotNull 
  @Schema(name = "label", description = "UI displayable name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LabelValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * technical value as understood by the backend, not to be displayed to end user
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "technical value as understood by the backend, not to be displayed to end user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelValue labelValue = (LabelValue) o;
    return Objects.equals(this.id, labelValue.id) &&
        Objects.equals(this.label, labelValue.label) &&
        Objects.equals(this.value, labelValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelValue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

