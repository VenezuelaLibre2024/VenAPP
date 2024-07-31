package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.aC */
/* loaded from: assets/audience_network.dex */
public final class C4421aC implements InterfaceC23932Y {
    public final SharedPreferences A00;

    public C4421aC(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23932Y
    public final C4422aD A5S() {
        return new C4422aD(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23932Y
    public final long A7K(String str, long j10) {
        return this.A00.getLong(str, j10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23932Y
    public final String A85(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
