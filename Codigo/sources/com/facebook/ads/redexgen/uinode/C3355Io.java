package com.facebook.ads.redexgen.uinode;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Io */
/* loaded from: assets/audience_network.dex */
public final class C3355Io {
    public final View A00;
    public final C4336Ym A01;
    public final InterfaceC3369J2 A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C3355Io(C4336Ym c4336Ym, View view, String str, boolean z10, boolean z11) {
        this.A03 = str;
        this.A01 = c4336Ym;
        this.A02 = c4336Ym.A09();
        this.A00 = view;
        this.A05 = z11;
        this.A06 = z10;
    }

    public final View A00() {
        return this.A00;
    }

    public final C4336Ym A01() {
        return this.A01;
    }

    public final InterfaceC3369J2 A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
