package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Pelnomocnik banku
 */

@Schema(name = "OrganizationAttorney", description = "Pelnomocnik banku")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class OrganizationAttorney {

  private Long id;

  private String imieINazwisko1;

  private String imieINazwisko2;

  private String numerTelefonuKmorkowy;

  private String adresMailowy;

  public OrganizationAttorney id(Long id) {
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

  public OrganizationAttorney imieINazwisko1(String imieINazwisko1) {
    this.imieINazwisko1 = imieINazwisko1;
    return this;
  }

  /**
   * pole wyboru ze zdefiniowanej listy oraz wolne pole tekstowe o nazwie 'inne:' do wpisania informacji ręcznie. zdefiniowana lista powinna być pobierana z biblioteki danych trzmanych na backendzie w Mediatorze
   * @return imieINazwisko1
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "imieINazwisko1", description = "pole wyboru ze zdefiniowanej listy oraz wolne pole tekstowe o nazwie 'inne:' do wpisania informacji ręcznie. zdefiniowana lista powinna być pobierana z biblioteki danych trzmanych na backendzie w Mediatorze", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imieINazwisko1")
  public String getImieINazwisko1() {
    return imieINazwisko1;
  }

  public void setImieINazwisko1(String imieINazwisko1) {
    this.imieINazwisko1 = imieINazwisko1;
  }

  public OrganizationAttorney imieINazwisko2(String imieINazwisko2) {
    this.imieINazwisko2 = imieINazwisko2;
    return this;
  }

  /**
   * informacje zaciągałyby się automatycznie z biblioteki pełnomocników po wyborze pełnomocnika z listy wyboru w polu powyżej
   * @return imieINazwisko2
  */
  @Size(min = 0, max = 150) 
  @Schema(name = "imieINazwisko2", description = "informacje zaciągałyby się automatycznie z biblioteki pełnomocników po wyborze pełnomocnika z listy wyboru w polu powyżej", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imieINazwisko2")
  public String getImieINazwisko2() {
    return imieINazwisko2;
  }

  public void setImieINazwisko2(String imieINazwisko2) {
    this.imieINazwisko2 = imieINazwisko2;
  }

  public OrganizationAttorney numerTelefonuKmorkowy(String numerTelefonuKmorkowy) {
    this.numerTelefonuKmorkowy = numerTelefonuKmorkowy;
    return this;
  }

  /**
   * tylko cyfry
   * @return numerTelefonuKmorkowy
  */
  @Pattern(regexp = "^\\+[0-9]{1,6} [0-9]{3,14}$") 
  @Schema(name = "numerTelefonuKmorkowy", description = "tylko cyfry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numerTelefonuKmorkowy")
  public String getNumerTelefonuKmorkowy() {
    return numerTelefonuKmorkowy;
  }

  public void setNumerTelefonuKmorkowy(String numerTelefonuKmorkowy) {
    this.numerTelefonuKmorkowy = numerTelefonuKmorkowy;
  }

  public OrganizationAttorney adresMailowy(String adresMailowy) {
    this.adresMailowy = adresMailowy;
    return this;
  }

  /**
   * 
   * @return adresMailowy
  */
  @Pattern(regexp = "(^$)|(^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$)") @Size(min = 0, max = 50) 
  @Schema(name = "adresMailowy", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adresMailowy")
  public String getAdresMailowy() {
    return adresMailowy;
  }

  public void setAdresMailowy(String adresMailowy) {
    this.adresMailowy = adresMailowy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAttorney organizationAttorney = (OrganizationAttorney) o;
    return Objects.equals(this.id, organizationAttorney.id) &&
        Objects.equals(this.imieINazwisko1, organizationAttorney.imieINazwisko1) &&
        Objects.equals(this.imieINazwisko2, organizationAttorney.imieINazwisko2) &&
        Objects.equals(this.numerTelefonuKmorkowy, organizationAttorney.numerTelefonuKmorkowy) &&
        Objects.equals(this.adresMailowy, organizationAttorney.adresMailowy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, imieINazwisko1, imieINazwisko2, numerTelefonuKmorkowy, adresMailowy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAttorney {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imieINazwisko1: ").append(toIndentedString(imieINazwisko1)).append("\n");
    sb.append("    imieINazwisko2: ").append(toIndentedString(imieINazwisko2)).append("\n");
    sb.append("    numerTelefonuKmorkowy: ").append(toIndentedString(numerTelefonuKmorkowy)).append("\n");
    sb.append("    adresMailowy: ").append(toIndentedString(adresMailowy)).append("\n");
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

