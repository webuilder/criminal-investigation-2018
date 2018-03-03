package webuilder.ci2018;

/**
 * 2018年刑侦科目推理试题解答
 * 
 * @author lijian
 *
 */
public class CriminalInvestigation2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validator validator = new AllValidators();
		for (int i = 0; i < (1 << 20); i++) {
			Result r = new Result(i);
			if (validator.validate(r)) {
				System.out.println(r);
				// break;
				// 不退出循环，继续查找是否有其他的答案组合
			}
		}
	}

}
