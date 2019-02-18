package com.xinghuo.commonlib.app.network;

public class ApiException extends Exception{

    public static final String CODE_OK = "000";
    public static final String CODE_ANALYZE_ERROR = "001";
    public static final String CODE_PARAMS_ERROR = "002";
    public static final String CODE_SERVER_ERROR = "005";
    public static final String CODE_PROVIDER_UPDATE = "006";
    public static final String CODE_UNKNOW_ERROR = "999";
    public static final String CODE_NULL_RESPONSE = "007";//服务器返回的response为null

    public static final String MSG_NULL_RESPONSE = "服务器返回数据为空";//服务器返回的response为null


    public ApiException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public ApiException(String code) {
        super(getMsg(code));
        this.code = code;
    }

    private static String getMsg(String code) {
        String msg = "UNKNOW";
        switch (code) {
            case CODE_NULL_RESPONSE:
                msg = MSG_NULL_RESPONSE;
                break;
        }
        return msg;
    }


    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
