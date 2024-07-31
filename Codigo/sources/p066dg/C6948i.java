package p066dg;

/* renamed from: dg.i */
/* loaded from: classes2.dex */
public final class C6948i extends AbstractC6949j {

    /* renamed from: c */
    private final AbstractC6949j f15487c;

    public C6948i(AbstractC6949j abstractC6949j) {
        super(abstractC6949j.m20102d(), abstractC6949j.m20101a());
        this.f15487c = abstractC6949j;
    }

    @Override // p066dg.AbstractC6949j
    /* renamed from: b */
    public byte[] mo20096b() {
        byte[] mo20096b = this.f15487c.mo20096b();
        int m20102d = m20102d() * m20101a();
        byte[] bArr = new byte[m20102d];
        for (int i10 = 0; i10 < m20102d; i10++) {
            bArr[i10] = (byte) (255 - (mo20096b[i10] & 255));
        }
        return bArr;
    }

    @Override // p066dg.AbstractC6949j
    /* renamed from: c */
    public byte[] mo20097c(int i10, byte[] bArr) {
        byte[] mo20097c = this.f15487c.mo20097c(i10, bArr);
        int m20102d = m20102d();
        for (int i11 = 0; i11 < m20102d; i11++) {
            mo20097c[i11] = (byte) (255 - (mo20097c[i11] & 255));
        }
        return mo20097c;
    }

    @Override // p066dg.AbstractC6949j
    /* renamed from: e */
    public AbstractC6949j mo20098e() {
        return this.f15487c;
    }

    @Override // p066dg.AbstractC6949j
    /* renamed from: f */
    public boolean mo20099f() {
        return this.f15487c.mo20099f();
    }

    @Override // p066dg.AbstractC6949j
    /* renamed from: g */
    public AbstractC6949j mo20100g() {
        return new C6948i(this.f15487c.mo20100g());
    }
}
