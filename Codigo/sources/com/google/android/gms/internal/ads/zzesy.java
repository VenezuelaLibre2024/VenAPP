package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;

/* loaded from: classes2.dex */
public final class zzesy implements zzexq {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final zzcyb zze;
    private final zzfip zzf;
    private final zzfhh zzg;
    private final w1 zzh = t.q().zzi();
    private final zzdwa zzi;
    private final zzcyo zzj;

    public zzesy(Context context, String str, String str2, zzcyb zzcybVar, zzfip zzfipVar, zzfhh zzfhhVar, zzdwa zzdwaVar, zzcyo zzcyoVar) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzcybVar;
        this.zzf = zzfipVar;
        this.zzg = zzfhhVar;
        this.zzi = zzdwaVar;
        this.zzj = zzcyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) a0.c().zza(zzbgc.zzhy)).booleanValue()) {
            zzdwa zzdwaVar = this.zzi;
            zzdwaVar.zza().put("seq_num", this.zzc);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzfA)).booleanValue()) {
            this.zze.zzk(this.zzg.zzd);
            bundle.putAll(this.zzf.zzb());
        }
        return zzgen.zzh(new zzexp() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                zzesy.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzc(android.os.Bundle r4, android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesy.zzc(android.os.Bundle, android.os.Bundle):void");
    }
}
