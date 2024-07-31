package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.y0;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import x8.e0;

/* loaded from: classes2.dex */
public final class zzejs implements zzeit {
    private final Context zza;
    private final zzcvc zzb;
    private final Executor zzc;

    public zzejs(Context context, zzcvc zzcvcVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcvcVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, final zzfgm zzfgmVar, zzeiq zzeiqVar) {
        final View zza;
        if (((Boolean) a0.c().zza(zzbgc.zzhI)).booleanValue() && zzfgmVar.zzah) {
            zzbte zzc = ((zzfif) zzeiqVar.zzb).zzc();
            if (zzc == null) {
                zzcec.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfho(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) com.google.android.gms.dynamic.d.g2(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfho(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzgen.zzn(zzgen.zzh(null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzejq
                            @Override // com.google.android.gms.internal.ads.zzgdu
                            public final com.google.common.util.concurrent.f zza(Object obj) {
                                return zzejs.this.zzc(zza, zzfgmVar, obj);
                            }
                        }, zzcep.zze).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfho(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfho(e11);
            }
        } else {
            zza = ((zzfif) zzeiqVar.zzb).zza();
        }
        zzcvc zzcvcVar = this.zzb;
        zzcwx zzcwxVar = new zzcwx(zzfgyVar, zzfgmVar, zzeiqVar.zza);
        final zzfif zzfifVar = (zzfif) zzeiqVar.zzb;
        Objects.requireNonNull(zzfifVar);
        zzcug zza2 = zzcvcVar.zza(zzcwxVar, new zzcum(zza, null, new zzcwf() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // com.google.android.gms.internal.ads.zzcwf
            public final s2 zza() {
                return zzfif.this.zzb();
            }
        }, (zzfgn) zzfgmVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcrv((zzfif) zzeiqVar.zzb), this.zzc);
        ((zzekj) zzeiqVar.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        z4 z4Var;
        z4 z4Var2 = zzfgyVar.zza.zza.zze;
        if (z4Var2.f8844y) {
            z4Var = new z4(this.zza, e0.d(z4Var2.f8835e, z4Var2.f8832b));
        } else {
            z4Var = (((Boolean) a0.c().zza(zzbgc.zzhI)).booleanValue() && zzfgmVar.zzah) ? new z4(this.zza, e0.e(z4Var2.f8835e, z4Var2.f8832b)) : zzfhn.zza(this.zza, zzfgmVar.zzv);
        }
        z4 z4Var3 = z4Var;
        if (((Boolean) a0.c().zza(zzbgc.zzhI)).booleanValue() && zzfgmVar.zzah) {
            Object obj = zzeiqVar.zzb;
            ((zzfif) obj).zzn(this.zza, z4Var3, zzfgyVar.zza.zza.zzd, zzfgmVar.zzw.toString(), y0.l(zzfgmVar.zzt), (zzbtb) zzeiqVar.zzc);
            return;
        }
        Object obj2 = zzeiqVar.zzb;
        ((zzfif) obj2).zzm(this.zza, z4Var3, zzfgyVar.zza.zza.zzd, zzfgmVar.zzw.toString(), y0.l(zzfgmVar.zzt), (zzbtb) zzeiqVar.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(View view, zzfgm zzfgmVar, Object obj) {
        return zzgen.zzh(zzcvt.zza(this.zza, view, zzfgmVar));
    }
}
