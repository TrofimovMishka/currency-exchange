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
 * Represents case state
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public enum EtapProcesu {
  
  NOWA("NOWA"),
  
  W_ANALIZIE("W_ANALIZIE"),
  
  PO_DECYZJI("PO_DECYZJI"),
  
  DO_KONTAKTU_Z_KLIENTEM("DO_KONTAKTU_Z_KLIENTEM"),
  
  DECYZJA_NEGATYWNA_RYZYKA("DECYZJA_NEGATYWNA_RYZYKA"),
  
  OCZEKUJE_NA_UMOWE_MEDIACYJNA("OCZEKUJE_NA_UMOWE_MEDIACYJNA"),
  
  BRAK_KONTAKTU("BRAK_KONTAKTU"),
  
  ODMOWA_MEDIACJI("ODMOWA_MEDIACJI"),
  
  ZAREJESTROWANA_W_KNF("ZAREJESTROWANA_W_KNF"),
  
  OCZEKUJE_NA_MEDIACJE_KALKULACJA("OCZEKUJE_NA_MEDIACJE_KALKULACJA"),
  
  OCZEKUJE_NA_MEDIACJE_DOKUMENTACJA("OCZEKUJE_NA_MEDIACJE_DOKUMENTACJA"),
  
  OCZEKUJE_NA_MEDIACJE("OCZEKUJE_NA_MEDIACJE"),
  
  MEDIACJE("MEDIACJE"),
  
  DECYZJA_NEGOCJACYJNA_RBI("DECYZJA_NEGOCJACYJNA_RBI"),
  
  OCZEKUJE_NA_KOLEJNE_SPOTKANIE("OCZEKUJE_NA_KOLEJNE_SPOTKANIE"),
  
  BRAK_POROZUMIENIA("BRAK_POROZUMIENIA"),
  
  MEDIACJA_ZAKONCZONA_NEGATYWNIE("MEDIACJA_ZAKONCZONA_NEGATYWNIE"),
  
  PRZYGOTOWYWANIE_UGODY_REKALKULACJA("PRZYGOTOWYWANIE_UGODY_REKALKULACJA"),
  
  REZYGNACJA_KLIENTA_PO_MEDIACJI("REZYGNACJA_KLIENTA_PO_MEDIACJI"),
  
  PRZYGOTOWYWANIE_UGODY("PRZYGOTOWYWANIE_UGODY"),
  
  DOKUMENTY_WYSLANE("DOKUMENTY_WYSLANE"),
  
  DOKUMENTY_OTRZYMANE("DOKUMENTY_OTRZYMANE"),
  
  DOKUMENTY_NIEKOMPLETNE("DOKUMENTY_NIEKOMPLETNE"),
  
  DOKUMENTY_OTRZYMANE_KOMPLETNE("DOKUMENTY_OTRZYMANE_KOMPLETNE"),
  
  DOKUMENTY_OTRZYMANE_DO_REKALKULACJI("DOKUMENTY_OTRZYMANE_DO_REKALKULACJI"),
  
  OCZEKUJE_NA_REALIZACJE("OCZEKUJE_NA_REALIZACJE"),
  
  UGODA_URUCHOMIONA_W_SYSTEMIE("UGODA_URUCHOMIONA_W_SYSTEMIE"),
  
  UGODA_URUCHOMIONA_W_SYSTEMIE_KONIEC_PROCESU("UGODA_URUCHOMIONA_W_SYSTEMIE_KONIEC_PROCESU"),
  
  BRAK_SPELNIENIA_WARUNKOW_PO_MEDIACJI("BRAK_SPELNIENIA_WARUNKOW_PO_MEDIACJI"),
  
  ANULOWANA("ANULOWANA");

  private String value;

  EtapProcesu(String value) {
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
  public static EtapProcesu fromValue(String value) {
    for (EtapProcesu b : EtapProcesu.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

