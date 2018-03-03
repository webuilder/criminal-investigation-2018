package webuilder.ci2018;

/**
 * 答案验证器，用于验证答案是否满足题目要求
 * 
 * @author lijian
 *
 */
public interface Validator {
	boolean validate(Result r);
}
