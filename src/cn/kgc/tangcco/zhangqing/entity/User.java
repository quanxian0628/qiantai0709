package cn.kgc.tangcco.zhangqing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int uId;
	private String uName;
	private String uPwd;
}
