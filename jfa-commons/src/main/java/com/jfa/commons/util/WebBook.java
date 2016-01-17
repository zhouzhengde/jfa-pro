/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.commons.util;

import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Map;

/**
 * To Export data to a format file
 */
public class WebBook {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebBook.class);

    private String fileName;

    private String contentType;

    private File templateFile;


    public void export(Map<String, Object> dataSource, HttpServletRequest request, HttpServletResponse response) {

        if (templateFile != null && !templateFile.exists()) {
            return;
        }

        InputStream in = null;
        OutputStream out = null;

        try {

            response.reset();
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            response.setContentType(getContentType());

            in = new BufferedInputStream(new FileInputStream(templateFile));
            out = response.getOutputStream();

            XLSTransformer transformer = new XLSTransformer();
            Workbook workbook = transformer.transformXLS(in, dataSource);
            workbook.write(out);
            out.flush();

        } catch (IOException e) {
            LOGGER.error("[WebBook export]: Occur an error", e);
        } catch (InvalidFormatException e) {
            LOGGER.error("[WebBook export]: Occur an error", e);
        } finally {
            FileUtils.close(in);
            FileUtils.close(out);
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setTemplateFile(File templateFile) {
        this.templateFile = templateFile;
    }

    public String getContentType() {
        if (contentType == null || contentType.isEmpty()) {
            return "application/octet-stream";
        }
        return contentType;
    }
}