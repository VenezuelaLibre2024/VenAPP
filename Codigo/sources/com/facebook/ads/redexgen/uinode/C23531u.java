package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1u */
/* loaded from: assets/audience_network.dex */
public final class C23531u {
    public int A00;
    public long A01;
    public RewardData A02;
    public EnumC3388JL A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final InterfaceC27488Z A07;
    public final EnumC3405Je A08;
    public final EnumC3407Jg A09;
    public final String A0A;
    public final EnumSet<CacheFlag> A0B;
    public final int A0C;
    public final AdPlacementType A0D;

    public C23531u(String str, EnumC3407Jg enumC3407Jg, AdPlacementType adPlacementType, EnumC3405Je enumC3405Je, int i10, InterfaceC27488Z interfaceC27488Z) {
        this(str, enumC3407Jg, adPlacementType, enumC3405Je, i10, EnumSet.of(CacheFlag.NONE), interfaceC27488Z);
    }

    public C23531u(String str, EnumC3407Jg enumC3407Jg, AdPlacementType adPlacementType, EnumC3405Je enumC3405Je, int i10, EnumSet<CacheFlag> cacheFlags, InterfaceC27488Z interfaceC27488Z) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = enumC3405Je;
        this.A0C = i10;
        this.A0B = cacheFlags;
        this.A09 = enumC3407Jg;
        this.A00 = -1;
        this.A07 = interfaceC27488Z;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0D;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        EnumC3405Je enumC3405Je = this.A08;
        if (enumC3405Je == null) {
            return AdPlacementType.NATIVE;
        }
        if (enumC3405Je == EnumC3405Je.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final C3428K1 A01(C4337Yn c4337Yn, C3412Jl c3412Jl, AdExperienceType adExperienceType) {
        String str = this.A0A;
        EnumC3405Je enumC3405Je = this.A08;
        return new C3428K1(c4337Yn, str, enumC3405Je != null ? new C3512LQ(enumC3405Je.A03(), this.A08.A02()) : null, this.A09, this.A0C, c3412Jl, AbstractC3518LW.A01(C3348Ih.A0J(c4337Yn)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
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

    public final void A05(EnumC3388JL enumC3388JL) {
        this.A03 = enumC3388JL;
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
