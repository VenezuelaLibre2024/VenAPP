package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.C5104d;
import com.google.android.gms.common.api.Status;
import ga.C7533a;
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

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacd
    public final void zza(Status status) {
        C7533a c7533a;
        HashMap hashMap;
        c7533a = zzadu.zza;
        c7533a.m22871c("SMS verification code request failed: " + C5104d.m12979a(status.m12969v1()) + " " + status.m12970w1(), new Object[0]);
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

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacd
    public final void zzb(String str) {
        C7533a c7533a;
        HashMap hashMap;
        c7533a = zzadu.zza;
        c7533a.m22869a("onCodeSent", new Object[0]);
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
