package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1447aC implements C2Y {
    public final SharedPreferences A00;

    public C1447aC(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.uinode.C2Y
    public final C1448aD A5S() {
        return new C1448aD(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.uinode.C2Y
    public final long A7K(String str, long j10) {
        return this.A00.getLong(str, j10);
    }

    @Override // com.facebook.ads.redexgen.uinode.C2Y
    public final String A85(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
