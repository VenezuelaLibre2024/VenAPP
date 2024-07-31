package c6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import i9.w;
import i9.x;
import i9.y;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class c implements w, RewardedVideoAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    private final y f6863a;

    /* renamed from: b, reason: collision with root package name */
    private final i9.e<w, x> f6864b;

    /* renamed from: c, reason: collision with root package name */
    private RewardedVideoAd f6865c;

    /* renamed from: e, reason: collision with root package name */
    private x f6867e;

    /* renamed from: g, reason: collision with root package name */
    private final f f6869g;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f6866d = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f6868f = new AtomicBoolean();

    public c(y yVar, i9.e<w, x> eVar, f fVar) {
        this.f6863a = yVar;
        this.f6864b = eVar;
        this.f6869g = fVar;
    }

    @Override // i9.w
    public void a(Context context) {
        this.f6866d.set(true);
        if (this.f6865c.show()) {
            x xVar = this.f6867e;
            if (xVar != null) {
                xVar.onVideoStart();
                this.f6867e.onAdOpened();
                return;
            }
            return;
        }
        x8.b bVar = new x8.b(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, bVar.c());
        x xVar2 = this.f6867e;
        if (xVar2 != null) {
            xVar2.onAdFailedToShow(bVar);
        }
        this.f6865c.destroy();
    }

    AdExperienceType b() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public void c() {
        Context b10 = this.f6863a.b();
        String placementID = FacebookMediationAdapter.getPlacementID(this.f6863a.c());
        if (TextUtils.isEmpty(placementID)) {
            x8.b bVar = new x8.b(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, bVar.c());
            this.f6864b.onFailure(bVar);
        } else {
            FacebookMediationAdapter.setMixedAudience(this.f6863a);
            this.f6865c = this.f6869g.d(b10, placementID);
            if (!TextUtils.isEmpty(this.f6863a.d())) {
                this.f6865c.setExtraHints(new ExtraHints.Builder().mediationData(this.f6863a.d()).build());
            }
            RewardedVideoAd rewardedVideoAd = this.f6865c;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(this.f6863a.a()).withAdExperience(b()).build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        x xVar = this.f6867e;
        if (xVar != null) {
            xVar.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        i9.e<w, x> eVar = this.f6864b;
        if (eVar != null) {
            this.f6867e = eVar.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        x8.b adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f6866d.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.c());
            x xVar = this.f6867e;
            if (xVar != null) {
                xVar.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.c());
            i9.e<w, x> eVar = this.f6864b;
            if (eVar != null) {
                eVar.onFailure(adError2);
            }
        }
        this.f6865c.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        x xVar = this.f6867e;
        if (xVar != null) {
            xVar.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        x xVar;
        if (!this.f6868f.getAndSet(true) && (xVar = this.f6867e) != null) {
            xVar.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f6865c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        x xVar;
        if (!this.f6868f.getAndSet(true) && (xVar = this.f6867e) != null) {
            xVar.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f6865c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.f6867e.onVideoComplete();
        this.f6867e.onUserEarnedReward(new b());
    }
}
