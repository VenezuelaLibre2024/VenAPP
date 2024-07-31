package io.flutter.plugins.googlemobileads;

import android.content.Context;
import com.google.android.gms.ads.nativead.b;
import x8.e;
import x8.g;
import x8.h;
import y8.a;
import y8.c;
import y8.d;
import z8.a;

/* loaded from: classes3.dex */
public class FlutterAdLoader {
    private final Context context;

    public FlutterAdLoader(Context context) {
        this.context = context;
    }

    public void loadAdManagerAppOpen(String str, a aVar, a.AbstractC0543a abstractC0543a) {
        z8.a.load(this.context, str, aVar, abstractC0543a);
    }

    public void loadAdManagerInterstitial(String str, y8.a aVar, d dVar) {
        c.load(this.context, str, aVar, dVar);
    }

    public void loadAdManagerNativeAd(String str, b.c cVar, com.google.android.gms.ads.nativead.c cVar2, e eVar, y8.a aVar) {
        new g.a(this.context, str).b(cVar).d(cVar2).c(eVar).a().b(aVar);
    }

    public void loadAdManagerRewarded(String str, y8.a aVar, n9.d dVar) {
        n9.c.load(this.context, str, aVar, dVar);
    }

    public void loadAdManagerRewardedInterstitial(String str, y8.a aVar, o9.b bVar) {
        o9.a.load(this.context, str, aVar, bVar);
    }

    public void loadAppOpen(String str, h hVar, a.AbstractC0543a abstractC0543a) {
        z8.a.load(this.context, str, hVar, abstractC0543a);
    }

    public void loadInterstitial(String str, h hVar, h9.b bVar) {
        h9.a.load(this.context, str, hVar, bVar);
    }

    public void loadNativeAd(String str, b.c cVar, com.google.android.gms.ads.nativead.c cVar2, e eVar, h hVar) {
        new g.a(this.context, str).b(cVar).d(cVar2).c(eVar).a().a(hVar);
    }

    public void loadRewarded(String str, h hVar, n9.d dVar) {
        n9.c.load(this.context, str, hVar, dVar);
    }

    public void loadRewardedInterstitial(String str, h hVar, o9.b bVar) {
        o9.a.load(this.context, str, hVar, bVar);
    }
}
