package p396v6;

import java.nio.ByteBuffer;
import p363t8.C11172r0;
import p396v6.InterfaceC11647i;

/* renamed from: v6.y0 */
/* loaded from: classes.dex */
final class C11680y0 extends AbstractC11681z {

    /* renamed from: i */
    private int f30591i;

    /* renamed from: j */
    private int f30592j;

    /* renamed from: k */
    private boolean f30593k;

    /* renamed from: l */
    private int f30594l;

    /* renamed from: m */
    private byte[] f30595m = C11172r0.f29045f;

    /* renamed from: n */
    private int f30596n;

    /* renamed from: o */
    private long f30597o;

    @Override // p396v6.AbstractC11681z, p396v6.InterfaceC11647i
    /* renamed from: b */
    public ByteBuffer mo36622b() {
        int i10;
        if (super.mo36624e() && (i10 = this.f30596n) > 0) {
            m36798l(i10).put(this.f30595m, 0, this.f30596n).flip();
            this.f30596n = 0;
        }
        return super.mo36622b();
    }

    @Override // p396v6.InterfaceC11647i
    /* renamed from: d */
    public void mo36464d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f30594l);
        this.f30597o += min / this.f30598b.f30414d;
        this.f30594l -= min;
        byteBuffer.position(position + min);
        if (this.f30594l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f30596n + i11) - this.f30595m.length;
        ByteBuffer m36798l = m36798l(length);
        int m34942q = C11172r0.m34942q(length, 0, this.f30596n);
        m36798l.put(this.f30595m, 0, m34942q);
        int m34942q2 = C11172r0.m34942q(length - m34942q, 0, i11);
        byteBuffer.limit(byteBuffer.position() + m34942q2);
        m36798l.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - m34942q2;
        int i13 = this.f30596n - m34942q;
        this.f30596n = i13;
        byte[] bArr = this.f30595m;
        System.arraycopy(bArr, m34942q, bArr, 0, i13);
        byteBuffer.get(this.f30595m, this.f30596n, i12);
        this.f30596n += i12;
        m36798l.flip();
    }

    @Override // p396v6.AbstractC11681z, p396v6.InterfaceC11647i
    /* renamed from: e */
    public boolean mo36624e() {
        return super.mo36624e() && this.f30596n == 0;
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: h */
    public InterfaceC11647i.a mo36465h(InterfaceC11647i.a aVar) {
        if (aVar.f30413c != 2) {
            throw new InterfaceC11647i.b(aVar);
        }
        this.f30593k = true;
        return (this.f30591i == 0 && this.f30592j == 0) ? InterfaceC11647i.a.f30410e : aVar;
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: i */
    protected void mo36466i() {
        if (this.f30593k) {
            this.f30593k = false;
            int i10 = this.f30592j;
            int i11 = this.f30598b.f30414d;
            this.f30595m = new byte[i10 * i11];
            this.f30594l = this.f30591i * i11;
        }
        this.f30596n = 0;
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: j */
    protected void mo36732j() {
        if (this.f30593k) {
            if (this.f30596n > 0) {
                this.f30597o += r0 / this.f30598b.f30414d;
            }
            this.f30596n = 0;
        }
    }

    @Override // p396v6.AbstractC11681z
    /* renamed from: k */
    protected void mo36467k() {
        this.f30595m = C11172r0.f29045f;
    }

    /* renamed from: m */
    public long m36794m() {
        return this.f30597o;
    }

    /* renamed from: n */
    public void m36795n() {
        this.f30597o = 0L;
    }

    /* renamed from: o */
    public void m36796o(int i10, int i11) {
        this.f30591i = i10;
        this.f30592j = i11;
    }
}
