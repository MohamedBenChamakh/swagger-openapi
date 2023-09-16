package com.utils.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PostTypeResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-16T16:01:36.132603800+01:00[Africa/Lagos]")
public class PostTypeResponseBody   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("iconUrl")
  private String iconUrl;

  public PostTypeResponseBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostTypeResponseBody iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * Get iconUrl
   * @return iconUrl
  */
  @ApiModelProperty(value = "")


  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTypeResponseBody postTypeResponseBody = (PostTypeResponseBody) o;
    return Objects.equals(this.name, postTypeResponseBody.name) &&
        Objects.equals(this.iconUrl, postTypeResponseBody.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, iconUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTypeResponseBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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

