package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.s2;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class zzejy implements zzeit {
    private final Context zza;
    private final zzcvc zzb;
    private View zzc;
    private zzbte zzd;

    public zzejy(Context context, zzcvc zzcvcVar) {
        this.zza = context;
        this.zzb = zzcvcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeit
    public final /* bridge */ /* synthetic */ Object zza(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        View view;
        if (((Boolean) a0.c().zza(zzbgc.zzhI)).booleanValue() && zzfgmVar.zzah) {
            try {
                view = (View) com.google.android.gms.dynamic.d.g2(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfho(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzgen.zzn(zzgen.zzh(null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzejv
                            public final /* synthetic */ View zzb;
                            public final /* synthetic */ zzfgm zzc;

                            public /* synthetic */ zzejv(View view2, zzfgm zzfgmVar2) {
                                r2 = view2;
                                r3 = zzfgmVar2;
                            }

                            @Override // com.google.android.gms.internal.ads.zzgdu
                            public final com.google.common.util.concurrent.f zza(Object obj) {
                                return zzejy.this.zzc(r2, r3, obj);
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
            view2 = this.zzc;
        }
        zzcug zza = this.zzb.zza(new zzcwx(zzfgyVar, zzfgmVar2, zzeiqVar.zza), new zzcum(view2, null, new zzcwf() { // from class: com.google.android.gms.internal.ads.zzeju
            public /* synthetic */ zzeju() {
            }

            @Override // com.google.android.gms.internal.ads.zzcwf
            public final s2 zza() {
                try {
                    return ((zzbus) zzeiq.this.zzb).zze();
                } catch (RemoteException e12) {
                    throw new zzfho(e12);
                }
            }
        }, (zzfgn) zzfgmVar2.zzv.get(0)));
        zza.zzg().zza(view2);
        ((zzekj) zzeiqVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeit
    public final void zzb(zzfgy zzfgyVar, zzfgm zzfgmVar, zzeiq zzeiqVar) {
        try {
            ((zzbus) zzeiqVar.zzb).zzq(zzfgmVar.zzaa);
            if (((Boolean) a0.c().zza(zzbgc.zzhI)).booleanValue() && zzfgmVar.zzah) {
                ((zzbus) zzeiqVar.zzb).zzk(zzfgmVar.zzV, zzfgmVar.zzw.toString(), zzfgyVar.zza.zza.zzd, com.google.android.gms.dynamic.d.h2(this.zza), new zzejx(this, zzeiqVar, null), (zzbtb) zzeiqVar.zzc, zzfgyVar.zza.zza.zze);
            } else {
                ((zzbus) zzeiqVar.zzb).zzj(zzfgmVar.zzV, zzfgmVar.zzw.toString(), zzfgyVar.zza.zza.zzd, com.google.android.gms.dynamic.d.h2(this.zza), new zzejx(this, zzeiqVar, null), (zzbtb) zzeiqVar.zzc, zzfgyVar.zza.zza.zze);
            }
        } catch (RemoteException e10) {
            throw new zzfho(e10);
        }
    }

    public final /* synthetic */ com.google.common.util.concurrent.f zzc(View view, zzfgm zzfgmVar, Object obj) {
        return zzgen.zzh(zzcvt.zza(this.zza, view, zzfgmVar));
    }
}
