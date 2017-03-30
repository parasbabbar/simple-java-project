package com.csye6225;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.joda.time.DateTime;

public class HelloWorldServlet extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DateTime dateTime = new DateTime();

        String message = "Current date time is " + dateTime;

        LOGGER.info("This is INFO log message");
        LOGGER.warn("This is WARN log message");
        LOGGER.error("This is ERROR log message");
        LOGGER.debug("This is DEBUG log message");

//        try{
//            throw new Exception("This is dummy exception.");
//        } catch (Exception e) {
//            LOGGER.error(e.getMessage(),e);
//        }

        resp.getOutputStream().write(message.getBytes());
    }
}
