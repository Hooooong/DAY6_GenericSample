package com.leeheungki.generic;


public class NewList<T> {

	private int length = 0;
	private Object list[];
	
	/*
	 * 생성자로 초기화해준다.
	 */
	public NewList() {
		list = new Object[1];
	}
	
	/*
	 * item 을 더하는 메소드
	 */
	public void add(T item) {
		Object tempList[] = new Object[length + 1];
		// 기존에 있던 객체들 복사
		for(int i =  0; i< list.length; i++) {
			tempList[i] = list[i];
		}
		
		tempList[length] = item;
		list = tempList;
		length++;
	}
	
	/*
	 * item 을 삭제하는 메소드
	 */
	public void remove(int num) {
		/*
		 * 삭제의 위치가 size 보다 클 경우 예외 발생
		 */
		if(num > size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Object tempList[] = new Object[length - 1];
		/*
		 * index -1 까지 복사
		 */
		for(int i= 0; i<num-1; i++) {
			tempList[i] = list[i];
		}
		
		/*
		 * index +1 부터 length까지 복사
		 */
		for(int i = num+1; i<list.length; i++) {
			tempList[i-1] = list[i];
		}
		
		list = tempList;
		length--;
	}
	
	/*
	 * item 을 가져오는 메소드
	 */
	public T get(int index ) {
		/*
		 * 가져오려는 위치가 size 보다 클 경우 예외 발생
		 */
		if(index > length) {
			throw new IndexOutOfBoundsException();
		}
		return (T)list[index];
	}
	
	public int size() {
		return length;
	}
	
}
