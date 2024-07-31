package v6;

import java.nio.ByteBuffer;
import v6.i;

/* loaded from: classes.dex */
public final class v0 extends z {

    /* renamed from: i, reason: collision with root package name */
    private final long f28134i;

    /* renamed from: j, reason: collision with root package name */
    private final long f28135j;

    /* renamed from: k, reason: collision with root package name */
    private final short f28136k;

    /* renamed from: l, reason: collision with root package name */
    private int f28137l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f28138m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f28139n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f28140o;

    /* renamed from: p, reason: collision with root package name */
    private int f28141p;

    /* renamed from: q, reason: collision with root package name */
    private int f28142q;

    /* renamed from: r, reason: collision with root package name */
    private int f28143r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f28144s;

    /* renamed from: t, reason: collision with root package name */
    private long f28145t;

    public v0() {
        this(150000L, 20000L, (short) 1024);
    }

    public v0(long j10, long j11, short s10) {
        t8.a.a(j11 <= j10);
        this.f28134i = j10;
        this.f28135j = j11;
        this.f28136k = s10;
        byte[] bArr = t8.r0.f26749f;
        this.f28139n = bArr;
        this.f28140o = bArr;
    }

    private int m(long j10) {
        return (int) ((j10 * this.f28229b.f28061a) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.f28136k);
        int i10 = this.f28137l;
        return ((limit / i10) * i10) + i10;
    }

    private int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f28136k) {
                int i10 = this.f28137l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f28144s = true;
        }
    }

    private void r(byte[] bArr, int i10) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f28144s = true;
        }
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        int position = o10 - byteBuffer.position();
        byte[] bArr = this.f28139n;
        int length = bArr.length;
        int i10 = this.f28142q;
        int i11 = length - i10;
        if (o10 < limit && position < i11) {
            r(bArr, i10);
            this.f28142q = 0;
            this.f28141p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f28139n, this.f28142q, min);
        int i12 = this.f28142q + min;
        this.f28142q = i12;
        byte[] bArr2 = this.f28139n;
        if (i12 == bArr2.length) {
            if (this.f28144s) {
                r(bArr2, this.f28143r);
                this.f28145t += (this.f28142q - (this.f28143r * 2)) / this.f28137l;
            } else {
                this.f28145t += (i12 - this.f28143r) / this.f28137l;
            }
            w(byteBuffer, this.f28139n, this.f28142q);
            this.f28142q = 0;
            this.f28141p = 2;
        }
        byteBuffer.limit(limit);
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f28139n.length));
        int n10 = n(byteBuffer);
        if (n10 == byteBuffer.position()) {
            this.f28141p = 1;
        } else {
            byteBuffer.limit(n10);
            q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        byteBuffer.limit(o10);
        this.f28145t += byteBuffer.remaining() / this.f28137l;
        w(byteBuffer, this.f28140o, this.f28143r);
        if (o10 < limit) {
            r(this.f28140o, this.f28143r);
            this.f28141p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void w(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f28143r);
        int i11 = this.f28143r - min;
        System.arraycopy(bArr, i10 - i11, this.f28140o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f28140o, i11, min);
    }

    @Override // v6.z, v6.i
    public boolean a() {
        return this.f28138m;
    }

    @Override // v6.i
    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f28141p;
            if (i10 == 0) {
                t(byteBuffer);
            } else if (i10 == 1) {
                s(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                u(byteBuffer);
            }
        }
    }

    @Override // v6.z
    public i.a h(i.a aVar) {
        if (aVar.f28063c == 2) {
            return this.f28138m ? aVar : i.a.f28060e;
        }
        throw new i.b(aVar);
    }

    @Override // v6.z
    protected void i() {
        if (this.f28138m) {
            this.f28137l = this.f28229b.f28064d;
            int m10 = m(this.f28134i) * this.f28137l;
            if (this.f28139n.length != m10) {
                this.f28139n = new byte[m10];
            }
            int m11 = m(this.f28135j) * this.f28137l;
            this.f28143r = m11;
            if (this.f28140o.length != m11) {
                this.f28140o = new byte[m11];
            }
        }
        this.f28141p = 0;
        this.f28145t = 0L;
        this.f28142q = 0;
        this.f28144s = false;
    }

    @Override // v6.z
    protected void j() {
        int i10 = this.f28142q;
        if (i10 > 0) {
            r(this.f28139n, i10);
        }
        if (this.f28144s) {
            return;
        }
        this.f28145t += this.f28143r / this.f28137l;
    }

    @Override // v6.z
    protected void k() {
        this.f28138m = false;
        this.f28143r = 0;
        byte[] bArr = t8.r0.f26749f;
        this.f28139n = bArr;
        this.f28140o = bArr;
    }

    public long p() {
        return this.f28145t;
    }

    public void v(boolean z10) {
        this.f28138m = z10;
    }
}
