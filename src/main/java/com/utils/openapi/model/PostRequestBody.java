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
 * PostRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-16T15:43:22.607710600+01:00[Africa/Lagos]")
public class PostRequestBody   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("content")
  private String content;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonProperty("publisherId")
  private String publisherId;

  public PostRequestBody title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PostRequestBody content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public PostRequestBody createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public PostRequestBody publisherId(String publisherId) {
    this.publisherId = publisherId;
    return this;
  }

  /**
   * Get publisherId
   * @return publisherId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPublisherId() {
    return publisherId;
  }

  public void setPublisherId(String publisherId) {
    this.publisherId = publisherId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRequestBody postRequestBody = (PostRequestBody) o;
    return Objects.equals(this.title, postRequestBody.title) &&
        Objects.equals(this.content, postRequestBody.content) &&
        Objects.equals(this.createdAt, postRequestBody.createdAt) &&
        Objects.equals(this.publisherId, postRequestBody.publisherId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, content, createdAt, publisherId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRequestBody {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    publisherId: ").append(toIndentedString(publisherId)).append("\n");
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

