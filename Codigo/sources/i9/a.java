package i9;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public abstract x8.a0 getSDKVersionInfo();

    public abstract x8.a0 getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<n> list);

    public void loadAppOpenAd(i iVar, e<h, Object> eVar) {
        eVar.onFailure(new x8.b(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(l lVar, e<j, k> eVar) {
        eVar.onFailure(new x8.b(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(l lVar, e<o, k> eVar) {
        eVar.onFailure(new x8.b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(r rVar, e<p, q> eVar) {
        eVar.onFailure(new x8.b(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(u uVar, e<c0, t> eVar) {
        eVar.onFailure(new x8.b(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(y yVar, e<w, x> eVar) {
        eVar.onFailure(new x8.b(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(y yVar, e<w, x> eVar) {
        eVar.onFailure(new x8.b(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
