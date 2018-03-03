package webuilder.ci2018;

import java.util.ArrayList;
import java.util.List;

import webuilder.ci2018.validator.Validator10;
import webuilder.ci2018.validator.Validator2;
import webuilder.ci2018.validator.Validator3;
import webuilder.ci2018.validator.Validator4;
import webuilder.ci2018.validator.Validator5;
import webuilder.ci2018.validator.Validator6;
import webuilder.ci2018.validator.Validator7;
import webuilder.ci2018.validator.Validator8;
import webuilder.ci2018.validator.Validator9;

/**
 * 验证所有的题目<br>
 * 使用composite模式，组合每个题目的验证器
 * 
 * @author lijian
 *
 */
public class AllValidators implements Validator {

	private List<Validator> validators;

	public AllValidators() {
		validators = new ArrayList<>();
		validators.add(new Validator2());
		validators.add(new Validator3());
		validators.add(new Validator4());
		validators.add(new Validator5());
		validators.add(new Validator6());
		validators.add(new Validator7());
		validators.add(new Validator8());
		validators.add(new Validator9());
		validators.add(new Validator10());
	}

	@Override
	public boolean validate(Result r) {
		for (Validator v : validators) {
			if (!v.validate(r)) {
				return false;
			}
		}
		return true;
	}

}
