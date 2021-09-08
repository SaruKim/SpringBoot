package test.lxl.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 在编译阶段会根据注解自动生成对应的方法；
 * Data包含get/set/hashCode/equals/toString等方法
 * @author Administrator
 */
@Data
@Table(name = "tb_user")
public class User {
	@Id
	//主键回填
	@KeySql(useGeneratedKeys = true)
	private Long id;
	//@Column
	//user_name --> userName
	private String userName;
	private String password;
	private String name;
	private Integer age;
	private Integer sex;
	private LocalDate birthday;
	private String note;
	private LocalDateTime created;
	private LocalDateTime updated;
}
