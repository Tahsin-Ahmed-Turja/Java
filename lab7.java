import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

class Attendance_info{
    public String Roll;
    public String name;
    public String ca;
    public String la;
    Attendance_info(String r,String n,String c,String l){
        Roll = r;
        name = n;
        ca = c;
        la = l;
    }
}

class AttendanceComparator implements Comparator<Attendance_info> {
    int choice;

    public AttendanceComparator(int c) {
        this.choice = c;
    }

    public int compare(Attendance_info a, Attendance_info b) {
        if (choice == 1) {
            return Integer.parseInt(a.ca) - Integer.parseInt(b.ca);
        } else {
            return Integer.parseInt(b.la) - Integer.parseInt(a.la);
        }
    }
}

public class lab7 {
    public static void main(String[] args) {
        try{
            BufferedReader r =new BufferedReader(new FileReader("/home/tahsin/Downloads/input.txt"));
            BufferedWriter cw =new BufferedWriter(new FileWriter("/home/tahsin/Downloads/coutput.txt"));
            BufferedWriter lw =new BufferedWriter(new FileWriter("/home/tahsin/Downloads/loutput.txt"));
            String line;
            line = r.readLine();
            Vector<Attendance_info> aif = new Vector<>();
            while(line != null){
                //System.out.println(line);
                String[] arrOfStr = line.split("\\s");
                Vector<String> v = new Vector<>();
                for(String a : arrOfStr){
                    if(!a.isEmpty()){
                        v.add(a);
                    }
                }
                Attendance_info af = new Attendance_info(v.get(0),v.get(1),v.get(2),v.get(3));
                aif.add(af);
                line = r.readLine();
            }
            Collections.sort(aif, new AttendanceComparator(1));
            for(var a : aif){
                cw.write(a.Roll+" "+a.name+" "+a.ca+" "+a.la+"\n");
            }
            Collections.sort(aif, new AttendanceComparator(2));
            for(var a : aif){
                lw.write(a.Roll+" "+a.name+" "+a.ca+" "+a.la+"\n");
            }
            r.close();
            cw.close();
            lw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
