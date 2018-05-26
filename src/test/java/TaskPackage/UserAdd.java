package TaskPackage;

import java.util.ArrayList;

//Here we add the users in the list and define it as a constant field

public class UserAdd {

    public static Object[][] provideUsers() {
        final ArrayList<UserInit> users = new ArrayList<>();

        users.add(new UserInit.Builder()
                .firstName("Bat")
                .secondName("Man")
                .phoneNumber("0040756987456")
                .userName("MantheBat")
                .email("manthe@bat.com")
                .password("test1234")
                .confirmPassword("test1234")
                .build());

        users.add(new UserInit.Builder()
                .firstName("Tim")
                .secondName("Los")
                .phoneNumber("0040749019549")
                .userName("LosmyTim")
                .email("@noor.com")
                .password("test1234")
                .confirmPassword("test1234")
                .build());

        users.add(new UserInit.Builder()
                .firstName("Pay")
                .secondName("Pal")
                .phoneNumber("0040745490129")
                .userName("PaywithPal")
                .email("pal@pay.com")
                .password("test1234")
                .confirmPassword("test1234")
                .build());

        users.add(new UserInit.Builder()
                .firstName("Lazy")
                .secondName("Cat")
                .phoneNumber("0040742576019")
                .userName("LaztehCat")
                .email("cat@lazteh.com")
                .password("test1234")
                .confirmPassword("test1234")
                .build());

        users.add(new UserInit.Builder()
                .firstName("Chack")
                .secondName("Norris")
                .phoneNumber("0040745789457")
                .userName("Daboy")
                .email("chucky@chuck.com")
                .password("test1234")
                .confirmPassword("test1234")
                .build());


        UserInit[] usersArray = new UserInit[users.size()];
        users.toArray(usersArray);
        Object[][] result = new Object[usersArray.length][users.get(0).toDataArray().length];
        for (int i = 0; i < usersArray.length; i++) {
            UserInit u = usersArray[i];
            result[i] = u.toDataArray();
        }

        return result;
    }
}



