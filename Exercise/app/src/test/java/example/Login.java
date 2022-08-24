package example;

import java.util.HashMap;

public class Login {

    private String userid = "admin";
    private String userPassword = "1234";

    public Login() {
    }

    public Login(String userid, String userPassword) {
        this.userid = userid;
        this.userPassword = userPassword;
    }

    public boolean isCheck(String userid, String userPassword) {
        if (userid.equals(userid) && userPassword.equals(userPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public static HashMap<String, EmployeeVO> setEmployee() {
        HashMap<String, EmployeeVO> hashMap = new HashMap<String, EmployeeVO>();
        hashMap.put("홍길동", new EmployeeVO(1, "홍길동", "010-7777-8888", "기획부", "과장"));
        hashMap.put("이순신", new EmployeeVO(2, "이순신", "010-6677-1234", "인사부", "차장"));
        hashMap.put("광계통", new EmployeeVO(3, "광계통", "010-9977-5678", "총무부", "대리"));
        hashMap.put("장영실", new EmployeeVO(4, "장영실", "010-2277-9101", "영업부", "사원"));
        hashMap.put("감강찬", new EmployeeVO(5, "감강찬", "010-3377-7812", "기획부", "알바"));
        return hashMap;
    }
}
