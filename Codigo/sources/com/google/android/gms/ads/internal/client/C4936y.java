package com.google.android.gms.ads.internal.client;

import p438x8.AbstractC12359e;
import p438x8.C12377o;

/* renamed from: com.google.android.gms.ads.internal.client.y */
/* loaded from: classes.dex */
public class C4936y extends AbstractC12359e {

    /* renamed from: a */
    private final Object f9882a = new Object();

    /* renamed from: b */
    private AbstractC12359e f9883b;

    /* renamed from: d */
    public final void m12481d(AbstractC12359e abstractC12359e) {
        synchronized (this.f9882a) {
            this.f9883b = abstractC12359e;
        }
    }

    @Override // p438x8.AbstractC12359e, com.google.android.gms.ads.internal.client.InterfaceC4783a
    public final void onAdClicked() {
        synchronized (this.f9882a) {
            AbstractC12359e abstractC12359e = this.f9883b;
            if (abstractC12359e != null) {
                abstractC12359e.onAdClicked();
            }
        }
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdClosed() {
        synchronized (this.f9882a) {
            AbstractC12359e abstractC12359e = this.f9883b;
            if (abstractC12359e != null) {
                abstractC12359e.onAdClosed();
            }
        }
    }

    @Override // p438x8.AbstractC12359e
    public void onAdFailedToLoad(C12377o c12377o) {
        synchronized (this.f9882a) {
            AbstractC12359e abstractC12359e = this.f9883b;
            if (abstractC12359e != null) {
                abstractC12359e.onAdFailedToLoad(c12377o);
            }
        }
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdImpression() {
        synchronized (this.f9882a) {
            AbstractC12359e abstractC12359e = this.f9883b;
            if (abstractC12359e != null) {
                abstractC12359e.onAdImpression();
            }
        }
    }

    @Override // p438x8.AbstractC12359e
    public void onAdLoaded() {
        synchronized (this.f9882a) {
            AbstractC12359e abstractC12359e = this.f9883b;
            if (abstractC12359e != null) {
                abstractC12359e.onAdLoaded();
            }
        }
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdOpened() {
        synchronized (this.f9882a) {
            AbstractC12359e abstractC12359e = this.f9883b;
            if (abstractC12359e != null) {
                abstractC12359e.onAdOpened();
            }
        }
    }
}
