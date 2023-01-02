package vaild.ValidPratice;

import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Setter
@ToString
public class UserDto {

    @NotNull(message = "번호에 Null값을 넣을 수 없습니다.")
    private long no;

    @NotNull(message = "이름에 Null값을 넣을 수 없습니다.")
    private String name;


    @Min(value = 5000, message = "금액은 5000원 이상이어야 합니다")
    private long Amt;





}
