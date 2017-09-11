JAVA Programing
----------------------------------------------------
#### 2017.09.11 6일차

###### 소스코드
____________________________________________________

  - `GenericMain.java`

    - NewList 를 생성하여 테스트하는 클래스

    ```java
    package com.leeheungki.generic;

    public class GenericMain {

    	public static void main(String[] args) {

    		NewList<News> newsList = new NewList<>();
    		//NewList<T> 다양한 타입이 들어갈 수 있음

    		System.out.println("삽입 전 크기 : " + newsList.size());
                    // 출력 : 0

    		newsList.add(new News("사진0","이름0","내용0"));

    		System.out.println("삽입 후 크기 : " + newsList.size());
                    // 출력 : 1

    		System.out.println("첫번째 사진명 : " + newsList.get(0).getThumb());
    		System.out.println("첫번째 이름명 : " + newsList.get(0).getName());
    		System.out.println("첫번째 내용명 : " + newsList.get(0).getSummary());

    		//newsList.remove(1);
                    //IndexOutOfBoundsException 오류 발생

    		newsList.remove(0);	//삭제

    		System.out.println("삭제 후 크기 : " + newsList.size());
                    // 출력 : 0
    	}
    }
    ```

  - `NewList.java`

    - ArrayList를 구현한 클래스
    - 추후에 Arrays.copyOf, Arrays.copyOfRange 메소드를 사용해서 수정해보겠음

    ```java
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
    ```
  - `News.java`

    - News Model 을 담당하는 클래스
    - 접근제한자를 private 로 하여 getter, setter 을 생성

    ```java
    package com.leeheungki.generic;

    public class News{
      // 사진
    	String thumb;
      // 이름
      String name;
      // 내용
    	String summary;

    	public News(String thumb, String name, String summary) {
    		super();
    		this.thumb = thumb;
    		this.name = name;
    		this.summary = summary;
    	}

    	public String getThumb() {
    		return thumb;
    	}

    	public void setThumb(String thumb) {
    		this.thumb = thumb;
    	}

    	public String getName() {
    		return name;
    	}

    	public void setName(String name) {
    		this.name = name;
    	}

    	public String getSummary() {
    		return summary;
    	}

    	public void setSummary(String summary) {
    		this.summary = summary;
    	}
    }
    ```
