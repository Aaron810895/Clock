import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Frame extends JFrame {

    Calendar date;
    SimpleDateFormat time; SimpleDateFormat dayFormat; SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String day;
    String time1;
    String Date;

    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Yeet master Clock");
        this.setLayout(new FlowLayout());
        this.setSize(400,250);
       // this.getContentPane().setBackground(new Color(252, 213, 60));
        this.setResizable(false);


        time = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,45));
       // timeLabel.setForeground(new Color(94,3,150));
       // timeLabel.setBackground(new Color(252, 213, 60));
        timeLabel.setOpaque(true);

        time1 = time.format(Calendar.getInstance().getTime());
        timeLabel.setText(time1);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana", Font.PLAIN,35));
       // dayLabel.setForeground(new Color(94,3,150));
       // dayLabel.setBackground(new Color(252, 213, 60));
        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana", Font.PLAIN,35));
      //  dateLabel.setForeground(new Color(94,3,150));
      //  dateLabel.setBackground(new Color(252, 213, 60));
        dateLabel.setOpaque(true);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();

          }
        public void setTime(){
            while(true) {
                time1 = time.format(Calendar.getInstance().getTime());
                timeLabel.setText(time1);

                day = dayFormat.format(Calendar.getInstance().getTime());
                dayLabel.setText(day);

                Date = dateFormat.format(Calendar.getInstance().getTime());
                dateLabel.setText(Date);
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                    }
            }
    }

}
