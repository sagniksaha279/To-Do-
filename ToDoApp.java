import java.util.*;
public class ToDoApp {
    public static void ImportantTask(String tasks[],int count){
        Scanner sc = new Scanner(System.in);
        //System.out.println(count);//3 count 4   012 123
        for(int i=count;i>=1;i--){
            tasks[i]=tasks[i-1];
        }
        System.out.print("Enter the most important task:");
        tasks[0]=sc.nextLine();
    }
    public static void LeastTask(String tasks[],int count){
        Scanner sc = new Scanner(System.in);
        System.out.println(count);
        System.out.print("Enter the least important task:");
        tasks[count-1]=sc.nextLine();
    }
    public static void addTask(String tasks[],int pos,int count){
        Scanner sc = new Scanner(System.in);
        if(tasks[pos]!=null){
            for(int i=count;i>=pos;i--){
                tasks[i]=tasks[i-1];
            }
            System.out.print("Enter your task:");
            tasks[pos]=sc.nextLine();
        }else{
            System.out.print("Enter your task:");
            tasks[pos]=sc.nextLine();
        }
    }
    public static void display(String tasks[],int count){
        System.out.println("the tasks are:");
        for(int i=0;i<count-1;i++){
            if(tasks[i] == null)
                continue;
            System.out.println((i+1)+")"+tasks[i]+" ");
        }
    }
    public static void deleteTask(String tasks[],int pos){
        tasks[pos] = null;
        System.out.println("tasks"+(pos+1)+"delted");
    }
    public static void main(String[] args) {
        String tasks[]=new String[100];
        Scanner sc= new Scanner(System.in);
        int choice =56,count=1;
        while(choice !=0){
            System.out.println("--MENU--\n1.add a Task\n2.Remove a task\n3.Display the tasks\n4.Important Task\n5.Least task");
            System.out.print("enter choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1 ->{
                    System.out.print("enter position:");
                    int pos = sc.nextInt();
                    count++;
                    addTask(tasks, pos-1,count);
                }
                case 2 ->{
                    System.out.print("enter position:");
                    int pos = sc.nextInt();
                    deleteTask(tasks, pos-1);
                    count--;
                }
                case 3 ->display(tasks,count);
                case 4 ->{
                    count++;
                    ImportantTask(tasks,count);
                }
                case 5 -> {
                    LeastTask(tasks, count);
                    count++;
                }
                default -> System.out.println("thank you");
            }
        }
    }  
}
