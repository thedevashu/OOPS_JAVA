package study.generic;

public class GenericStack<T> {

	/**
	 * @param obj
	 * @param top
	 */
	public GenericStack(T[] obj) {
		
		this.obj = obj;
		this.top = -1;
	}
	public void push(T obj) {
		if(top>this.obj.length) {
			System.out.println("Stack Fuol");
		}
		else 
			this.obj[++top]=obj;

	}
	public T pop() {
		int temp = top;
		if(temp >=0) {
			return obj[top--];
			
		}
		else {
//			System.out.println("Stack EMpty");
			return null;
		}
			
	}
	public void show() {
		for (int i = 0; i <= top; i++) {
			System.out.println(obj[i]);
		}
	}
	T obj[];
	int top;
	
	
}

