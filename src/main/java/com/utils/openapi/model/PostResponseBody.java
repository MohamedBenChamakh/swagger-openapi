package com.utils.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.utils.openapi.model.CommentResponseBody;
import com.utils.openapi.model.PostTypeResponseBody;
import com.utils.openapi.model.PublisherResponseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PostResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-16T16:01:36.132603800+01:00[Africa/Lagos]")
public class PostResponseBody   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("publisher")
  private PublisherResponseBody publisher;

  @JsonProperty("title")
  private String title;

  @JsonProperty("type")
  private PostTypeResponseBody type;

  @JsonProperty("content")
  private String content;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonProperty("comments")
  @Valid
  private List<CommentResponseBody> comments = null;

  public PostResponseBody id(String id) {
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

  public PostResponseBody publisher(PublisherResponseBody publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Get publisher
   * @return publisher
  */
  @ApiModelProperty(value = "")

  @Valid

  public PublisherResponseBody getPublisher() {
    return publisher;
  }

  public void setPublisher(PublisherResponseBody publisher) {
    this.publisher = publisher;
  }

  public PostResponseBody title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PostResponseBody type(PostTypeResponseBody type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public PostTypeResponseBody getType() {
    return type;
  }

  public void setType(PostTypeResponseBody type) {
    this.type = type;
  }

  public PostResponseBody content(String content) {
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

  public PostResponseBody createdAt(String createdAt) {
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

  public PostResponseBody comments(List<CommentResponseBody> comments) {
    this.comments = comments;
    return this;
  }

  public PostResponseBody addCommentsItem(CommentResponseBody commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CommentResponseBody> getComments() {
    return comments;
  }

  public void setComments(List<CommentResponseBody> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostResponseBody postResponseBody = (PostResponseBody) o;
    return Objects.equals(this.id, postResponseBody.id) &&
        Objects.equals(this.publisher, postResponseBody.publisher) &&
        Objects.equals(this.title, postResponseBody.title) &&
        Objects.equals(this.type, postResponseBody.type) &&
        Objects.equals(this.content, postResponseBody.content) &&
        Objects.equals(this.createdAt, postResponseBody.createdAt) &&
        Objects.equals(this.comments, postResponseBody.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, publisher, title, type, content, createdAt, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostResponseBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

