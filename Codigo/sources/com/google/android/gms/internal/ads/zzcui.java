package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.ads.internal.client.z4;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcui extends zzcuf {
    private final Context zzc;
    private final View zzd;
    private final zzcjk zze;
    private final zzfgn zzf;
    private final zzcwf zzg;
    private final zzdnl zzh;
    private final zzdiw zzi;
    private final zzhgx zzj;
    private final Executor zzk;
    private z4 zzl;

    public zzcui(zzcwg zzcwgVar, Context context, zzfgn zzfgnVar, View view, zzcjk zzcjkVar, zzcwf zzcwfVar, zzdnl zzdnlVar, zzdiw zzdiwVar, zzhgx zzhgxVar, Executor executor) {
        super(zzcwgVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcjkVar;
        this.zzf = zzfgnVar;
        this.zzg = zzcwfVar;
        this.zzh = zzdnlVar;
        this.zzi = zzdiwVar;
        this.zzj = zzhgxVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcui zzcuiVar) {
        zzdnl zzdnlVar = zzcuiVar.zzh;
        if (zzdnlVar.zze() == null) {
            return;
        }
        try {
            zzdnlVar.zze().zze((u0) zzcuiVar.zzj.zzb(), com.google.android.gms.dynamic.d.h2(zzcuiVar.zzc));
        } catch (RemoteException e10) {
            zzcec.zzh("RemoteException when notifyAdLoad is called", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final int zza() {
        if (((Boolean) a0.c().zza(zzbgc.zzhI)).booleanValue() && this.zzb.zzah) {
            if (!((Boolean) a0.c().zza(zzbgc.zzhJ)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final s2 zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfho unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final zzfgn zze() {
        z4 z4Var = this.zzl;
        if (z4Var != null) {
            return zzfhn.zzb(z4Var);
        }
        zzfgm zzfgmVar = this.zzb;
        if (zzfgmVar.zzad) {
            for (String str : zzfgmVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfgn(view.getWidth(), view.getHeight(), false);
        }
        return (zzfgn) this.zzb.zzs.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final zzfgn zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzh(ViewGroup viewGroup, z4 z4Var) {
        zzcjk zzcjkVar;
        if (viewGroup == null || (zzcjkVar = this.zze) == null) {
            return;
        }
        zzcjkVar.zzah(zzcla.zzc(z4Var));
        viewGroup.setMinimumHeight(z4Var.f8833c);
        viewGroup.setMinimumWidth(z4Var.f8836f);
        this.zzl = z4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuh
            public /* synthetic */ zzcuh() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcui.zzi(zzcui.this);
            }
        });
        super.zzj();
    }
}
