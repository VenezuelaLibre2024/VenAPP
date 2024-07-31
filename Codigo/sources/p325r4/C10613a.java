package p325r4;

import dk.C7021m;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: r4.a */
/* loaded from: classes.dex */
public final class C10613a {

    /* renamed from: d */
    public static final a f26813d = new a(null);

    /* renamed from: a */
    private int[] f26814a;

    /* renamed from: b */
    private int f26815b;

    /* renamed from: c */
    private float[] f26816c;

    /* renamed from: r4.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final int m32316b(int[] iArr) {
            int m20496x;
            int i10 = 1;
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i11 = iArr[0];
            m20496x = C7021m.m20496x(iArr);
            if (1 <= m20496x) {
                while (true) {
                    i11 *= iArr[i10];
                    if (i10 == m20496x) {
                        break;
                    }
                    i10++;
                }
            }
            return i11;
        }
    }

    public C10613a(int[] shape) {
        C9322n.m27781e(shape, "shape");
        this.f26814a = shape;
        int m32316b = f26813d.m32316b(shape);
        this.f26815b = m32316b;
        this.f26816c = new float[m32316b];
    }

    /* renamed from: a */
    public final float[] m32311a() {
        return this.f26816c;
    }

    /* renamed from: b */
    public final int m32312b(int i10) {
        return this.f26814a[i10];
    }

    /* renamed from: c */
    public final int m32313c() {
        return this.f26814a.length;
    }

    /* renamed from: d */
    public final void m32314d(int[] shape) {
        C9322n.m27781e(shape, "shape");
        this.f26814a = shape;
        int m32316b = f26813d.m32316b(shape);
        float[] fArr = new float[m32316b];
        System.arraycopy(this.f26816c, 0, fArr, 0, Math.min(this.f26815b, m32316b));
        this.f26816c = fArr;
        this.f26815b = m32316b;
    }
}
