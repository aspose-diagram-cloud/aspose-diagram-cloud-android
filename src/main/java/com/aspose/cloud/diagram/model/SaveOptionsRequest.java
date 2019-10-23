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
import com.aspose.cloud.diagram.model.SaveOptionsModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SaveOptionsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-08T10:51:41.813+08:00")
public class SaveOptionsRequest {
  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("Folder")
  private String folder = null;

  @SerializedName("SaveOptions")
  private SaveOptionsModel saveOptions = null;

  public SaveOptionsRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public SaveOptionsRequest folder(String folder) {
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @ApiModelProperty(value = "")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public SaveOptionsRequest saveOptions(SaveOptionsModel saveOptions) {
    this.saveOptions = saveOptions;
    return this;
  }

   /**
   * Get saveOptions
   * @return saveOptions
  **/
  @ApiModelProperty(value = "")
  public SaveOptionsModel getSaveOptions() {
    return saveOptions;
  }

  public void setSaveOptions(SaveOptionsModel saveOptions) {
    this.saveOptions = saveOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveOptionsRequest saveOptionsRequest = (SaveOptionsRequest) o;
    return Objects.equals(this.fileName, saveOptionsRequest.fileName) &&
        Objects.equals(this.folder, saveOptionsRequest.folder) &&
        Objects.equals(this.saveOptions, saveOptionsRequest.saveOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, folder, saveOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOptionsRequest {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    saveOptions: ").append(toIndentedString(saveOptions)).append("\n");
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
