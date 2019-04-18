package rohitksingh.com.broadcastactivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**********************************************************************
 *              Demo Activity which has a demo broadcastreceiver
 *              You can use BasicActivity
 *              1) extends BasicAactivity in your Activity
 *              2) provide implementtaion for abstract methods
 *
 **********************************************************************/

public class MainActivity extends BasicActivity {

    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.hello);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendBroadcast(new Intent("Hello Intent Filter"));
            }
        });
    }


    @Override
    public BroadcastReceiver getBroadcastReceiver() {
        return new HelloBroadcastReceiver();
    }

    @Override
    public IntentFilter getFilter() {
        return new IntentFilter("Hello Intent Filter");
    }

}
