package p396v6;

import java.nio.ByteBuffer;
import p363t8.C11137a;
import p363t8.C11172r0;
import p396v6.InterfaceC11647i;

/* renamed from: v6.v0 */
/* loaded from: classes.dex */
public final class C11674v0 extends AbstractC11681z {

    /* renamed from: i */
    private final long f30496i;

    /* renamed from: j */
    private final long f30497j;

    /* renamed from: k */
    private final short f30498k;

    /* renamed from: l */
    private int f30499l;

    /* renamed from: m */
    private boolean f30500m;

    /* renamed from: n */
    private byte[] f30501n;

    /* renamed from: o */
    private byte[] f30502o;

    /* renamed from: p */
    private int f30503p;

    /* renamed from: q */
    private int f30504q;

    /* renamed from: r */
    private int f30505r;

    /* renamed from: s */
    private boolean f30506s;

    /* renamed from: t */
    private long f30507t;

    public C11674v0() {
        this(150000L, 20000L, (short) 1024);
    }

    public C11674v0(long j10, long j11, short s10) {
        C11137a.m34599a(j11 <= j10);
        this.f30496i = j10;
        this.f30497j = j11;
        this.f30498k = s10;
        byte[] bArr = C11172r0.f29045f;
        this.f30501n = bArr;
        this.f30502o = bArr;
    }

    /* renamed from: m */
    private int m36723m(long j10) {
        return (int) ((j10 * this.f30598b.f30411a) / 1000000);
    }

    /* renamed from: n */
    private int m36724n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.f30498k);
        int i10 = this.f30499l;
        return ((limit / i10) * i10) + i10;
    }

    /* renamed from: o */
    private int m36725o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f30498k) {
                int i10 = this.f30499l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: q */
    private void m36726q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m36798l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f30506s = true;
        }
    }

    /* renamed from: r */
    private void m36727r(byte[] bArr, int i10) {
        m36798l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f30506s = true;
        }
    }

    /* renamed from: s */
    private void m36728s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m36725o = m36725o(byteBuffer);
        int position = m36725o - byteBuffer.position();
        byte[] bArr = this.f30501n;
        int length = bArr.length;
        int i10 = this.f30504q;
        int i11 = length - i10;
        if (m36725o < limit && position < i11) {
            m36727r(bArr, i10);
            this.f30504q = 0;
            this.f30503p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f30501n, this.f30504q, min);
        int i12 = this.f30504q + min;
        this.f30504q = i12;
        byte[] bArr2 = this.f30501n;
        if (i12 == bArr2.length) {
            if (this.f30506s) {
                m36727r(bArr2, this.f30505r);
                this.f30507t += (this.f30504q - (this.f30505r * 2)) / this.f30499l;
            } else {
                this.f30507t += (i12 - this.f30505r) / this.f30499l;
            }
            m36731w(byteBuffer, this.f30501n, this.f30504q);
            this.f30504q = 0;
            this.f30503p = 2;
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: t */
    private void m36729t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f30501n.length));
        int m36724n = m36724n(byteBuffer);
        if (m36724n == byteBuffer.position()) {
            this.f30503p = 1;
        } else {
            byteBuffer.limit(m36724n);
            m36726q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: u */
    private void m36730u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m36725o = m36725o(byteBuffer);
        byteBuffer.limit(m36725o);
        this.f30507t += byteBuffer.remaining() / this.f30499l;
        m36731w(byteBuffer, this.f30502o, this.f30505r);
        if (m36725o < limit) {
            m36727r(this.f30502o, this.f30505r);
            this.f30503p = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: w */
    private void m36731w(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f30505r);
        int i11 = this.f30505r - min;
        System.arraycopy(bArr, i10 - i11, this.f30502o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f30502o, i11, min);
    }

    @Override // p396v6.AbstractC11681z, p396v6.InterfaceC11647i
    /* renamed from: a */
    public boolean mo36621a() {
        return this.f30500m;
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: d */
    public void mo36464d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m36797g()) {
            int i10 = this.f30503p;
            if (i10 == 0) {
                m36729t(byteBuffer);
            } else if (i10 == 1) {
                m36728s(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                m36730u(byteBuffer);
            }
        }
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: h */
    public InterfaceC11647i.a mo36465h(InterfaceC11647i.a aVar) {
        if (aVar.f30413c == 2) {
            return this.f30500m ? aVar : InterfaceC11647i.a.f30410e;
        }
        throw new InterfaceC11647i.b(aVar);
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: i */
    protected void mo36466i() {
        if (this.f30500m) {
            this.f30499l = this.f30598b.f30414d;
            int m36723m = m36723m(this.f30496i) * this.f30499l;
            if (this.f30501n.length != m36723m) {
                this.f30501n = new byte[m36723m];
            }
            int m36723m2 = m36723m(this.f30497j) * this.f30499l;
            this.f30505r = m36723m2;
            if (this.f30502o.length != m36723m2) {
                this.f30502o = new byte[m36723m2];
            }
        }
        this.f30503p = 0;
        this.f30507t = 0L;
        this.f30504q = 0;
        this.f30506s = false;
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: j */
    protected void mo36732j() {
        int i10 = this.f30504q;
        if (i10 > 0) {
            m36727r(this.f30501n, i10);
        }
        if (this.f30506s) {
            return;
        }
        this.f30507t += this.f30505r / this.f30499l;
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: k */
    protected void mo36467k() {
        this.f30500m = false;
        this.f30505r = 0;
        byte[] bArr = C11172r0.f29045f;
        this.f30501n = bArr;
        this.f30502o = bArr;
    }

    /* renamed from: p */
    public long m36733p() {
        return this.f30507t;
    }

    /* renamed from: v */
    public void m36734v(boolean z10) {
        this.f30500m = z10;
    }
}
