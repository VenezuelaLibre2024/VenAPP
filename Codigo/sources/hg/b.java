package hg;

/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: c */
    private final int f16764c;

    /* renamed from: d */
    private final int f16765d;

    public b(g gVar, int i10, int i11) {
        super(gVar);
        this.f16764c = i10;
        this.f16765d = i11;
    }

    @Override // hg.g
    public void c(kg.a aVar, byte[] bArr) {
        int i10 = this.f16765d;
        int i11 = 0;
        while (i11 < i10) {
            if (i11 == 0 || (i11 == 31 && i10 <= 62)) {
                aVar.c(31, 5);
                if (i10 > 62) {
                    aVar.c(i10 - 31, 16);
                } else {
                    aVar.c(i11 == 0 ? Math.min(i10, 31) : i10 - 31, 5);
                }
            }
            aVar.c(bArr[this.f16764c + i11], 8);
            i11++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(this.f16764c);
        sb2.append("::");
        sb2.append((this.f16764c + this.f16765d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
