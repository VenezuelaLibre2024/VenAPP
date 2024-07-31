package p363t8;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: t8.n */
/* loaded from: classes.dex */
public final class C11163n {

    /* renamed from: a */
    public static final int[] f29015a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b */
    public static final int[] f29016b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c */
    private static final int[] f29017c = {12344};

    /* renamed from: t8.n$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static void m34811a(int i10, int i11) {
        GLES20.glBindTexture(i10, i11);
        m34812b();
        GLES20.glTexParameteri(i10, 10240, 9729);
        m34812b();
        GLES20.glTexParameteri(i10, 10241, 9729);
        m34812b();
        GLES20.glTexParameteri(i10, 10242, 33071);
        m34812b();
        GLES20.glTexParameteri(i10, 10243, 33071);
        m34812b();
    }

    /* renamed from: b */
    public static void m34812b() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (z10) {
            throw new a(sb2.toString());
        }
    }

    /* renamed from: c */
    public static void m34813c(boolean z10, String str) {
        if (!z10) {
            throw new a(str);
        }
    }

    /* renamed from: d */
    private static FloatBuffer m34814d(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: e */
    public static FloatBuffer m34815e(float[] fArr) {
        return (FloatBuffer) m34814d(fArr.length).put(fArr).flip();
    }

    /* renamed from: f */
    public static int m34816f() {
        int m34817g = m34817g();
        m34811a(36197, m34817g);
        return m34817g;
    }

    /* renamed from: g */
    private static int m34817g() {
        m34813c(!C11172r0.m34914c(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m34812b();
        return iArr[0];
    }

    /* renamed from: h */
    public static boolean m34818h(Context context) {
        String eglQueryString;
        int i10 = C11172r0.f29040a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(C11172r0.f29042c) || "XT1650".equals(C11172r0.f29043d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m34819i() {
        String eglQueryString;
        return C11172r0.f29040a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    /* renamed from: j */
    public static void m34820j(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }
}
