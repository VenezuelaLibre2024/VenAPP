package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.26 */
/* loaded from: assets/audience_network.dex */
public final class C236526 {
    public long A00;
    public InterstitialAd A01;
    public InterstitialAdListener A02;
    public RewardData A03;
    public RewardedAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public EnumSet<CacheFlag> A08;
    public final InterfaceC27488Z A09;
    public final C4337Yn A0A;
    public final String A0B;
    public final WeakReference<InterstitialAd> A0C;

    public C236526(C4337Yn c4337Yn, InterstitialAd interstitialAd, String str) {
        this(c4337Yn, interstitialAd, str, new C4444aZ());
    }

    public C236526(C4337Yn c4337Yn, InterstitialAd interstitialAd, String str, InterfaceC27488Z interfaceC27488Z) {
        this.A0A = c4337Yn;
        this.A0B = str;
        this.A01 = interstitialAd;
        this.A0C = new WeakReference<>(interstitialAd);
        this.A00 = -1L;
        c4337Yn.A0M(this);
        this.A09 = interfaceC27488Z;
    }

    public final long A00() {
        return this.A00;
    }

    public final InterstitialAd A01() {
        InterstitialAd interstitialAd = this.A01;
        return interstitialAd != null ? interstitialAd : this.A0C.get();
    }

    public final InterstitialAdListener A02() {
        return this.A02;
    }

    public final RewardData A03() {
        return this.A03;
    }

    public final RewardedAdListener A04() {
        return this.A04;
    }

    public final C4337Yn A05() {
        return this.A0A;
    }

    public final InterfaceC27488Z A06() {
        return this.A09;
    }

    public final String A07() {
        return this.A05;
    }

    public final String A08() {
        return this.A06;
    }

    public final String A09() {
        return this.A07;
    }

    public final String A0A() {
        return this.A0B;
    }

    public final EnumSet<CacheFlag> A0B() {
        return this.A08;
    }

    public final void A0C(long j10) {
        this.A00 = j10;
    }

    public final void A0D(InterstitialAd interstitialAd) {
        if (interstitialAd == null && !C3348Ih.A0p(this.A0A)) {
            return;
        }
        this.A01 = interstitialAd;
    }

    public final void A0E(InterstitialAdListener interstitialAdListener) {
        this.A02 = interstitialAdListener;
    }

    public final void A0F(RewardData rewardData) {
        this.A03 = rewardData;
    }

    public final void A0G(RewardedAdListener rewardedAdListener) {
        this.A04 = rewardedAdListener;
    }

    public final void A0H(String str) {
        this.A05 = str;
    }

    public final void A0I(String str) {
        this.A06 = str;
    }

    public final void A0J(String str) {
        this.A07 = str;
    }

    public final void A0K(EnumSet<CacheFlag> flags) {
        this.A08 = flags;
    }
}
