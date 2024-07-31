package com.facebook.ads.redexgen.uinode;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.RF */
/* loaded from: assets/audience_network.dex */
public final class C3873RF {
    public float A00;
    public EnumC22620Q A01;
    public Map<String, String> A02;

    public C3873RF(EnumC22620Q enumC22620Q) {
        this(enumC22620Q, 0.0f);
    }

    public C3873RF(EnumC22620Q enumC22620Q, float f10) {
        this(enumC22620Q, f10, null);
    }

    public C3873RF(EnumC22620Q enumC22620Q, float f10, Map<String, String> windowParams) {
        this.A01 = enumC22620Q;
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

    public final EnumC22620Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC22620Q.A0J;
    }
}
