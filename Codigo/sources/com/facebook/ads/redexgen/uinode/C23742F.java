package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.InterfaceC2219Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.2F */
/* loaded from: assets/audience_network.dex */
public final class C23742F {
    public static String[] A0E = {"pQFQWrff5apwgeDCfICDjWO2FINXUEGY", "Zrlf7mbphLj9aknW7PcFFQ", "n3KJlhWP5Ju2JP4ez23sn5JFnk3TGtqs", "LKe9A2", "QZ6oU5eByjCJaazPOJhmSAWWHc", "bIzEhjdis4s2Gtu6NLj44xIWpvJeHb48", "cSwbeF06gtlZkK5ZI0p5Ev", "223A19fPLhE6SS6l"};
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public InterfaceC2219Ad A09;
    public WeakReference<InterfaceC2219Ad> A0A;
    public final C4337Yn A0B;
    public final InterfaceC27488Z A0C;
    public final String A0D;

    public C23742F(C4337Yn c4337Yn, String str, InterfaceC2219Ad interfaceC2219Ad, InterfaceC27488Z interfaceC27488Z) {
        this.A0B = c4337Yn;
        this.A0D = str;
        this.A09 = interfaceC2219Ad;
        this.A0A = new WeakReference<>(interfaceC2219Ad);
        this.A0C = interfaceC27488Z;
        c4337Yn.A0M(this);
    }

    public final InterfaceC2219Ad A00() {
        InterfaceC2219Ad interfaceC2219Ad = this.A09;
        return interfaceC2219Ad != null ? interfaceC2219Ad : this.A0A.get();
    }

    public final RewardedVideoAdListener A01() {
        return this.A04;
    }

    public final C4337Yn A02() {
        return this.A0B;
    }

    public final void A03(InterfaceC2219Ad interfaceC2219Ad) {
        if (interfaceC2219Ad == null) {
            C4337Yn c4337Yn = this.A0B;
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0E[4] = "e0pPDU8i87wGcMU5DIxBijYJQd";
            if (!C3348Ih.A0p(c4337Yn)) {
                return;
            }
        }
        this.A09 = interfaceC2219Ad;
    }
}
