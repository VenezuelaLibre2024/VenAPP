package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.AK */
/* loaded from: assets/audience_network.dex */
public final class C2856AK {
    public final int A00;
    public final C3113Eo A01;

    public C2856AK(int i10, C3113Eo c3113Eo) {
        this.A00 = i10;
        this.A01 = c3113Eo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2856AK c2856ak = (C2856AK) obj;
        return this.A00 == c2856ak.A00 && this.A01.equals(c2856ak.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
