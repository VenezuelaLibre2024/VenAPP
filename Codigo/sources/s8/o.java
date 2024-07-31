package s8;

import java.util.Arrays;
import s8.b;
import t8.r0;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25318a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25319b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f25320c;

    /* renamed from: d, reason: collision with root package name */
    private int f25321d;

    /* renamed from: e, reason: collision with root package name */
    private int f25322e;

    /* renamed from: f, reason: collision with root package name */
    private int f25323f;

    /* renamed from: g, reason: collision with root package name */
    private a[] f25324g;

    public o(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public o(boolean z10, int i10, int i11) {
        t8.a.a(i10 > 0);
        t8.a.a(i11 >= 0);
        this.f25318a = z10;
        this.f25319b = i10;
        this.f25323f = i11;
        this.f25324g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f25320c = null;
            return;
        }
        this.f25320c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f25324g[i12] = new a(this.f25320c, i12 * i10);
        }
    }

    @Override // s8.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f25324g;
        int i10 = this.f25323f;
        this.f25323f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f25322e--;
        notifyAll();
    }

    @Override // s8.b
    public synchronized a b() {
        a aVar;
        this.f25322e++;
        int i10 = this.f25323f;
        if (i10 > 0) {
            a[] aVarArr = this.f25324g;
            int i11 = i10 - 1;
            this.f25323f = i11;
            aVar = (a) t8.a.e(aVarArr[i11]);
            this.f25324g[this.f25323f] = null;
        } else {
            aVar = new a(new byte[this.f25319b], 0);
            int i12 = this.f25322e;
            a[] aVarArr2 = this.f25324g;
            if (i12 > aVarArr2.length) {
                this.f25324g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override // s8.b
    public synchronized void c() {
        int i10 = 0;
        int max = Math.max(0, r0.l(this.f25321d, this.f25319b) - this.f25322e);
        int i11 = this.f25323f;
        if (max >= i11) {
            return;
        }
        if (this.f25320c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) t8.a.e(this.f25324g[i10]);
                if (aVar.f25185a == this.f25320c) {
                    i10++;
                } else {
                    a aVar2 = (a) t8.a.e(this.f25324g[i12]);
                    if (aVar2.f25185a != this.f25320c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f25324g;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f25323f) {
                return;
            }
        }
        Arrays.fill(this.f25324g, max, this.f25323f, (Object) null);
        this.f25323f = max;
    }

    @Override // s8.b
    public synchronized void d(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f25324g;
            int i10 = this.f25323f;
            this.f25323f = i10 + 1;
            aVarArr[i10] = aVar.a();
            this.f25322e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // s8.b
    public int e() {
        return this.f25319b;
    }

    public synchronized int f() {
        return this.f25322e * this.f25319b;
    }

    public synchronized void g() {
        if (this.f25318a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f25321d;
        this.f25321d = i10;
        if (z10) {
            c();
        }
    }
}
