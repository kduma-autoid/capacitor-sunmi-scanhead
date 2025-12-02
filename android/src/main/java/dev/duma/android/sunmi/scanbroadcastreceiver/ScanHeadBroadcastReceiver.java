package dev.duma.android.sunmi.scanbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import androidx.core.content.ContextCompat;
import java.util.Objects;

public class ScanHeadBroadcastReceiver implements IScanHeadBroadcastReceiver {
    private final Context context;

    private final ScanCallback callback;

    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (Objects.requireNonNull(intent.getAction())) {
                case "com.sunmi.scanner.ACTION_DATA_CODE_RECEIVED" -> {
                    String code = null;
                    try {
                        code = intent.getStringExtra("data");
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }

                    byte[] sourceBytes = new byte[0];
                    try {
                        sourceBytes = intent.getByteArrayExtra("source_byte");
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }

                    String source_byte = Base64.encodeToString(sourceBytes, Base64.NO_WRAP);

                    if (code != null && !code.isEmpty()) {
                        callback.onScan(code, source_byte);
                    }
                }

                case "com.sunmi.scanner.ACTION_SCAN_START" -> callback.onStart();

                case "com.sunmi.scanner.ACTION_SCAN_END" -> callback.onStop();
            }
        }
    };

    protected ScanHeadBroadcastReceiver(Context context, ScanCallback callback) {
        this.context = context;
        this.callback = callback;
    }

    @Override
    public void register() {
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.sunmi.scanner.ACTION_DATA_CODE_RECEIVED");
        filter.addAction("com.sunmi.scanner.ACTION_SCAN_END");
        filter.addAction("com.sunmi.scanner.ACTION_SCAN_START");

        ContextCompat.registerReceiver(context, receiver, filter, ContextCompat.RECEIVER_EXPORTED);
    }

    @Override
    public void unregister() {
        try {
            context.unregisterReceiver(receiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
