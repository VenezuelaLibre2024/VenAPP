package v8;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f28575a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f28576b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f28577c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f28578d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private final Display f28579e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f28580f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28581g;

    /* loaded from: classes.dex */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f28579e = display;
        this.f28580f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f28576b);
        SensorManager.getOrientation(this.f28576b, this.f28578d);
        return this.f28578d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f28580f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f28581g) {
            c.a(this.f28577c, fArr);
            this.f28581g = true;
        }
        float[] fArr2 = this.f28576b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f28576b, 0, this.f28577c, 0);
    }

    private void d(float[] fArr, int i10) {
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
            float[] fArr2 = this.f28576b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f28576b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f28575a, sensorEvent.values);
        d(this.f28575a, this.f28579e.getRotation());
        float a10 = a(this.f28575a);
        e(this.f28575a);
        c(this.f28575a);
        b(this.f28575a, a10);
    }
}
