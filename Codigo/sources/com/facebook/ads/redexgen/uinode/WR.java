package com.facebook.ads.redexgen.uinode;

import android.net.Uri;

/* loaded from: assets/audience_network.dex */
public final class WR {
    public InterfaceC0840Bv A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final InterfaceC0949Gt A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public WR(InterfaceC0949Gt interfaceC0949Gt) {
        this.A06 = interfaceC0949Gt;
    }

    public final WR A00(String str) {
        AbstractC0955Ha.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final CB A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C1372Xm();
        }
        return new CB(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
