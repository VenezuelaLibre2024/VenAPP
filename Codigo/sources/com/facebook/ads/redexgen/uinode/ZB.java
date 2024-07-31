package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class ZB implements C6U {
    public final List<C1517bK> A00;
    public final /* synthetic */ ZA A01;

    public ZB(ZA za2, List<C1517bK> list) {
        this.A01 = za2;
        this.A00 = list;
    }

    private void A00() {
        C06885m c06885m;
        C06885m c06885m2;
        C06885m c06885m3;
        C1399Yn c1399Yn;
        C06885m c06885m4;
        C06885m c06885m5;
        C1399Yn c1399Yn2;
        c06885m = this.A01.A00;
        c06885m.A05(true);
        c06885m2 = this.A01.A00;
        c06885m2.A02();
        c06885m3 = this.A01.A00;
        c06885m3.A03(0);
        for (C1517bK c1517bK : this.A00) {
            c1399Yn = this.A01.A01;
            V5 A0K = V2.A0K();
            c06885m4 = this.A01.A00;
            V2 v22 = new V2(c1399Yn, c1517bK, null, A0K, c06885m4.A01());
            if (v22.A0y() != null && v22.A0y().A0F() != null) {
                ((AbstractC1478ah) v22.A0y().A0F()).A00(v22);
            }
            c06885m5 = this.A01.A00;
            c1399Yn2 = this.A01.A01;
            c06885m5.A04(new NativeAd(c1399Yn2, v22));
        }
        KK.A00(new ZC(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void AB2() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void ABB() {
        A00();
    }
}
