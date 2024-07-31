package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.InterfaceC2219Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.FE */
/* loaded from: assets/audience_network.dex */
public final class C3139FE extends AbstractC4445aa {
    public static String[] A02 = {"6CKGqR2K2MH05agWbJN3ka4F1ij3xhtD", "25gFyXHUhXKi43K8KJ4chgoS7w07JQQZ", "vjdmG7Wc53PSGoj25veSMfUO8xL7SxfR", "TQa00i6LjIP9KGMZzj8Rx2HUQjG1dRa1", "ap4e45gngLG", "PTi4Abr85pNMPfkRgyZo1NxbOs1aDg0f", "O7pu2EfbMgektne8Y3vUNLOEHbflJ4Uv", "IlEhKaiOmMN"};
    public C4435aQ A00;
    public final C23742F A01;

    public C3139FE(C23742F c23742f, String str) {
        super(c23742f.A0B, str, A00(c23742f));
        this.A01 = c23742f;
    }

    public static C4427aI A00(C23742F c23742f) {
        return new C4427aI(c23742f);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4445aa
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A56();
        }
        C4435aQ c4435aQ = this.A00;
        if (c4435aQ != null) {
            c4435aQ.destroy();
        }
        super.A00.AFw(EnumC235920.A04);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4445aa
    public final void A09() {
        C4435aQ c4435aQ = new C4435aQ(this.A01, this, A04());
        this.A00 = c4435aQ;
        c4435aQ.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A0D(InterfaceC2219Ad interfaceC2219Ad, String str, AdExperienceType adExperienceType, boolean z10) {
        if (super.A00.A5d()) {
            return;
        }
        this.A01.A03(interfaceC2219Ad);
        C4435aQ c4435aQ = this.A00;
        if (c4435aQ != null) {
            c4435aQ.A0J(str, adExperienceType, z10);
            String[] strArr = A02;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "snzzAybKLkKRz85P4BzzU6VwJ24uwEo8";
            strArr2[1] = "iwkpZYLOXs3iYxZlCgOD0Nxy0vDnSGoK";
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z10;
        if (AbstractC3351Ik.A07(this.A02) && AbstractC3351Ik.A09(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(AdError.INTERNAL_ERROR_2003, AbstractC23812M.A00(new Bundle(), rewardData));
            return;
        }
        C4435aQ c4435aQ = this.A00;
        if (c4435aQ != null) {
            c4435aQ.A0I(rewardData);
        }
    }

    public final boolean A0F() {
        C4435aQ c4435aQ = this.A00;
        if (c4435aQ != null) {
            return c4435aQ.A0K();
        }
        return this.A01.A01 > 0 && C3527Lf.A00() > this.A01.A01;
    }

    public final boolean A0G() {
        C4435aQ c4435aQ = this.A00;
        if (c4435aQ != null) {
            return c4435aQ.A0L();
        }
        return super.A00.A5v() == EnumC235920.A06;
    }

    public final boolean A0H(InterfaceC2219Ad interfaceC2219Ad, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((C26035z) rewardedVideoShowAdConfig).A00();
        long A01 = ((C26035z) rewardedVideoShowAdConfig).A01();
        if (super.A00.A5e()) {
            return false;
        }
        this.A01.A03(interfaceC2219Ad);
        if (super.A01.A01) {
            A0A(A00);
            return true;
        }
        C4435aQ c4435aQ = this.A00;
        if (c4435aQ != null) {
            return c4435aQ.A0M(A00, A01);
        }
        C4435aQ c4435aQ2 = new C4435aQ(this.A01, this, A04());
        this.A00 = c4435aQ2;
        c4435aQ2.A0M(A00, A01);
        return false;
    }
}
