package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第7题答案
 * 
 * @author lijian
 *
 */
public class Validator7 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(6);

		int a = 0, b = 0, c = 0, d = 0;
		for (int i = 0; i < Result.COUNT; i++) {
			char ch = r.getAnswer(i);
			if (ch == 'A') {
				a++;
			} else if (ch == 'B') {
				b++;
			} else if (ch == 'C') {
				c++;
			} else if (ch == 'D') {
				d++;
			}
		}

		if (x == 'A') {
			return c < a && c < b && c < d;
		}
		if (x == 'B') {
			return b < a && b < c && b < d;
		}
		if (x == 'C') {
			return a < b && a < c && a < d;
		}
		if (x == 'D') {
			return d < a && d < b && d < c;
		}
		return false;
	}

}
