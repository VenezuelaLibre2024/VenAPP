package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bB */
/* loaded from: assets/audience_network.dex */
public final class C4482bB extends AbstractC22880r {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C4482bB.class.getSimpleName();
    public C4484bD A00;
    public boolean A01;
    public final C4337Yn A02;
    public final InterfaceC3369J2 A03;
    public final AbstractC3644NY A04;

    public C4482bB(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, AbstractC3644NY abstractC3644NY, C3872RE c3872re, AbstractC22890s abstractC22890s) {
        super(c4337Yn, abstractC22890s, c3872re);
        this.A03 = interfaceC3369J2;
        this.A04 = abstractC3644NY;
        this.A02 = c4337Yn;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22880r
    public final void A06(Map<String, String> map) {
        C4484bD c4484bD = this.A00;
        if (c4484bD != null && !TextUtils.isEmpty(c4484bD.A6T())) {
            this.A02.A0E().A2k();
            AbstractC23832O.A00(this.A00.A05());
            InterfaceC3369J2 interfaceC3369J2 = this.A03;
            String A6T = this.A00.A6T();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            interfaceC3369J2.A9g(A6T, map);
        }
    }

    public final synchronized void A07() {
        C4484bD c4484bD;
        if (!this.A01 && (c4484bD = this.A00) != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(c4484bD.A03())) {
                ExecutorC3530Li.A00(new C4483bC(this));
            }
        }
    }

    public final void A08(C4484bD c4484bD) {
        this.A00 = c4484bD;
    }
}
