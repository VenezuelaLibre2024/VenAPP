package com.facebook.ads.redexgen.uinode;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.8H */
/* loaded from: assets/audience_network.dex */
public class C27318H implements SensorEventListener {
    public C27318H() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C27338J.A0D(sensorEvent.values);
        C27338J.A04();
    }
}
