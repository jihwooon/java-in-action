package example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeStart {
    Scanner scan = new Scanner(System.in);
    HashMap<String, EmployeeVO> list = new HashMap<String, EmployeeVO>();

    public EmployeeStart() {
        int loginCount = 0;

        do {
            String userid = conInput("아이디");
            String userPassword = conInput("비밀번호");
            Login login = new Login();

            if (login.isCheck(userid, userPassword)) {// 로그인 성공
                list = Login.setEmployee();

                do {
                    String menu = conInput("메뉴(1:사원목록, 2:사원등록, 3:사원수정, 4:사원삭제, 5:종료)");
                    if (menu.equals("1")) {
                        employeeList();
                    } else if (menu.equals("2")) {
                        employeeInsert();
                    } else if (menu.equals("3")) {
                        employeeEdit();
                    } else if (menu.equals("4")) {
                        employeeDelete();
                    } else if (menu.equals("5")) {
                        System.exit(0);
                    } else {
                        System.out.println("메뉴를 잘못선택하였습니다.. 다시 선택하세요...");
                    }

                } while (true);
            } else {// 로그인 실패
                loginCount++;
                if (loginCount > 3) {
                    break;
                }
            }
        } while (true);
        System.out.println("프로그램이 종료되었습니다.");
    }

    // 콘솔에서 문자입력
    public String conInput(String msg) {
        System.out.print(msg + "=");
        return scan.nextLine();
    }

    // 사원입력
    public void employeeList() {
        Collection<EmployeeVO> valueList = list.values();
        Iterator<EmployeeVO> iterator = valueList.iterator();
        while (iterator.hasNext()) {
            iterator.next().output();
        }
    }

    // 사원등록
    public void employeeInsert() {
        int id = Integer.parseInt(conInput("번호"));
        String name = conInput("이름");
        String phoneNumber = conInput("연락처");
        String department = conInput("부서");
        String position = conInput("직급");

        EmployeeVO vo = new EmployeeVO(id, name, phoneNumber, department, position);

        list.put(name, vo);
        employeeList();
    }

    // 사원 수정
    public void employeeEdit() {
        String name = conInput("수정할 사원명=");
        EmployeeVO employeeVO = list.get(name);
        if (employeeVO != null) {
            employeeVO.output();
            String subMenu = conInput("수정할 할목을 선택하세요.(1:연락처, 2:부서명, 3:직급)");
            String data = conInput("수정할 데이터입력=");
            if (subMenu.equals("1")) {
                employeeVO.setPhoneNumber(data);
            } else if (subMenu.equals("2")) {
                employeeVO.equals(data);

            } else if (subMenu.equals("3")) {
                employeeVO.setPosition(data);

            } else {
                System.out.println("수정할 항목을 잘못선택하였습니다.");
            }

        } else {
            System.out.println(name + "는 없는 사원명입니다.");
        }
    }

    // 사원 삭제
    public void employeeDelete() {
        String key = conInput("삭제할 사원입력");
        list.remove(key);

    }

    public static void main(String[] args) {
        new EmployeeStart();

    }
}
