package r4;

import dk.m;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0412a f24699d = new C0412a(null);

    /* renamed from: a, reason: collision with root package name */
    private int[] f24700a;

    /* renamed from: b, reason: collision with root package name */
    private int f24701b;

    /* renamed from: c, reason: collision with root package name */
    private float[] f24702c;

    /* renamed from: r4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0412a {
        private C0412a() {
        }

        public /* synthetic */ C0412a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int[] iArr) {
            int x10;
            int i10 = 1;
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i11 = iArr[0];
            x10 = m.x(iArr);
            if (1 <= x10) {
                while (true) {
                    i11 *= iArr[i10];
                    if (i10 == x10) {
                        break;
                    }
                    i10++;
                }
            }
            return i11;
        }
    }

    public a(int[] shape) {
        n.e(shape, "shape");
        this.f24700a = shape;
        int b10 = f24699d.b(shape);
        this.f24701b = b10;
        this.f24702c = new float[b10];
    }

    public final float[] a() {
        return this.f24702c;
    }

    public final int b(int i10) {
        return this.f24700a[i10];
    }

    public final int c() {
        return this.f24700a.length;
    }

    public final void d(int[] shape) {
        n.e(shape, "shape");
        this.f24700a = shape;
        int b10 = f24699d.b(shape);
        float[] fArr = new float[b10];
        System.arraycopy(this.f24702c, 0, fArr, 0, Math.min(this.f24701b, b10));
        this.f24702c = fArr;
        this.f24701b = b10;
    }
}
