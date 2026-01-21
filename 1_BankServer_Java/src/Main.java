import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("=== 은행 서버 가동 시작 (포트: 9000) ===");

        // 1. 9000번 포트로 문 열고 기다리기 (가게 오픈)
        ServerSocket server = new ServerSocket(9000);

        while (true) {
            System.out.println("손님(ATM) 기다리는 중...");

            // 2. 누군가 접속할 때까지 여기서 멈춰있음 (전화 올 때까지 대기)
            Socket client = server.accept();

            // 3. 접속되면 이 줄이 실행
            System.out.println("ATM이 접속했습니다 IP: " + client.getInetAddress());
        }
    }
}