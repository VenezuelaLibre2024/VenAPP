package p398v8;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p363t8.C11161m;
import p363t8.C11163n;
import p398v8.C11747e;

/* renamed from: v8.g */
/* loaded from: classes.dex */
final class C11749g {

    /* renamed from: j */
    private static final float[] f31025j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k */
    private static final float[] f31026k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l */
    private static final float[] f31027l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    private static final float[] f31028m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n */
    private static final float[] f31029n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    private int f31030a;

    /* renamed from: b */
    private a f31031b;

    /* renamed from: c */
    private a f31032c;

    /* renamed from: d */
    private C11161m f31033d;

    /* renamed from: e */
    private int f31034e;

    /* renamed from: f */
    private int f31035f;

    /* renamed from: g */
    private int f31036g;

    /* renamed from: h */
    private int f31037h;

    /* renamed from: i */
    private int f31038i;

    /* renamed from: v8.g$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a */
        private final int f31039a;

        /* renamed from: b */
        private final FloatBuffer f31040b;

        /* renamed from: c */
        private final FloatBuffer f31041c;

        /* renamed from: d */
        private final int f31042d;

        public a(C11747e.b bVar) {
            this.f31039a = bVar.m37133a();
            this.f31040b = C11163n.m34815e(bVar.f31023c);
            this.f31041c = C11163n.m34815e(bVar.f31024d);
            int i10 = bVar.f31022b;
            this.f31042d = i10 != 1 ? i10 != 2 ? 4 : 6 : 5;
        }
    }

    /* renamed from: c */
    public static boolean m37141c(C11747e c11747e) {
        C11747e.a aVar = c11747e.f31016a;
        C11747e.a aVar2 = c11747e.f31017b;
        return aVar.m37132b() == 1 && aVar.m37131a(0).f31021a == 0 && aVar2.m37132b() == 1 && aVar2.m37131a(0).f31021a == 0;
    }

    /* renamed from: a */
    public void m37142a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f31032c : this.f31031b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f31030a;
        GLES20.glUniformMatrix3fv(this.f31035f, 1, false, i11 == 1 ? z10 ? f31027l : f31026k : i11 == 2 ? z10 ? f31029n : f31028m : f31025j, 0);
        GLES20.glUniformMatrix4fv(this.f31034e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f31038i, 0);
        try {
            C11163n.m34812b();
        } catch (C11163n.a e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f31036g, 3, 5126, false, 12, (Buffer) aVar.f31040b);
        try {
            C11163n.m34812b();
        } catch (C11163n.a e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f31037h, 2, 5126, false, 8, (Buffer) aVar.f31041c);
        try {
            C11163n.m34812b();
        } catch (C11163n.a e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f31042d, 0, aVar.f31039a);
        try {
            C11163n.m34812b();
        } catch (C11163n.a e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    /* renamed from: b */
    public void m37143b() {
        try {
            C11161m c11161m = new C11161m("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f31033d = c11161m;
            this.f31034e = c11161m.m34796j("uMvpMatrix");
            this.f31035f = this.f31033d.m34796j("uTexMatrix");
            this.f31036g = this.f31033d.m34795e("aPosition");
            this.f31037h = this.f31033d.m34795e("aTexCoords");
            this.f31038i = this.f31033d.m34796j("uTexture");
        } catch (C11163n.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    /* renamed from: d */
    public void m37144d(C11747e c11747e) {
        if (m37141c(c11747e)) {
            this.f31030a = c11747e.f31018c;
            a aVar = new a(c11747e.f31016a.m37131a(0));
            this.f31031b = aVar;
            if (!c11747e.f31019d) {
                aVar = new a(c11747e.f31017b.m37131a(0));
            }
            this.f31032c = aVar;
        }
    }
}
