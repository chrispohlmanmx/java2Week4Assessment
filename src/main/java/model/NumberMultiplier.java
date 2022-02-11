/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Feb 10, 2022
 */
package model;

/**
 * 
 */
public class NumberMultiplier {
	private int num1;
	private int num2;
	private int num3;
	private int product;
	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	/**
	 * @return the num3
	 */
	public int getNum3() {
		return num3;
	}
	/**
	 * @param num3 the num3 to set
	 */
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	
	
	/**
	 * @return the sum
	 */
	public int getProduct() {
		return product;
	}
	/**
	 * @param sum the sum to set
	 */
	public void setProduct() {
		this.product = this.num1 * this.num2 * this.num3;
	}
	public NumberMultiplier() {
		super();
		
	}
	
	public NumberMultiplier(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		setProduct();
	}
	@Override
	public String toString() {
		return "NumberAdder [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", product=" + product + "]";
	}
}
