package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import cb.a;
import cb.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzl {
    private final Application zza;
    private final zzap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(Application application, zzap zzapVar) {
        this.zza = application;
        this.zzb = zzapVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzci zzc(Activity activity, d dVar) {
        a a10 = dVar.a();
        if (a10 == null) {
            a10 = new a.C0118a(this.zza).b();
        }
        return zzn.zza(new zzn(this, activity, a10, dVar, null));
    }
}
