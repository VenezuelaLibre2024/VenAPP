package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.GW */
/* loaded from: assets/audience_network.dex */
public final class C3217GW {
    public final int A00;
    public final int A01;
    public final String A02;

    public C3217GW(int i10, int i11, String str) {
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3217GW c3217gw = (C3217GW) obj;
        if (this.A00 == c3217gw.A00 && this.A01 == c3217gw.A01 && TextUtils.equals(this.A02, c3217gw.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i10 = result * 31;
        int result2 = this.A01;
        int result3 = (i10 + result2) * 31;
        String str = this.A02;
        int result4 = str != null ? str.hashCode() : 0;
        return result3 + result4;
    }
}