package p363t8;

import java.util.Arrays;

/* renamed from: t8.m0 */
/* loaded from: classes.dex */
public final class C11162m0<V> {

    /* renamed from: a */
    private long[] f29011a;

    /* renamed from: b */
    private V[] f29012b;

    /* renamed from: c */
    private int f29013c;

    /* renamed from: d */
    private int f29014d;

    public C11162m0() {
        this(10);
    }

    public C11162m0(int i10) {
        this.f29011a = new long[i10];
        this.f29012b = (V[]) m34802f(i10);
    }

    /* renamed from: b */
    private void m34799b(long j10, V v10) {
        int i10 = this.f29013c;
        int i11 = this.f29014d;
        V[] vArr = this.f29012b;
        int length = (i10 + i11) % vArr.length;
        this.f29011a[length] = j10;
        vArr[length] = v10;
        this.f29014d = i11 + 1;
    }

    /* renamed from: d */
    private void m34800d(long j10) {
        if (this.f29014d > 0) {
            if (j10 <= this.f29011a[((this.f29013c + r0) - 1) % this.f29012b.length]) {
                m34806c();
            }
        }
    }

    /* renamed from: e */
    private void m34801e() {
        int length = this.f29012b.length;
        if (this.f29014d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) m34802f(i10);
        int i11 = this.f29013c;
        int i12 = length - i11;
        System.arraycopy(this.f29011a, i11, jArr, 0, i12);
        System.arraycopy(this.f29012b, this.f29013c, vArr, 0, i12);
        int i13 = this.f29013c;
        if (i13 > 0) {
            System.arraycopy(this.f29011a, 0, jArr, i12, i13);
            System.arraycopy(this.f29012b, 0, vArr, i12, this.f29013c);
        }
        this.f29011a = jArr;
        this.f29012b = vArr;
        this.f29013c = 0;
    }

    /* renamed from: f */
    private static <V> V[] m34802f(int i10) {
        return (V[]) new Object[i10];
    }

    /* renamed from: h */
    private V m34803h(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f29014d > 0) {
            long j12 = j10 - this.f29011a[this.f29013c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = m34804k();
            j11 = j12;
        }
        return v10;
    }

    /* renamed from: k */
    private V m34804k() {
        C11137a.m34605g(this.f29014d > 0);
        V[] vArr = this.f29012b;
        int i10 = this.f29013c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f29013c = (i10 + 1) % vArr.length;
        this.f29014d--;
        return v10;
    }

    /* renamed from: a */
    public synchronized void m34805a(long j10, V v10) {
        m34800d(j10);
        m34801e();
        m34799b(j10, v10);
    }

    /* renamed from: c */
    public synchronized void m34806c() {
        this.f29013c = 0;
        this.f29014d = 0;
        Arrays.fill(this.f29012b, (Object) null);
    }

    /* renamed from: g */
    public synchronized V m34807g(long j10) {
        return m34803h(j10, false);
    }

    /* renamed from: i */
    public synchronized V m34808i() {
        return this.f29014d == 0 ? null : m34804k();
    }

    /* renamed from: j */
    public synchronized V m34809j(long j10) {
        return m34803h(j10, true);
    }

    /* renamed from: l */
    public synchronized int m34810l() {
        return this.f29014d;
    }
}
