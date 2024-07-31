package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1u */
/* loaded from: assets/audience_network.dex */
public final class C05941u {
    public int A00;
    public long A01;
    public RewardData A02;
    public JL A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final C8Z A07;
    public final EnumC1007Je A08;
    public final EnumC1009Jg A09;
    public final String A0A;
    public final EnumSet<CacheFlag> A0B;
    public final int A0C;
    public final AdPlacementType A0D;

    public C05941u(String str, EnumC1009Jg enumC1009Jg, AdPlacementType adPlacementType, EnumC1007Je enumC1007Je, int i10, C8Z c8z) {
        this(str, enumC1009Jg, adPlacementType, enumC1007Je, i10, EnumSet.of(CacheFlag.NONE), c8z);
    }

    public C05941u(String str, EnumC1009Jg enumC1009Jg, AdPlacementType adPlacementType, EnumC1007Je enumC1007Je, int i10, EnumSet<CacheFlag> cacheFlags, C8Z c8z) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = enumC1007Je;
        this.A0C = i10;
        this.A0B = cacheFlags;
        this.A09 = enumC1009Jg;
        this.A00 = -1;
        this.A07 = c8z;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0D;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        EnumC1007Je enumC1007Je = this.A08;
        if (enumC1007Je == null) {
            return AdPlacementType.NATIVE;
        }
        if (enumC1007Je == EnumC1007Je.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final K1 A01(C1399Yn c1399Yn, C1014Jl c1014Jl, AdExperienceType adExperienceType) {
        String str = this.A0A;
        EnumC1007Je enumC1007Je = this.A08;
        return new K1(c1399Yn, str, enumC1007Je != null ? new LQ(enumC1007Je.A03(), this.A08.A02()) : null, this.A09, this.A0C, c1014Jl, LW.A01(C0988Ih.A0J(c1399Yn)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final void A03(long j10) {
        this.A01 = j10;
    }

    public final void A04(RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(JL jl2) {
        this.A03 = jl2;
    }

    public final void A06(String str) {
        this.A04 = str;
    }

    public final void A07(String str) {
        this.A05 = str;
    }

    public final void A08(boolean z10) {
        this.A06 = z10;
    }
}
