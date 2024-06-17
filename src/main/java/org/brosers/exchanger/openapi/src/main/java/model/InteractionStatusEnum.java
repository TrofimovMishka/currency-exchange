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
 * Enum dla statusu rozmow
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public enum InteractionStatusEnum {
  
  W_TRAKCIE_PROB("W_TRAKCIE_PROB"),
  
  BRAK_KONTAKTU("BRAK_KONTAKTU"),
  
  ODMOWA_MEDIACJI("ODMOWA_MEDIACJI"),
  
  OCZEKUJE_NA_UMOWE_MEDIACYJNA("OCZEKUJE_NA_UMOWE_MEDIACYJNA"),
  
  ANULOWANO("ANULOWANO"),
  
  PRZESLANKA_NEGATYWNA("PRZESLANKA_NEGATYWNA");

  private String value;

  InteractionStatusEnum(String value) {
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
  public static InteractionStatusEnum fromValue(String value) {
    for (InteractionStatusEnum b : InteractionStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

