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

package com.aspose.cloud.diagram.api;

import java.io.File;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import com.aspose.cloud.diagram.client.ApiException;
import com.aspose.cloud.diagram.model.FileFormatRequest;
import com.aspose.cloud.diagram.model.SaaSposeResponse;
import com.aspose.cloud.diagram.model.SaveResponse;

/**
 * API tests for DiagramFileApi
 */
public class DiagramFileApiTest {

	private final DiagramFileApi api = new DiagramFileApi();

	private String TEMPFOLDER = "Temp";
	private String File_TEST_GET = "file_get_1.vdx";

	/**
	 * Read document info or export.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void diagramFileGetDiagramTest() throws ApiException {
		String name = File_TEST_GET;
		String format = "pdf";
		String folder = TEMPFOLDER;
		String storage = null;
		api.setApiClient(DiagramApiUtil.Ready());
		File response = api.diagramFileGetDiagram(name, format, folder, storage);
		assertTrue(response!=null);
	}

	/**
	 * Convert document and save result to storage.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void diagramFilePostSaveAsTest() throws ApiException {
		String name = File_TEST_GET;
		FileFormatRequest format = new FileFormatRequest();
		format.setFormat("pdf");
		
		String newfilename = "file_saveas_android.pdf";
		String folder = TEMPFOLDER;
		Boolean isOverwrite = true;
		String storage = null;
		api.setApiClient(DiagramApiUtil.Ready());
		SaveResponse response = api.diagramFilePostSaveAs(name, format, newfilename, folder, isOverwrite, storage);
        assertTrue(response!=null);
	}

	/**
	 * Create new diagram and save result to storage.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void diagramFilePutCreateTest() throws ApiException {
		String name = "file_create_android.vdx";
		String folder = TEMPFOLDER;
		Boolean isOverwrite = true;
		String storage = null;
		api.setApiClient(DiagramApiUtil.Ready());
		SaaSposeResponse response = api.diagramFilePutCreate(name, folder, isOverwrite, storage);
        assertTrue(response!=null);
	}

	/**
	 * Upload file and save result to storage.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void diagramFilePutUploadTest() throws ApiException {
		String name = "file_upload_android.pdf";
		String folder = TEMPFOLDER;
		Boolean isOverwrite = true;
		String storage = null;
		String localFilePath="/mnt/sdcard/android.vdx"; //Please Ensure App access to storage
		api.setApiClient(DiagramApiUtil.Ready());
		SaaSposeResponse response = api.diagramFilePutUpload(localFilePath,name, folder, isOverwrite, storage);
        assertTrue(response!=null);
	}

}