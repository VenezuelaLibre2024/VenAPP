package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.DO */
/* loaded from: assets/audience_network.dex */
public final class C3033DO {
    public final String A00;
    public final boolean A01;

    public C3033DO(String str, boolean z10) {
        this.A00 = str;
        this.A01 = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C3033DO.class) {
            return false;
        }
        C3033DO c3033do = (C3033DO) obj;
        return TextUtils.equals(this.A00, c3033do.A00) && this.A01 == c3033do.A01;
    }

    public final int hashCode() {
        int result = 1 * 31;
        String str = this.A00;
        int prime = str == null ? 0 : str.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        return result2 + prime2;
    }
}
