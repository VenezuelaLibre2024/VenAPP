package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.aD */
/* loaded from: assets/audience_network.dex */
public class C4422aD implements InterfaceC23922X {
    public final SharedPreferences.Editor A00;

    public C4422aD(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C4422aD A00(String str, long j10) {
        this.A00.putLong(str, j10);
        return this;
    }

    public final C4422aD A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
