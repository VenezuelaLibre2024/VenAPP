package p363t8;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: t8.j */
/* loaded from: classes.dex */
public final class RunnableC11155j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: r */
    private static final int[] f28980r = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    private final Handler f28981a;

    /* renamed from: b */
    private final int[] f28982b;

    /* renamed from: c */
    private EGLDisplay f28983c;

    /* renamed from: d */
    private EGLContext f28984d;

    /* renamed from: e */
    private EGLSurface f28985e;

    /* renamed from: f */
    private SurfaceTexture f28986f;

    /* renamed from: t8.j$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    public RunnableC11155j(Handler handler) {
        this(handler, null);
    }

    public RunnableC11155j(Handler handler, a aVar) {
        this.f28981a = handler;
        this.f28982b = new int[1];
    }

    /* renamed from: a */
    private static EGLConfig m34745a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f28980r, 0, eGLConfigArr, 0, 1, iArr, 0);
        C11163n.m34813c(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, C11172r0.m34860C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    /* renamed from: b */
    private static EGLContext m34746b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        C11163n.m34813c(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    /* renamed from: c */
    private static EGLSurface m34747c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            C11163n.m34813c(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        C11163n.m34813c(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    /* renamed from: d */
    private void m34748d() {
    }

    /* renamed from: e */
    private static void m34749e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C11163n.m34812b();
    }

    /* renamed from: f */
    private static EGLDisplay m34750f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        C11163n.m34813c(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        C11163n.m34813c(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    /* renamed from: g */
    public SurfaceTexture m34751g() {
        return (SurfaceTexture) C11137a.m34603e(this.f28986f);
    }

    /* renamed from: h */
    public void m34752h(int i10) {
        EGLDisplay m34750f = m34750f();
        this.f28983c = m34750f;
        EGLConfig m34745a = m34745a(m34750f);
        EGLContext m34746b = m34746b(this.f28983c, m34745a, i10);
        this.f28984d = m34746b;
        this.f28985e = m34747c(this.f28983c, m34745a, m34746b, i10);
        m34749e(this.f28982b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28982b[0]);
        this.f28986f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* renamed from: i */
    public void m34753i() {
        this.f28981a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f28986f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f28982b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f28983c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f28983c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f28985e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f28983c, this.f28985e);
            }
            EGLContext eGLContext = this.f28984d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f28983c, eGLContext);
            }
            if (C11172r0.f29040a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f28983c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f28983c);
            }
            this.f28983c = null;
            this.f28984d = null;
            this.f28985e = null;
            this.f28986f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f28981a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m34748d();
        SurfaceTexture surfaceTexture = this.f28986f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
