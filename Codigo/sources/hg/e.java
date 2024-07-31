package hg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f16774c;

    /* renamed from: d, reason: collision with root package name */
    private final short f16775d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, int i10, int i11) {
        super(gVar);
        this.f16774c = (short) i10;
        this.f16775d = (short) i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // hg.g
    public void c(kg.a aVar, byte[] bArr) {
        aVar.c(this.f16774c, this.f16775d);
    }

    public String toString() {
        short s10 = this.f16774c;
        short s11 = this.f16775d;
        return '<' + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f16775d)).substring(1) + '>';
    }
}
