package d6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import c6.f;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import i9.c0;
import i9.e;
import i9.t;
import i9.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends c0 {

    /* renamed from: s, reason: collision with root package name */
    private final u f13788s;

    /* renamed from: t, reason: collision with root package name */
    private final e<c0, t> f13789t;

    /* renamed from: u, reason: collision with root package name */
    private NativeAdBase f13790u;

    /* renamed from: v, reason: collision with root package name */
    private t f13791v;

    /* renamed from: w, reason: collision with root package name */
    private MediaView f13792w;

    /* renamed from: x, reason: collision with root package name */
    private final f f13793x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements MediaViewListener {
        a() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (c.this.f13791v != null) {
                c.this.f13791v.onVideoComplete();
            }
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onEnterFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onExitFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenBackground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenForeground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPause(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPlay(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onVolumeChange(MediaView mediaView, float f10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends a9.d {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f13795a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f13796b;

        public b() {
        }

        public b(Drawable drawable) {
            this.f13795a = drawable;
        }

        public b(Uri uri) {
            this.f13796b = uri;
        }

        @Override // a9.d
        public Drawable getDrawable() {
            return this.f13795a;
        }

        @Override // a9.d
        public double getScale() {
            return 1.0d;
        }

        @Override // a9.d
        public Uri getUri() {
            return this.f13796b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d6.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0206c {
        void a();

        void b(x8.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements AdListener, NativeAdListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f13798a;

        /* renamed from: b, reason: collision with root package name */
        private final NativeAdBase f13799b;

        /* loaded from: classes.dex */
        class a implements InterfaceC0206c {
            a() {
            }

            @Override // d6.c.InterfaceC0206c
            public void a() {
                c cVar = c.this;
                cVar.f13791v = (t) cVar.f13789t.onSuccess(c.this);
            }

            @Override // d6.c.InterfaceC0206c
            public void b(x8.b bVar) {
                Log.w(FacebookMediationAdapter.TAG, bVar.c());
                c.this.f13789t.onFailure(bVar);
            }
        }

        d(Context context, NativeAdBase nativeAdBase) {
            this.f13799b = nativeAdBase;
            this.f13798a = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            c.this.f13791v.reportAdClicked();
            c.this.f13791v.onAdOpened();
            c.this.f13791v.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.f13799b) {
                x8.b bVar = new x8.b(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, bVar.c());
                c.this.f13789t.onFailure(bVar);
                return;
            }
            Context context = this.f13798a.get();
            if (context != null) {
                c.this.T(context, new a());
                return;
            }
            x8.b bVar2 = new x8.b(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, bVar2.c());
            c.this.f13789t.onFailure(bVar2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            x8.b adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.c());
            c.this.f13789t.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public c(u uVar, e<c0, t> eVar, f fVar) {
        this.f13789t = eVar;
        this.f13788s = uVar;
        this.f13793x = fVar;
    }

    private boolean S(NativeAdBase nativeAdBase) {
        boolean z10 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        return nativeAdBase instanceof NativeBannerAd ? z10 : (!z10 || nativeAdBase.getAdCoverImage() == null || this.f13792w == null) ? false : true;
    }

    @Override // i9.c0
    public void I(View view, Map<String, View> map, Map<String, View> map2) {
        D(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f13790u;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            }
        }
        if (!(nativeAdBase instanceof NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        NativeAd nativeAd = (NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.f13792w, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.f13792w, arrayList);
        }
    }

    @Override // i9.c0
    public void J(View view) {
        NativeAdBase nativeAdBase = this.f13790u;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.J(view);
    }

    public void T(Context context, InterfaceC0206c interfaceC0206c) {
        if (!S(this.f13790u)) {
            x8.b bVar = new x8.b(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, bVar.c());
            interfaceC0206c.b(bVar);
            return;
        }
        z(this.f13790u.getAdHeadline());
        if (this.f13790u.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(Uri.parse(this.f13790u.getAdCoverImage().getUrl())));
            B(arrayList);
        }
        v(this.f13790u.getAdBodyText());
        if (this.f13790u.getPreloadedIconViewDrawable() == null) {
            A(this.f13790u.getAdIcon() == null ? new b() : new b(Uri.parse(this.f13790u.getAdIcon().getUrl())));
        } else {
            A(new b(this.f13790u.getPreloadedIconViewDrawable()));
        }
        w(this.f13790u.getAdCallToAction());
        u(this.f13790u.getAdvertiserName());
        this.f13792w.setListener(new a());
        y(true);
        C(this.f13792w);
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, this.f13790u.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f13790u.getAdSocialContext());
        x(bundle);
        t(new AdOptionsView(context, this.f13790u, null));
        interfaceC0206c.a();
    }

    public void U() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f13788s.c());
        if (TextUtils.isEmpty(placementID)) {
            x8.b bVar = new x8.b(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, bVar.c());
            this.f13789t.onFailure(bVar);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f13788s);
        this.f13792w = this.f13793x.b(this.f13788s.b());
        try {
            this.f13790u = NativeAdBase.fromBidPayload(this.f13788s.b(), placementID, this.f13788s.a());
            if (!TextUtils.isEmpty(this.f13788s.d())) {
                this.f13790u.setExtraHints(new ExtraHints.Builder().mediationData(this.f13788s.d()).build());
            }
            NativeAdBase nativeAdBase = this.f13790u;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new d(this.f13788s.b(), this.f13790u)).withBid(this.f13788s.a()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            x8.b bVar2 = new x8.b(109, "Failed to create native ad from bid payload: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, bVar2.c());
            this.f13789t.onFailure(bVar2);
        }
    }
}
