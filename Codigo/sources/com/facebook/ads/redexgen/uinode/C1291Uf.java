package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1291Uf implements LU {
    public int A00;
    public final LU A01;

    public C1291Uf(LU lu, int i10) {
        this.A01 = lu;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.LU
    public final void AE8(String str) {
        if (this.A00 > 0) {
            this.A01.AE8(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.LU
    public final void flush() {
        this.A01.flush();
    }
}
