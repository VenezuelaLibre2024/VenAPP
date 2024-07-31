package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzdjn extends zzcwh {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdhy zze;
    private final zzdkw zzf;
    private final zzcxc zzg;
    private final zzfrc zzh;
    private final zzdbk zzi;
    private final zzcdp zzj;
    private boolean zzk;

    public zzdjn(zzcwg zzcwgVar, Context context, zzcjk zzcjkVar, zzdhy zzdhyVar, zzdkw zzdkwVar, zzcxc zzcxcVar, zzfrc zzfrcVar, zzdbk zzdbkVar, zzcdp zzcdpVar) {
        super(zzcwgVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcjkVar);
        this.zze = zzdhyVar;
        this.zzf = zzdkwVar;
        this.zzg = zzcxcVar;
        this.zzh = zzfrcVar;
        this.zzi = zzdbkVar;
        this.zzj = zzcdpVar;
    }

    public final void finalize() {
        try {
            zzcjk zzcjkVar = (zzcjk) this.zzd.get();
            if (((Boolean) a0.c().zza(zzbgc.zzgL)).booleanValue()) {
                if (!this.zzk && zzcjkVar != null) {
                    zzcep.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjm
                        public /* synthetic */ zzdjm() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcjk.this.destroy();
                        }
                    });
                }
            } else if (zzcjkVar != null) {
                zzcjkVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z10, Activity activity) {
        zzfgm zzD;
        this.zze.zzb();
        if (((Boolean) a0.c().zza(zzbgc.zzaB)).booleanValue()) {
            t.r();
            if (j2.f(this.zzc)) {
                zzcec.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) a0.c().zza(zzbgc.zzaC)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcjk zzcjkVar = (zzcjk) this.zzd.get();
        if (!((Boolean) a0.c().zza(zzbgc.zzll)).booleanValue() || zzcjkVar == null || (zzD = zzcjkVar.zzD()) == null || !zzD.zzar || zzD.zzas == this.zzj.zzb()) {
            if (this.zzk) {
                zzcec.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzfij.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z10, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdkv e10) {
                    this.zzi.zzc(e10);
                }
            }
        } else {
            zzcec.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzfij.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }
}
