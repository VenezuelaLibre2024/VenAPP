package ig;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class b implements SensorEventListener {

    /* renamed from: a */
    private jh.h f17697a;

    /* renamed from: b */
    private jh.i f17698b;

    /* renamed from: c */
    private Sensor f17699c;

    /* renamed from: d */
    private Context f17700d;

    /* renamed from: e */
    private Handler f17701e = new Handler();

    public b(Context context, jh.h hVar, jh.i iVar) {
        this.f17700d = context;
        this.f17697a = hVar;
        this.f17698b = iVar;
    }

    public /* synthetic */ void b(boolean z10) {
        this.f17697a.t(z10);
    }

    private void c(boolean z10) {
        this.f17701e.post(new Runnable() { // from class: ig.a

            /* renamed from: b */
            public final /* synthetic */ boolean f17696b;

            public /* synthetic */ a(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(r2);
            }
        });
    }

    public void d() {
        if (this.f17698b.d()) {
            SensorManager sensorManager = (SensorManager) this.f17700d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f17699c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void e() {
        if (this.f17699c != null) {
            ((SensorManager) this.f17700d.getSystemService("sensor")).unregisterListener(this);
            this.f17699c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f17697a != null) {
            if (f10 <= 45.0f) {
                c(true);
            } else if (f10 >= 450.0f) {
                c(false);
            }
        }
    }
}
