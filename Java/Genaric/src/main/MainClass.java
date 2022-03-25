package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	Generic == template(형태)
		 				: 자료형 변수
		 				: 같은 클래스에서 다양한 자료형을 사용하고 싶은 경우, 설정하는 요소
		 */
		Box<Integer> box = new Box<Integer>(123);
		System.out.println(box.getTemp());
		
		Box<String> sbox = new Box<String>("hello");
		System.out.println(sbox.getTemp());
		
		BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001, "홍길동");
		System.out.println(bmap.getKey()+"\n"+bmap.getValue());
	}

}


class Box<T>{
	T temp;
	
	public Box(T temp) {
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
}


class BoxMap<KEY, VALUE>{
	KEY key;
	VALUE value;
	
	public BoxMap(KEY key, VALUE value) {
		this.key = key;
		this.value = value;
	}

	public KEY getKey() {
		return key;
	}

	public void setKey(KEY key) {
		this.key = key;
	}

	public VALUE getValue() {
		return value;
	}

	public void setValue(VALUE value) {
		this.value = value;
	}
	
	
}