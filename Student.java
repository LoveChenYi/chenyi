package throws��;


/**
 * @author ��Դ
 * @date ����ʱ�䣺2017��3��21�� ����10:01:12
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
		if(!"��".equals(sex) && !"Ů".equals(sex)){
			//throw�����ʣ���Ļ��׳��쳣
			//����������throw��һ��Ҫ�ڷ�������throws�쳣
			//��throwһ����throws
			//�׳���Ŀ���Ҳ�����
			//���쳣�����ж�
			this.sex = "����";
			throw new Exception("���˿���");
		}
		this.sex = sex;
	}
	
	
	
}
