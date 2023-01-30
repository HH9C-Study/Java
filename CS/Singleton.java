
class Singleton {
    //전역 클래스
    private static class singleInstanceHolder {
        //전역 변수로 상수 INSTANCE(상수명) -> 여기서 만드는 new Singleton(); 이라는 인스턴스의 주소가 들어감
        private static final Singleton INSTANCE = new Singleton();
    }
    //위 클래스의 전역 상수 INSTANCE를 호출하는 함수 -> 아까 만든 new Singleton() 을 호출
    public static Singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if(a==b) {
            System.out.println(true);
        }
    }
}