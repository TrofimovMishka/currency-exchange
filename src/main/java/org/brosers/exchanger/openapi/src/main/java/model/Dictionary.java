package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.LabelValue;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Pojedynczy slownik systemowy ze stalymi
 */

@Schema(name = "Dictionary", description = "Pojedynczy slownik systemowy ze stalymi")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class Dictionary {

  private Long id;

  private String name;

  private Integer version;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataDate;

  @Valid
  private List<@Valid LabelValue> values;

  public Dictionary id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * 
   * @return id
  */
  
  @Schema(name = "id", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Dictionary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 
   * @return name
  */
  
  @Schema(name = "name", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dictionary version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * 
   * @return version
  */
  
  @Schema(name = "version", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Dictionary dataDate(OffsetDateTime dataDate) {
    this.dataDate = dataDate;
    return this;
  }

  /**
   * 
   * @return dataDate
  */
  @Valid 
  @Schema(name = "dataDate", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataDate")
  public OffsetDateTime getDataDate() {
    return dataDate;
  }

  public void setDataDate(OffsetDateTime dataDate) {
    this.dataDate = dataDate;
  }

  public Dictionary values(List<@Valid LabelValue> values) {
    this.values = values;
    return this;
  }

  public Dictionary addValuesItem(LabelValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * 
   * @return values
  */
  @Valid 
  @Schema(name = "values", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<@Valid LabelValue> getValues() {
    return values;
  }

  public void setValues(List<@Valid LabelValue> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dictionary dictionary = (Dictionary) o;
    return Objects.equals(this.id, dictionary.id) &&
        Objects.equals(this.name, dictionary.name) &&
        Objects.equals(this.version, dictionary.version) &&
        Objects.equals(this.dataDate, dictionary.dataDate) &&
        Objects.equals(this.values, dictionary.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, dataDate, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dictionary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dataDate: ").append(toIndentedString(dataDate)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

