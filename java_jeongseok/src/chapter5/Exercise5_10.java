package chapter5;


public class Exercise5_10 {

	public static void main(String[]  args) {
	
		// 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프록그램을 완성하시오
		// [a][b][c][d][e][f][g][h][i][j][k][l][m][n][o][p][q][r][s][t]
		// [`][~][!][@][#][$][%][^][&][*][(][)][-][_][+][=][|][[][]][{]
		// [u][v][w][x][y][z]
		// [}][;][:][,][.][/]
		// [0][1][2][3][4][5][6][7][8][9]
		// [q][w][e][r][t][y][u][i][o][p] 
		
		char[] abcCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_',
						'+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src = "acb123";
		String result = "";
		
		//문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if(ch >= 'a' && ch <='z') {
				result += abcCode[(int)ch - 97];
			}else {
				result += abcCode[(int)ch - 48];
			}
			
		}
		
		System.out.println("src : " + src);
		System.out.println("result : " + result);
	}	// end of main
}	// end of class
