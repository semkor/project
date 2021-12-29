package lesson36.A_demo;

import lesson36.B_model.ENUM.UserType;
import lesson36.B_model.User;
import lesson36.D_service.UserService;
import lesson36.E_repository.UserRepository;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Map;

public class DemoUser {
    public static void main(String[] args) throws Exception{
//---------------------------------------------------- 1 блок ---------------------------------------------------------
//проверка юзера - пустые значения
//        UserService.login(null, null);

//проверка юзера - существующего в базе
//        System.out.println(UserService.isStatus());
//        System.out.println(UserService.getUserType());
//        UserService.login("frolov", "aD12345*");
//        System.out.println(UserService.isStatus());
//        System.out.println(UserService.getUserType());

//проверка юзера - не существующего в базе
//        System.out.println(UserService.isStatus());
//        System.out.println(UserService.getUserType());
//        UserService.login("fRolov", "aD12345*");
//        System.out.println(UserService.isStatus());
//        System.out.println(UserService.getUserType());

//---------------------------------------------------- 2 блок ---------------------------------------------------------
//регистрация  юзера - пустые значения
//        UserService.registerUser(new User(null,null,null));

//проверка регистрации в базе - логин существует
//        UserService.registerUser(new User("frolov", "aD12345*","Ukraine"));

//проверка регистрации в базе - логин не существует в базе
//        System.out.println(UserService.registerUser(new User("protasov", "aD12345*","Ukraine")));


//---------------------------------------------------- 3 блок ---------------------------------------------------------
//проверка - выход из системы
//        System.out.println(UserService.isStatus());
//        System.out.println(UserService.getUserType());
//        UserService.login("frolov", "aD12345*");
//        System.out.println(UserService.isStatus());
//        System.out.println(UserService.getUserType());
//        UserService.logout();
//        System.out.println(UserService.isStatus());
//        System.out.println(UserService.getUserType());
    }
}