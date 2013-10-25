package com.ninetwozero.lockscreenbypass;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        unlockScreen();
    }

    private void unlockScreen() {
        KeyguardManager manager = (KeyguardManager) this.getSystemService(Context.KEYGUARD_SERVICE);
        KeyguardManager.KeyguardLock lock = manager.newKeyguardLock("NINETWOZERO");
        lock.disableKeyguard();
    }
    
}
