package androidx.collection;

/* loaded from: classes.dex */
public class i<E> implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f2877e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private boolean f2878a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f2879b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f2880c;

    /* renamed from: d, reason: collision with root package name */
    private int f2881d;

    public i() {
        this(10);
    }

    public i(int i10) {
        this.f2878a = false;
        if (i10 == 0) {
            this.f2879b = d.f2847a;
            this.f2880c = d.f2849c;
        } else {
            int e10 = d.e(i10);
            this.f2879b = new int[e10];
            this.f2880c = new Object[e10];
        }
    }

    private void d() {
        int i10 = this.f2881d;
        int[] iArr = this.f2879b;
        Object[] objArr = this.f2880c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f2877e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f2878a = false;
        this.f2881d = i11;
    }

    public void a(int i10, E e10) {
        int i11 = this.f2881d;
        if (i11 != 0 && i10 <= this.f2879b[i11 - 1]) {
            i(i10, e10);
            return;
        }
        if (this.f2878a && i11 >= this.f2879b.length) {
            d();
        }
        int i12 = this.f2881d;
        if (i12 >= this.f2879b.length) {
            int e11 = d.e(i12 + 1);
            int[] iArr = new int[e11];
            Object[] objArr = new Object[e11];
            int[] iArr2 = this.f2879b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2880c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2879b = iArr;
            this.f2880c = objArr;
        }
        this.f2879b[i12] = i10;
        this.f2880c[i12] = e10;
        this.f2881d = i12 + 1;
    }

    public void b() {
        int i10 = this.f2881d;
        Object[] objArr = this.f2880c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f2881d = 0;
        this.f2878a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f2879b = (int[]) this.f2879b.clone();
            iVar.f2880c = (Object[]) this.f2880c.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E e(int i10) {
        return g(i10, null);
    }

    public E g(int i10, E e10) {
        E e11;
        int a10 = d.a(this.f2879b, this.f2881d, i10);
        return (a10 < 0 || (e11 = (E) this.f2880c[a10]) == f2877e) ? e10 : e11;
    }

    public int h(int i10) {
        if (this.f2878a) {
            d();
        }
        return this.f2879b[i10];
    }

    public void i(int i10, E e10) {
        int a10 = d.a(this.f2879b, this.f2881d, i10);
        if (a10 >= 0) {
            this.f2880c[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f2881d;
        if (i11 < i12) {
            Object[] objArr = this.f2880c;
            if (objArr[i11] == f2877e) {
                this.f2879b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f2878a && i12 >= this.f2879b.length) {
            d();
            i11 = ~d.a(this.f2879b, this.f2881d, i10);
        }
        int i13 = this.f2881d;
        if (i13 >= this.f2879b.length) {
            int e11 = d.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f2879b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2880c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2879b = iArr;
            this.f2880c = objArr2;
        }
        int i14 = this.f2881d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f2879b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f2880c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f2881d - i11);
        }
        this.f2879b[i11] = i10;
        this.f2880c[i11] = e10;
        this.f2881d++;
    }

    public int j() {
        if (this.f2878a) {
            d();
        }
        return this.f2881d;
    }

    public E k(int i10) {
        if (this.f2878a) {
            d();
        }
        return (E) this.f2880c[i10];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2881d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f2881d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i10));
            sb2.append('=');
            E k10 = k(i10);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
