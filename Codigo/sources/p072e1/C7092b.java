package p072e1;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.Objects;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public class C7092b {

    /* renamed from: a */
    private EGLDisplay f15715a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f15716b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLSurface f15717c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    private EGLConfig[] f15718d = new EGLConfig[1];

    /* renamed from: e */
    private Surface f15719e;

    /* renamed from: f */
    private int f15720f;

    /* renamed from: g */
    private int f15721g;

    public C7092b(Surface surface) {
        surface.getClass();
        this.f15719e = surface;
        m20871c();
    }

    /* renamed from: a */
    private void m20869a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    /* renamed from: b */
    private void m20870b() {
        this.f15717c = EGL14.eglCreateWindowSurface(this.f15715a, this.f15718d[0], this.f15719e, new int[]{12344}, 0);
        m20869a("eglCreateWindowSurface");
        if (this.f15717c == null) {
            throw new RuntimeException("surface was null");
        }
    }

    /* renamed from: c */
    private void m20871c() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f15715a = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f15715a, iArr, 0, iArr, 1)) {
            this.f15715a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLDisplay eGLDisplay = this.f15715a;
        EGLConfig[] eGLConfigArr = this.f15718d;
        if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.f15716b = EGL14.eglCreateContext(this.f15715a, this.f15718d[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        m20869a("eglCreateContext");
        if (this.f15716b == null) {
            throw new RuntimeException("null context");
        }
        m20870b();
        this.f15720f = m20873e();
        this.f15721g = m20872d();
    }

    /* renamed from: d */
    public int m20872d() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f15715a, this.f15717c, 12374, iArr, 0);
        return iArr[0];
    }

    /* renamed from: e */
    public int m20873e() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f15715a, this.f15717c, 12375, iArr, 0);
        return iArr[0];
    }

    /* renamed from: f */
    public void m20874f() {
        EGLDisplay eGLDisplay = this.f15715a;
        EGLSurface eGLSurface = this.f15717c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f15716b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: g */
    public void m20875g() {
        EGLDisplay eGLDisplay = this.f15715a;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: h */
    public void m20876h() {
        if (!Objects.equals(this.f15715a, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglDestroySurface(this.f15715a, this.f15717c);
            EGL14.eglDestroyContext(this.f15715a, this.f15716b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f15715a);
        }
        this.f15719e.release();
        this.f15715a = EGL14.EGL_NO_DISPLAY;
        this.f15716b = EGL14.EGL_NO_CONTEXT;
        this.f15717c = EGL14.EGL_NO_SURFACE;
        this.f15719e = null;
    }

    /* renamed from: i */
    public void m20877i(long j10) {
        EGLExt.eglPresentationTimeANDROID(this.f15715a, this.f15717c, j10);
    }

    /* renamed from: j */
    public boolean m20878j() {
        return EGL14.eglSwapBuffers(this.f15715a, this.f15717c);
    }
}
