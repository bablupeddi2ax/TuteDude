package Strings;

public class UpperToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "akjhsgfbakuiIJHSWAOFILWHASL";
		String res = caseChange(a);
		System.out.println(res);
	}	
	public static String caseChange(String a) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<a.length();i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z') {
				sb.append((char)(a.charAt(i)+32));
			}
			else if(a.charAt(i)>='a' && a.charAt(i)<='z') {
				sb.append((char)(a.charAt(i)-32));
			}
		}
		String after = sb.toString();
		return after;
	}
}	
