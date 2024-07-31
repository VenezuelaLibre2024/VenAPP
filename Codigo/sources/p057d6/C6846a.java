package p057d6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC2219Ad;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import p038c6.C1878f;
import p157i9.C7917l;
import p157i9.InterfaceC7910e;
import p157i9.InterfaceC7915j;
import p157i9.InterfaceC7916k;
import p438x8.C12353b;

/* renamed from: d6.a */
/* loaded from: classes.dex */
public class C6846a implements InterfaceC7915j, AdListener {

    /* renamed from: a */
    private final C7917l f15129a;

    /* renamed from: b */
    private final InterfaceC7910e<InterfaceC7915j, InterfaceC7916k> f15130b;

    /* renamed from: c */
    private AdView f15131c;

    /* renamed from: d */
    private FrameLayout f15132d;

    /* renamed from: e */
    private InterfaceC7916k f15133e;

    /* renamed from: f */
    private final C1878f f15134f;

    public C6846a(C7917l c7917l, InterfaceC7910e<InterfaceC7915j, InterfaceC7916k> interfaceC7910e, C1878f c1878f) {
        this.f15129a = c7917l;
        this.f15130b = interfaceC7910e;
        this.f15134f = c1878f;
    }

    /* renamed from: b */
    public void m19784b() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f15129a.m24422c());
        if (TextUtils.isEmpty(placementID)) {
            C12353b c12353b = new C12353b(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, c12353b.m39955c());
            this.f15130b.onFailure(c12353b);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f15129a);
        try {
            this.f15131c = this.f15134f.m9983c(this.f15129a.m24421b(), placementID, this.f15129a.m24420a());
            if (!TextUtils.isEmpty(this.f15129a.m24423d())) {
                this.f15131c.setExtraHints(new ExtraHints.Builder().mediationData(this.f15129a.m24423d()).build());
            }
            Context m24421b = this.f15129a.m24421b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f15129a.m24426f().m40003k(m24421b), -2);
            this.f15132d = new FrameLayout(m24421b);
            this.f15131c.setLayoutParams(layoutParams);
            this.f15132d.addView(this.f15131c);
            AdView adView = this.f15131c;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(this.f15129a.m24420a()).build());
        } catch (Exception e10) {
            C12353b c12353b2 = new C12353b(111, "Failed to create banner ad: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, c12353b2.m39955c());
            this.f15130b.onFailure(c12353b2);
        }
    }

    @Override // p157i9.InterfaceC7915j
    public View getView() {
        return this.f15132d;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7916k interfaceC7916k = this.f15133e;
        if (interfaceC7916k != null) {
            interfaceC7916k.reportAdClicked();
            this.f15133e.onAdOpened();
            this.f15133e.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(InterfaceC2219Ad interfaceC2219Ad) {
        this.f15133e = this.f15130b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(InterfaceC2219Ad interfaceC2219Ad, AdError adError) {
        C12353b adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.m39955c());
        this.f15130b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(InterfaceC2219Ad interfaceC2219Ad) {
        InterfaceC7916k interfaceC7916k = this.f15133e;
        if (interfaceC7916k != null) {
            interfaceC7916k.reportAdImpression();
        }
    }
}
