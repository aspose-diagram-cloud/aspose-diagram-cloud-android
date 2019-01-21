/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.diagram.model;

import java.util.Objects;
import com.aspose.cloud.diagram.model.PageModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DiagramModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-26T16:31:47.542+08:00")
public class DiagramModel {
  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("Pages")
  private List<PageModel> pages = null;

  public DiagramModel fileName(String fileName) {
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

  public DiagramModel pages(List<PageModel> pages) {
    this.pages = pages;
    return this;
  }

  public DiagramModel addPagesItem(PageModel pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PageModel>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @ApiModelProperty(value = "")
  public List<PageModel> getPages() {
    return pages;
  }

  public void setPages(List<PageModel> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagramModel diagramModel = (DiagramModel) o;
    return Objects.equals(this.fileName, diagramModel.fileName) &&
        Objects.equals(this.pages, diagramModel.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagramModel {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

