package androidx.collection;

/* loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f2850e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private boolean f2851a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f2852b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f2853c;

    /* renamed from: d, reason: collision with root package name */
    private int f2854d;

    public e() {
        this(10);
    }

    public e(int i10) {
        this.f2851a = false;
        if (i10 == 0) {
            this.f2852b = d.f2848b;
            this.f2853c = d.f2849c;
        } else {
            int f10 = d.f(i10);
            this.f2852b = new long[f10];
            this.f2853c = new Object[f10];
        }
    }

    private void c() {
        int i10 = this.f2854d;
        long[] jArr = this.f2852b;
        Object[] objArr = this.f2853c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f2850e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f2851a = false;
        this.f2854d = i11;
    }

    public void a() {
        int i10 = this.f2854d;
        Object[] objArr = this.f2853c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f2854d = 0;
        this.f2851a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f2852b = (long[]) this.f2852b.clone();
            eVar.f2853c = (Object[]) this.f2853c.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E d(long j10) {
        return e(j10, null);
    }

    public E e(long j10, E e10) {
        E e11;
        int b10 = d.b(this.f2852b, this.f2854d, j10);
        return (b10 < 0 || (e11 = (E) this.f2853c[b10]) == f2850e) ? e10 : e11;
    }

    public int g(long j10) {
        if (this.f2851a) {
            c();
        }
        return d.b(this.f2852b, this.f2854d, j10);
    }

    public long h(int i10) {
        if (this.f2851a) {
            c();
        }
        return this.f2852b[i10];
    }

    public void i(long j10, E e10) {
        int b10 = d.b(this.f2852b, this.f2854d, j10);
        if (b10 >= 0) {
            this.f2853c[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f2854d;
        if (i10 < i11) {
            Object[] objArr = this.f2853c;
            if (objArr[i10] == f2850e) {
                this.f2852b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f2851a && i11 >= this.f2852b.length) {
            c();
            i10 = ~d.b(this.f2852b, this.f2854d, j10);
        }
        int i12 = this.f2854d;
        if (i12 >= this.f2852b.length) {
            int f10 = d.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f2852b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2853c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2852b = jArr;
            this.f2853c = objArr2;
        }
        int i13 = this.f2854d;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f2852b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f2853c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f2854d - i10);
        }
        this.f2852b[i10] = j10;
        this.f2853c[i10] = e10;
        this.f2854d++;
    }

    public void j(long j10) {
        int b10 = d.b(this.f2852b, this.f2854d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f2853c;
            Object obj = objArr[b10];
            Object obj2 = f2850e;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f2851a = true;
            }
        }
    }

    public void k(int i10) {
        Object[] objArr = this.f2853c;
        Object obj = objArr[i10];
        Object obj2 = f2850e;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f2851a = true;
        }
    }

    public int l() {
        if (this.f2851a) {
            c();
        }
        return this.f2854d;
    }

    public E m(int i10) {
        if (this.f2851a) {
            c();
        }
        return (E) this.f2853c[i10];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2854d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f2854d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i10));
            sb2.append('=');
            E m10 = m(i10);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
