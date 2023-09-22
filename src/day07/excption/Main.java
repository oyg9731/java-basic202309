package day07.excption;

import day07.exception.LoginUser;
import util.Utility;

public class Main {
    public static void main(String[] args) {
        LoginUser user = new LoginUser("abc123", "1111");

        String id = Utility.input("ID: ");
        String pw = Utility.input("PW: ");

        try {
            String result = user.validate(id, pw);
        } catch (LoginFailException e) {
//            e.printStackTrace(); // 에러 로그 출력
            System.out.println(e.getMessage());
        } catch (NullPointerException e){

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
