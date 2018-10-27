import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcus_w on 2018/10/20.
 */
class Battery {
    String band = "baba";

    void charge() {
        System.out.println(band + "电池正在充电..");
    }
}

class Phone {
    Battery battery;
    List songs = new ArrayList();

    //构造方法
    Phone(Battery b) {
        battery = b;
    }

    void download(String songName) {
        songs.add(songName);
        System.out.println("["+songName+"]"+"下载成功！");
    }

    void musicPlay() {
        for (Object song : songs) {
            System.out.println("播放音乐:" + song);
        }
    }
}

/**
 * @Test
 */
public class Sy6_5 {
    public static void main(String[] args) {
        Battery baba = new Battery();
        Phone samsung = new Phone(baba);
        samsung.download("说谎");
        samsung.download("阴天");
        samsung.musicPlay();
        samsung.battery.charge();
    }
}
