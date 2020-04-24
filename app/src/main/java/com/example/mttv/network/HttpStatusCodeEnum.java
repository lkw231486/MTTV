package com.example.mttv.network;

/**
 * @author zhangling
 * date 2019-05-14 20:51
 * description: http常见状态码
 */
public enum HttpStatusCodeEnum {
    /**
     * 服务异常类型
     */
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    METHOD_NOT_ALLOWED(405),
    INTERNAL_SERVER_ERROR(500),
    BAC_GATEWAY(502),
    GATEWAY_TIMEOUT(504);

    private int respCode;

    HttpStatusCodeEnum(int respCode) {
        this.respCode = respCode;
    }

    public int getRespCode() {
        return respCode;
    }
}