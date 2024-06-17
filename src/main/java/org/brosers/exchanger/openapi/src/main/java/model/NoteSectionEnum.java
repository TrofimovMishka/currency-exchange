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
 * 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public enum NoteSectionEnum {
  
  CASE_DATA("CASE_DATA"),
  
  CLIENT_DATA("CLIENT_DATA"),
  
  CLIENT_INTERACTION_SUMMARY("CLIENT_INTERACTION_SUMMARY"),
  
  CLIENT_INTERACTION_EVENT("CLIENT_INTERACTION_EVENT"),
  
  CREDIT_DATA("CREDIT_DATA"),
  
  CALCULATION_SUMMARY("CALCULATION_SUMMARY"),
  
  COURT_HEARING_MEETING("COURT_HEARING_MEETING"),
  
  ORGANIZATION_ATTORNEY("ORGANIZATION_ATTORNEY"),
  
  CASE_MEDIATOR("CASE_MEDIATOR"),
  
  KNF_DATA("KNF_DATA"),
  
  MEDIATION_OUTCOME("MEDIATION_OUTCOME"),
  
  FINALIZATION_PARAMETERS("FINALIZATION_PARAMETERS"),
  
  DOCUMENTATION("DOCUMENTATION"),
  
  CREDIT_DECISION_EVENT("CREDIT_DECISION_EVENT"),
  
  CREDIT_DECISION("CREDIT_DECISION"),
  
  NULL("null");

  private String value;

  NoteSectionEnum(String value) {
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
  public static NoteSectionEnum fromValue(String value) {
    for (NoteSectionEnum b : NoteSectionEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

