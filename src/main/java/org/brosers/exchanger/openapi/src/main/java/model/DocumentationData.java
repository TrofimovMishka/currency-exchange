package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dokumentacja
 */

@Schema(name = "DocumentationData", description = "Dokumentacja")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class DocumentationData {

  private Long id;

  private Long caseId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataWaznosciDecyzji;

  private String statusDecyzji;

  private String warunkiDecyzji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataWplywuUmowyMediacyjnej;

  private Boolean kompletnoscUmowyMediacyjnej;

  private String numerDyspozycji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataWysylkiUmowyMediacyjnejDoKnf;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataKalkulacjiPrzedMediacja;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPrzygotowaniaDokumentowDoMediacji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPozytywnegoWynikuMediacji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPrzygotowaniaOstatecznejKalkulacji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataPrzygotowaniaOstatecznejDokumentacji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataWysylkiDokumentowKurierem;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataWysylkiDokumentowRNet;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataKoniecznegoPrzypomnieniaOZwrocieDokumentow;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataOtrzymaniaPodpisanychDokumentow;

  private Boolean czyDokumentyKompletne;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate planowanaDataRealizacji;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataRealizacjiWSystemie;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataOdeslaniaUmowyDoKnf;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataOdeslaniaUmowyDoKlienta;

  private Boolean czyKlientPodpisalOswiadczeniePit;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataZawarciaUgody;

  public DocumentationData id(Long id) {
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

  public DocumentationData caseId(Long caseId) {
    this.caseId = caseId;
    return this;
  }

  /**
   * identyfikator sprawy wewnatrz Mediator
   * @return caseId
  */
  
  @Schema(name = "caseId", description = "identyfikator sprawy wewnatrz Mediator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseId")
  public Long getCaseId() {
    return caseId;
  }

  public void setCaseId(Long caseId) {
    this.caseId = caseId;
  }

  public DocumentationData dataWaznosciDecyzji(LocalDate dataWaznosciDecyzji) {
    this.dataWaznosciDecyzji = dataWaznosciDecyzji;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataWaznosciDecyzji
  */
  @Valid 
  @Schema(name = "dataWaznosciDecyzji", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataWaznosciDecyzji")
  public LocalDate getDataWaznosciDecyzji() {
    return dataWaznosciDecyzji;
  }

  public void setDataWaznosciDecyzji(LocalDate dataWaznosciDecyzji) {
    this.dataWaznosciDecyzji = dataWaznosciDecyzji;
  }

  public DocumentationData statusDecyzji(String statusDecyzji) {
    this.statusDecyzji = statusDecyzji;
    return this;
  }

  /**
   * Status decyzji
   * @return statusDecyzji
  */
  
  @Schema(name = "statusDecyzji", description = "Status decyzji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusDecyzji")
  public String getStatusDecyzji() {
    return statusDecyzji;
  }

  public void setStatusDecyzji(String statusDecyzji) {
    this.statusDecyzji = statusDecyzji;
  }

  public DocumentationData warunkiDecyzji(String warunkiDecyzji) {
    this.warunkiDecyzji = warunkiDecyzji;
    return this;
  }

  /**
   * Warunki decyzji
   * @return warunkiDecyzji
  */
  
  @Schema(name = "warunkiDecyzji", description = "Warunki decyzji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warunkiDecyzji")
  public String getWarunkiDecyzji() {
    return warunkiDecyzji;
  }

  public void setWarunkiDecyzji(String warunkiDecyzji) {
    this.warunkiDecyzji = warunkiDecyzji;
  }

  public DocumentationData dataWplywuUmowyMediacyjnej(LocalDate dataWplywuUmowyMediacyjnej) {
    this.dataWplywuUmowyMediacyjnej = dataWplywuUmowyMediacyjnej;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataWplywuUmowyMediacyjnej
  */
  @Valid 
  @Schema(name = "dataWplywuUmowyMediacyjnej", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataWplywuUmowyMediacyjnej")
  public LocalDate getDataWplywuUmowyMediacyjnej() {
    return dataWplywuUmowyMediacyjnej;
  }

  public void setDataWplywuUmowyMediacyjnej(LocalDate dataWplywuUmowyMediacyjnej) {
    this.dataWplywuUmowyMediacyjnej = dataWplywuUmowyMediacyjnej;
  }

  public DocumentationData kompletnoscUmowyMediacyjnej(Boolean kompletnoscUmowyMediacyjnej) {
    this.kompletnoscUmowyMediacyjnej = kompletnoscUmowyMediacyjnej;
    return this;
  }

  /**
   * Kompletność umowy mediacyjnej
   * @return kompletnoscUmowyMediacyjnej
  */
  
  @Schema(name = "kompletnoscUmowyMediacyjnej", description = "Kompletność umowy mediacyjnej", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kompletnoscUmowyMediacyjnej")
  public Boolean getKompletnoscUmowyMediacyjnej() {
    return kompletnoscUmowyMediacyjnej;
  }

  public void setKompletnoscUmowyMediacyjnej(Boolean kompletnoscUmowyMediacyjnej) {
    this.kompletnoscUmowyMediacyjnej = kompletnoscUmowyMediacyjnej;
  }

  public DocumentationData numerDyspozycji(String numerDyspozycji) {
    this.numerDyspozycji = numerDyspozycji;
    return this;
  }

  /**
   * Numer dyspozycji
   * @return numerDyspozycji
  */
  @Size(max = 50) 
  @Schema(name = "numerDyspozycji", description = "Numer dyspozycji", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerDyspozycji")
  public String getNumerDyspozycji() {
    return numerDyspozycji;
  }

  public void setNumerDyspozycji(String numerDyspozycji) {
    this.numerDyspozycji = numerDyspozycji;
  }

  public DocumentationData dataWysylkiUmowyMediacyjnejDoKnf(LocalDate dataWysylkiUmowyMediacyjnejDoKnf) {
    this.dataWysylkiUmowyMediacyjnejDoKnf = dataWysylkiUmowyMediacyjnejDoKnf;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataWysylkiUmowyMediacyjnejDoKnf
  */
  @Valid 
  @Schema(name = "dataWysylkiUmowyMediacyjnejDoKnf", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataWysylkiUmowyMediacyjnejDoKnf")
  public LocalDate getDataWysylkiUmowyMediacyjnejDoKnf() {
    return dataWysylkiUmowyMediacyjnejDoKnf;
  }

  public void setDataWysylkiUmowyMediacyjnejDoKnf(LocalDate dataWysylkiUmowyMediacyjnejDoKnf) {
    this.dataWysylkiUmowyMediacyjnejDoKnf = dataWysylkiUmowyMediacyjnejDoKnf;
  }

  public DocumentationData wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja(LocalDate wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja) {
    this.wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja = wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja
  */
  @Valid 
  @Schema(name = "wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja")
  public LocalDate getWymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja() {
    return wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja;
  }

  public void setWymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja(LocalDate wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja) {
    this.wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja = wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja;
  }

  public DocumentationData dataKalkulacjiPrzedMediacja(LocalDate dataKalkulacjiPrzedMediacja) {
    this.dataKalkulacjiPrzedMediacja = dataKalkulacjiPrzedMediacja;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataKalkulacjiPrzedMediacja
  */
  @Valid 
  @Schema(name = "dataKalkulacjiPrzedMediacja", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataKalkulacjiPrzedMediacja")
  public LocalDate getDataKalkulacjiPrzedMediacja() {
    return dataKalkulacjiPrzedMediacja;
  }

  public void setDataKalkulacjiPrzedMediacja(LocalDate dataKalkulacjiPrzedMediacja) {
    this.dataKalkulacjiPrzedMediacja = dataKalkulacjiPrzedMediacja;
  }

  public DocumentationData wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja(LocalDate wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja) {
    this.wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja = wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja
  */
  @Valid 
  @Schema(name = "wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja")
  public LocalDate getWymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja() {
    return wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja;
  }

  public void setWymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja(LocalDate wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja) {
    this.wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja = wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja;
  }

  public DocumentationData dataPrzygotowaniaDokumentowDoMediacji(LocalDate dataPrzygotowaniaDokumentowDoMediacji) {
    this.dataPrzygotowaniaDokumentowDoMediacji = dataPrzygotowaniaDokumentowDoMediacji;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataPrzygotowaniaDokumentowDoMediacji
  */
  @Valid 
  @Schema(name = "dataPrzygotowaniaDokumentowDoMediacji", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPrzygotowaniaDokumentowDoMediacji")
  public LocalDate getDataPrzygotowaniaDokumentowDoMediacji() {
    return dataPrzygotowaniaDokumentowDoMediacji;
  }

  public void setDataPrzygotowaniaDokumentowDoMediacji(LocalDate dataPrzygotowaniaDokumentowDoMediacji) {
    this.dataPrzygotowaniaDokumentowDoMediacji = dataPrzygotowaniaDokumentowDoMediacji;
  }

  public DocumentationData dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika(LocalDate dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika) {
    this.dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika = dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika
  */
  @Valid 
  @Schema(name = "dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika")
  public LocalDate getDataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika() {
    return dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika;
  }

  public void setDataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika(LocalDate dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika) {
    this.dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika = dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika;
  }

  public DocumentationData dataPozytywnegoWynikuMediacji(LocalDate dataPozytywnegoWynikuMediacji) {
    this.dataPozytywnegoWynikuMediacji = dataPozytywnegoWynikuMediacji;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataPozytywnegoWynikuMediacji
  */
  @Valid 
  @Schema(name = "dataPozytywnegoWynikuMediacji", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPozytywnegoWynikuMediacji")
  public LocalDate getDataPozytywnegoWynikuMediacji() {
    return dataPozytywnegoWynikuMediacji;
  }

  public void setDataPozytywnegoWynikuMediacji(LocalDate dataPozytywnegoWynikuMediacji) {
    this.dataPozytywnegoWynikuMediacji = dataPozytywnegoWynikuMediacji;
  }

  public DocumentationData dataPrzygotowaniaOstatecznejKalkulacji(LocalDate dataPrzygotowaniaOstatecznejKalkulacji) {
    this.dataPrzygotowaniaOstatecznejKalkulacji = dataPrzygotowaniaOstatecznejKalkulacji;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataPrzygotowaniaOstatecznejKalkulacji
  */
  @Valid 
  @Schema(name = "dataPrzygotowaniaOstatecznejKalkulacji", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPrzygotowaniaOstatecznejKalkulacji")
  public LocalDate getDataPrzygotowaniaOstatecznejKalkulacji() {
    return dataPrzygotowaniaOstatecznejKalkulacji;
  }

  public void setDataPrzygotowaniaOstatecznejKalkulacji(LocalDate dataPrzygotowaniaOstatecznejKalkulacji) {
    this.dataPrzygotowaniaOstatecznejKalkulacji = dataPrzygotowaniaOstatecznejKalkulacji;
  }

  public DocumentationData dataPrzygotowaniaOstatecznejDokumentacji(LocalDate dataPrzygotowaniaOstatecznejDokumentacji) {
    this.dataPrzygotowaniaOstatecznejDokumentacji = dataPrzygotowaniaOstatecznejDokumentacji;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataPrzygotowaniaOstatecznejDokumentacji
  */
  @Valid 
  @Schema(name = "dataPrzygotowaniaOstatecznejDokumentacji", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPrzygotowaniaOstatecznejDokumentacji")
  public LocalDate getDataPrzygotowaniaOstatecznejDokumentacji() {
    return dataPrzygotowaniaOstatecznejDokumentacji;
  }

  public void setDataPrzygotowaniaOstatecznejDokumentacji(LocalDate dataPrzygotowaniaOstatecznejDokumentacji) {
    this.dataPrzygotowaniaOstatecznejDokumentacji = dataPrzygotowaniaOstatecznejDokumentacji;
  }

  public DocumentationData dataWysylkiDokumentowKurierem(LocalDate dataWysylkiDokumentowKurierem) {
    this.dataWysylkiDokumentowKurierem = dataWysylkiDokumentowKurierem;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataWysylkiDokumentowKurierem
  */
  @Valid 
  @Schema(name = "dataWysylkiDokumentowKurierem", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataWysylkiDokumentowKurierem")
  public LocalDate getDataWysylkiDokumentowKurierem() {
    return dataWysylkiDokumentowKurierem;
  }

  public void setDataWysylkiDokumentowKurierem(LocalDate dataWysylkiDokumentowKurierem) {
    this.dataWysylkiDokumentowKurierem = dataWysylkiDokumentowKurierem;
  }

  public DocumentationData dataWysylkiDokumentowRNet(LocalDate dataWysylkiDokumentowRNet) {
    this.dataWysylkiDokumentowRNet = dataWysylkiDokumentowRNet;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataWysylkiDokumentowRNet
  */
  @Valid 
  @Schema(name = "dataWysylkiDokumentowRNet", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataWysylkiDokumentowRNet")
  public LocalDate getDataWysylkiDokumentowRNet() {
    return dataWysylkiDokumentowRNet;
  }

  public void setDataWysylkiDokumentowRNet(LocalDate dataWysylkiDokumentowRNet) {
    this.dataWysylkiDokumentowRNet = dataWysylkiDokumentowRNet;
  }

  public DocumentationData dataKoniecznegoPrzypomnieniaOZwrocieDokumentow(LocalDate dataKoniecznegoPrzypomnieniaOZwrocieDokumentow) {
    this.dataKoniecznegoPrzypomnieniaOZwrocieDokumentow = dataKoniecznegoPrzypomnieniaOZwrocieDokumentow;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataKoniecznegoPrzypomnieniaOZwrocieDokumentow
  */
  @Valid 
  @Schema(name = "dataKoniecznegoPrzypomnieniaOZwrocieDokumentow", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataKoniecznegoPrzypomnieniaOZwrocieDokumentow")
  public LocalDate getDataKoniecznegoPrzypomnieniaOZwrocieDokumentow() {
    return dataKoniecznegoPrzypomnieniaOZwrocieDokumentow;
  }

  public void setDataKoniecznegoPrzypomnieniaOZwrocieDokumentow(LocalDate dataKoniecznegoPrzypomnieniaOZwrocieDokumentow) {
    this.dataKoniecznegoPrzypomnieniaOZwrocieDokumentow = dataKoniecznegoPrzypomnieniaOZwrocieDokumentow;
  }

  public DocumentationData dataOtrzymaniaPodpisanychDokumentow(LocalDate dataOtrzymaniaPodpisanychDokumentow) {
    this.dataOtrzymaniaPodpisanychDokumentow = dataOtrzymaniaPodpisanychDokumentow;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataOtrzymaniaPodpisanychDokumentow
  */
  @Valid 
  @Schema(name = "dataOtrzymaniaPodpisanychDokumentow", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataOtrzymaniaPodpisanychDokumentow")
  public LocalDate getDataOtrzymaniaPodpisanychDokumentow() {
    return dataOtrzymaniaPodpisanychDokumentow;
  }

  public void setDataOtrzymaniaPodpisanychDokumentow(LocalDate dataOtrzymaniaPodpisanychDokumentow) {
    this.dataOtrzymaniaPodpisanychDokumentow = dataOtrzymaniaPodpisanychDokumentow;
  }

  public DocumentationData czyDokumentyKompletne(Boolean czyDokumentyKompletne) {
    this.czyDokumentyKompletne = czyDokumentyKompletne;
    return this;
  }

  /**
   * Czy dokumenty kompletne
   * @return czyDokumentyKompletne
  */
  
  @Schema(name = "czyDokumentyKompletne", description = "Czy dokumenty kompletne", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("czyDokumentyKompletne")
  public Boolean getCzyDokumentyKompletne() {
    return czyDokumentyKompletne;
  }

  public void setCzyDokumentyKompletne(Boolean czyDokumentyKompletne) {
    this.czyDokumentyKompletne = czyDokumentyKompletne;
  }

  public DocumentationData planowanaDataRealizacji(LocalDate planowanaDataRealizacji) {
    this.planowanaDataRealizacji = planowanaDataRealizacji;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return planowanaDataRealizacji
  */
  @Valid 
  @Schema(name = "planowanaDataRealizacji", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planowanaDataRealizacji")
  public LocalDate getPlanowanaDataRealizacji() {
    return planowanaDataRealizacji;
  }

  public void setPlanowanaDataRealizacji(LocalDate planowanaDataRealizacji) {
    this.planowanaDataRealizacji = planowanaDataRealizacji;
  }

  public DocumentationData dataRealizacjiWSystemie(LocalDate dataRealizacjiWSystemie) {
    this.dataRealizacjiWSystemie = dataRealizacjiWSystemie;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataRealizacjiWSystemie
  */
  @Valid 
  @Schema(name = "dataRealizacjiWSystemie", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataRealizacjiWSystemie")
  public LocalDate getDataRealizacjiWSystemie() {
    return dataRealizacjiWSystemie;
  }

  public void setDataRealizacjiWSystemie(LocalDate dataRealizacjiWSystemie) {
    this.dataRealizacjiWSystemie = dataRealizacjiWSystemie;
  }

  public DocumentationData dataOdeslaniaUmowyDoKnf(LocalDate dataOdeslaniaUmowyDoKnf) {
    this.dataOdeslaniaUmowyDoKnf = dataOdeslaniaUmowyDoKnf;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataOdeslaniaUmowyDoKnf
  */
  @Valid 
  @Schema(name = "dataOdeslaniaUmowyDoKnf", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataOdeslaniaUmowyDoKnf")
  public LocalDate getDataOdeslaniaUmowyDoKnf() {
    return dataOdeslaniaUmowyDoKnf;
  }

  public void setDataOdeslaniaUmowyDoKnf(LocalDate dataOdeslaniaUmowyDoKnf) {
    this.dataOdeslaniaUmowyDoKnf = dataOdeslaniaUmowyDoKnf;
  }

  public DocumentationData dataOdeslaniaUmowyDoKlienta(LocalDate dataOdeslaniaUmowyDoKlienta) {
    this.dataOdeslaniaUmowyDoKlienta = dataOdeslaniaUmowyDoKlienta;
    return this;
  }

  /**
   * YYYY-MM-DD
   * @return dataOdeslaniaUmowyDoKlienta
  */
  @Valid 
  @Schema(name = "dataOdeslaniaUmowyDoKlienta", description = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataOdeslaniaUmowyDoKlienta")
  public LocalDate getDataOdeslaniaUmowyDoKlienta() {
    return dataOdeslaniaUmowyDoKlienta;
  }

  public void setDataOdeslaniaUmowyDoKlienta(LocalDate dataOdeslaniaUmowyDoKlienta) {
    this.dataOdeslaniaUmowyDoKlienta = dataOdeslaniaUmowyDoKlienta;
  }

  public DocumentationData czyKlientPodpisalOswiadczeniePit(Boolean czyKlientPodpisalOswiadczeniePit) {
    this.czyKlientPodpisalOswiadczeniePit = czyKlientPodpisalOswiadczeniePit;
    return this;
  }

  /**
   * Czy klient podpisal oswiadczenie PIT
   * @return czyKlientPodpisalOswiadczeniePit
  */
  
  @Schema(name = "czyKlientPodpisalOswiadczeniePit", description = "Czy klient podpisal oswiadczenie PIT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("czyKlientPodpisalOswiadczeniePit")
  public Boolean getCzyKlientPodpisalOswiadczeniePit() {
    return czyKlientPodpisalOswiadczeniePit;
  }

  public void setCzyKlientPodpisalOswiadczeniePit(Boolean czyKlientPodpisalOswiadczeniePit) {
    this.czyKlientPodpisalOswiadczeniePit = czyKlientPodpisalOswiadczeniePit;
  }

  public DocumentationData dataZawarciaUgody(OffsetDateTime dataZawarciaUgody) {
    this.dataZawarciaUgody = dataZawarciaUgody;
    return this;
  }

  /**
   * Date when agreement was signed
   * @return dataZawarciaUgody
  */
  @Valid 
  @Schema(name = "dataZawarciaUgody", description = "Date when agreement was signed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataZawarciaUgody")
  public OffsetDateTime getDataZawarciaUgody() {
    return dataZawarciaUgody;
  }

  public void setDataZawarciaUgody(OffsetDateTime dataZawarciaUgody) {
    this.dataZawarciaUgody = dataZawarciaUgody;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentationData documentationData = (DocumentationData) o;
    return Objects.equals(this.id, documentationData.id) &&
        Objects.equals(this.caseId, documentationData.caseId) &&
        Objects.equals(this.dataWaznosciDecyzji, documentationData.dataWaznosciDecyzji) &&
        Objects.equals(this.statusDecyzji, documentationData.statusDecyzji) &&
        Objects.equals(this.warunkiDecyzji, documentationData.warunkiDecyzji) &&
        Objects.equals(this.dataWplywuUmowyMediacyjnej, documentationData.dataWplywuUmowyMediacyjnej) &&
        Objects.equals(this.kompletnoscUmowyMediacyjnej, documentationData.kompletnoscUmowyMediacyjnej) &&
        Objects.equals(this.numerDyspozycji, documentationData.numerDyspozycji) &&
        Objects.equals(this.dataWysylkiUmowyMediacyjnejDoKnf, documentationData.dataWysylkiUmowyMediacyjnejDoKnf) &&
        Objects.equals(this.wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja, documentationData.wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja) &&
        Objects.equals(this.dataKalkulacjiPrzedMediacja, documentationData.dataKalkulacjiPrzedMediacja) &&
        Objects.equals(this.wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja, documentationData.wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja) &&
        Objects.equals(this.dataPrzygotowaniaDokumentowDoMediacji, documentationData.dataPrzygotowaniaDokumentowDoMediacji) &&
        Objects.equals(this.dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika, documentationData.dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika) &&
        Objects.equals(this.dataPozytywnegoWynikuMediacji, documentationData.dataPozytywnegoWynikuMediacji) &&
        Objects.equals(this.dataPrzygotowaniaOstatecznejKalkulacji, documentationData.dataPrzygotowaniaOstatecznejKalkulacji) &&
        Objects.equals(this.dataPrzygotowaniaOstatecznejDokumentacji, documentationData.dataPrzygotowaniaOstatecznejDokumentacji) &&
        Objects.equals(this.dataWysylkiDokumentowKurierem, documentationData.dataWysylkiDokumentowKurierem) &&
        Objects.equals(this.dataWysylkiDokumentowRNet, documentationData.dataWysylkiDokumentowRNet) &&
        Objects.equals(this.dataKoniecznegoPrzypomnieniaOZwrocieDokumentow, documentationData.dataKoniecznegoPrzypomnieniaOZwrocieDokumentow) &&
        Objects.equals(this.dataOtrzymaniaPodpisanychDokumentow, documentationData.dataOtrzymaniaPodpisanychDokumentow) &&
        Objects.equals(this.czyDokumentyKompletne, documentationData.czyDokumentyKompletne) &&
        Objects.equals(this.planowanaDataRealizacji, documentationData.planowanaDataRealizacji) &&
        Objects.equals(this.dataRealizacjiWSystemie, documentationData.dataRealizacjiWSystemie) &&
        Objects.equals(this.dataOdeslaniaUmowyDoKnf, documentationData.dataOdeslaniaUmowyDoKnf) &&
        Objects.equals(this.dataOdeslaniaUmowyDoKlienta, documentationData.dataOdeslaniaUmowyDoKlienta) &&
        Objects.equals(this.czyKlientPodpisalOswiadczeniePit, documentationData.czyKlientPodpisalOswiadczeniePit) &&
        Objects.equals(this.dataZawarciaUgody, documentationData.dataZawarciaUgody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, dataWaznosciDecyzji, statusDecyzji, warunkiDecyzji, dataWplywuUmowyMediacyjnej, kompletnoscUmowyMediacyjnej, numerDyspozycji, dataWysylkiUmowyMediacyjnejDoKnf, wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja, dataKalkulacjiPrzedMediacja, wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja, dataPrzygotowaniaDokumentowDoMediacji, dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika, dataPozytywnegoWynikuMediacji, dataPrzygotowaniaOstatecznejKalkulacji, dataPrzygotowaniaOstatecznejDokumentacji, dataWysylkiDokumentowKurierem, dataWysylkiDokumentowRNet, dataKoniecznegoPrzypomnieniaOZwrocieDokumentow, dataOtrzymaniaPodpisanychDokumentow, czyDokumentyKompletne, planowanaDataRealizacji, dataRealizacjiWSystemie, dataOdeslaniaUmowyDoKnf, dataOdeslaniaUmowyDoKlienta, czyKlientPodpisalOswiadczeniePit, dataZawarciaUgody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentationData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    dataWaznosciDecyzji: ").append(toIndentedString(dataWaznosciDecyzji)).append("\n");
    sb.append("    statusDecyzji: ").append(toIndentedString(statusDecyzji)).append("\n");
    sb.append("    warunkiDecyzji: ").append(toIndentedString(warunkiDecyzji)).append("\n");
    sb.append("    dataWplywuUmowyMediacyjnej: ").append(toIndentedString(dataWplywuUmowyMediacyjnej)).append("\n");
    sb.append("    kompletnoscUmowyMediacyjnej: ").append(toIndentedString(kompletnoscUmowyMediacyjnej)).append("\n");
    sb.append("    numerDyspozycji: ").append(toIndentedString(numerDyspozycji)).append("\n");
    sb.append("    dataWysylkiUmowyMediacyjnejDoKnf: ").append(toIndentedString(dataWysylkiUmowyMediacyjnejDoKnf)).append("\n");
    sb.append("    wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja: ").append(toIndentedString(wymaganaDataPrzygotowaniaKalkulacjiPrzedMediacja)).append("\n");
    sb.append("    dataKalkulacjiPrzedMediacja: ").append(toIndentedString(dataKalkulacjiPrzedMediacja)).append("\n");
    sb.append("    wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja: ").append(toIndentedString(wymaganaDataPrzygotowaniaDokumentacjiPrzedMediacja)).append("\n");
    sb.append("    dataPrzygotowaniaDokumentowDoMediacji: ").append(toIndentedString(dataPrzygotowaniaDokumentowDoMediacji)).append("\n");
    sb.append("    dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika: ").append(toIndentedString(dataPrzekazaniaDokumentacjiDoKnfKlientaPelnomocnika)).append("\n");
    sb.append("    dataPozytywnegoWynikuMediacji: ").append(toIndentedString(dataPozytywnegoWynikuMediacji)).append("\n");
    sb.append("    dataPrzygotowaniaOstatecznejKalkulacji: ").append(toIndentedString(dataPrzygotowaniaOstatecznejKalkulacji)).append("\n");
    sb.append("    dataPrzygotowaniaOstatecznejDokumentacji: ").append(toIndentedString(dataPrzygotowaniaOstatecznejDokumentacji)).append("\n");
    sb.append("    dataWysylkiDokumentowKurierem: ").append(toIndentedString(dataWysylkiDokumentowKurierem)).append("\n");
    sb.append("    dataWysylkiDokumentowRNet: ").append(toIndentedString(dataWysylkiDokumentowRNet)).append("\n");
    sb.append("    dataKoniecznegoPrzypomnieniaOZwrocieDokumentow: ").append(toIndentedString(dataKoniecznegoPrzypomnieniaOZwrocieDokumentow)).append("\n");
    sb.append("    dataOtrzymaniaPodpisanychDokumentow: ").append(toIndentedString(dataOtrzymaniaPodpisanychDokumentow)).append("\n");
    sb.append("    czyDokumentyKompletne: ").append(toIndentedString(czyDokumentyKompletne)).append("\n");
    sb.append("    planowanaDataRealizacji: ").append(toIndentedString(planowanaDataRealizacji)).append("\n");
    sb.append("    dataRealizacjiWSystemie: ").append(toIndentedString(dataRealizacjiWSystemie)).append("\n");
    sb.append("    dataOdeslaniaUmowyDoKnf: ").append(toIndentedString(dataOdeslaniaUmowyDoKnf)).append("\n");
    sb.append("    dataOdeslaniaUmowyDoKlienta: ").append(toIndentedString(dataOdeslaniaUmowyDoKlienta)).append("\n");
    sb.append("    czyKlientPodpisalOswiadczeniePit: ").append(toIndentedString(czyKlientPodpisalOswiadczeniePit)).append("\n");
    sb.append("    dataZawarciaUgody: ").append(toIndentedString(dataZawarciaUgody)).append("\n");
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

