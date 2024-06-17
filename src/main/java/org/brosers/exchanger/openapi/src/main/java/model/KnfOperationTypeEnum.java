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
 * Operation type tbd in KNF
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public enum KnfOperationTypeEnum {
  
  UPDATE_ATTORNEY("UPDATE_ATTORNEY"),
  
  SEND_POSITIVE_AGREEMENT("SEND_POSITIVE_AGREEMENT"),
  
  SEND_NEGATIVE_AGREEMENT("SEND_NEGATIVE_AGREEMENT"),
  
  UPDATE_CASE_STATE("UPDATE_CASE_STATE"),
  
  CLOSE_CASE("CLOSE_CASE"),
  
  SEND_ATTACHMENTS("SEND_ATTACHMENTS"),
  
  REGISTER_CASE("REGISTER_CASE"),
  
  DOWNLOAD_PROTOCOL("DOWNLOAD_PROTOCOL");

  private String value;

  KnfOperationTypeEnum(String value) {
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
  public static KnfOperationTypeEnum fromValue(String value) {
    for (KnfOperationTypeEnum b : KnfOperationTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

