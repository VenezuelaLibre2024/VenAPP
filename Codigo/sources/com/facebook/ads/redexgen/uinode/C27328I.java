package com.facebook.ads.redexgen.uinode;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.8I */
/* loaded from: assets/audience_network.dex */
public class C27328I implements SensorEventListener {
    public C27328I() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C27338J.A0B = sensorEvent.values;
        C27338J.A07();
    }
}
