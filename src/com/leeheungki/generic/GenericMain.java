package com.leeheungki.generic;

public class GenericMain {

	public static void main(String[] args) {

		NewList<News> newsList = new NewList<>();
		// NewList<T> �پ��� Ÿ���� �� �� ����

		System.out.println("���� �� ũ�� : " + newsList.size());
		// ��� : 0

		newsList.add(new News("����0", "�̸�0", "����0"));

		System.out.println("���� �� ũ�� : " + newsList.size());

		// ��� : 1

		System.out.println("ù��° ������ : " + newsList.get(0).getThumb());
		System.out.println("ù��° �̸��� : " + newsList.get(0).getName());
		System.out.println("ù��° ����� : " + newsList.get(0).getSummary());

		// newsList.remove(1);
		// IndexOutOfBoundsException ���� �߻�

		newsList.remove(0); // ����

		System.out.println("���� �� ũ�� : " + newsList.size());
		// ��� : 0
	}
}