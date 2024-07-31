package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c6.d;
import c6.e;
import c6.f;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.BidderTokenProvider;
import com.google.ads.mediation.facebook.a;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import d6.b;
import d6.c;
import i9.c0;
import i9.j;
import i9.k;
import i9.l;
import i9.n;
import i9.p;
import i9.q;
import i9.r;
import i9.t;
import i9.u;
import i9.w;
import i9.x;
import i9.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x8.a0;

/* loaded from: classes.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";

    /* renamed from: a */
    private d6.a f8068a;

    /* renamed from: b */
    private b f8069b;

    /* renamed from: c */
    private c f8070c;

    /* renamed from: d */
    private c6.c f8071d;

    /* renamed from: e */
    private d f8072e;

    /* renamed from: f */
    private final f f8073f = new f();

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0139a {

        /* renamed from: a */
        final /* synthetic */ i9.b f8074a;

        a(i9.b bVar) {
            this.f8074a = bVar;
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0139a
        public void a() {
            this.f8074a.onInitializationSucceeded();
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0139a
        public void b(x8.b bVar) {
            this.f8074a.onInitializationFailed(bVar.c());
        }
    }

    public static x8.b getAdError(AdError adError) {
        return new x8.b(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    public static String getPlacementID(Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(i9.d dVar) {
        if (dVar.e() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (dVar.e() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(k9.a aVar, k9.b bVar) {
        bVar.onSuccess(BidderTokenProvider.getBidderToken(aVar.a()));
    }

    @Override // i9.a
    public a0 getSDKVersionInfo() {
        String a10 = e.a();
        String[] split = a10.split("\\.");
        if (split.length >= 3) {
            return new a0(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s.Returning 0.0.0 for SDK version.", a10));
        return new a0(0, 0, 0);
    }

    @Override // i9.a
    public a0 getVersionInfo() {
        String a10 = c6.a.a();
        String[] split = a10.split("\\.");
        if (split.length >= 4) {
            return new a0(Integer.parseInt(split[0]), Integer.parseInt(split[1]), (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s.Returning 0.0.0 for adapter version.", a10));
        return new a0(0, 0, 0);
    }

    @Override // i9.a
    public void initialize(Context context, i9.b bVar, List<n> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            String placementID = getPlacementID(it.next().a());
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (arrayList.isEmpty()) {
            bVar.onInitializationFailed("Initialization failed. No placement IDs found.");
        } else {
            com.google.ads.mediation.facebook.a.a().b(context, arrayList, new a(bVar));
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(l lVar, i9.e<j, k> eVar) {
        d6.a aVar = new d6.a(lVar, eVar, this.f8073f);
        this.f8068a = aVar;
        aVar.b();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(r rVar, i9.e<p, q> eVar) {
        b bVar = new b(rVar, eVar, this.f8073f);
        this.f8069b = bVar;
        bVar.b();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(u uVar, i9.e<c0, t> eVar) {
        c cVar = new c(uVar, eVar, this.f8073f);
        this.f8070c = cVar;
        cVar.U();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(y yVar, i9.e<w, x> eVar) {
        c6.c cVar = new c6.c(yVar, eVar, this.f8073f);
        this.f8071d = cVar;
        cVar.c();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(y yVar, i9.e<w, x> eVar) {
        d dVar = new d(yVar, eVar, this.f8073f);
        this.f8072e = dVar;
        dVar.c();
    }
}
