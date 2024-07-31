package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import ga.a;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzadz extends zzacd {
    private final String zza;
    private final /* synthetic */ zzadu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzadz(zzadu zzaduVar, zzacd zzacdVar, String str) {
        super(zzacdVar);
        this.zzb = zzaduVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacd
    public final void zza(Status status) {
        a aVar;
        HashMap hashMap;
        aVar = zzadu.zza;
        aVar.c("SMS verification code request failed: " + d.a(status.v1()) + " " + status.w1(), new Object[0]);
        hashMap = this.zzb.zzd;
        zzaeb zzaebVar = (zzaeb) hashMap.get(this.zza);
        if (zzaebVar == null) {
            return;
        }
        Iterator<zzacd> it = zzaebVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacd
    public final void zzb(String str) {
        a aVar;
        HashMap hashMap;
        aVar = zzadu.zza;
        aVar.a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzaeb zzaebVar = (zzaeb) hashMap.get(this.zza);
        if (zzaebVar == null) {
            return;
        }
        Iterator<zzacd> it = zzaebVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzaebVar.zzg = true;
        zzaebVar.zzd = str;
        if (zzaebVar.zza <= 0) {
            this.zzb.zzb(this.zza);
        } else if (!zzaebVar.zzc) {
            this.zzb.zze(this.zza);
        } else {
            if (zzag.zzc(zzaebVar.zze)) {
                return;
            }
            zzadu.zza(this.zzb, this.zza);
        }
    }
}
