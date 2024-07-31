package p072e1;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: e1.f */
/* loaded from: classes.dex */
public class C7096f {

    /* renamed from: h */
    public static final float[] f15795h;

    /* renamed from: i */
    public static final float[] f15796i;

    /* renamed from: a */
    private int f15797a;

    /* renamed from: b */
    private int f15798b;

    /* renamed from: c */
    private int f15799c;

    /* renamed from: d */
    private int f15800d;

    /* renamed from: e */
    private int f15801e;

    /* renamed from: f */
    private int f15802f;

    /* renamed from: g */
    private int f15803g;

    static {
        float[] fArr = new float[16];
        f15795h = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        f15796i = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public C7096f(int i10) {
        String str;
        this.f15797a = i10;
        if (i10 == 0) {
            this.f15803g = 3553;
            str = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        } else {
            if (i10 != 1) {
                throw new RuntimeException("Unhandled type " + i10);
            }
            this.f15803g = 36197;
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        }
        this.f15798b = m20918c("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", str);
        int i11 = this.f15798b;
        if (i11 == 0) {
            throw new RuntimeException("Unable to create program");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i11, "aPosition");
        this.f15801e = glGetAttribLocation;
        m20917b(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f15798b, "aTextureCoord");
        this.f15802f = glGetAttribLocation2;
        m20917b(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f15798b, "uMVPMatrix");
        this.f15799c = glGetUniformLocation;
        m20917b(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f15798b, "uTexMatrix");
        this.f15800d = glGetUniformLocation2;
        m20917b(glGetUniformLocation2, "uTexMatrix");
    }

    /* renamed from: a */
    public static void m20916a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(glGetError);
        Log.e("Texture2dProgram", str2);
        throw new RuntimeException(str2);
    }

    /* renamed from: b */
    public static void m20917b(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new RuntimeException("Unable to locate '" + str + "' in program");
    }

    /* renamed from: c */
    public static int m20918c(String str, String str2) {
        int m20919f;
        int m20919f2 = m20919f(35633, str);
        if (m20919f2 == 0 || (m20919f = m20919f(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        m20916a("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e("Texture2dProgram", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, m20919f2);
        m20916a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, m20919f);
        m20916a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.e("Texture2dProgram", "Could not link program: ");
        Log.e("Texture2dProgram", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    /* renamed from: f */
    public static int m20919f(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        m20916a("glCreateShader type=" + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e("Texture2dProgram", "Could not compile shader " + i10 + ":");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("Texture2dProgram", sb2.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: d */
    public int m20920d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m20916a("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(this.f15803g, i10);
        m20916a("glBindTexture " + i10);
        GLES20.glTexParameterf(this.f15803g, 10241, 9728.0f);
        int i11 = this.f15803g;
        GLES20.glTexParameterf(i11, 10240, i11 != 3553 ? 9729.0f : 9728.0f);
        GLES20.glTexParameteri(this.f15803g, 10242, 33071);
        GLES20.glTexParameteri(this.f15803g, 10243, 33071);
        m20916a("glTexParameter");
        return i10;
    }

    /* renamed from: e */
    public void m20921e(float[] fArr, FloatBuffer floatBuffer, int i10, int i11, int i12, int i13, float[] fArr2, FloatBuffer floatBuffer2, int i14, int i15) {
        m20916a("draw start");
        GLES20.glUseProgram(this.f15798b);
        m20916a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f15803g, i14);
        GLES20.glUniformMatrix4fv(this.f15799c, 1, false, fArr, 0);
        m20916a("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.f15800d, 1, false, fArr2, 0);
        m20916a("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.f15801e);
        m20916a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f15801e, i12, 5126, false, i13, (Buffer) floatBuffer);
        m20916a("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f15802f);
        m20916a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f15802f, 2, 5126, false, i15, (Buffer) floatBuffer2);
        m20916a("glVertexAttribPointer");
        GLES20.glDrawArrays(5, i10, i11);
        m20916a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.f15801e);
        GLES20.glDisableVertexAttribArray(this.f15802f);
        GLES20.glBindTexture(this.f15803g, 0);
        GLES20.glUseProgram(0);
    }

    /* renamed from: g */
    public void m20922g(int i10, Bitmap bitmap) {
        GLES20.glBindTexture(this.f15803g, i10);
        GLUtils.texImage2D(this.f15803g, 0, bitmap, 0);
    }

    /* renamed from: h */
    public void m20923h() {
        Log.d("Texture2dProgram", "deleting program " + this.f15798b);
        GLES20.glDeleteProgram(this.f15798b);
        this.f15798b = -1;
    }
}
