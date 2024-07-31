package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.NativeAd;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ZB */
/* loaded from: assets/audience_network.dex */
public class C4361ZB implements InterfaceC26336U {
    public final List<C4491bK> A00;
    public final /* synthetic */ C4360ZA A01;

    public C4361ZB(C4360ZA c4360za, List<C4491bK> list) {
        this.A01 = c4360za;
        this.A00 = list;
    }

    private void A00() {
        C25905m c25905m;
        C25905m c25905m2;
        C25905m c25905m3;
        C4337Yn c4337Yn;
        C25905m c25905m4;
        C25905m c25905m5;
        C4337Yn c4337Yn2;
        c25905m = this.A01.A00;
        c25905m.A05(true);
        c25905m2 = this.A01.A00;
        c25905m2.A02();
        c25905m3 = this.A01.A00;
        c25905m3.A03(0);
        for (C4491bK c4491bK : this.A00) {
            c4337Yn = this.A01.A01;
            C4110V5 A0K = C4107V2.A0K();
            c25905m4 = this.A01.A00;
            C4107V2 c4107v2 = new C4107V2(c4337Yn, c4491bK, null, A0K, c25905m4.A01());
            if (c4107v2.A0y() != null && c4107v2.A0y().A0F() != null) {
                ((AbstractC4452ah) c4107v2.A0y().A0F()).A00(c4107v2);
            }
            c25905m5 = this.A01.A00;
            c4337Yn2 = this.A01.A01;
            c25905m5.A04(new NativeAd(c4337Yn2, c4107v2));
        }
        AbstractC3446KK.A00(new C4362ZC(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void AB2() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void ABB() {
        A00();
    }
}
