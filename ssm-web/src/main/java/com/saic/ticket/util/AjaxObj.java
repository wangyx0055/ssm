/*
 * Copyright (C), 2013-2013, 上海汽车集团股份有限公司
 * FileName: AjaxObj.java
 * Author:   v_xueyinhao01
 * Date:     2013年12月17日 下午5:41:46
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.saic.ticket.util;


/**
 * 前台Ajax请求返回json公共类 <br>
 * 
 * 
 * @author pengqaing
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AjaxObj {
    /**
     * 请求成功常量
     */
    public static final int SUCCESS = 1;
    /**
     * 请求失败常量
     */
    public static final int FAILD = 0;
    /**
     * 返回结果 0表示失败 1表示成功
     */
    private int result;
    /**
     * 返回提示信息
     */
    private String msg;
    /**
     * 附加对象，用来存储一些特定的返回信息
     */
    private Object obj;

    /**
     * 构造函数
     */
    public AjaxObj() {
        result = AjaxObj.SUCCESS;
    }

    /**
     * @return result 调用结果
     */
    public int getResult() {
        return result;
    }

    /**
     * @param result 调用结果
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * @return msg 提示信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg 提示信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return obj 附加对象
     */
    public Object getObj() {
        return obj;
    }

    /**
     * @param obj 附加对象
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }
}
