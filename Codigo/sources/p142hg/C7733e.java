package p142hg;

import kg.C9263a;

/* renamed from: hg.e */
/* loaded from: classes2.dex */
final class C7733e extends AbstractC7735g {

    /* renamed from: c */
    private final short f18424c;

    /* renamed from: d */
    private final short f18425d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7733e(AbstractC7735g abstractC7735g, int i10, int i11) {
        super(abstractC7735g);
        this.f18424c = (short) i10;
        this.f18425d = (short) i11;
    }

    @Override // p142hg.AbstractC7735g
    /* renamed from: c */
    void mo23577c(C9263a c9263a, byte[] bArr) {
        c9263a.m27583c(this.f18424c, this.f18425d);
    }

    public String toString() {
        short s10 = this.f18424c;
        short s11 = this.f18425d;
        return '<' + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f18425d)).substring(1) + '>';
    }
}
