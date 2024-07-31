package com.facebook.ads.redexgen.uinode;

import android.net.Uri;

/* renamed from: com.facebook.ads.redexgen.X.WR */
/* loaded from: assets/audience_network.dex */
public final class C4194WR {
    public InterfaceC2953Bv A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final InterfaceC3238Gt A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public C4194WR(InterfaceC3238Gt interfaceC3238Gt) {
        this.A06 = interfaceC3238Gt;
    }

    public final C4194WR A00(String str) {
        AbstractC3281Ha.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final C2969CB A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C4274Xm();
        }
        return new C2969CB(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
