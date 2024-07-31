package p112g0;

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
import androidx.core.util.C0984h;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p407w.C12029o0;
import p407w.C12048y;

/* renamed from: g0.a0 */
/* loaded from: classes.dex */
public final class C7388a0 {

    /* renamed from: n */
    private static final String f17112n;

    /* renamed from: o */
    private static final String f17113o;

    /* renamed from: p */
    private static final String f17114p;

    /* renamed from: q */
    private static final String f17115q;

    /* renamed from: r */
    private static final float[] f17116r;

    /* renamed from: s */
    private static final FloatBuffer f17117s;

    /* renamed from: t */
    private static final float[] f17118t;

    /* renamed from: u */
    private static final FloatBuffer f17119u;

    /* renamed from: v */
    private static final a f17120v;

    /* renamed from: c */
    private Thread f17123c;

    /* renamed from: f */
    private EGLConfig f17126f;

    /* renamed from: h */
    private Surface f17128h;

    /* renamed from: a */
    private final AtomicBoolean f17121a = new AtomicBoolean(false);

    /* renamed from: b */
    final Map<Surface, a> f17122b = new HashMap();

    /* renamed from: d */
    private EGLDisplay f17124d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e */
    private EGLContext f17125e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: g */
    private EGLSurface f17127g = EGL14.EGL_NO_SURFACE;

    /* renamed from: i */
    private int f17129i = -1;

    /* renamed from: j */
    private int f17130j = -1;

    /* renamed from: k */
    private int f17131k = -1;

    /* renamed from: l */
    private int f17132l = -1;

    /* renamed from: m */
    private int f17133m = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0.a0$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: d */
        static a m22300d(EGLSurface eGLSurface, int i10, int i11) {
            return new C7389b(eGLSurface, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract EGLSurface mo22301a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract int mo22302b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo22303c();
    }

    static {
        Locale locale = Locale.US;
        f17112n = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f17113o = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f17114p = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", "vTextureCoord", "sTexture", "sTexture", "vTextureCoord");
        f17115q = String.format(locale, "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}", "sTexture", "vTextureCoord", "sTexture", "vTextureCoord");
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f17116r = fArr;
        f17117s = m22276h(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f17118t = fArr2;
        f17119u = m22276h(fArr2);
        f17120v = a.m22300d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* renamed from: A */
    private void m22263A(EGLSurface eGLSurface) {
        C0984h.m4833k(this.f17124d);
        C0984h.m4833k(this.f17125e);
        if (!EGL14.eglMakeCurrent(this.f17124d, eGLSurface, eGLSurface, this.f17125e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* renamed from: B */
    private static int m22264B(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }

    /* renamed from: E */
    private void m22265E() {
        int i10 = this.f17130j;
        if (i10 != -1) {
            GLES20.glDeleteProgram(i10);
            this.f17130j = -1;
        }
        if (!Objects.equals(this.f17124d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f17124d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (a aVar : this.f17122b.values()) {
                if (!Objects.equals(aVar.mo22301a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f17124d, aVar.mo22301a())) {
                    m22269a("eglDestroySurface");
                }
            }
            this.f17122b.clear();
            if (!Objects.equals(this.f17127g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f17124d, this.f17127g);
                this.f17127g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f17125e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f17124d, this.f17125e);
                this.f17125e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f17124d);
            this.f17124d = EGL14.EGL_NO_DISPLAY;
        }
        this.f17126f = null;
        this.f17130j = -1;
        this.f17131k = -1;
        this.f17132l = -1;
        this.f17133m = -1;
        this.f17129i = -1;
        this.f17128h = null;
        this.f17123c = null;
    }

    /* renamed from: F */
    private void m22266F(Surface surface, boolean z10) {
        if (this.f17128h == surface) {
            this.f17128h = null;
            m22263A(this.f17127g);
        }
        a remove = z10 ? this.f17122b.remove(surface) : this.f17122b.put(surface, f17120v);
        if (remove == null || remove == f17120v) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f17124d, remove.mo22301a());
        } catch (RuntimeException e10) {
            C12029o0.m38649l("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    /* renamed from: I */
    private void m22267I(ByteBuffer byteBuffer, Size size, float[] fArr) {
        C0984h.m4824b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        C0984h.m4824b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int m22286r = m22286r();
        GLES20.glActiveTexture(33985);
        m22271c("glActiveTexture");
        GLES20.glBindTexture(3553, m22286r);
        m22271c("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        m22271c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int m22285q = m22285q();
        GLES20.glBindFramebuffer(36160, m22285q);
        m22271c("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, m22286r, 0);
        m22271c("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        m22271c("glActiveTexture");
        GLES20.glBindTexture(36197, this.f17129i);
        m22271c("glBindTexture");
        this.f17128h = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        GLES20.glUniformMatrix4fv(this.f17131k, 1, false, fArr, 0);
        m22271c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        m22271c("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        m22271c("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        m22284p(m22286r);
        m22283o(m22285q);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f17129i);
    }

    /* renamed from: K */
    private void m22268K() {
        GLES20.glUseProgram(this.f17130j);
        m22271c("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f17129i);
        GLES20.glEnableVertexAttribArray(this.f17132l);
        m22271c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f17132l, 2, 5126, false, 0, (Buffer) f17117s);
        m22271c("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f17133m);
        m22271c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f17133m, 2, 5126, false, 0, (Buffer) f17119u);
        m22271c("glVertexAttribPointer");
    }

    /* renamed from: a */
    private static void m22269a(String str) {
        try {
            m22270b(str);
        } catch (IllegalStateException e10) {
            C12029o0.m38641d("OpenGlRenderer", e10.toString(), e10);
        }
    }

    /* renamed from: b */
    private static void m22270b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    /* renamed from: c */
    private static void m22271c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    /* renamed from: d */
    private void m22272d() {
        C0984h.m4836n(this.f17123c == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    /* renamed from: e */
    private void m22273e(boolean z10) {
        C0984h.m4836n(z10 == this.f17121a.get(), z10 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    /* renamed from: f */
    private static void m22274f(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    /* renamed from: g */
    private void m22275g(C12048y c12048y) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f17124d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f17124d, iArr, 0, iArr, 1)) {
            this.f17124d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        int i10 = c12048y.m38702d() ? 10 : 8;
        int[] iArr2 = {12324, i10, 12323, i10, 12322, i10, 12321, c12048y.m38702d() ? 2 : 8, 12325, 0, 12326, 0, 12352, c12048y.m38702d() ? 64 : 4, 12610, !c12048y.m38702d() ? 1 : 0, 12339, 5, 12344};
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f17124d, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        int[] iArr3 = new int[3];
        iArr3[0] = 12440;
        iArr3[1] = c12048y.m38702d() ? 3 : 2;
        iArr3[2] = 12344;
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f17124d, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr3, 0);
        m22270b("eglCreateContext");
        this.f17126f = eGLConfig;
        this.f17125e = eglCreateContext;
        int[] iArr4 = new int[1];
        EGL14.eglQueryContext(this.f17124d, eglCreateContext, 12440, iArr4, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr4[0]);
    }

    /* renamed from: h */
    public static FloatBuffer m22276h(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: i */
    private a m22277i(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f17124d;
            EGLConfig eGLConfig = this.f17126f;
            Objects.requireNonNull(eGLConfig);
            EGLSurface m22282n = m22282n(eGLDisplay, eGLConfig, surface);
            Size m22289u = m22289u(m22282n);
            return a.m22300d(m22282n, m22289u.getWidth(), m22289u.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            C12029o0.m38649l("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    /* renamed from: j */
    private static EGLSurface m22278j(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        m22270b("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: k */
    private void m22279k(C12048y c12048y, InterfaceC7394d0 interfaceC7394d0) {
        int i10;
        int i11;
        int i12;
        int m22290x;
        int glCreateProgram;
        try {
            i12 = m22292z(35633, c12048y.m38702d() ? f17113o : f17112n);
            try {
                m22290x = m22290x(c12048y, interfaceC7394d0);
                try {
                    glCreateProgram = GLES20.glCreateProgram();
                } catch (IllegalArgumentException | IllegalStateException e10) {
                    i11 = -1;
                    i10 = m22290x;
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
            m22271c("glCreateProgram");
            GLES20.glAttachShader(glCreateProgram, i12);
            m22271c("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, m22290x);
            m22271c("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                this.f17130j = glCreateProgram;
                return;
            }
            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(glCreateProgram));
        } catch (IllegalArgumentException | IllegalStateException e13) {
            i10 = m22290x;
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

    /* renamed from: l */
    private void m22280l() {
        EGLDisplay eGLDisplay = this.f17124d;
        EGLConfig eGLConfig = this.f17126f;
        Objects.requireNonNull(eGLConfig);
        this.f17127g = m22278j(eGLDisplay, eGLConfig, 1, 1);
    }

    /* renamed from: m */
    private void m22281m() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m22271c("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        m22271c("glBindTexture " + i10);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m22271c("glTexParameter");
        this.f17129i = i10;
    }

    /* renamed from: n */
    private static EGLSurface m22282n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        m22270b("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: o */
    private static void m22283o(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        m22271c("glDeleteFramebuffers");
    }

    /* renamed from: p */
    private static void m22284p(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        m22271c("glDeleteTextures");
    }

    /* renamed from: q */
    private static int m22285q() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        m22271c("glGenFramebuffers");
        return iArr[0];
    }

    /* renamed from: r */
    private static int m22286r() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m22271c("glGenTextures");
        return iArr[0];
    }

    /* renamed from: s */
    private String m22287s(C12048y c12048y) {
        m22273e(false);
        try {
            m22275g(c12048y);
            m22280l();
            m22263A(this.f17127g);
            String glGetString = GLES20.glGetString(7939);
            return glGetString != null ? glGetString : "";
        } catch (IllegalStateException e10) {
            C12029o0.m38649l("OpenGlRenderer", "Failed to get GL extensions: " + e10.getMessage(), e10);
            return "";
        } finally {
            m22265E();
        }
    }

    /* renamed from: t */
    private a m22288t(Surface surface) {
        C0984h.m4836n(this.f17122b.containsKey(surface), "The surface is not registered.");
        a aVar = this.f17122b.get(surface);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    /* renamed from: u */
    private Size m22289u(EGLSurface eGLSurface) {
        return new Size(m22264B(this.f17124d, eGLSurface, 12375), m22264B(this.f17124d, eGLSurface, 12374));
    }

    /* renamed from: x */
    private int m22290x(C12048y c12048y, InterfaceC7394d0 interfaceC7394d0) {
        if (interfaceC7394d0 == InterfaceC7394d0.f17147a) {
            return m22292z(35632, c12048y.m38702d() ? f17115q : f17114p);
        }
        try {
            String m22319a = interfaceC7394d0.m22319a("sTexture", "vTextureCoord");
            if (m22319a != null && m22319a.contains("vTextureCoord") && m22319a.contains("sTexture")) {
                return m22292z(35632, m22319a);
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th2);
        }
    }

    /* renamed from: y */
    private void m22291y() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f17130j, "aPosition");
        this.f17132l = glGetAttribLocation;
        m22274f(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f17130j, "aTextureCoord");
        this.f17133m = glGetAttribLocation2;
        m22274f(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f17130j, "uTexMatrix");
        this.f17131k = glGetUniformLocation;
        m22274f(glGetUniformLocation, "uTexMatrix");
    }

    /* renamed from: z */
    private static int m22292z(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        m22271c("glCreateShader type=" + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        C12029o0.m38648k("OpenGlRenderer", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    /* renamed from: C */
    public void m22293C(Surface surface) {
        m22273e(true);
        m22272d();
        if (this.f17122b.containsKey(surface)) {
            return;
        }
        this.f17122b.put(surface, f17120v);
    }

    /* renamed from: D */
    public void m22294D() {
        if (this.f17121a.getAndSet(false)) {
            m22272d();
            m22265E();
        }
    }

    /* renamed from: G */
    public void m22295G(long j10, float[] fArr, Surface surface) {
        m22273e(true);
        m22272d();
        a m22288t = m22288t(surface);
        if (m22288t == f17120v) {
            m22288t = m22277i(surface);
            if (m22288t == null) {
                return;
            } else {
                this.f17122b.put(surface, m22288t);
            }
        }
        if (surface != this.f17128h) {
            m22263A(m22288t.mo22301a());
            this.f17128h = surface;
            GLES20.glViewport(0, 0, m22288t.mo22303c(), m22288t.mo22302b());
            GLES20.glScissor(0, 0, m22288t.mo22303c(), m22288t.mo22302b());
        }
        GLES20.glUniformMatrix4fv(this.f17131k, 1, false, fArr, 0);
        m22271c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        m22271c("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f17124d, m22288t.mo22301a(), j10);
        if (EGL14.eglSwapBuffers(this.f17124d, m22288t.mo22301a())) {
            return;
        }
        C12029o0.m38648k("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m22266F(surface, false);
    }

    /* renamed from: H */
    public Bitmap m22296H(Size size, float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        m22267I(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.m2873i(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    /* renamed from: J */
    public void m22297J(Surface surface) {
        m22273e(true);
        m22272d();
        m22266F(surface, true);
    }

    /* renamed from: v */
    public int m22298v() {
        m22273e(true);
        m22272d();
        return this.f17129i;
    }

    /* renamed from: w */
    public void m22299w(C12048y c12048y, InterfaceC7394d0 interfaceC7394d0) {
        m22273e(false);
        try {
            if (c12048y.m38702d() && !m22287s(c12048y).contains("GL_EXT_YUV_target")) {
                Log.w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                c12048y = C12048y.f32040d;
            }
            m22275g(c12048y);
            m22280l();
            m22263A(this.f17127g);
            m22279k(c12048y, interfaceC7394d0);
            m22291y();
            m22281m();
            m22268K();
            this.f17123c = Thread.currentThread();
            this.f17121a.set(true);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            m22265E();
            throw e10;
        }
    }
}
