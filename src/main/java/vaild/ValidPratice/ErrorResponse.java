package vaild.ValidPratice;

import lombok.Getter;
import lombok.Setter;

// api 내려줄 에러 형태 정의
@Getter
@Setter
public class ErrorResponse {
    // enum 을 이용하여 에러코드 정의하기
    private  String code;
    // 어떤 에러인지 간단히 넣어지구
    private  String description;
    // 에러 세부내용 넣어주기
    private  String detail;

    public ErrorResponse(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public ErrorResponse(String code, String description, String detail) {
        this.code = code;
        this.description = description;
        this.detail = detail;
    }
}
