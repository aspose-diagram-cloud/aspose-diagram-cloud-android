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
import com.aspose.cloud.diagram.model.PageSize;
import com.aspose.cloud.diagram.model.RectangleF;
import com.aspose.cloud.diagram.model.RenderingSaveOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HTMLSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-08T10:51:41.813+08:00")
public class HTMLSaveOptions extends RenderingSaveOptions {
  @SerializedName("PageCount")
  private Integer pageCount = null;

  @SerializedName("SaveToolBar")
  private Boolean saveToolBar = null;

  @SerializedName("ExportHiddenPage")
  private Boolean exportHiddenPage = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("SaveForegroundPagesOnly")
  private Boolean saveForegroundPagesOnly = null;

  @SerializedName("Title")
  private String title = null;

  public HTMLSaveOptions pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public HTMLSaveOptions saveToolBar(Boolean saveToolBar) {
    this.saveToolBar = saveToolBar;
    return this;
  }

   /**
   * Get saveToolBar
   * @return saveToolBar
  **/
  @ApiModelProperty(value = "")
  public Boolean isSaveToolBar() {
    return saveToolBar;
  }

  public void setSaveToolBar(Boolean saveToolBar) {
    this.saveToolBar = saveToolBar;
  }

  public HTMLSaveOptions exportHiddenPage(Boolean exportHiddenPage) {
    this.exportHiddenPage = exportHiddenPage;
    return this;
  }

   /**
   * Get exportHiddenPage
   * @return exportHiddenPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isExportHiddenPage() {
    return exportHiddenPage;
  }

  public void setExportHiddenPage(Boolean exportHiddenPage) {
    this.exportHiddenPage = exportHiddenPage;
  }

  public HTMLSaveOptions pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Get pageIndex
   * @return pageIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public HTMLSaveOptions saveForegroundPagesOnly(Boolean saveForegroundPagesOnly) {
    this.saveForegroundPagesOnly = saveForegroundPagesOnly;
    return this;
  }

   /**
   * Get saveForegroundPagesOnly
   * @return saveForegroundPagesOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isSaveForegroundPagesOnly() {
    return saveForegroundPagesOnly;
  }

  public void setSaveForegroundPagesOnly(Boolean saveForegroundPagesOnly) {
    this.saveForegroundPagesOnly = saveForegroundPagesOnly;
  }

  public HTMLSaveOptions title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTMLSaveOptions htMLSaveOptions = (HTMLSaveOptions) o;
    return Objects.equals(this.pageCount, htMLSaveOptions.pageCount) &&
        Objects.equals(this.saveToolBar, htMLSaveOptions.saveToolBar) &&
        Objects.equals(this.exportHiddenPage, htMLSaveOptions.exportHiddenPage) &&
        Objects.equals(this.pageIndex, htMLSaveOptions.pageIndex) &&
        Objects.equals(this.saveForegroundPagesOnly, htMLSaveOptions.saveForegroundPagesOnly) &&
        Objects.equals(this.title, htMLSaveOptions.title) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageCount, saveToolBar, exportHiddenPage, pageIndex, saveForegroundPagesOnly, title, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTMLSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    saveToolBar: ").append(toIndentedString(saveToolBar)).append("\n");
    sb.append("    exportHiddenPage: ").append(toIndentedString(exportHiddenPage)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    saveForegroundPagesOnly: ").append(toIndentedString(saveForegroundPagesOnly)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
