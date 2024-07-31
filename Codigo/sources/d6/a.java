package d6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import c6.f;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import i9.e;
import i9.j;
import i9.k;
import i9.l;

/* loaded from: classes.dex */
public class a implements j, AdListener {

    /* renamed from: a, reason: collision with root package name */
    private final l f13775a;

    /* renamed from: b, reason: collision with root package name */
    private final e<j, k> f13776b;

    /* renamed from: c, reason: collision with root package name */
    private AdView f13777c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f13778d;

    /* renamed from: e, reason: collision with root package name */
    private k f13779e;

    /* renamed from: f, reason: collision with root package name */
    private final f f13780f;

    public a(l lVar, e<j, k> eVar, f fVar) {
        this.f13775a = lVar;
        this.f13776b = eVar;
        this.f13780f = fVar;
    }

    public void b() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f13775a.c());
        if (TextUtils.isEmpty(placementID)) {
            x8.b bVar = new x8.b(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, bVar.c());
            this.f13776b.onFailure(bVar);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f13775a);
        try {
            this.f13777c = this.f13780f.c(this.f13775a.b(), placementID, this.f13775a.a());
            if (!TextUtils.isEmpty(this.f13775a.d())) {
                this.f13777c.setExtraHints(new ExtraHints.Builder().mediationData(this.f13775a.d()).build());
            }
            Context b10 = this.f13775a.b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f13775a.f().k(b10), -2);
            this.f13778d = new FrameLayout(b10);
            this.f13777c.setLayoutParams(layoutParams);
            this.f13778d.addView(this.f13777c);
            AdView adView = this.f13777c;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(this.f13775a.a()).build());
        } catch (Exception e10) {
            x8.b bVar2 = new x8.b(111, "Failed to create banner ad: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, bVar2.c());
            this.f13776b.onFailure(bVar2);
        }
    }

    @Override // i9.j
    public View getView() {
        return this.f13778d;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        k kVar = this.f13779e;
        if (kVar != null) {
            kVar.reportAdClicked();
            this.f13779e.onAdOpened();
            this.f13779e.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f13779e = this.f13776b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        x8.b adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.c());
        this.f13776b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        k kVar = this.f13779e;
        if (kVar != null) {
            kVar.reportAdImpression();
        }
    }
}
