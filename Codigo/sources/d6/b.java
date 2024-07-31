package d6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import c6.f;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import i9.e;
import i9.p;
import i9.q;
import i9.r;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b implements p, InterstitialAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    private final r f13781a;

    /* renamed from: b, reason: collision with root package name */
    private final e<p, q> f13782b;

    /* renamed from: c, reason: collision with root package name */
    private InterstitialAd f13783c;

    /* renamed from: d, reason: collision with root package name */
    private q f13784d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f13785e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f13786f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final f f13787g;

    public b(r rVar, e<p, q> eVar, f fVar) {
        this.f13781a = rVar;
        this.f13782b = eVar;
        this.f13787g = fVar;
    }

    @Override // i9.p
    public void a(Context context) {
        this.f13785e.set(true);
        if (this.f13783c.show()) {
            return;
        }
        x8.b bVar = new x8.b(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, bVar.toString());
        q qVar = this.f13784d;
        if (qVar != null) {
            qVar.onAdFailedToShow(bVar);
        }
    }

    public void b() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f13781a.c());
        if (TextUtils.isEmpty(placementID)) {
            x8.b bVar = new x8.b(101, "Failed to request ad. PlacementID is null or empty. ", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, bVar.c());
            this.f13782b.onFailure(bVar);
        } else {
            FacebookMediationAdapter.setMixedAudience(this.f13781a);
            this.f13783c = this.f13787g.a(this.f13781a.b(), placementID);
            if (!TextUtils.isEmpty(this.f13781a.d())) {
                this.f13783c.setExtraHints(new ExtraHints.Builder().mediationData(this.f13781a.d()).build());
            }
            InterstitialAd interstitialAd = this.f13783c;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(this.f13781a.a()).withAdListener(this).build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        q qVar = this.f13784d;
        if (qVar != null) {
            qVar.reportAdClicked();
            this.f13784d.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f13784d = this.f13782b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        x8.b adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.c());
        if (!this.f13785e.get()) {
            this.f13782b.onFailure(adError2);
            return;
        }
        q qVar = this.f13784d;
        if (qVar != null) {
            qVar.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        q qVar;
        if (this.f13786f.getAndSet(true) || (qVar = this.f13784d) == null) {
            return;
        }
        qVar.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad2) {
        q qVar;
        if (this.f13786f.getAndSet(true) || (qVar = this.f13784d) == null) {
            return;
        }
        qVar.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad2) {
        q qVar = this.f13784d;
        if (qVar != null) {
            qVar.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        q qVar = this.f13784d;
        if (qVar != null) {
            qVar.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }
}
