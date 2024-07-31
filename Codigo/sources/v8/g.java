package v8;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import t8.n;
import v8.e;

/* loaded from: classes.dex */
final class g {

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f28591j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f28592k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f28593l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f28594m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f28595n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f28596a;

    /* renamed from: b, reason: collision with root package name */
    private a f28597b;

    /* renamed from: c, reason: collision with root package name */
    private a f28598c;

    /* renamed from: d, reason: collision with root package name */
    private t8.m f28599d;

    /* renamed from: e, reason: collision with root package name */
    private int f28600e;

    /* renamed from: f, reason: collision with root package name */
    private int f28601f;

    /* renamed from: g, reason: collision with root package name */
    private int f28602g;

    /* renamed from: h, reason: collision with root package name */
    private int f28603h;

    /* renamed from: i, reason: collision with root package name */
    private int f28604i;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f28605a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f28606b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f28607c;

        /* renamed from: d, reason: collision with root package name */
        private final int f28608d;

        public a(e.b bVar) {
            this.f28605a = bVar.a();
            this.f28606b = n.e(bVar.f28589c);
            this.f28607c = n.e(bVar.f28590d);
            int i10 = bVar.f28588b;
            this.f28608d = i10 != 1 ? i10 != 2 ? 4 : 6 : 5;
        }
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f28582a;
        e.a aVar2 = eVar.f28583b;
        return aVar.b() == 1 && aVar.a(0).f28587a == 0 && aVar2.b() == 1 && aVar2.a(0).f28587a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f28598c : this.f28597b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f28596a;
        GLES20.glUniformMatrix3fv(this.f28601f, 1, false, i11 == 1 ? z10 ? f28593l : f28592k : i11 == 2 ? z10 ? f28595n : f28594m : f28591j, 0);
        GLES20.glUniformMatrix4fv(this.f28600e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f28604i, 0);
        try {
            n.b();
        } catch (n.a e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f28602g, 3, 5126, false, 12, (Buffer) aVar.f28606b);
        try {
            n.b();
        } catch (n.a e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f28603h, 2, 5126, false, 8, (Buffer) aVar.f28607c);
        try {
            n.b();
        } catch (n.a e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f28608d, 0, aVar.f28605a);
        try {
            n.b();
        } catch (n.a e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            t8.m mVar = new t8.m("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f28599d = mVar;
            this.f28600e = mVar.j("uMvpMatrix");
            this.f28601f = this.f28599d.j("uTexMatrix");
            this.f28602g = this.f28599d.e("aPosition");
            this.f28603h = this.f28599d.e("aTexCoords");
            this.f28604i = this.f28599d.j("uTexture");
        } catch (n.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f28596a = eVar.f28584c;
            a aVar = new a(eVar.f28582a.a(0));
            this.f28597b = aVar;
            if (!eVar.f28585d) {
                aVar = new a(eVar.f28583b.a(0));
            }
            this.f28598c = aVar;
        }
    }
}
