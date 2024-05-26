package com.zaza.auth.global.common.code;

import lombok.Getter;

@Getter
public enum ResponseCode {

    SUCCESS(2000, "response success", "응답에 성공했습니다."),
    SERVER_ERROR(5000, "server error", "요청에 실패했습니다."),
    BAD_REQUEST(4010, "bad request", "요청값을 확인해주세요."),
    ;

    private int status;
    private String label;
    private String message;

    ResponseCode(int status, String label, String message) {
        this.status = status;
        this.label = label;
        this.message = message;
    }
}
