package rohitksingh.com.broadcastactivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class HelloBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("BasicActivity", "onReceive: ");

        if(intent.getAction().equals("Hello Intent Filter"))
        {
            Toast.makeText(context, "Hello Broadcast Triggered", Toast.LENGTH_SHORT).show();
        }
    }
}
