package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class LogTimerTask extends TimerTask {

    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

       String strTime = sdf.format(new Date());
        System.out.println(strTime+":成功完成了一次数据备份！");
    }
}
