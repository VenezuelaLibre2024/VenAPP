package p142hg;

import kg.C9263a;

/* renamed from: hg.b */
/* loaded from: classes2.dex */
final class C7730b extends AbstractC7735g {

    /* renamed from: c */
    private final int f18414c;

    /* renamed from: d */
    private final int f18415d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7730b(AbstractC7735g abstractC7735g, int i10, int i11) {
        super(abstractC7735g);
        this.f18414c = i10;
        this.f18415d = i11;
    }

    @Override // p142hg.AbstractC7735g
    /* renamed from: c */
    public void mo23577c(C9263a c9263a, byte[] bArr) {
        int i10 = this.f18415d;
        int i11 = 0;
        while (i11 < i10) {
            if (i11 == 0 || (i11 == 31 && i10 <= 62)) {
                c9263a.m27583c(31, 5);
                if (i10 > 62) {
                    c9263a.m27583c(i10 - 31, 16);
                } else {
                    c9263a.m27583c(i11 == 0 ? Math.min(i10, 31) : i10 - 31, 5);
                }
            }
            c9263a.m27583c(bArr[this.f18414c + i11], 8);
            i11++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(this.f18414c);
        sb2.append("::");
        sb2.append((this.f18414c + this.f18415d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
