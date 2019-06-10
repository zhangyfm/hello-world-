package quickstart;


/**
 * create by zyf
 */
public class HelloWorld2 {
    private String name;

    public static void main(String[] args){
        System.out.println("Hello world..");
       Thread thread=new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("线程。。。");



           }
       });

      thread.start();


        System.out.println("end");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

