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
 * CommentRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-16T17:12:39.115251300+01:00[Africa/Lagos]")
public class CommentRequestBody   {
  @JsonProperty("postId")
  private String postId;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonProperty("content")
  private String content;

  @JsonProperty("like")
  private Boolean like;

  public CommentRequestBody postId(String postId) {
    this.postId = postId;
    return this;
  }

  /**
   * Get postId
   * @return postId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }

  public CommentRequestBody createdAt(String createdAt) {
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

  public CommentRequestBody content(String content) {
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

  public CommentRequestBody like(Boolean like) {
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
    CommentRequestBody commentRequestBody = (CommentRequestBody) o;
    return Objects.equals(this.postId, commentRequestBody.postId) &&
        Objects.equals(this.createdAt, commentRequestBody.createdAt) &&
        Objects.equals(this.content, commentRequestBody.content) &&
        Objects.equals(this.like, commentRequestBody.like);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postId, createdAt, content, like);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentRequestBody {\n");
    
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
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

