/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.web.controller;

import com.jfa.commons.common.BaseController;
import com.jfa.commons.exception.ControllerException;
import com.jfa.commons.util.WebBook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("exports")
public class ExportsController extends BaseController {

    private static List<AfficheType> list = new ArrayList<AfficheType>();

    static {

        list.add(new AfficheType("01", "01001", "01001001", "He1", "H1", "H3", "材料", "xxxx"));
        list.add(new AfficheType("01", "01001", "01001001", "He2", "H2", "H3", "材料", "xxx1x1"));
        list.add(new AfficheType("01", "01001", "01001001", "He3", "H3", "H3", "材料", "xxxx2"));
        list.add(new AfficheType("01", "01001", "01001001", "He", "H4", "H3", "材料", "xxxx3"));
        list.add(new AfficheType("01", "01001", "01001001", "He", "H5", "H3", "材料", "xxxx4"));
        list.add(new AfficheType("01", "01001", "01001001", "He", "H2", "H3", "材料", "xxxx7"));
        list.add(new AfficheType("01", "01001", "01001001", "He", "H2", "H3", "材料", "xxxx5"));
        list.add(new AfficheType("01", "01001", "01001001", "He", "H2", "H3", "披露", "xxxx8"));
        list.add(new AfficheType("01", "01001", "01001001", "He", "H2", "H3", "披露", "xxxx9"));
        list.add(new AfficheType("01", "01001", "01001001", "He", "H2", "H3", "披露", "xxxx10"));
        list.add(new AfficheType("01", "01001", "01001001", "He", "H2", "H3", "材料", "xxxx11"));

        list.add(new AfficheType("01", "01002", "01002001", "He", "H21", "H3", "材料", "2xxxxx11"));
        list.add(new AfficheType("01", "01002", "01002001", "He", "H22", "H3", "材料", "2xxxx11"));
        list.add(new AfficheType("01", "01002", "01002001", "He", "H23", "H3", "材料", "2xxxx11"));
        list.add(new AfficheType("01", "01002", "01002001", "He", "H24", "H3", "披露", "2xxxx11"));
        list.add(new AfficheType("01", "01002", "01002001", "He", "H25", "H3", "披露", "2xxxx11"));


        list.add(new AfficheType("02", "02002", "02002001", "He", "H21", "H3", "材料", "2xxxxx11"));
        list.add(new AfficheType("02", "02002", "02002001", "He", "H22", "H3", "材料", "2xxxx11"));
        list.add(new AfficheType("02", "02002", "02002001", "He", "H23", "H3", "材料", "2xxxx11"));
        list.add(new AfficheType("02", "02002", "02002001", "He", "H24", "H3", "披露", "2xxxx11"));
        list.add(new AfficheType("02", "02002", "02002001", "He", "H25", "H3", "披露", "2xxxx11"));

    }

    @RequestMapping(method = RequestMethod.GET)
    public void exports(HttpServletRequest request, HttpServletResponse response) throws ControllerException {

        try {

            WebBook book = new WebBook();
            book.setFileName("测试数据.xls");
            book.setContentType("application/vnd.ms-excel ");
            book.export(WebBook.FileType.XLS, new WebBook.CustomizeWorkbook() {

                public Workbook customize(Workbook workbook) {

                    short height = 550;
                    int rowNum = 0, colNum = 0;

                    Sheet sheet = workbook.createSheet("Hello");
                    Row row = sheet.createRow(rowNum++);
                    row.createCell(colNum++).setCellValue("大类编号");
                    row.createCell(colNum++).setCellValue("大类名称");
                    row.createCell(colNum++).setCellValue("中类编号");
                    row.createCell(colNum++).setCellValue("中类名称");
                    row.createCell(colNum++).setCellValue("小类编号");
                    row.createCell(colNum++).setCellValue("小类名称");
                    row.createCell(colNum++).setCellValue("报批材料");
                    row.createCell(colNum++).setCellValue("批露要点");
                    row.setHeight(height);

                    for (AfficheType type : list) {
                        colNum = 0;
                        Row dataRow = sheet.createRow(rowNum++);
                        dataRow.createCell(colNum++).setCellValue(type.getAnnCategory1Code());
                        dataRow.createCell(colNum++).setCellValue(type.getAnnCategory1Name());
                        dataRow.createCell(colNum++).setCellValue(type.getAnnCategory2Code());
                        dataRow.createCell(colNum++).setCellValue(type.getAnnCategory2Name());
                        dataRow.createCell(colNum++).setCellValue(type.getAnnCategory3Code());
                        dataRow.createCell(colNum++).setCellValue(type.getAnnCategory3Name());
                        dataRow.createCell(colNum++).setCellValue(type.getContent());
                    }
                    return workbook;
                }
            }, response);

        } catch (Exception e) {
            throw new ControllerException(e);
        }
    }
}
