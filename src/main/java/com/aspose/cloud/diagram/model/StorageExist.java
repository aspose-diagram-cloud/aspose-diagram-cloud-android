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
 * Storage exists
 */
@ApiModel(description = "Storage exists")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-08T10:51:41.813+08:00")
public class StorageExist {
  @SerializedName("Exists")
  private Boolean exists = null;

  public StorageExist exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * Shows that the storage exists.             
   * @return exists
  **/
  @ApiModelProperty(required = true, value = "Shows that the storage exists.             ")
  public Boolean isExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageExist storageExist = (StorageExist) o;
    return Objects.equals(this.exists, storageExist.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageExist {\n");
    
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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

