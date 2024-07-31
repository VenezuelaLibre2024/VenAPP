package dg;

/* loaded from: classes2.dex */
public final class i extends j {

    /* renamed from: c */
    private final j f14133c;

    public i(j jVar) {
        super(jVar.d(), jVar.a());
        this.f14133c = jVar;
    }

    @Override // dg.j
    public byte[] b() {
        byte[] b10 = this.f14133c.b();
        int d10 = d() * a();
        byte[] bArr = new byte[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            bArr[i10] = (byte) (255 - (b10[i10] & 255));
        }
        return bArr;
    }

    @Override // dg.j
    public byte[] c(int i10, byte[] bArr) {
        byte[] c10 = this.f14133c.c(i10, bArr);
        int d10 = d();
        for (int i11 = 0; i11 < d10; i11++) {
            c10[i11] = (byte) (255 - (c10[i11] & 255));
        }
        return c10;
    }

    @Override // dg.j
    public j e() {
        return this.f14133c;
    }

    @Override // dg.j
    public boolean f() {
        return this.f14133c.f();
    }

    @Override // dg.j
    public j g() {
        return new i(this.f14133c.g());
    }
}
