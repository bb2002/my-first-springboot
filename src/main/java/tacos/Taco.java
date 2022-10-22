package tacos;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	@NotNull()
	@Size(min=5, message="이름은 최소한 5글자 이상으로 해주세요.")
	private String name;
	
	@Size(min=1, message="아무것도 없는 타코는 드실 수 없습니다.")
	private List<String> ingredients;
}
