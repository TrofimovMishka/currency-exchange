package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Parametry koncowe
 */

@Schema(name = "FinalizationParameters", description = "Parametry koncowe")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class FinalizationParameters {

  private Long id;

  private Long caseId;

  private String outstandingBalanceBeforeSettlementInCHF;

  private String outstandingBalanceBeforeSettlementInPLN;

  private String outstandingBalanceAfterTheSettlementInPLN;

  private String amountWO;

  private String percentageWO;

  /**
   * 
   */
  public enum RiskGroupEnum {
    HIGH_RISK("HIGH_RISK"),
    
    MEDIUM_RISK("MEDIUM_RISK"),
    
    LOW_RISK("LOW_RISK"),
    
    VERY_LOW_RISK("VERY_LOW_RISK");

    private String value;

    RiskGroupEnum(String value) {
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
    public static RiskGroupEnum fromValue(String value) {
      for (RiskGroupEnum b : RiskGroupEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RiskGroupEnum riskGroup;

  private String kursNBP;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataKursuNBP;

  public FinalizationParameters id(Long id) {
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

  public FinalizationParameters caseId(Long caseId) {
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

  public FinalizationParameters outstandingBalanceBeforeSettlementInCHF(String outstandingBalanceBeforeSettlementInCHF) {
    this.outstandingBalanceBeforeSettlementInCHF = outstandingBalanceBeforeSettlementInCHF;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return outstandingBalanceBeforeSettlementInCHF
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "outstandingBalanceBeforeSettlementInCHF", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outstandingBalanceBeforeSettlementInCHF")
  public String getOutstandingBalanceBeforeSettlementInCHF() {
    return outstandingBalanceBeforeSettlementInCHF;
  }

  public void setOutstandingBalanceBeforeSettlementInCHF(String outstandingBalanceBeforeSettlementInCHF) {
    this.outstandingBalanceBeforeSettlementInCHF = outstandingBalanceBeforeSettlementInCHF;
  }

  public FinalizationParameters outstandingBalanceBeforeSettlementInPLN(String outstandingBalanceBeforeSettlementInPLN) {
    this.outstandingBalanceBeforeSettlementInPLN = outstandingBalanceBeforeSettlementInPLN;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return outstandingBalanceBeforeSettlementInPLN
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "outstandingBalanceBeforeSettlementInPLN", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outstandingBalanceBeforeSettlementInPLN")
  public String getOutstandingBalanceBeforeSettlementInPLN() {
    return outstandingBalanceBeforeSettlementInPLN;
  }

  public void setOutstandingBalanceBeforeSettlementInPLN(String outstandingBalanceBeforeSettlementInPLN) {
    this.outstandingBalanceBeforeSettlementInPLN = outstandingBalanceBeforeSettlementInPLN;
  }

  public FinalizationParameters outstandingBalanceAfterTheSettlementInPLN(String outstandingBalanceAfterTheSettlementInPLN) {
    this.outstandingBalanceAfterTheSettlementInPLN = outstandingBalanceAfterTheSettlementInPLN;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return outstandingBalanceAfterTheSettlementInPLN
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "outstandingBalanceAfterTheSettlementInPLN", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outstandingBalanceAfterTheSettlementInPLN")
  public String getOutstandingBalanceAfterTheSettlementInPLN() {
    return outstandingBalanceAfterTheSettlementInPLN;
  }

  public void setOutstandingBalanceAfterTheSettlementInPLN(String outstandingBalanceAfterTheSettlementInPLN) {
    this.outstandingBalanceAfterTheSettlementInPLN = outstandingBalanceAfterTheSettlementInPLN;
  }

  public FinalizationParameters amountWO(String amountWO) {
    this.amountWO = amountWO;
    return this;
  }

  /**
   * Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return amountWO
  */
  @Size(min = 0, max = 20) 
  @Schema(name = "amountWO", description = "Format X.XXX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountWO")
  public String getAmountWO() {
    return amountWO;
  }

  public void setAmountWO(String amountWO) {
    this.amountWO = amountWO;
  }

  public FinalizationParameters percentageWO(String percentageWO) {
    this.percentageWO = percentageWO;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return percentageWO
  */
  @Size(min = 0, max = 10) 
  @Schema(name = "percentageWO", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentageWO")
  public String getPercentageWO() {
    return percentageWO;
  }

  public void setPercentageWO(String percentageWO) {
    this.percentageWO = percentageWO;
  }

  public FinalizationParameters riskGroup(RiskGroupEnum riskGroup) {
    this.riskGroup = riskGroup;
    return this;
  }

  /**
   * 
   * @return riskGroup
  */
  
  @Schema(name = "riskGroup", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("riskGroup")
  public RiskGroupEnum getRiskGroup() {
    return riskGroup;
  }

  public void setRiskGroup(RiskGroupEnum riskGroup) {
    this.riskGroup = riskGroup;
  }

  public FinalizationParameters kursNBP(String kursNBP) {
    this.kursNBP = kursNBP;
    return this;
  }

  /**
   * Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku
   * @return kursNBP
  */
  @Size(min = 0, max = 10) 
  @Schema(name = "kursNBP", description = "Format XX,XX tysiące oddzielone kropką znaki dziesiętne oddzielone przecinkiem. Możliwe tylko dwa miejsca po przecinku", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kursNBP")
  public String getKursNBP() {
    return kursNBP;
  }

  public void setKursNBP(String kursNBP) {
    this.kursNBP = kursNBP;
  }

  public FinalizationParameters dataKursuNBP(LocalDate dataKursuNBP) {
    this.dataKursuNBP = dataKursuNBP;
    return this;
  }

  /**
   * mozliwosc wyboru z kalendarza. yyyy-MM-dd
   * @return dataKursuNBP
  */
  @Valid 
  @Schema(name = "dataKursuNBP", description = "mozliwosc wyboru z kalendarza. yyyy-MM-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataKursuNBP")
  public LocalDate getDataKursuNBP() {
    return dataKursuNBP;
  }

  public void setDataKursuNBP(LocalDate dataKursuNBP) {
    this.dataKursuNBP = dataKursuNBP;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalizationParameters finalizationParameters = (FinalizationParameters) o;
    return Objects.equals(this.id, finalizationParameters.id) &&
        Objects.equals(this.caseId, finalizationParameters.caseId) &&
        Objects.equals(this.outstandingBalanceBeforeSettlementInCHF, finalizationParameters.outstandingBalanceBeforeSettlementInCHF) &&
        Objects.equals(this.outstandingBalanceBeforeSettlementInPLN, finalizationParameters.outstandingBalanceBeforeSettlementInPLN) &&
        Objects.equals(this.outstandingBalanceAfterTheSettlementInPLN, finalizationParameters.outstandingBalanceAfterTheSettlementInPLN) &&
        Objects.equals(this.amountWO, finalizationParameters.amountWO) &&
        Objects.equals(this.percentageWO, finalizationParameters.percentageWO) &&
        Objects.equals(this.riskGroup, finalizationParameters.riskGroup) &&
        Objects.equals(this.kursNBP, finalizationParameters.kursNBP) &&
        Objects.equals(this.dataKursuNBP, finalizationParameters.dataKursuNBP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, outstandingBalanceBeforeSettlementInCHF, outstandingBalanceBeforeSettlementInPLN, outstandingBalanceAfterTheSettlementInPLN, amountWO, percentageWO, riskGroup, kursNBP, dataKursuNBP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizationParameters {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    outstandingBalanceBeforeSettlementInCHF: ").append(toIndentedString(outstandingBalanceBeforeSettlementInCHF)).append("\n");
    sb.append("    outstandingBalanceBeforeSettlementInPLN: ").append(toIndentedString(outstandingBalanceBeforeSettlementInPLN)).append("\n");
    sb.append("    outstandingBalanceAfterTheSettlementInPLN: ").append(toIndentedString(outstandingBalanceAfterTheSettlementInPLN)).append("\n");
    sb.append("    amountWO: ").append(toIndentedString(amountWO)).append("\n");
    sb.append("    percentageWO: ").append(toIndentedString(percentageWO)).append("\n");
    sb.append("    riskGroup: ").append(toIndentedString(riskGroup)).append("\n");
    sb.append("    kursNBP: ").append(toIndentedString(kursNBP)).append("\n");
    sb.append("    dataKursuNBP: ").append(toIndentedString(dataKursuNBP)).append("\n");
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

