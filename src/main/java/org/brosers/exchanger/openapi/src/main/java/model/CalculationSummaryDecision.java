package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import model.DecyzjaRbi;
import model.RodzajUgody;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Kalkulacje decyzja
 */

@Schema(name = "CalculationSummaryDecision", description = "Kalkulacje decyzja")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class CalculationSummaryDecision {

  private Long id;

  private DecyzjaRbi decyzjaRbi;

  private RodzajUgody rodzajUgody;

  public CalculationSummaryDecision id(Long id) {
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

  public CalculationSummaryDecision decyzjaRbi(DecyzjaRbi decyzjaRbi) {
    this.decyzjaRbi = decyzjaRbi;
    return this;
  }

  /**
   * Get decyzjaRbi
   * @return decyzjaRbi
  */
  @Valid 
  @Schema(name = "decyzjaRbi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decyzjaRbi")
  public DecyzjaRbi getDecyzjaRbi() {
    return decyzjaRbi;
  }

  public void setDecyzjaRbi(DecyzjaRbi decyzjaRbi) {
    this.decyzjaRbi = decyzjaRbi;
  }

  public CalculationSummaryDecision rodzajUgody(RodzajUgody rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
    return this;
  }

  /**
   * Get rodzajUgody
   * @return rodzajUgody
  */
  @Valid 
  @Schema(name = "rodzajUgody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rodzajUgody")
  public RodzajUgody getRodzajUgody() {
    return rodzajUgody;
  }

  public void setRodzajUgody(RodzajUgody rodzajUgody) {
    this.rodzajUgody = rodzajUgody;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationSummaryDecision calculationSummaryDecision = (CalculationSummaryDecision) o;
    return Objects.equals(this.id, calculationSummaryDecision.id) &&
        Objects.equals(this.decyzjaRbi, calculationSummaryDecision.decyzjaRbi) &&
        Objects.equals(this.rodzajUgody, calculationSummaryDecision.rodzajUgody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, decyzjaRbi, rodzajUgody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationSummaryDecision {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    decyzjaRbi: ").append(toIndentedString(decyzjaRbi)).append("\n");
    sb.append("    rodzajUgody: ").append(toIndentedString(rodzajUgody)).append("\n");
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

