package androidx.camera.core.impl.utils;

import android.opengl.Matrix;

/* renamed from: androidx.camera.core.impl.utils.o */
/* loaded from: classes.dex */
public final class C0686o {

    /* renamed from: a */
    private static final float[] f3002a = new float[16];

    /* renamed from: a */
    private static void m3334a(float[] fArr, float f10, float f11) {
        Matrix.translateM(fArr, 0, -f10, -f11, 0.0f);
    }

    /* renamed from: b */
    private static void m3335b(float[] fArr, float f10, float f11) {
        Matrix.translateM(fArr, 0, f10, f11, 0.0f);
    }

    /* renamed from: c */
    public static void m3336c(float[] fArr, float f10, float f11, float f12) {
        m3335b(fArr, f11, f12);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        m3334a(fArr, f11, f12);
    }

    /* renamed from: d */
    public static void m3337d(float[] fArr, float f10) {
        m3335b(fArr, 0.0f, f10);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        m3334a(fArr, 0.0f, f10);
    }
}
