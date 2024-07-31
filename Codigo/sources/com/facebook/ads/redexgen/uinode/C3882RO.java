package com.facebook.ads.redexgen.uinode;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.RO */
/* loaded from: assets/audience_network.dex */
public class C3882RO {
    public C3886RS A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C3882RO A00(C3886RS c3886rs) {
        this.A00 = c3886rs;
        return this;
    }

    public final C3882RO A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C3882RO A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C3882RO A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C3882RO A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C3883RP A05() {
        return new C3883RP(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
