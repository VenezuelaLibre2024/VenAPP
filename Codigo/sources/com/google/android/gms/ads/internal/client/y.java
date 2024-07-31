package com.google.android.gms.ads.internal.client;

/* loaded from: classes.dex */
public class y extends x8.e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8795a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private x8.e f8796b;

    public final void d(x8.e eVar) {
        synchronized (this.f8795a) {
            this.f8796b = eVar;
        }
    }

    @Override // x8.e, com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        synchronized (this.f8795a) {
            x8.e eVar = this.f8796b;
            if (eVar != null) {
                eVar.onAdClicked();
            }
        }
    }

    @Override // x8.e
    public final void onAdClosed() {
        synchronized (this.f8795a) {
            x8.e eVar = this.f8796b;
            if (eVar != null) {
                eVar.onAdClosed();
            }
        }
    }

    @Override // x8.e
    public void onAdFailedToLoad(x8.o oVar) {
        synchronized (this.f8795a) {
            x8.e eVar = this.f8796b;
            if (eVar != null) {
                eVar.onAdFailedToLoad(oVar);
            }
        }
    }

    @Override // x8.e
    public final void onAdImpression() {
        synchronized (this.f8795a) {
            x8.e eVar = this.f8796b;
            if (eVar != null) {
                eVar.onAdImpression();
            }
        }
    }

    @Override // x8.e
    public void onAdLoaded() {
        synchronized (this.f8795a) {
            x8.e eVar = this.f8796b;
            if (eVar != null) {
                eVar.onAdLoaded();
            }
        }
    }

    @Override // x8.e
    public final void onAdOpened() {
        synchronized (this.f8795a) {
            x8.e eVar = this.f8796b;
            if (eVar != null) {
                eVar.onAdOpened();
            }
        }
    }
}
