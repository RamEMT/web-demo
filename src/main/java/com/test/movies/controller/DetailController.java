package com.test.movies.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.movies.entity.TFilm;
import com.test.movies.service.DetailService;
import com.test.movies.service.impl.DetailServiceImpl;
import com.test.movies.utils.ResponseEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DetailController extends HttpServlet {
    private final DetailService service = new DetailServiceImpl();
    public static final String CONTENT_TYPE_JSON = "application/json;charset=utf-8";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("filmId");
        ResponseEntity<TFilm> responseEntity = null;
        try {
            TFilm film = service.getFilm(id);
            responseEntity = new ResponseEntity<>(200,"success",film);
            resp.setContentType(CONTENT_TYPE_JSON);
        } catch (Exception e){
            e.printStackTrace();
        }
        resp.getWriter().println(JSONObject.toJSONString(responseEntity));
    }
}
