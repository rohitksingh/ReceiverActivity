package rohitksingh.com.broadcastactivity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class BasicActivity extends AppCompatActivity {


    private BroadcastReceiver broadcastReceiver;
    private IntentFilter filter;
    private static final String TAG = "BasicActivity";

    /**********************************************************************
     *                   Activity Lifecycle methods
     **********************************************************************/

    @Override
    public void onCreate(Bundle sis)
    {
        super.onCreate(sis);
        broadcastReceiver = getBroadcastReceiver();
        filter = getFilter();
    }

    @Override
    public void onStart()
    {
        super.onStart();
        register();
    }

    @Override
    public void onStop()
    {
        super.onStop();
        unregister();
    }

    /**********************************************************************
     *                   Boilerplate code
     **********************************************************************/

    private void register()
    {
        registerReceiver(broadcastReceiver,filter);
        Log.d(TAG, "register: ");
    }

    private void unregister()
    {
        unregisterReceiver(broadcastReceiver);
        Log.d(TAG, "unregister: ");
    }

    /**********************************************************************
     *                   Abstract methods
     **********************************************************************/

    public abstract BroadcastReceiver getBroadcastReceiver();

    public abstract IntentFilter getFilter();

}
