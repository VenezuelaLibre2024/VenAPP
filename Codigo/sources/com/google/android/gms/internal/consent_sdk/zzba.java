package com.google.android.gms.internal.consent_sdk;

import cb.b;
import cb.e;
import cb.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzba implements f.b, f.a {
    private final f.b zza;
    private final f.a zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzba(f.b bVar, f.a aVar, zzaz zzazVar) {
        this.zza = bVar;
        this.zzb = aVar;
    }

    @Override // cb.f.a
    public final void onConsentFormLoadFailure(e eVar) {
        this.zzb.onConsentFormLoadFailure(eVar);
    }

    @Override // cb.f.b
    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
