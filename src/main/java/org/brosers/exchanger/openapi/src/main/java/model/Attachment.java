package model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Zalacznik do sprawy one-pager i inne. Moze zostac zaloczony tylko JEDEN one pager
 */

@Schema(name = "Attachment", description = "Zalacznik do sprawy one-pager i inne. Moze zostac zaloczony tylko JEDEN one pager")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-02T21:55:45.453890500+02:00[Europe/Warsaw]", comments = "Generator version: 7.4.0")
public class Attachment {

  private Long id;

  private Long caseId;

  private String organisationId;

  private String uploadFileName;

  private Long fileSizeBytes;

  private String extension;

  private String internalFileName;

  private String internalURI;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime uploadDate;

  /**
   * 
   */
  public enum AttachmentTypeEnum {
    ONE_PAGER("ONE_PAGER"),
    
    OTHER("OTHER"),
    
    UMOWA("UMOWA"),
    
    HARMONOGRAM("HARMONOGRAM"),
    
    ANEKS("ANEKS"),
    
    UGODA("UGODA"),
    
    INNE("INNE");

    private String value;

    AttachmentTypeEnum(String value) {
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
    public static AttachmentTypeEnum fromValue(String value) {
      for (AttachmentTypeEnum b : AttachmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AttachmentTypeEnum attachmentType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime knfExportDate;

  private Boolean deleted;

  public Attachment id(Long id) {
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

  public Attachment caseId(Long caseId) {
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

  public Attachment organisationId(String organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * 
   * @return organisationId
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "organisationId", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organisationId")
  public String getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }

  public Attachment uploadFileName(String uploadFileName) {
    this.uploadFileName = uploadFileName;
    return this;
  }

  /**
   * 
   * @return uploadFileName
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "uploadFileName", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploadFileName")
  public String getUploadFileName() {
    return uploadFileName;
  }

  public void setUploadFileName(String uploadFileName) {
    this.uploadFileName = uploadFileName;
  }

  public Attachment fileSizeBytes(Long fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
    return this;
  }

  /**
   * 
   * @return fileSizeBytes
  */
  
  @Schema(name = "fileSizeBytes", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileSizeBytes")
  public Long getFileSizeBytes() {
    return fileSizeBytes;
  }

  public void setFileSizeBytes(Long fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
  }

  public Attachment extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * 
   * @return extension
  */
  @Size(min = 0, max = 1000) 
  @Schema(name = "extension", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public Attachment internalFileName(String internalFileName) {
    this.internalFileName = internalFileName;
    return this;
  }

  /**
   * 
   * @return internalFileName
  */
  @Size(min = 0, max = 100) 
  @Schema(name = "internalFileName", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internalFileName")
  public String getInternalFileName() {
    return internalFileName;
  }

  public void setInternalFileName(String internalFileName) {
    this.internalFileName = internalFileName;
  }

  public Attachment internalURI(String internalURI) {
    this.internalURI = internalURI;
    return this;
  }

  /**
   * 
   * @return internalURI
  */
  @Size(min = 0, max = 1000) 
  @Schema(name = "internalURI", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internalURI")
  public String getInternalURI() {
    return internalURI;
  }

  public void setInternalURI(String internalURI) {
    this.internalURI = internalURI;
  }

  public Attachment description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 
   * @return description
  */
  @Size(min = 0, max = 1000) 
  @Schema(name = "description", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Attachment uploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  /**
   * yyyy-MM-dd HH:mm:ss
   * @return uploadDate
  */
  @Valid 
  @Schema(name = "uploadDate", description = "yyyy-MM-dd HH:mm:ss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploadDate")
  public OffsetDateTime getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
  }

  public Attachment attachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

  /**
   * 
   * @return attachmentType
  */
  
  @Schema(name = "attachmentType", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachmentType")
  public AttachmentTypeEnum getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
  }

  public Attachment knfExportDate(OffsetDateTime knfExportDate) {
    this.knfExportDate = knfExportDate;
    return this;
  }

  /**
   * date-time of send attachment to knf
   * @return knfExportDate
  */
  @Valid 
  @Schema(name = "knfExportDate", description = "date-time of send attachment to knf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("knfExportDate")
  public OffsetDateTime getKnfExportDate() {
    return knfExportDate;
  }

  public void setKnfExportDate(OffsetDateTime knfExportDate) {
    this.knfExportDate = knfExportDate;
  }

  public Attachment deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
  */
  
  @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.caseId, attachment.caseId) &&
        Objects.equals(this.organisationId, attachment.organisationId) &&
        Objects.equals(this.uploadFileName, attachment.uploadFileName) &&
        Objects.equals(this.fileSizeBytes, attachment.fileSizeBytes) &&
        Objects.equals(this.extension, attachment.extension) &&
        Objects.equals(this.internalFileName, attachment.internalFileName) &&
        Objects.equals(this.internalURI, attachment.internalURI) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.uploadDate, attachment.uploadDate) &&
        Objects.equals(this.attachmentType, attachment.attachmentType) &&
        Objects.equals(this.knfExportDate, attachment.knfExportDate) &&
        Objects.equals(this.deleted, attachment.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseId, organisationId, uploadFileName, fileSizeBytes, extension, internalFileName, internalURI, description, uploadDate, attachmentType, knfExportDate, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    uploadFileName: ").append(toIndentedString(uploadFileName)).append("\n");
    sb.append("    fileSizeBytes: ").append(toIndentedString(fileSizeBytes)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    internalFileName: ").append(toIndentedString(internalFileName)).append("\n");
    sb.append("    internalURI: ").append(toIndentedString(internalURI)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    knfExportDate: ").append(toIndentedString(knfExportDate)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

