package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes2.dex */
public final class zzaq implements zzdn {
    private final zzdr zza;

    public zzaq(zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzap((Application) this.zza.zza());
    }
}