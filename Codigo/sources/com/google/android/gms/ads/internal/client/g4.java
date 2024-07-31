package com.google.android.gms.ads.internal.client;

/* loaded from: classes.dex */
public final class g4 extends e2 {

    /* renamed from: a, reason: collision with root package name */
    private final n9.a f8668a;

    public g4(n9.a aVar) {
        this.f8668a = aVar;
    }

    @Override // com.google.android.gms.ads.internal.client.f2
    public final void zze() {
        n9.a aVar = this.f8668a;
        if (aVar != null) {
            aVar.onAdMetadataChanged();
        }
    }
}
