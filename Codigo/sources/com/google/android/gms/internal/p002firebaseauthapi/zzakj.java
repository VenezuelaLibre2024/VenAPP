package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzakj implements zzakg {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final int zza(int i10, Object obj, Object obj2) {
        zzakh zzakhVar = (zzakh) obj;
        if (zzakhVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzakhVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final zzake<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(Object obj, Object obj2) {
        zzakh zzakhVar = (zzakh) obj;
        zzakh zzakhVar2 = (zzakh) obj2;
        if (!zzakhVar2.isEmpty()) {
            if (!zzakhVar.zzd()) {
                zzakhVar = zzakhVar.zzb();
            }
            zzakhVar.zza(zzakhVar2);
        }
        return zzakhVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zzb(Object obj) {
        return zzakh.zza().zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zzc(Object obj) {
        ((zzakh) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Map<?, ?> zzd(Object obj) {
        return (zzakh) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Map<?, ?> zze(Object obj) {
        return (zzakh) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final boolean zzf(Object obj) {
        return !((zzakh) obj).zzd();
    }
}
