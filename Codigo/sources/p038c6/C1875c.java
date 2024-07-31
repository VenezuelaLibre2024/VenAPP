package p038c6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC2219Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import p157i9.C7930y;
import p157i9.InterfaceC7910e;
import p157i9.InterfaceC7928w;
import p157i9.InterfaceC7929x;
import p438x8.C12353b;

/* renamed from: c6.c */
/* loaded from: classes.dex */
public class C1875c implements InterfaceC7928w, RewardedVideoAdExtendedListener {

    /* renamed from: a */
    private final C7930y f7812a;

    /* renamed from: b */
    private final InterfaceC7910e<InterfaceC7928w, InterfaceC7929x> f7813b;

    /* renamed from: c */
    private RewardedVideoAd f7814c;

    /* renamed from: e */
    private InterfaceC7929x f7816e;

    /* renamed from: g */
    private final C1878f f7818g;

    /* renamed from: d */
    private final AtomicBoolean f7815d = new AtomicBoolean();

    /* renamed from: f */
    private final AtomicBoolean f7817f = new AtomicBoolean();

    public C1875c(C7930y c7930y, InterfaceC7910e<InterfaceC7928w, InterfaceC7929x> interfaceC7910e, C1878f c1878f) {
        this.f7812a = c7930y;
        this.f7813b = interfaceC7910e;
        this.f7818g = c1878f;
    }

    @Override // p157i9.InterfaceC7928w
    /* renamed from: a */
    public void mo9977a(Context context) {
        this.f7815d.set(true);
        if (this.f7814c.show()) {
            InterfaceC7929x interfaceC7929x = this.f7816e;
            if (interfaceC7929x != null) {
                interfaceC7929x.onVideoStart();
                this.f7816e.onAdOpened();
                return;
            }
            return;
        }
        C12353b c12353b = new C12353b(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, c12353b.m39955c());
        InterfaceC7929x interfaceC7929x2 = this.f7816e;
        if (interfaceC7929x2 != null) {
            interfaceC7929x2.onAdFailedToShow(c12353b);
        }
        this.f7814c.destroy();
    }

    /* renamed from: b */
    AdExperienceType mo9978b() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    /* renamed from: c */
    public void m9979c() {
        Context m24421b = this.f7812a.m24421b();
        String placementID = FacebookMediationAdapter.getPlacementID(this.f7812a.m24422c());
        if (TextUtils.isEmpty(placementID)) {
            C12353b c12353b = new C12353b(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, c12353b.m39955c());
            this.f7813b.onFailure(c12353b);
        } else {
            FacebookMediationAdapter.setMixedAudience(this.f7812a);
            this.f7814c = this.f7818g.m9984d(m24421b, placementID);
            if (!TextUtils.isEmpty(this.f7812a.m24423d())) {
                this.f7814c.setExtraHints(new ExtraHints.Builder().mediationData(this.f7812a.m24423d()).build());
            }
            RewardedVideoAd rewardedVideoAd = this.f7814c;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(this.f7812a.m24420a()).withAdExperience(mo9978b()).build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7929x interfaceC7929x = this.f7816e;
        if (interfaceC7929x != null) {
            interfaceC7929x.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7910e<InterfaceC7928w, InterfaceC7929x> interfaceC7910e = this.f7813b;
        if (interfaceC7910e != null) {
            this.f7816e = interfaceC7910e.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(InterfaceC2219Ad interfaceC2219Ad, AdError adError) {
        C12353b adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f7815d.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.m39955c());
            InterfaceC7929x interfaceC7929x = this.f7816e;
            if (interfaceC7929x != null) {
                interfaceC7929x.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.m39955c());
            InterfaceC7910e<InterfaceC7928w, InterfaceC7929x> interfaceC7910e = this.f7813b;
            if (interfaceC7910e != null) {
                interfaceC7910e.onFailure(adError2);
            }
        }
        this.f7814c.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7929x interfaceC7929x = this.f7816e;
        if (interfaceC7929x != null) {
            interfaceC7929x.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        InterfaceC7929x interfaceC7929x;
        if (!this.f7817f.getAndSet(true) && (interfaceC7929x = this.f7816e) != null) {
            interfaceC7929x.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f7814c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        InterfaceC7929x interfaceC7929x;
        if (!this.f7817f.getAndSet(true) && (interfaceC7929x = this.f7816e) != null) {
            interfaceC7929x.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f7814c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.f7816e.onVideoComplete();
        this.f7816e.onUserEarnedReward(new C1874b());
    }
}
