package p157i9;

import android.content.Context;
import java.util.List;
import p438x8.C12352a0;
import p438x8.C12353b;

/* renamed from: i9.a */
/* loaded from: classes.dex */
public abstract class AbstractC7902a {
    public abstract C12352a0 getSDKVersionInfo();

    public abstract C12352a0 getVersionInfo();

    public abstract void initialize(Context context, InterfaceC7904b interfaceC7904b, List<C7919n> list);

    public void loadAppOpenAd(C7914i c7914i, InterfaceC7910e<InterfaceC7913h, Object> interfaceC7910e) {
        interfaceC7910e.onFailure(new C12353b(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(C7917l c7917l, InterfaceC7910e<InterfaceC7915j, InterfaceC7916k> interfaceC7910e) {
        interfaceC7910e.onFailure(new C12353b(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(C7917l c7917l, InterfaceC7910e<InterfaceC7920o, InterfaceC7916k> interfaceC7910e) {
        interfaceC7910e.onFailure(new C12353b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(C7923r c7923r, InterfaceC7910e<InterfaceC7921p, InterfaceC7922q> interfaceC7910e) {
        interfaceC7910e.onFailure(new C12353b(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(C7926u c7926u, InterfaceC7910e<AbstractC7907c0, InterfaceC7925t> interfaceC7910e) {
        interfaceC7910e.onFailure(new C12353b(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(C7930y c7930y, InterfaceC7910e<InterfaceC7928w, InterfaceC7929x> interfaceC7910e) {
        interfaceC7910e.onFailure(new C12353b(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(C7930y c7930y, InterfaceC7910e<InterfaceC7928w, InterfaceC7929x> interfaceC7910e) {
        interfaceC7910e.onFailure(new C12353b(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
