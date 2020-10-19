package com.test.movies.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.movies.service.IndexService;
import com.test.movies.service.impl.IndexServiceImpl;
import com.test.movies.utils.IndexData;
import com.test.movies.utils.ResponseEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class IndexController extends HttpServlet {
    private final IndexService service = new IndexServiceImpl();
    public static final String CONTENT_TYPE_JSON = "application/json;charset=utf-8";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResponseEntity<IndexData> responseEntity = null;
        try {
            IndexData indexData = service.getIndexData();
            responseEntity = new ResponseEntity<>(200,"success",indexData);
            resp.setContentType(CONTENT_TYPE_JSON);
        } catch (Exception e){
            e.printStackTrace();
        }
        resp.getWriter().println(JSONObject.toJSONString(responseEntity));
    }
}
