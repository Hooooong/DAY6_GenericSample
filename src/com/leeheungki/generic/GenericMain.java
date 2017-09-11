package com.leeheungki.generic;

public class GenericMain {

	public static void main(String[] args) {

		NewList<News> newsList = new NewList<>();
		// NewList<T> 다양한 타입이 들어갈 수 있음

		System.out.println("삽입 전 크기 : " + newsList.size());
		// 출력 : 0

		newsList.add(new News("사진0", "이름0", "내용0"));

		System.out.println("삽입 후 크기 : " + newsList.size());

		// 출력 : 1

		System.out.println("첫번째 사진명 : " + newsList.get(0).getThumb());
		System.out.println("첫번째 이름명 : " + newsList.get(0).getName());
		System.out.println("첫번째 내용명 : " + newsList.get(0).getSummary());

		// newsList.remove(1);
		// IndexOutOfBoundsException 오류 발생

		newsList.remove(0); // 삭제

		System.out.println("삭제 후 크기 : " + newsList.size());
		// 출력 : 0
	}
}