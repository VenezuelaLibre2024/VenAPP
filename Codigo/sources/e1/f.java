package e1;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class f {

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f14423h;

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f14424i;

    /* renamed from: a, reason: collision with root package name */
    private int f14425a;

    /* renamed from: b, reason: collision with root package name */
    private int f14426b;

    /* renamed from: c, reason: collision with root package name */
    private int f14427c;

    /* renamed from: d, reason: collision with root package name */
    private int f14428d;

    /* renamed from: e, reason: collision with root package name */
    private int f14429e;

    /* renamed from: f, reason: collision with root package name */
    private int f14430f;

    /* renamed from: g, reason: collision with root package name */
    private int f14431g;

    static {
        float[] fArr = new float[16];
        f14423h = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        f14424i = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public f(int i10) {
        String str;
        this.f14425a = i10;
        if (i10 == 0) {
            this.f14431g = 3553;
            str = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        } else {
            if (i10 != 1) {
                throw new RuntimeException("Unhandled type " + i10);
            }
            this.f14431g = 36197;
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        }
        this.f14426b = c("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", str);
        int i11 = this.f14426b;
        if (i11 == 0) {
            throw new RuntimeException("Unable to create program");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i11, "aPosition");
        this.f14429e = glGetAttribLocation;
        b(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f14426b, "aTextureCoord");
        this.f14430f = glGetAttribLocation2;
        b(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f14426b, "uMVPMatrix");
        this.f14427c = glGetUniformLocation;
        b(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f14426b, "uTexMatrix");
        this.f14428d = glGetUniformLocation2;
        b(glGetUniformLocation2, "uTexMatrix");
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(glGetError);
        Log.e("Texture2dProgram", str2);
        throw new RuntimeException(str2);
    }

    public static void b(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new RuntimeException("Unable to locate '" + str + "' in program");
    }

    public static int c(String str, String str2) {
        int f10;
        int f11 = f(35633, str);
        if (f11 == 0 || (f10 = f(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e("Texture2dProgram", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, f11);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, f10);
        a("glAttachShader");
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

    public static int f(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        a("glCreateShader type=" + i10);
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

    public int d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(this.f14431g, i10);
        a("glBindTexture " + i10);
        GLES20.glTexParameterf(this.f14431g, 10241, 9728.0f);
        int i11 = this.f14431g;
        GLES20.glTexParameterf(i11, 10240, i11 != 3553 ? 9729.0f : 9728.0f);
        GLES20.glTexParameteri(this.f14431g, 10242, 33071);
        GLES20.glTexParameteri(this.f14431g, 10243, 33071);
        a("glTexParameter");
        return i10;
    }

    public void e(float[] fArr, FloatBuffer floatBuffer, int i10, int i11, int i12, int i13, float[] fArr2, FloatBuffer floatBuffer2, int i14, int i15) {
        a("draw start");
        GLES20.glUseProgram(this.f14426b);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f14431g, i14);
        GLES20.glUniformMatrix4fv(this.f14427c, 1, false, fArr, 0);
        a("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.f14428d, 1, false, fArr2, 0);
        a("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.f14429e);
        a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f14429e, i12, 5126, false, i13, (Buffer) floatBuffer);
        a("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f14430f);
        a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f14430f, 2, 5126, false, i15, (Buffer) floatBuffer2);
        a("glVertexAttribPointer");
        GLES20.glDrawArrays(5, i10, i11);
        a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.f14429e);
        GLES20.glDisableVertexAttribArray(this.f14430f);
        GLES20.glBindTexture(this.f14431g, 0);
        GLES20.glUseProgram(0);
    }

    public void g(int i10, Bitmap bitmap) {
        GLES20.glBindTexture(this.f14431g, i10);
        GLUtils.texImage2D(this.f14431g, 0, bitmap, 0);
    }

    public void h() {
        Log.d("Texture2dProgram", "deleting program " + this.f14426b);
        GLES20.glDeleteProgram(this.f14426b);
        this.f14426b = -1;
    }
}
