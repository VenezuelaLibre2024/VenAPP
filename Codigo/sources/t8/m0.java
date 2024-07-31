package t8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f26715a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f26716b;

    /* renamed from: c, reason: collision with root package name */
    private int f26717c;

    /* renamed from: d, reason: collision with root package name */
    private int f26718d;

    public m0() {
        this(10);
    }

    public m0(int i10) {
        this.f26715a = new long[i10];
        this.f26716b = (V[]) f(i10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f26717c;
        int i11 = this.f26718d;
        V[] vArr = this.f26716b;
        int length = (i10 + i11) % vArr.length;
        this.f26715a[length] = j10;
        vArr[length] = v10;
        this.f26718d = i11 + 1;
    }

    private void d(long j10) {
        if (this.f26718d > 0) {
            if (j10 <= this.f26715a[((this.f26717c + r0) - 1) % this.f26716b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f26716b.length;
        if (this.f26718d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f26717c;
        int i12 = length - i11;
        System.arraycopy(this.f26715a, i11, jArr, 0, i12);
        System.arraycopy(this.f26716b, this.f26717c, vArr, 0, i12);
        int i13 = this.f26717c;
        if (i13 > 0) {
            System.arraycopy(this.f26715a, 0, jArr, i12, i13);
            System.arraycopy(this.f26716b, 0, vArr, i12, this.f26717c);
        }
        this.f26715a = jArr;
        this.f26716b = vArr;
        this.f26717c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    private V h(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f26718d > 0) {
            long j12 = j10 - this.f26715a[this.f26717c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = k();
            j11 = j12;
        }
        return v10;
    }

    private V k() {
        a.g(this.f26718d > 0);
        V[] vArr = this.f26716b;
        int i10 = this.f26717c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f26717c = (i10 + 1) % vArr.length;
        this.f26718d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f26717c = 0;
        this.f26718d = 0;
        Arrays.fill(this.f26716b, (Object) null);
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public synchronized V i() {
        return this.f26718d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f26718d;
    }
}
