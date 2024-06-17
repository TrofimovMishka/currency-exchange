package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets RodzajUgodyKnf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public enum RodzajUgodyKnf {
  
  UGODA_TAK_M("UGODA_TAK_M"),
  
  UGODA_TAK_E("UGODA_TAK_E"),
  
  UGODA_NIE("UGODA_NIE"),
  
  WZNOWIENIE("WZNOWIENIE");

  private String value;

  RodzajUgodyKnf(String value) {
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
  public static RodzajUgodyKnf fromValue(String value) {
    for (RodzajUgodyKnf b : RodzajUgodyKnf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

