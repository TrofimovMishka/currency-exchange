package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import model.RodzajUgodyKnf;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WynikUgody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class WynikUgody {

  private RodzajUgodyKnf rodzajUgody;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataZawarcia;

  public WynikUgody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WynikUgody(RodzajUgodyKnf rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
  }

  public WynikUgody rodzajUgody(RodzajUgodyKnf rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
    return this;
  }

  /**
   * Get rodzajUgody
   * @return rodzajUgody
  */
  @NotNull @Valid 
  @Schema(name = "rodzajUgody", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rodzajUgody")
  public RodzajUgodyKnf getRodzajUgody() {
    return rodzajUgody;
  }

  public void setRodzajUgody(RodzajUgodyKnf rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
  }

  public WynikUgody dataZawarcia(OffsetDateTime dataZawarcia) {
    this.dataZawarcia = dataZawarcia;
    return this;
  }

  /**
   * Get dataZawarcia
   * @return dataZawarcia
  */
  @Valid 
  @Schema(name = "dataZawarcia", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataZawarcia")
  public OffsetDateTime getDataZawarcia() {
    return dataZawarcia;
  }

  public void setDataZawarcia(OffsetDateTime dataZawarcia) {
    this.dataZawarcia = dataZawarcia;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WynikUgody wynikUgody = (WynikUgody) o;
    return Objects.equals(this.rodzajUgody, wynikUgody.rodzajUgody) &&
        Objects.equals(this.dataZawarcia, wynikUgody.dataZawarcia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rodzajUgody, dataZawarcia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WynikUgody {\n");
    sb.append("    rodzajUgody: ").append(toIndentedString(rodzajUgody)).append("\n");
    sb.append("    dataZawarcia: ").append(toIndentedString(dataZawarcia)).append("\n");
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

