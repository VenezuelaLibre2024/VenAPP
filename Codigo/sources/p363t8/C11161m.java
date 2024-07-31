package p363t8;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t8.m */
/* loaded from: classes.dex */
public final class C11161m {

    /* renamed from: a */
    private final int f28999a;

    /* renamed from: b */
    private final a[] f29000b;

    /* renamed from: c */
    private final b[] f29001c;

    /* renamed from: d */
    private final Map<String, a> f29002d;

    /* renamed from: e */
    private final Map<String, b> f29003e;

    /* renamed from: t8.m$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        public final String f29004a;

        /* renamed from: b */
        private final int f29005b;

        /* renamed from: c */
        private final int f29006c;

        private a(String str, int i10, int i11) {
            this.f29004a = str;
            this.f29005b = i10;
            this.f29006c = i11;
        }

        /* renamed from: a */
        public static a m34797a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C11161m.m34793h(bArr));
            return new a(str, i11, C11161m.m34791f(i10, str));
        }
    }

    /* renamed from: t8.m$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        public final String f29007a;

        /* renamed from: b */
        private final int f29008b;

        /* renamed from: c */
        private final int f29009c;

        /* renamed from: d */
        private final float[] f29010d = new float[16];

        private b(String str, int i10, int i11) {
            this.f29007a = str;
            this.f29008b = i10;
            this.f29009c = i11;
        }

        /* renamed from: a */
        public static b m34798a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C11161m.m34793h(bArr));
            return new b(str, C11161m.m34794i(i10, str), iArr2[0]);
        }
    }

    public C11161m(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f28999a = glCreateProgram;
        C11163n.m34812b();
        m34790d(glCreateProgram, 35633, str);
        m34790d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        C11163n.m34813c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.f29002d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f29000b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a m34797a = a.m34797a(this.f28999a, i10);
            this.f29000b[i10] = m34797a;
            this.f29002d.put(m34797a.f29004a, m34797a);
        }
        this.f29003e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f28999a, 35718, iArr3, 0);
        this.f29001c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b m34798a = b.m34798a(this.f28999a, i11);
            this.f29001c[i11] = m34798a;
            this.f29003e.put(m34798a.f29007a, m34798a);
        }
        C11163n.m34812b();
    }

    /* renamed from: d */
    private static void m34790d(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        C11163n.m34813c(iArr[0] == 1, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        C11163n.m34812b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static int m34791f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    /* renamed from: g */
    private int m34792g(String str) {
        return m34791f(this.f28999a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m34793h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static int m34794i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    /* renamed from: e */
    public int m34795e(String str) {
        int m34792g = m34792g(str);
        GLES20.glEnableVertexAttribArray(m34792g);
        C11163n.m34812b();
        return m34792g;
    }

    /* renamed from: j */
    public int m34796j(String str) {
        return m34794i(this.f28999a, str);
    }
}
