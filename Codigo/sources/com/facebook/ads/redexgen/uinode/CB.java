package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CB extends WW implements InterfaceC0892El {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC0840Bv A05;
    public final InterfaceC0949Gt A06;
    public final Object A07;
    public final String A08;

    public CB(Uri uri, InterfaceC0949Gt interfaceC0949Gt, InterfaceC0840Bv interfaceC0840Bv, int i10, String str, int i11, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0949Gt;
        this.A05 = interfaceC0840Bv;
        this.A03 = i10;
        this.A08 = str;
        this.A02 = i11;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j10, boolean z10) {
        this.A00 = j10;
        this.A01 = z10;
        A01(new WN(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.uinode.WW
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.uinode.WW
    public final void A03(Y6 y62, boolean z10) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0897Eq
    public final WP A4k(C0895Eo c0895Eo, InterfaceC0942Gm interfaceC0942Gm) {
        AbstractC0955Ha.A03(c0895Eo.A02 == 0);
        return new CD(this.A04, this.A06.A4X(), this.A05.A4b(), this.A03, A00(c0895Eo), this, interfaceC0942Gm, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0897Eq
    public final void AAO() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0892El
    public final void AD9(long j10, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (this.A00 == j10 && this.A01 == z10) {
            return;
        }
        A00(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0897Eq
    public final void AEa(WP wp) {
        ((CD) wp).A0R();
    }
}
