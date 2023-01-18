package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * The container for the definition of a concept which is addressed by the competency framework. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFConceptType   {
  @JsonProperty("identifier")
  @NotNull

  private String identifier;

  @JsonProperty("uri")
  @NotNull
@Valid

  private URI uri;

  @JsonProperty("title")
  @NotNull

  private String title;

  @JsonProperty("keywords")
  
  private String keywords;

  @JsonProperty("hierarchyCode")
  @NotNull

  private String hierarchyCode;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("lastChangeDateTime")
  @NotNull
@Valid

  private OffsetDateTime lastChangeDateTime;

  public CFConceptType identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The data-type for establishing a Globally Unique Identifier (GUID). The form of the GUID is a Universally Unique Identifier (UUID) of 16 hexadecimal characters (lower case) in the format 8-4-4-4-12. All permitted versions (1-5) and variants (1-2) are supported. 
   * @return identifier
  **/
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public CFConceptType uri(URI uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Model Primitive Datatype = AnyURI
   * @return uri
  **/
  public URI getUri() {
    return uri;
  }

  public void setUri(URI uri) {
    this.uri = uri;
  }

  public CFConceptType title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CFConceptType keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return keywords
  **/
  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public CFConceptType hierarchyCode(String hierarchyCode) {
    this.hierarchyCode = hierarchyCode;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return hierarchyCode
  **/
  public String getHierarchyCode() {
    return hierarchyCode;
  }

  public void setHierarchyCode(String hierarchyCode) {
    this.hierarchyCode = hierarchyCode;
  }

  public CFConceptType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Model Primitive Datatype = String
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CFConceptType lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
    this.lastChangeDateTime = lastChangeDateTime;
    return this;
  }

   /**
   * Model Primitive Datatype = DateTime
   * @return lastChangeDateTime
  **/
  public OffsetDateTime getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  public void setLastChangeDateTime(OffsetDateTime lastChangeDateTime) {
    this.lastChangeDateTime = lastChangeDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFConceptType cfConceptType = (CFConceptType) o;
    return Objects.equals(identifier, cfConceptType.identifier) &&
        Objects.equals(uri, cfConceptType.uri) &&
        Objects.equals(title, cfConceptType.title) &&
        Objects.equals(keywords, cfConceptType.keywords) &&
        Objects.equals(hierarchyCode, cfConceptType.hierarchyCode) &&
        Objects.equals(description, cfConceptType.description) &&
        Objects.equals(lastChangeDateTime, cfConceptType.lastChangeDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, uri, title, keywords, hierarchyCode, description, lastChangeDateTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFConceptType {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    hierarchyCode: ").append(toIndentedString(hierarchyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastChangeDateTime: ").append(toIndentedString(lastChangeDateTime)).append("\n");
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

