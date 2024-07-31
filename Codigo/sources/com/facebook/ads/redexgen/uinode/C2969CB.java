package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.CB */
/* loaded from: assets/audience_network.dex */
public final class C2969CB extends AbstractC4199WW implements InterfaceC3110El {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC2953Bv A05;
    public final InterfaceC3238Gt A06;
    public final Object A07;
    public final String A08;

    public C2969CB(Uri uri, InterfaceC3238Gt interfaceC3238Gt, InterfaceC2953Bv interfaceC2953Bv, int i10, String str, int i11, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC3238Gt;
        this.A05 = interfaceC2953Bv;
        this.A03 = i10;
        this.A08 = str;
        this.A02 = i11;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j10, boolean z10) {
        this.A00 = j10;
        this.A01 = z10;
        A01(new C4190WN(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4199WW
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4199WW
    public final void A03(InterfaceC4294Y6 interfaceC4294Y6, boolean z10) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3115Eq
    public final InterfaceC4192WP A4k(C3113Eo c3113Eo, InterfaceC3231Gm interfaceC3231Gm) {
        AbstractC3281Ha.A03(c3113Eo.A02 == 0);
        return new C2971CD(this.A04, this.A06.A4X(), this.A05.A4b(), this.A03, A00(c3113Eo), this, interfaceC3231Gm, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3115Eq
    public final void AAO() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3110El
    public final void AD9(long j10, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (this.A00 == j10 && this.A01 == z10) {
            return;
        }
        A00(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3115Eq
    public final void AEa(InterfaceC4192WP interfaceC4192WP) {
        ((C2971CD) interfaceC4192WP).A0R();
    }
}
