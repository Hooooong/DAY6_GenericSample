package com.leeheungki.generic;


public class NewList<T> {

	private int length = 0;
	private Object list[];
	
	/*
	 * �����ڷ� �ʱ�ȭ���ش�.
	 */
	public NewList() {
		list = new Object[1];
	}
	
	/*
	 * item �� ���ϴ� �޼ҵ�
	 */
	public void add(T item) {
		Object tempList[] = new Object[length + 1];
		// ������ �ִ� ��ü�� ����
		for(int i =  0; i< list.length; i++) {
			tempList[i] = list[i];
		}
		
		tempList[length] = item;
		list = tempList;
		length++;
	}
	
	/*
	 * item �� �����ϴ� �޼ҵ�
	 */
	public void remove(int num) {
		/*
		 * ������ ��ġ�� size ���� Ŭ ��� ���� �߻�
		 */
		if(num > size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Object tempList[] = new Object[length - 1];
		/*
		 * index -1 ���� ����
		 */
		for(int i= 0; i<num-1; i++) {
			tempList[i] = list[i];
		}
		
		/*
		 * index +1 ���� length���� ����
		 */
		for(int i = num+1; i<list.length; i++) {
			tempList[i-1] = list[i];
		}
		
		list = tempList;
		length--;
	}
	
	/*
	 * item �� �������� �޼ҵ�
	 */
	public T get(int index ) {
		/*
		 * ���������� ��ġ�� size ���� Ŭ ��� ���� �߻�
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
