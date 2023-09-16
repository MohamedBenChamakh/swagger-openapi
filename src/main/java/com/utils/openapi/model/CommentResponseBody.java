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
 * CommentResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-16T11:36:50.510816+01:00[Africa/Luanda]")
public class CommentResponseBody   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonProperty("content")
  private String content;

  @JsonProperty("like")
  private Boolean like;

  public CommentResponseBody id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommentResponseBody createdAt(String createdAt) {
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

  public CommentResponseBody content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CommentResponseBody like(Boolean like) {
    this.like = like;
    return this;
  }

  /**
   * Get like
   * @return like
  */
  @ApiModelProperty(value = "")


  public Boolean getLike() {
    return like;
  }

  public void setLike(Boolean like) {
    this.like = like;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentResponseBody commentResponseBody = (CommentResponseBody) o;
    return Objects.equals(this.id, commentResponseBody.id) &&
        Objects.equals(this.createdAt, commentResponseBody.createdAt) &&
        Objects.equals(this.content, commentResponseBody.content) &&
        Objects.equals(this.like, commentResponseBody.like);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, content, like);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentResponseBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    like: ").append(toIndentedString(like)).append("\n");
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

