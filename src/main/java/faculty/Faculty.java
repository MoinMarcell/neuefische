package faculty;

public class Faculty {
    public static void main(String[] args) {
        System.out.println(facultyForLoop(3));
        System.out.println(facultyWhileLoop(3));
    }
    public static int facultyForLoop(int number){
        int faculty = 1;
        for(int i = 2; i <= number; i++){
            faculty *= i;
        }
        return faculty;
    }

    public static int facultyWhileLoop(int number){
        int faculty = 1;
        while(number >= 2){
            faculty *= faculty;
            number--;
        }
        return faculty;
    }
}
