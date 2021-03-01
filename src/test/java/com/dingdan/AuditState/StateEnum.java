package com.dingdan.AuditState;

/**
 * 状态枚举类
 *
 * @author Administrator
 */
public enum StateEnum {


    GENERATE("0", "新建"),

    WAIT_FOR_PAY("1", "待付款"),

    WAIT_FOR_FAHUO("2", "待发货"),

    YI_FAHUO("3", "已发货"),

    YI_WANGCHENG("4", "已完成"),

    TUIKUANG("5", "退款中"),

    TUIHUO("6", "退货"),

    CLOSE("7", "已关闭");


    private String key;
    private String value;

    StateEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
