package com.google.android.gms.ads.internal.client;

import p438x8.C12354b0;

/* renamed from: com.google.android.gms.ads.internal.client.m4 */
/* loaded from: classes.dex */
public final class BinderC4869m4 extends AbstractBinderC4915u2 {

    /* renamed from: a */
    private final C12354b0.a f9783a;

    public BinderC4869m4(C12354b0.a aVar) {
        this.f9783a = aVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4921v2
    public final void zze() {
        this.f9783a.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4921v2
    public final void zzf(boolean z10) {
        this.f9783a.onVideoMute(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4921v2
    public final void zzg() {
        this.f9783a.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4921v2
    public final void zzh() {
        this.f9783a.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4921v2
    public final void zzi() {
        this.f9783a.onVideoStart();
    }
}
