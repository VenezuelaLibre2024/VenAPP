package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import java.util.List;

/* loaded from: classes2.dex */
final class zzcso implements zzgej {
    final /* synthetic */ zzcsq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcso(zzcsq zzcsqVar) {
        this.zza = zzcsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfht zzfhtVar;
        zzfnu zzfnuVar;
        zzfgy zzfgyVar;
        zzfgm zzfgmVar;
        zzfgm zzfgmVar2;
        Context context;
        zzcsq zzcsqVar = this.zza;
        String str = (String) obj;
        zzfhtVar = zzcsqVar.zzh;
        zzfnuVar = zzcsqVar.zzg;
        zzfgyVar = zzcsqVar.zze;
        zzfgmVar = zzcsqVar.zzf;
        zzfgmVar2 = zzcsqVar.zzf;
        List zzd = zzfnuVar.zzd(zzfgyVar, zzfgmVar, false, "", str, zzfgmVar2.zzc);
        zzcsq zzcsqVar2 = this.zza;
        zzcdl q10 = t.q();
        context = zzcsqVar2.zza;
        zzfhtVar.zzc(zzd, true == q10.zzz(context) ? 2 : 1);
    }
}
