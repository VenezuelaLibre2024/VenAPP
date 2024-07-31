package io.flutter.plugins.googlemobileads;

import x8.j;
import x8.t;

/* loaded from: classes3.dex */
public class FlutterPaidEventListener implements t {

    /* renamed from: ad, reason: collision with root package name */
    private final FlutterAd f18291ad;
    private final AdInstanceManager manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterPaidEventListener(AdInstanceManager adInstanceManager, FlutterAd flutterAd) {
        this.manager = adInstanceManager;
        this.f18291ad = flutterAd;
    }

    @Override // x8.t
    public void onPaidEvent(j jVar) {
        this.manager.onPaidEvent(this.f18291ad, new FlutterAdValue(jVar.b(), jVar.a(), jVar.c()));
    }
}
