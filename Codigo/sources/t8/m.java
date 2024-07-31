package t8;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final int f26703a;

    /* renamed from: b, reason: collision with root package name */
    private final a[] f26704b;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f26705c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f26706d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, b> f26707e;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f26708a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26709b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26710c;

        private a(String str, int i10, int i11) {
            this.f26708a = str;
            this.f26709b = i10;
            this.f26710c = i11;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, m.h(bArr));
            return new a(str, i11, m.f(i10, str));
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f26711a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26712b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26713c;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f26714d = new float[16];

        private b(String str, int i10, int i11) {
            this.f26711a = str;
            this.f26712b = i10;
            this.f26713c = i11;
        }

        public static b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, m.h(bArr));
            return new b(str, m.i(i10, str), iArr2[0]);
        }
    }

    public m(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f26703a = glCreateProgram;
        n.b();
        d(glCreateProgram, 35633, str);
        d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        n.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.f26706d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f26704b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a a10 = a.a(this.f26703a, i10);
            this.f26704b[i10] = a10;
            this.f26706d.put(a10.f26708a, a10);
        }
        this.f26707e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f26703a, 35718, iArr3, 0);
        this.f26705c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b a11 = b.a(this.f26703a, i11);
            this.f26705c[i11] = a11;
            this.f26707e.put(a11.f26711a, a11);
        }
        n.b();
    }

    private static void d(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        n.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        n.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f26703a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) {
        int g10 = g(str);
        GLES20.glEnableVertexAttribArray(g10);
        n.b();
        return g10;
    }

    public int j(String str) {
        return i(this.f26703a, str);
    }
}
