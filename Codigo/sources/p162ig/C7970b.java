package p162ig;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import p184jh.C9057h;
import p184jh.C9058i;

/* renamed from: ig.b */
/* loaded from: classes2.dex */
public final class C7970b implements SensorEventListener {

    /* renamed from: a */
    private C9057h f19360a;

    /* renamed from: b */
    private C9058i f19361b;

    /* renamed from: c */
    private Sensor f19362c;

    /* renamed from: d */
    private Context f19363d;

    /* renamed from: e */
    private Handler f19364e = new Handler();

    public C7970b(Context context, C9057h c9057h, C9058i c9058i) {
        this.f19363d = context;
        this.f19360a = c9057h;
        this.f19361b = c9058i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m24503b(boolean z10) {
        this.f19360a.m26636t(z10);
    }

    /* renamed from: c */
    private void m24504c(final boolean z10) {
        this.f19364e.post(new Runnable() { // from class: ig.a
            @Override // java.lang.Runnable
            public final void run() {
                C7970b.this.m24503b(z10);
            }
        });
    }

    /* renamed from: d */
    public void m24505d() {
        if (this.f19361b.m26644d()) {
            SensorManager sensorManager = (SensorManager) this.f19363d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f19362c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* renamed from: e */
    public void m24506e() {
        if (this.f19362c != null) {
            ((SensorManager) this.f19363d.getSystemService("sensor")).unregisterListener(this);
            this.f19362c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f19360a != null) {
            if (f10 <= 45.0f) {
                m24504c(true);
            } else if (f10 >= 450.0f) {
                m24504c(false);
            }
        }
    }
}
