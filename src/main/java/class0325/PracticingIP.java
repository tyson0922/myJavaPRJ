package class0325;

public class PracticingIP {
    public static void main(String[] args){
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"http://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)\"";
        System.out.println(log.indexOf("127.0.0.1"));
        int a = log.indexOf("-");
        System.out.println(a);
        System.out.println(log.substring(0,a-1));


        int b, c;
        String d;
        b = log.indexOf("\"");
        c = log.indexOf(" ", b);
        System.out.println(c);

        d = log.substring(b+1, c);
        System.out.println(d);
    }
}
