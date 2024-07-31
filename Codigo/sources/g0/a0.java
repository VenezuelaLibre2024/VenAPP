package g0;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: n, reason: collision with root package name */
    private static final String f15534n;

    /* renamed from: o, reason: collision with root package name */
    private static final String f15535o;

    /* renamed from: p, reason: collision with root package name */
    private static final String f15536p;

    /* renamed from: q, reason: collision with root package name */
    private static final String f15537q;

    /* renamed from: r, reason: collision with root package name */
    private static final float[] f15538r;

    /* renamed from: s, reason: collision with root package name */
    private static final FloatBuffer f15539s;

    /* renamed from: t, reason: collision with root package name */
    private static final float[] f15540t;

    /* renamed from: u, reason: collision with root package name */
    private static final FloatBuffer f15541u;

    /* renamed from: v, reason: collision with root package name */
    private static final a f15542v;

    /* renamed from: c, reason: collision with root package name */
    private Thread f15545c;

    /* renamed from: f, reason: collision with root package name */
    private EGLConfig f15548f;

    /* renamed from: h, reason: collision with root package name */
    private Surface f15550h;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f15543a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    final Map<Surface, a> f15544b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private EGLDisplay f15546d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    private EGLContext f15547e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: g, reason: collision with root package name */
    private EGLSurface f15549g = EGL14.EGL_NO_SURFACE;

    /* renamed from: i, reason: collision with root package name */
    private int f15551i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f15552j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f15553k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f15554l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f15555m = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        static a d(EGLSurface eGLSurface, int i10, int i11) {
            return new b(eGLSurface, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract EGLSurface a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int c();
    }

    static {
        Locale locale = Locale.US;
        f15534n = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f15535o = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f15536p = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", "vTextureCoord", "sTexture", "sTexture", "vTextureCoord");
        f15537q = String.format(locale, "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}", "sTexture", "vTextureCoord", "sTexture", "vTextureCoord");
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f15538r = fArr;
        f15539s = h(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f15540t = fArr2;
        f15541u = h(fArr2);
        f15542v = a.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    private void A(EGLSurface eGLSurface) {
        androidx.core.util.h.k(this.f15546d);
        androidx.core.util.h.k(this.f15547e);
        if (!EGL14.eglMakeCurrent(this.f15546d, eGLSurface, eGLSurface, this.f15547e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    private static int B(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }

    private void E() {
        int i10 = this.f15552j;
        if (i10 != -1) {
            GLES20.glDeleteProgram(i10);
            this.f15552j = -1;
        }
        if (!Objects.equals(this.f15546d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f15546d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (a aVar : this.f15544b.values()) {
                if (!Objects.equals(aVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f15546d, aVar.a())) {
                    a("eglDestroySurface");
                }
            }
            this.f15544b.clear();
            if (!Objects.equals(this.f15549g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f15546d, this.f15549g);
                this.f15549g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f15547e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f15546d, this.f15547e);
                this.f15547e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f15546d);
            this.f15546d = EGL14.EGL_NO_DISPLAY;
        }
        this.f15548f = null;
        this.f15552j = -1;
        this.f15553k = -1;
        this.f15554l = -1;
        this.f15555m = -1;
        this.f15551i = -1;
        this.f15550h = null;
        this.f15545c = null;
    }

    private void F(Surface surface, boolean z10) {
        if (this.f15550h == surface) {
            this.f15550h = null;
            A(this.f15549g);
        }
        a remove = z10 ? this.f15544b.remove(surface) : this.f15544b.put(surface, f15542v);
        if (remove == null || remove == f15542v) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f15546d, remove.a());
        } catch (RuntimeException e10) {
            w.o0.l("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    private void I(ByteBuffer byteBuffer, Size size, float[] fArr) {
        androidx.core.util.h.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        androidx.core.util.h.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int r10 = r();
        GLES20.glActiveTexture(33985);
        c("glActiveTexture");
        GLES20.glBindTexture(3553, r10);
        c("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int q10 = q();
        GLES20.glBindFramebuffer(36160, q10);
        c("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, r10, 0);
        c("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        c("glActiveTexture");
        GLES20.glBindTexture(36197, this.f15551i);
        c("glBindTexture");
        this.f15550h = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        GLES20.glUniformMatrix4fv(this.f15553k, 1, false, fArr, 0);
        c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        c("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        c("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        p(r10);
        o(q10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f15551i);
    }

    private void K() {
        GLES20.glUseProgram(this.f15552j);
        c("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f15551i);
        GLES20.glEnableVertexAttribArray(this.f15554l);
        c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f15554l, 2, 5126, false, 0, (Buffer) f15539s);
        c("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f15555m);
        c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f15555m, 2, 5126, false, 0, (Buffer) f15541u);
        c("glVertexAttribPointer");
    }

    private static void a(String str) {
        try {
            b(str);
        } catch (IllegalStateException e10) {
            w.o0.d("OpenGlRenderer", e10.toString(), e10);
        }
    }

    private static void b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    private static void c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    private void d() {
        androidx.core.util.h.n(this.f15545c == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    private void e(boolean z10) {
        androidx.core.util.h.n(z10 == this.f15543a.get(), z10 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    private static void f(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    private void g(w.y yVar) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f15546d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f15546d, iArr, 0, iArr, 1)) {
            this.f15546d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        int i10 = yVar.d() ? 10 : 8;
        int[] iArr2 = {12324, i10, 12323, i10, 12322, i10, 12321, yVar.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, yVar.d() ? 64 : 4, 12610, !yVar.d() ? 1 : 0, 12339, 5, 12344};
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f15546d, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        int[] iArr3 = new int[3];
        iArr3[0] = 12440;
        iArr3[1] = yVar.d() ? 3 : 2;
        iArr3[2] = 12344;
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f15546d, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr3, 0);
        b("eglCreateContext");
        this.f15548f = eGLConfig;
        this.f15547e = eglCreateContext;
        int[] iArr4 = new int[1];
        EGL14.eglQueryContext(this.f15546d, eglCreateContext, 12440, iArr4, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr4[0]);
    }

    public static FloatBuffer h(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    private a i(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f15546d;
            EGLConfig eGLConfig = this.f15548f;
            Objects.requireNonNull(eGLConfig);
            EGLSurface n10 = n(eGLDisplay, eGLConfig, surface);
            Size u10 = u(n10);
            return a.d(n10, u10.getWidth(), u10.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            w.o0.l("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    private static EGLSurface j(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        b("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    private void k(w.y yVar, d0 d0Var) {
        int i10;
        int i11;
        int i12;
        int x10;
        int glCreateProgram;
        try {
            i12 = z(35633, yVar.d() ? f15535o : f15534n);
            try {
                x10 = x(yVar, d0Var);
                try {
                    glCreateProgram = GLES20.glCreateProgram();
                } catch (IllegalArgumentException | IllegalStateException e10) {
                    i11 = -1;
                    i10 = x10;
                    e = e10;
                }
            } catch (IllegalArgumentException | IllegalStateException e11) {
                e = e11;
                i10 = -1;
                i11 = -1;
            }
        } catch (IllegalArgumentException | IllegalStateException e12) {
            e = e12;
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        try {
            c("glCreateProgram");
            GLES20.glAttachShader(glCreateProgram, i12);
            c("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, x10);
            c("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                this.f15552j = glCreateProgram;
                return;
            }
            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(glCreateProgram));
        } catch (IllegalArgumentException | IllegalStateException e13) {
            i10 = x10;
            e = e13;
            i11 = glCreateProgram;
            if (i12 != -1) {
                GLES20.glDeleteShader(i12);
            }
            if (i10 != -1) {
                GLES20.glDeleteShader(i10);
            }
            if (i11 != -1) {
                GLES20.glDeleteProgram(i11);
            }
            throw e;
        }
    }

    private void l() {
        EGLDisplay eGLDisplay = this.f15546d;
        EGLConfig eGLConfig = this.f15548f;
        Objects.requireNonNull(eGLConfig);
        this.f15549g = j(eGLDisplay, eGLConfig, 1, 1);
    }

    private void m() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        c("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        c("glBindTexture " + i10);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        c("glTexParameter");
        this.f15551i = i10;
    }

    private static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        b("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    private static void o(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        c("glDeleteFramebuffers");
    }

    private static void p(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        c("glDeleteTextures");
    }

    private static int q() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        c("glGenFramebuffers");
        return iArr[0];
    }

    private static int r() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        c("glGenTextures");
        return iArr[0];
    }

    private String s(w.y yVar) {
        e(false);
        try {
            g(yVar);
            l();
            A(this.f15549g);
            String glGetString = GLES20.glGetString(7939);
            return glGetString != null ? glGetString : "";
        } catch (IllegalStateException e10) {
            w.o0.l("OpenGlRenderer", "Failed to get GL extensions: " + e10.getMessage(), e10);
            return "";
        } finally {
            E();
        }
    }

    private a t(Surface surface) {
        androidx.core.util.h.n(this.f15544b.containsKey(surface), "The surface is not registered.");
        a aVar = this.f15544b.get(surface);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    private Size u(EGLSurface eGLSurface) {
        return new Size(B(this.f15546d, eGLSurface, 12375), B(this.f15546d, eGLSurface, 12374));
    }

    private int x(w.y yVar, d0 d0Var) {
        if (d0Var == d0.f15569a) {
            return z(35632, yVar.d() ? f15537q : f15536p);
        }
        try {
            String a10 = d0Var.a("sTexture", "vTextureCoord");
            if (a10 != null && a10.contains("vTextureCoord") && a10.contains("sTexture")) {
                return z(35632, a10);
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th2);
        }
    }

    private void y() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f15552j, "aPosition");
        this.f15554l = glGetAttribLocation;
        f(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f15552j, "aTextureCoord");
        this.f15555m = glGetAttribLocation2;
        f(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f15552j, "uTexMatrix");
        this.f15553k = glGetUniformLocation;
        f(glGetUniformLocation, "uTexMatrix");
    }

    private static int z(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        c("glCreateShader type=" + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        w.o0.k("OpenGlRenderer", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public void C(Surface surface) {
        e(true);
        d();
        if (this.f15544b.containsKey(surface)) {
            return;
        }
        this.f15544b.put(surface, f15542v);
    }

    public void D() {
        if (this.f15543a.getAndSet(false)) {
            d();
            E();
        }
    }

    public void G(long j10, float[] fArr, Surface surface) {
        e(true);
        d();
        a t10 = t(surface);
        if (t10 == f15542v) {
            t10 = i(surface);
            if (t10 == null) {
                return;
            } else {
                this.f15544b.put(surface, t10);
            }
        }
        if (surface != this.f15550h) {
            A(t10.a());
            this.f15550h = surface;
            GLES20.glViewport(0, 0, t10.c(), t10.b());
            GLES20.glScissor(0, 0, t10.c(), t10.b());
        }
        GLES20.glUniformMatrix4fv(this.f15553k, 1, false, fArr, 0);
        c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        c("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f15546d, t10.a(), j10);
        if (EGL14.eglSwapBuffers(this.f15546d, t10.a())) {
            return;
        }
        w.o0.k("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        F(surface, false);
    }

    public Bitmap H(Size size, float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        I(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.i(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public void J(Surface surface) {
        e(true);
        d();
        F(surface, true);
    }

    public int v() {
        e(true);
        d();
        return this.f15551i;
    }

    public void w(w.y yVar, d0 d0Var) {
        e(false);
        try {
            if (yVar.d() && !s(yVar).contains("GL_EXT_YUV_target")) {
                Log.w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                yVar = w.y.f29577d;
            }
            g(yVar);
            l();
            A(this.f15549g);
            k(yVar, d0Var);
            y();
            m();
            K();
            this.f15545c = Thread.currentThread();
            this.f15543a.set(true);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            E();
            throw e10;
        }
    }
}
