package p072e1;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: e1.a */
/* loaded from: classes.dex */
public class C7091a {

    /* renamed from: f */
    private static final float[] f15708f;

    /* renamed from: g */
    private static final FloatBuffer f15709g;

    /* renamed from: a */
    private final float[] f15710a;

    /* renamed from: b */
    private final FloatBuffer f15711b;

    /* renamed from: c */
    private final int f15712c;

    /* renamed from: d */
    private final int f15713d;

    /* renamed from: e */
    private C7096f f15714e;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f15708f = fArr;
        f15709g = m20863b(fArr);
    }

    public C7091a(C7096f c7096f, int i10, int i11) {
        float[] fArr = new float[8];
        this.f15710a = fArr;
        this.f15711b = m20863b(fArr);
        this.f15714e = c7096f;
        this.f15712c = i10;
        this.f15713d = i11;
    }

    /* renamed from: b */
    public static FloatBuffer m20863b(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: a */
    public void m20864a(int i10, float[] fArr, Rect rect) {
        m20868f(rect);
        this.f15714e.m20921e(C7096f.f15795h, f15709g, 0, 4, 2, 8, fArr, this.f15711b, i10, 8);
    }

    /* renamed from: c */
    public int m20865c() {
        return this.f15714e.m20920d();
    }

    /* renamed from: d */
    public void m20866d(int i10, Bitmap bitmap) {
        this.f15714e.m20922g(i10, bitmap);
    }

    /* renamed from: e */
    public void m20867e(boolean z10) {
        C7096f c7096f = this.f15714e;
        if (c7096f != null) {
            if (z10) {
                c7096f.m20923h();
            }
            this.f15714e = null;
        }
    }

    /* renamed from: f */
    void m20868f(Rect rect) {
        float[] fArr = this.f15710a;
        int i10 = rect.left;
        int i11 = this.f15712c;
        fArr[0] = i10 / i11;
        int i12 = rect.bottom;
        int i13 = this.f15713d;
        fArr[1] = 1.0f - (i12 / i13);
        int i14 = rect.right;
        fArr[2] = i14 / i11;
        fArr[3] = 1.0f - (i12 / i13);
        fArr[4] = i10 / i11;
        int i15 = rect.top;
        fArr[5] = 1.0f - (i15 / i13);
        fArr[6] = i14 / i11;
        fArr[7] = 1.0f - (i15 / i13);
        this.f15711b.put(fArr);
        this.f15711b.position(0);
    }
}
