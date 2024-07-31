package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzebf implements zzgej {
    final /* synthetic */ zzebg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebf(zzebg zzebgVar) {
        this.zza = zzebgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        Pattern pattern;
        zzegc zzegcVar;
        if (((Boolean) a0.c().zza(zzbgc.zzgj)).booleanValue()) {
            pattern = zzebg.zza;
            Matcher matcher = pattern.matcher(th2.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzegcVar = this.zza.zzf;
                zzegcVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegc zzegcVar;
        zzegc zzegcVar2;
        zzfgy zzfgyVar = (zzfgy) obj;
        if (((Boolean) a0.c().zza(zzbgc.zzgj)).booleanValue()) {
            zzegcVar = this.zza.zzf;
            zzegcVar.zzi(zzfgyVar.zzb.zzb.zze);
            zzegcVar2 = this.zza.zzf;
            zzegcVar2.zzj(zzfgyVar.zzb.zzb.zzf);
        }
    }
}
