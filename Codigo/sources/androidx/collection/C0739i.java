package androidx.collection;

/* renamed from: androidx.collection.i */
/* loaded from: classes.dex */
public class C0739i<E> implements Cloneable {

    /* renamed from: e */
    private static final Object f3222e = new Object();

    /* renamed from: a */
    private boolean f3223a;

    /* renamed from: b */
    private int[] f3224b;

    /* renamed from: c */
    private Object[] f3225c;

    /* renamed from: d */
    private int f3226d;

    public C0739i() {
        this(10);
    }

    public C0739i(int i10) {
        this.f3223a = false;
        if (i10 == 0) {
            this.f3224b = C0734d.f3192a;
            this.f3225c = C0734d.f3194c;
        } else {
            int m3678e = C0734d.m3678e(i10);
            this.f3224b = new int[m3678e];
            this.f3225c = new Object[m3678e];
        }
    }

    /* renamed from: d */
    private void m3716d() {
        int i10 = this.f3226d;
        int[] iArr = this.f3224b;
        Object[] objArr = this.f3225c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f3222e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f3223a = false;
        this.f3226d = i11;
    }

    /* renamed from: a */
    public void m3717a(int i10, E e10) {
        int i11 = this.f3226d;
        if (i11 != 0 && i10 <= this.f3224b[i11 - 1]) {
            m3723i(i10, e10);
            return;
        }
        if (this.f3223a && i11 >= this.f3224b.length) {
            m3716d();
        }
        int i12 = this.f3226d;
        if (i12 >= this.f3224b.length) {
            int m3678e = C0734d.m3678e(i12 + 1);
            int[] iArr = new int[m3678e];
            Object[] objArr = new Object[m3678e];
            int[] iArr2 = this.f3224b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f3225c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3224b = iArr;
            this.f3225c = objArr;
        }
        this.f3224b[i12] = i10;
        this.f3225c[i12] = e10;
        this.f3226d = i12 + 1;
    }

    /* renamed from: b */
    public void m3718b() {
        int i10 = this.f3226d;
        Object[] objArr = this.f3225c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f3226d = 0;
        this.f3223a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0739i<E> clone() {
        try {
            C0739i<E> c0739i = (C0739i) super.clone();
            c0739i.f3224b = (int[]) this.f3224b.clone();
            c0739i.f3225c = (Object[]) this.f3225c.clone();
            return c0739i;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: e */
    public E m3720e(int i10) {
        return m3721g(i10, null);
    }

    /* renamed from: g */
    public E m3721g(int i10, E e10) {
        E e11;
        int m3674a = C0734d.m3674a(this.f3224b, this.f3226d, i10);
        return (m3674a < 0 || (e11 = (E) this.f3225c[m3674a]) == f3222e) ? e10 : e11;
    }

    /* renamed from: h */
    public int m3722h(int i10) {
        if (this.f3223a) {
            m3716d();
        }
        return this.f3224b[i10];
    }

    /* renamed from: i */
    public void m3723i(int i10, E e10) {
        int m3674a = C0734d.m3674a(this.f3224b, this.f3226d, i10);
        if (m3674a >= 0) {
            this.f3225c[m3674a] = e10;
            return;
        }
        int i11 = ~m3674a;
        int i12 = this.f3226d;
        if (i11 < i12) {
            Object[] objArr = this.f3225c;
            if (objArr[i11] == f3222e) {
                this.f3224b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f3223a && i12 >= this.f3224b.length) {
            m3716d();
            i11 = ~C0734d.m3674a(this.f3224b, this.f3226d, i10);
        }
        int i13 = this.f3226d;
        if (i13 >= this.f3224b.length) {
            int m3678e = C0734d.m3678e(i13 + 1);
            int[] iArr = new int[m3678e];
            Object[] objArr2 = new Object[m3678e];
            int[] iArr2 = this.f3224b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3225c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3224b = iArr;
            this.f3225c = objArr2;
        }
        int i14 = this.f3226d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f3224b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f3225c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f3226d - i11);
        }
        this.f3224b[i11] = i10;
        this.f3225c[i11] = e10;
        this.f3226d++;
    }

    /* renamed from: j */
    public int m3724j() {
        if (this.f3223a) {
            m3716d();
        }
        return this.f3226d;
    }

    /* renamed from: k */
    public E m3725k(int i10) {
        if (this.f3223a) {
            m3716d();
        }
        return (E) this.f3225c[i10];
    }

    public String toString() {
        if (m3724j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f3226d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f3226d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m3722h(i10));
            sb2.append('=');
            E m3725k = m3725k(i10);
            if (m3725k != this) {
                sb2.append(m3725k);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
