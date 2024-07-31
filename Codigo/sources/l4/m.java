package l4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class m implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20977b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private b f20978a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public final void a(b bVar) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            this.f20978a = bVar;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(sensor, "sensor");
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(event, "event");
            b bVar = this.f20978a;
            if (bVar == null) {
                return;
            }
            float[] fArr = event.values;
            double d10 = fArr[0] / 9.80665f;
            double d11 = fArr[1] / 9.80665f;
            double d12 = fArr[2] / 9.80665f;
            if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > 2.3d) {
                bVar.a();
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
