
public class Main01 {
	public static void main(String[] args) {
		new 자동차().시동();
		new 청소기().시동();
		new 가습기().가동();
		new tv().전원켜기();
		new 컴퓨터().연결();
		
	}

}

class 자동차 {
	void 시동() {
		System.out.println("시동이 걸렸습니다.");
	}
}

class 청소기 {
	void 시동() {
		System.out.println("청소를 시작합니다.");
	}
}

class 가습기 {
	void 가동() {
		System.out.println("가습기에 물을 채워주세요.");
	}
}

class tv {
	void 전원켜기() {
		System.out.println("전원이 켜졌습니다.");
	}
}

class 컴퓨터 {
	void 연결() {
		System.out.println("인터넷에 연결되었습니다.");
	}
}
