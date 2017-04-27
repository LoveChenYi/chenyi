package throws包;


/**
 * @author 丰源
 * @date 创建时间：2017年3月21日 上午10:01:12
 * 
 */
public class Student {
	private String name;
	private String sex;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 * @throws Exception 
	 */
	public void setSex(String sex) throws Exception {
		if(!"男".equals(sex) && !"女".equals(sex)){
			//throw：动词，真的会抛出异常
			//方法体中有throw，一定要在方法名后throws异常
			//有throw一定有throws
			//抛出的目的我不处理
			//有异常程序中断
			this.sex = "妖人";
			throw new Exception("妖人快跑");
		}
		this.sex = sex;
	}
	
	
	
}
