package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzesd implements zzexq {
    private final zzgey zza;
    private final zzdua zzb;
    private final zzdyi zzc;
    private final zzesf zzd;

    public zzesd(zzgey zzgeyVar, zzdua zzduaVar, zzdyi zzdyiVar, zzesf zzesfVar) {
        this.zza = zzgeyVar;
        this.zzb = zzduaVar;
        this.zzc = zzdyiVar;
        this.zzd = zzesfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        zzbfu zzbfuVar = zzbgc.zzlc;
        if (((Boolean) a0.c().zza(zzbfuVar)).booleanValue() && this.zzd.zza() != null) {
            zzese zza = this.zzd.zza();
            zza.getClass();
            return zzgen.zzh(zza);
        }
        if (zzfxt.zzd((String) a0.c().zza(zzbgc.zzbr)) || (!((Boolean) a0.c().zza(zzbfuVar)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzgen.zzh(new zzese(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesd.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzese zzc() {
        List<String> asList = Arrays.asList(((String) a0.c().zza(zzbgc.zzbr)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfif zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) a0.c().zza(zzbgc.zzlc)).booleanValue() || zzt) {
                    try {
                        zzbvg zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfho unused) {
                    }
                }
                try {
                    zzbvg zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfho unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfho unused3) {
            }
        }
        zzese zzeseVar = new zzese(bundle);
        if (((Boolean) a0.c().zza(zzbgc.zzlc)).booleanValue()) {
            this.zzd.zzb(zzeseVar);
        }
        return zzeseVar;
    }
}
