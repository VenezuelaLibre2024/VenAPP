package p213l4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;

/* renamed from: l4.m */
/* loaded from: classes.dex */
public final class C9397m implements SensorEventListener {

    /* renamed from: b */
    public static final a f22799b = new a(null);

    /* renamed from: a */
    private b f22800a;

    /* renamed from: l4.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: l4.m$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo27929a();
    }

    /* renamed from: a */
    public final void m27985a(b bVar) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            this.f22800a = bVar;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(sensor, "sensor");
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(event, "event");
            b bVar = this.f22800a;
            if (bVar == null) {
                return;
            }
            float[] fArr = event.values;
            double d10 = fArr[0] / 9.80665f;
            double d11 = fArr[1] / 9.80665f;
            double d12 = fArr[2] / 9.80665f;
            if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > 2.3d) {
                bVar.mo27929a();
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
