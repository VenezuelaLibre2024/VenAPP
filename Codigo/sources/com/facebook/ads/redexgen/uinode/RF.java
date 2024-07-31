package com.facebook.ads.redexgen.uinode;

import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class RF {
    public float A00;
    public C0Q A01;
    public Map<String, String> A02;

    public RF(C0Q c0q) {
        this(c0q, 0.0f);
    }

    public RF(C0Q c0q, float f10) {
        this(c0q, f10, null);
    }

    public RF(C0Q c0q, float f10, Map<String, String> windowParams) {
        this.A01 = c0q;
        this.A00 = f10;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A02();
    }

    public final C0Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == C0Q.A0J;
    }
}
