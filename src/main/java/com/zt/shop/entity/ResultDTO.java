package com.zt.shop.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @ClassName ResultDTO
 * @Description TODO
 * @Date 2021/5/13 16:28
 * @Version 1.0
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultDTO<T> implements Serializable {

    public final static int DEFAULT_SUCCESS_CODE = 200;
    public final static int DEFAULT_ERROR_CODE = 500;
    public final static String DEFAULT_SUCCESS_MESSAGE = "操作成功!";
    public final static String DEFAULT_ERROR_MESSAGE = "操作失败！";
    /**
     * 登录失败提示
     */
    public final static String LOGIN_FAIL = "登录异常！";

    private int code;
    private String message;
    private Object data;

    public static ResultDTO getSuccess() {
        ResultDTO res = new ResultDTO(DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MESSAGE, null);
        return res;
    }

    public static ResultDTO getSuccess(Object data) {
        ResultDTO res = new ResultDTO(DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MESSAGE, data);
        return res;
    }

    public static ResultDTO getSuccess(Object data, String message) {
        ResultDTO res = new ResultDTO(DEFAULT_SUCCESS_CODE, message, data);
        return res;
    }

    public static ResultDTO getSuccess(int code, Object data) {
        ResultDTO res = new ResultDTO(code, DEFAULT_SUCCESS_MESSAGE, data);
        return res;
    }

    public static ResultDTO getSuccess(int code, String message, Object data) {
        ResultDTO res = new ResultDTO(code, message, data);
        return res;
    }

    public static ResultDTO getFailure(int code, String message) {
        ResultDTO res = new ResultDTO(code, message, null);
        return res;
    }

    public static ResultDTO getFailure(String message) {
        ResultDTO res = new ResultDTO(DEFAULT_ERROR_CODE, message, null);
        return res;
    }

    public static ResultDTO getFailure() {
        ResultDTO res = new ResultDTO(DEFAULT_ERROR_CODE, DEFAULT_ERROR_MESSAGE, null);
        return res;
    }

    private ResultDTO(int code, String message, Object data) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ResultDTO() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{code:" + code + ", message:\"" + message + "\", data:" + data + "}";
    }

}
