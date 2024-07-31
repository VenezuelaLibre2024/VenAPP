package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeuj implements zzexq {
    private final Context zza;
    private final zzgey zzb;

    public zzeuj(Context context, zzgey zzgeyVar) {
        this.zza = context;
        this.zzb = zzgeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                t.r();
                zzazp zzg = t.q().zzi().zzg();
                Bundle bundle = null;
                if (zzg != null && (!t.q().zzi().zzN() || !t.q().zzi().zzO())) {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzazf zza = zzg.zza();
                    if (zza != null) {
                        zzj = zza.zzd();
                        str = zza.zze();
                        zzk = zza.zzf();
                        if (zzj != null) {
                            t.q().zzi().j(zzj);
                        }
                        if (zzk != null) {
                            t.q().zzi().zzy(zzk);
                        }
                    } else {
                        zzj = t.q().zzi().zzj();
                        zzk = t.q().zzi().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!t.q().zzi().zzO()) {
                        if (zzk == null || TextUtils.isEmpty(zzk)) {
                            zzk = "no_hash";
                        }
                        bundle2.putString("v_fp_vertical", zzk);
                    }
                    if (zzj != null && !t.q().zzi().zzN()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeuk(bundle);
            }
        });
    }
}
