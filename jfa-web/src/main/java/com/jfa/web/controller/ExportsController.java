/*
 * Copyright (c) 2016. Bond(China), java freestyle app
 */

package com.jfa.web.controller;

import com.jfa.commons.common.BaseController;
import com.jfa.commons.exception.ControllerException;
import com.jfa.commons.util.WebBook;
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

    @RequestMapping(method = RequestMethod.GET)
    public void exports(HttpServletRequest request, HttpServletResponse response) throws ControllerException {

        try {

            WebBook book = new WebBook();
            book.setFileName("一生一世.xls");
            book.setTemplateFile(new File(this.getClass().getClassLoader().getResource("").getPath() + "template/template.xls"));
            book.setContentType("application/vnd.ms-excel ");

            Map<String, Object> rs = new HashMap<String, Object>();
            List list = new ArrayList();
            DemoBean demoBean1 = new DemoBean();
            demoBean1.setId("01");
            demoBean1.setName("中国");

            DemoBean demoBean3 = new DemoBean();
            demoBean3.setId("0101");
            demoBean3.setName("北京");
            DemoBean demoBean4 = new DemoBean();
            demoBean4.setId("0102");
            demoBean4.setName("上海");
            demoBean1.getSiblings().add(demoBean3);
            demoBean1.getSiblings().add(demoBean4);

            DemoBean demoBean2 = new DemoBean();
            demoBean2.setId("02");
            demoBean2.setName("美国");
            DemoBean demoBean5 = new DemoBean();
            demoBean5.setId("0201");
            demoBean5.setName("纽约");
            DemoBean demoBean6 = new DemoBean();
            demoBean6.setId("0202");
            demoBean6.setName("华盛顿");
            demoBean2.getSiblings().add(demoBean5);
            demoBean2.getSiblings().add(demoBean6);

            list.add(demoBean1);
            list.add(demoBean2);
            rs.put("result", list);
            book.export(rs, request, response);

        } catch (Exception e) {
            throw new ControllerException(e);
        }
    }
}
