package com.google.android.gms.ads.internal.client;

import x8.b0;

/* loaded from: classes.dex */
public final class m4 extends u2 {

    /* renamed from: a, reason: collision with root package name */
    private final b0.a f8706a;

    public m4(b0.a aVar) {
        this.f8706a = aVar;
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zze() {
        this.f8706a.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zzf(boolean z10) {
        this.f8706a.onVideoMute(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zzg() {
        this.f8706a.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zzh() {
        this.f8706a.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.v2
    public final void zzi() {
        this.f8706a.onVideoStart();
    }
}
