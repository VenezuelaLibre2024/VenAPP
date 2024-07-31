package v6;

import java.nio.ByteBuffer;
import v6.i;

/* loaded from: classes.dex */
final class y0 extends z {

    /* renamed from: i, reason: collision with root package name */
    private int f28222i;

    /* renamed from: j, reason: collision with root package name */
    private int f28223j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28224k;

    /* renamed from: l, reason: collision with root package name */
    private int f28225l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f28226m = t8.r0.f26749f;

    /* renamed from: n, reason: collision with root package name */
    private int f28227n;

    /* renamed from: o, reason: collision with root package name */
    private long f28228o;

    @Override // v6.z, v6.i
    public ByteBuffer b() {
        int i10;
        if (super.e() && (i10 = this.f28227n) > 0) {
            l(i10).put(this.f28226m, 0, this.f28227n).flip();
            this.f28227n = 0;
        }
        return super.b();
    }

    @Override // v6.i
    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f28225l);
        this.f28228o += min / this.f28229b.f28064d;
        this.f28225l -= min;
        byteBuffer.position(position + min);
        if (this.f28225l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f28227n + i11) - this.f28226m.length;
        ByteBuffer l10 = l(length);
        int q10 = t8.r0.q(length, 0, this.f28227n);
        l10.put(this.f28226m, 0, q10);
        int q11 = t8.r0.q(length - q10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + q11);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - q11;
        int i13 = this.f28227n - q10;
        this.f28227n = i13;
        byte[] bArr = this.f28226m;
        System.arraycopy(bArr, q10, bArr, 0, i13);
        byteBuffer.get(this.f28226m, this.f28227n, i12);
        this.f28227n += i12;
        l10.flip();
    }

    @Override // v6.z, v6.i
    public boolean e() {
        return super.e() && this.f28227n == 0;
    }

    @Override // v6.z
    public i.a h(i.a aVar) {
        if (aVar.f28063c != 2) {
            throw new i.b(aVar);
        }
        this.f28224k = true;
        return (this.f28222i == 0 && this.f28223j == 0) ? i.a.f28060e : aVar;
    }

    @Override // v6.z
    protected void i() {
        if (this.f28224k) {
            this.f28224k = false;
            int i10 = this.f28223j;
            int i11 = this.f28229b.f28064d;
            this.f28226m = new byte[i10 * i11];
            this.f28225l = this.f28222i * i11;
        }
        this.f28227n = 0;
    }

    @Override // v6.z
    protected void j() {
        if (this.f28224k) {
            if (this.f28227n > 0) {
                this.f28228o += r0 / this.f28229b.f28064d;
            }
            this.f28227n = 0;
        }
    }

    @Override // v6.z
    protected void k() {
        this.f28226m = t8.r0.f26749f;
    }

    public long m() {
        return this.f28228o;
    }

    public void n() {
        this.f28228o = 0L;
    }

    public void o(int i10, int i11) {
        this.f28222i = i10;
        this.f28223j = i11;
    }
}
