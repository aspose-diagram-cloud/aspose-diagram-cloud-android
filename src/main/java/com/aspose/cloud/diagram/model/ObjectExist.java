/*
 * Aspose.Diagram Cloud API Reference
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.diagram.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object exists
 */
@ApiModel(description = "Object exists")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-08T10:51:41.813+08:00")
public class ObjectExist {
  @SerializedName("Exists")
  private Boolean exists = null;

  @SerializedName("IsFolder")
  private Boolean isFolder = null;

  public ObjectExist exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * Indicates that the file or folder exists.
   * @return exists
  **/
  @ApiModelProperty(required = true, value = "Indicates that the file or folder exists.")
  public Boolean isExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }

  public ObjectExist isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

   /**
   * True if it is a folder, false if it is a file.
   * @return isFolder
  **/
  @ApiModelProperty(required = true, value = "True if it is a folder, false if it is a file.")
  public Boolean isIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectExist objectExist = (ObjectExist) o;
    return Objects.equals(this.exists, objectExist.exists) &&
        Objects.equals(this.isFolder, objectExist.isFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exists, isFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectExist {\n");
    
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

