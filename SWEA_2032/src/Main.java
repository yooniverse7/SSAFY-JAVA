import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
	static int[][] d = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}}; // ��, �Ʒ�, ������, ����

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N]; // ��
		int max = 0; // �ִ� 
		
		for(int i = 0; i<N; i++) { //����� ä���
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				int sum = arr[i][j];
				for(int z = 0; z<4; z++) { // �ֺ� ���� �� ���ϱ�
					int dx = d[z][0] + i;
					int dy = d[z][1] + j;
					if(dx<N && dx>=0 && dy<N && dy>=0) {
						sum += arr[dx][dy];
					}
					
				}
				
				if(max < sum) { 
					max = sum;
				}
			}
		}
		
		System.out.println(max);
	}

}
