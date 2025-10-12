package inheritanceAndPolymorphism;

public class ValidationService {

    public  boolean verifyEmail(User user){

        String email = user.email;
        if(email == null)
            return false;
        else
            return true;
    }

    public void validateLectureAttendance(User user){
        user.attendLecture();
        System.out.println("User has attended lecture");
    }
}
