package p057d6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC2219Ad;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import p011a9.AbstractC0066d;
import p038c6.C1878f;
import p157i9.AbstractC7907c0;
import p157i9.C7926u;
import p157i9.InterfaceC7910e;
import p157i9.InterfaceC7925t;
import p438x8.C12353b;

/* renamed from: d6.c */
/* loaded from: classes.dex */
public class C6848c extends AbstractC7907c0 {

    /* renamed from: s */
    private final C7926u f15142s;

    /* renamed from: t */
    private final InterfaceC7910e<AbstractC7907c0, InterfaceC7925t> f15143t;

    /* renamed from: u */
    private NativeAdBase f15144u;

    /* renamed from: v */
    private InterfaceC7925t f15145v;

    /* renamed from: w */
    private MediaView f15146w;

    /* renamed from: x */
    private final C1878f f15147x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d6.c$a */
    /* loaded from: classes.dex */
    public class a implements MediaViewListener {
        a() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (C6848c.this.f15145v != null) {
                C6848c.this.f15145v.onVideoComplete();
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
    /* renamed from: d6.c$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC0066d {

        /* renamed from: a */
        private Drawable f15149a;

        /* renamed from: b */
        private Uri f15150b;

        public b() {
        }

        public b(Drawable drawable) {
            this.f15149a = drawable;
        }

        public b(Uri uri) {
            this.f15150b = uri;
        }

        @Override // p011a9.AbstractC0066d
        public Drawable getDrawable() {
            return this.f15149a;
        }

        @Override // p011a9.AbstractC0066d
        public double getScale() {
            return 1.0d;
        }

        @Override // p011a9.AbstractC0066d
        public Uri getUri() {
            return this.f15150b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d6.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo19794a();

        /* renamed from: b */
        void mo19795b(C12353b c12353b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d6.c$d */
    /* loaded from: classes.dex */
    public class d implements AdListener, NativeAdListener {

        /* renamed from: a */
        private final WeakReference<Context> f15152a;

        /* renamed from: b */
        private final NativeAdBase f15153b;

        /* renamed from: d6.c$d$a */
        /* loaded from: classes.dex */
        class a implements c {
            a() {
            }

            @Override // p057d6.C6848c.c
            /* renamed from: a */
            public void mo19794a() {
                C6848c c6848c = C6848c.this;
                c6848c.f15145v = (InterfaceC7925t) c6848c.f15143t.onSuccess(C6848c.this);
            }

            @Override // p057d6.C6848c.c
            /* renamed from: b */
            public void mo19795b(C12353b c12353b) {
                Log.w(FacebookMediationAdapter.TAG, c12353b.m39955c());
                C6848c.this.f15143t.onFailure(c12353b);
            }
        }

        d(Context context, NativeAdBase nativeAdBase) {
            this.f15153b = nativeAdBase;
            this.f15152a = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(InterfaceC2219Ad interfaceC2219Ad) {
            C6848c.this.f15145v.reportAdClicked();
            C6848c.this.f15145v.onAdOpened();
            C6848c.this.f15145v.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(InterfaceC2219Ad interfaceC2219Ad) {
            if (interfaceC2219Ad != this.f15153b) {
                C12353b c12353b = new C12353b(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, c12353b.m39955c());
                C6848c.this.f15143t.onFailure(c12353b);
                return;
            }
            Context context = this.f15152a.get();
            if (context != null) {
                C6848c.this.m19792T(context, new a());
                return;
            }
            C12353b c12353b2 = new C12353b(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, c12353b2.m39955c());
            C6848c.this.f15143t.onFailure(c12353b2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(InterfaceC2219Ad interfaceC2219Ad, AdError adError) {
            C12353b adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.m39955c());
            C6848c.this.f15143t.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(InterfaceC2219Ad interfaceC2219Ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(InterfaceC2219Ad interfaceC2219Ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public C6848c(C7926u c7926u, InterfaceC7910e<AbstractC7907c0, InterfaceC7925t> interfaceC7910e, C1878f c1878f) {
        this.f15143t = interfaceC7910e;
        this.f15142s = c7926u;
        this.f15147x = c1878f;
    }

    /* renamed from: S */
    private boolean m19790S(NativeAdBase nativeAdBase) {
        boolean z10 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        return nativeAdBase instanceof NativeBannerAd ? z10 : (!z10 || nativeAdBase.getAdCoverImage() == null || this.f15146w == null) ? false : true;
    }

    @Override // p157i9.AbstractC7907c0
    /* renamed from: I */
    public void mo11774I(View view, Map<String, View> map, Map<String, View> map2) {
        m24384D(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f15144u;
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
            nativeAd.registerViewForInteraction(view, this.f15146w, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.f15146w, arrayList);
        }
    }

    @Override // p157i9.AbstractC7907c0
    /* renamed from: J */
    public void mo19791J(View view) {
        NativeAdBase nativeAdBase = this.f15144u;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.mo19791J(view);
    }

    /* renamed from: T */
    public void m19792T(Context context, c cVar) {
        if (!m19790S(this.f15144u)) {
            C12353b c12353b = new C12353b(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, c12353b.m39955c());
            cVar.mo19795b(c12353b);
            return;
        }
        m24419z(this.f15144u.getAdHeadline());
        if (this.f15144u.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(Uri.parse(this.f15144u.getAdCoverImage().getUrl())));
            m24382B(arrayList);
        }
        m24415v(this.f15144u.getAdBodyText());
        if (this.f15144u.getPreloadedIconViewDrawable() == null) {
            m24381A(this.f15144u.getAdIcon() == null ? new b() : new b(Uri.parse(this.f15144u.getAdIcon().getUrl())));
        } else {
            m24381A(new b(this.f15144u.getPreloadedIconViewDrawable()));
        }
        m24416w(this.f15144u.getAdCallToAction());
        m24414u(this.f15144u.getAdvertiserName());
        this.f15146w.setListener(new a());
        m24418y(true);
        m24383C(this.f15146w);
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, this.f15144u.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f15144u.getAdSocialContext());
        m24417x(bundle);
        m24413t(new AdOptionsView(context, this.f15144u, null));
        cVar.mo19794a();
    }

    /* renamed from: U */
    public void m19793U() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f15142s.m24422c());
        if (TextUtils.isEmpty(placementID)) {
            C12353b c12353b = new C12353b(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, c12353b.m39955c());
            this.f15143t.onFailure(c12353b);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f15142s);
        this.f15146w = this.f15147x.m9982b(this.f15142s.m24421b());
        try {
            this.f15144u = NativeAdBase.fromBidPayload(this.f15142s.m24421b(), placementID, this.f15142s.m24420a());
            if (!TextUtils.isEmpty(this.f15142s.m24423d())) {
                this.f15144u.setExtraHints(new ExtraHints.Builder().mediationData(this.f15142s.m24423d()).build());
            }
            NativeAdBase nativeAdBase = this.f15144u;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new d(this.f15142s.m24421b(), this.f15144u)).withBid(this.f15142s.m24420a()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            C12353b c12353b2 = new C12353b(109, "Failed to create native ad from bid payload: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, c12353b2.m39955c());
            this.f15143t.onFailure(c12353b2);
        }
    }
}
