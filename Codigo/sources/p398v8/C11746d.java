package p398v8;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* renamed from: v8.d */
/* loaded from: classes.dex */
final class C11746d implements SensorEventListener {

    /* renamed from: a */
    private final float[] f31009a = new float[16];

    /* renamed from: b */
    private final float[] f31010b = new float[16];

    /* renamed from: c */
    private final float[] f31011c = new float[16];

    /* renamed from: d */
    private final float[] f31012d = new float[3];

    /* renamed from: e */
    private final Display f31013e;

    /* renamed from: f */
    private final a[] f31014f;

    /* renamed from: g */
    private boolean f31015g;

    /* renamed from: v8.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo37128a(float[] fArr, float f10);
    }

    public C11746d(Display display, a... aVarArr) {
        this.f31013e = display;
        this.f31014f = aVarArr;
    }

    /* renamed from: a */
    private float m37123a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f31010b);
        SensorManager.getOrientation(this.f31010b, this.f31012d);
        return this.f31012d[2];
    }

    /* renamed from: b */
    private void m37124b(float[] fArr, float f10) {
        for (a aVar : this.f31014f) {
            aVar.mo37128a(fArr, f10);
        }
    }

    /* renamed from: c */
    private void m37125c(float[] fArr) {
        if (!this.f31015g) {
            C11745c.m37118a(this.f31011c, fArr);
            this.f31015g = true;
        }
        float[] fArr2 = this.f31010b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f31010b, 0, this.f31011c, 0);
    }

    /* renamed from: d */
    private void m37126d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f31010b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f31010b, i11, i12, fArr);
        }
    }

    /* renamed from: e */
    private static void m37127e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f31009a, sensorEvent.values);
        m37126d(this.f31009a, this.f31013e.getRotation());
        float m37123a = m37123a(this.f31009a);
        m37127e(this.f31009a);
        m37125c(this.f31009a);
        m37124b(this.f31009a, m37123a);
    }
}
