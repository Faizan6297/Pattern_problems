import java.util.*;

public class a1 {
/**
 * @param args
 */
public static void main(String[] args) {
    int line,row,column;

    char ch='A';
    Scanner sc =new Scanner(System.in);
    System.out.println("Entre number of line");
    line=sc.nextInt();
    for(row=1;row<=line;row++){
        for(column=1;column<=row;column++){
            System.out.print(""+ch);
        }
        System.out.println();
        ch++;
    }
}
}