package p057d6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC2219Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import p038c6.C1878f;
import p157i9.C7923r;
import p157i9.InterfaceC7910e;
import p157i9.InterfaceC7921p;
import p157i9.InterfaceC7922q;
import p438x8.C12353b;

/* renamed from: d6.b */
/* loaded from: classes.dex */
public class C6847b implements InterfaceC7921p, InterstitialAdExtendedListener {

    /* renamed from: a */
    private final C7923r f15135a;

    /* renamed from: b */
    private final InterfaceC7910e<InterfaceC7921p, InterfaceC7922q> f15136b;

    /* renamed from: c */
    private InterstitialAd f15137c;

    /* renamed from: d */
    private InterfaceC7922q f15138d;

    /* renamed from: e */
    private final AtomicBoolean f15139e = new AtomicBoolean();

    /* renamed from: f */
    private final AtomicBoolean f15140f = new AtomicBoolean();

    /* renamed from: g */
    private final C1878f f15141g;

    public C6847b(C7923r c7923r, InterfaceC7910e<InterfaceC7921p, InterfaceC7922q> interfaceC7910e, C1878f c1878f) {
        this.f15135a = c7923r;
        this.f15136b = interfaceC7910e;
        this.f15141g = c1878f;
    }

    @Override // p157i9.InterfaceC7921p
    /* renamed from: a */
    public void mo19785a(Context context) {
        this.f15139e.set(true);
        if (this.f15137c.show()) {
            return;
        }
        C12353b c12353b = new C12353b(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, c12353b.toString());
        InterfaceC7922q interfaceC7922q = this.f15138d;
        if (interfaceC7922q != null) {
            interfaceC7922q.onAdFailedToShow(c12353b);
        }
    }

    /* renamed from: b */
    public void m19786b() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f15135a.m24422c());
        if (TextUtils.isEmpty(placementID)) {
            C12353b c12353b = new C12353b(101, "Failed to request ad. PlacementID is null or empty. ", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, c12353b.m39955c());
            this.f15136b.onFailure(c12353b);
        } else {
            FacebookMediationAdapter.setMixedAudience(this.f15135a);
            this.f15137c = this.f15141g.m9981a(this.f15135a.m24421b(), placementID);
            if (!TextUtils.isEmpty(this.f15135a.m24423d())) {
                this.f15137c.setExtraHints(new ExtraHints.Builder().mediationData(this.f15135a.m24423d()).build());
            }
            InterstitialAd interstitialAd = this.f15137c;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(this.f15135a.m24420a()).withAdListener(this).build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7922q interfaceC7922q = this.f15138d;
        if (interfaceC7922q != null) {
            interfaceC7922q.reportAdClicked();
            this.f15138d.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(InterfaceC2219Ad interfaceC2219Ad) {
        this.f15138d = this.f15136b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(InterfaceC2219Ad interfaceC2219Ad, AdError adError) {
        C12353b adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.m39955c());
        if (!this.f15139e.get()) {
            this.f15136b.onFailure(adError2);
            return;
        }
        InterfaceC7922q interfaceC7922q = this.f15138d;
        if (interfaceC7922q != null) {
            interfaceC7922q.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        InterfaceC7922q interfaceC7922q;
        if (this.f15140f.getAndSet(true) || (interfaceC7922q = this.f15138d) == null) {
            return;
        }
        interfaceC7922q.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7922q interfaceC7922q;
        if (this.f15140f.getAndSet(true) || (interfaceC7922q = this.f15138d) == null) {
            return;
        }
        interfaceC7922q.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7922q interfaceC7922q = this.f15138d;
        if (interfaceC7922q != null) {
            interfaceC7922q.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7922q interfaceC7922q = this.f15138d;
        if (interfaceC7922q != null) {
            interfaceC7922q.reportAdImpression();
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
