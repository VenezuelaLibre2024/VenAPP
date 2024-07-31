package t8;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* loaded from: classes.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f26684r = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    private final Handler f26685a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f26686b;

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f26687c;

    /* renamed from: d, reason: collision with root package name */
    private EGLContext f26688d;

    /* renamed from: e, reason: collision with root package name */
    private EGLSurface f26689e;

    /* renamed from: f, reason: collision with root package name */
    private SurfaceTexture f26690f;

    /* loaded from: classes.dex */
    public interface a {
    }

    public j(Handler handler) {
        this(handler, null);
    }

    public j(Handler handler, a aVar) {
        this.f26685a = handler;
        this.f26686b = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f26684r, 0, eGLConfigArr, 0, 1, iArr, 0);
        n.c(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, r0.C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        n.c(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            n.c(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        n.c(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    private void d() {
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        n.b();
    }

    private static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        n.c(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        n.c(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) t8.a.e(this.f26690f);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.f26687c = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f26687c, a10, i10);
        this.f26688d = b10;
        this.f26689e = c(this.f26687c, a10, b10, i10);
        e(this.f26686b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f26686b[0]);
        this.f26690f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f26685a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f26690f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f26686b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f26687c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f26687c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f26689e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f26687c, this.f26689e);
            }
            EGLContext eGLContext = this.f26688d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f26687c, eGLContext);
            }
            if (r0.f26744a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f26687c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f26687c);
            }
            this.f26687c = null;
            this.f26688d = null;
            this.f26689e = null;
            this.f26690f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f26685a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f26690f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
