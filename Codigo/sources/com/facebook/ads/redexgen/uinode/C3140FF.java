package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.FF */
/* loaded from: assets/audience_network.dex */
public final class C3140FF extends AbstractC4445aa {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    public static final InterfaceC236627 A03 = new C4433aO();
    public C4438aT A00;
    public final C236526 A01;

    public C3140FF(C236526 c236526, String str) {
        super(c236526.A05(), str, A03.A4h(c236526));
        this.A01 = c236526;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4445aa
    public final void A08() {
        C4438aT c4438aT = this.A00;
        if (c4438aT != null) {
            c4438aT.destroy();
        }
        InterfaceC236021 interfaceC236021 = super.A00;
        EnumC235920 enumC235920 = EnumC235920.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC236021.AFw(enumC235920);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4445aa
    public final void A09() {
        C4438aT c4438aT = new C4438aT(this.A01, this, A04());
        this.A00 = c4438aT;
        c4438aT.A0G(this.A01.A0B(), this.A01.A07());
    }

    public final void A0D(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A5d()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        C4438aT c4438aT = this.A00;
        if (c4438aT != null) {
            c4438aT.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (AbstractC3351Ik.A07(this.A02) && AbstractC3351Ik.A08(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(1013, AbstractC23812M.A00(new Bundle(), rewardData));
        }
    }

    public final boolean A0F() {
        C4438aT c4438aT = this.A00;
        if (c4438aT != null) {
            return c4438aT.A0H();
        }
        if (this.A01.A00() > 0) {
            long A00 = C3527Lf.A00();
            long A002 = this.A01.A00();
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (A00 > A002) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0G() {
        C4438aT c4438aT = this.A00;
        if (c4438aT != null) {
            return c4438aT.A0I();
        }
        return super.A00.A5v() == EnumC235920.A06;
    }

    public final boolean A0H(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5e()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        }
        C4438aT c4438aT = this.A00;
        if (c4438aT != null) {
            return c4438aT.A0J();
        }
        C4438aT c4438aT2 = new C4438aT(this.A01, this, A04());
        this.A00 = c4438aT2;
        c4438aT2.A0J();
        return false;
    }
}
