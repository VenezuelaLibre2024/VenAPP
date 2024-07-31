package e1;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f14350f;

    /* renamed from: g, reason: collision with root package name */
    private static final FloatBuffer f14351g;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f14352a;

    /* renamed from: b, reason: collision with root package name */
    private final FloatBuffer f14353b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14354c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14355d;

    /* renamed from: e, reason: collision with root package name */
    private f f14356e;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f14350f = fArr;
        f14351g = b(fArr);
    }

    public a(f fVar, int i10, int i11) {
        float[] fArr = new float[8];
        this.f14352a = fArr;
        this.f14353b = b(fArr);
        this.f14356e = fVar;
        this.f14354c = i10;
        this.f14355d = i11;
    }

    public static FloatBuffer b(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public void a(int i10, float[] fArr, Rect rect) {
        f(rect);
        this.f14356e.e(f.f14423h, f14351g, 0, 4, 2, 8, fArr, this.f14353b, i10, 8);
    }

    public int c() {
        return this.f14356e.d();
    }

    public void d(int i10, Bitmap bitmap) {
        this.f14356e.g(i10, bitmap);
    }

    public void e(boolean z10) {
        f fVar = this.f14356e;
        if (fVar != null) {
            if (z10) {
                fVar.h();
            }
            this.f14356e = null;
        }
    }

    void f(Rect rect) {
        float[] fArr = this.f14352a;
        int i10 = rect.left;
        int i11 = this.f14354c;
        fArr[0] = i10 / i11;
        int i12 = rect.bottom;
        int i13 = this.f14355d;
        fArr[1] = 1.0f - (i12 / i13);
        int i14 = rect.right;
        fArr[2] = i14 / i11;
        fArr[3] = 1.0f - (i12 / i13);
        fArr[4] = i10 / i11;
        int i15 = rect.top;
        fArr[5] = 1.0f - (i15 / i13);
        fArr[6] = i14 / i11;
        fArr[7] = 1.0f - (i15 / i13);
        this.f14353b.put(fArr);
        this.f14353b.position(0);
    }
}
