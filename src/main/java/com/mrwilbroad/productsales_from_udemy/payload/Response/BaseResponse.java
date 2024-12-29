package com.mrwilbroad.productsales_from_udemy.payload.Response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {

    private T data;
    private List<T> dataList;
    private String message;
    private int code;
    private boolean error;


    public BaseResponse(String message , int code, boolean error , T data) {
        this.data = data;
        this.message = message;
        this.code = code;
        this.error = error;
    }

    public BaseResponse(String message , int code , boolean error , List<T> dataList) {
        this.message = message;
        this.code = code;
        this.error = error;
        this.dataList = dataList;
    }

    public BaseResponse(String message , int code , boolean error) {
        this.message = message;
        this.code = code;
        this.error = error;
    }

    @Override
    public String toString() {
        return "Response{" +
                "error=" + error +
                ", code=" + code +
                ", data=" + data +
                ", dataList=" + dataList +
                ", message='" + message + '\'' +
                '}';
    }




}
