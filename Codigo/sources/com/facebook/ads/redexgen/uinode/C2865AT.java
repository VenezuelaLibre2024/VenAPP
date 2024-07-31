package com.facebook.ads.redexgen.uinode;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.AT */
/* loaded from: assets/audience_network.dex */
public final class C2865AT {
    public static final C2865AT A04 = new C2864AS().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C2865AT(int i10, int i11, int i12) {
        this.A01 = i10;
        this.A02 = i11;
        this.A03 = i12;
    }

    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2865AT c2865at = (C2865AT) obj;
        return this.A01 == c2865at.A01 && this.A02 == c2865at.A02 && this.A03 == c2865at.A03;
    }

    public final int hashCode() {
        int result = this.A01;
        int result2 = ((((17 * 31) + result) * 31) + this.A02) * 31;
        int result3 = this.A03;
        return result2 + result3;
    }
}
