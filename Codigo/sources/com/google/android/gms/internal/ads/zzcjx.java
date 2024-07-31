package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzcjx {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcjk, java.lang.Object] */
    public static final zzcjk zza(Context context, zzcla zzclaVar, String str, boolean z10, boolean z11, zzavi zzaviVar, zzbhj zzbhjVar, zzcei zzceiVar, zzbgu zzbguVar, l lVar, com.google.android.gms.ads.internal.a aVar, zzbbp zzbbpVar, zzfgm zzfgmVar, zzfgp zzfgpVar, zzehs zzehsVar, zzfhl zzfhlVar) {
        zzbgc.zza(context);
        try {
            zzcjt zzcjtVar = new zzfxu(context, zzclaVar, str, z10, z11, zzaviVar, zzbhjVar, zzceiVar, null, lVar, aVar, zzbbpVar, zzfgmVar, zzfgpVar, zzfhlVar, zzehsVar) { // from class: com.google.android.gms.internal.ads.zzcjt
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcla zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzavi zzf;
                public final /* synthetic */ zzbhj zzg;
                public final /* synthetic */ zzcei zzh;
                public final /* synthetic */ l zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.a zzj;
                public final /* synthetic */ zzbbp zzk;
                public final /* synthetic */ zzfgm zzl;
                public final /* synthetic */ zzfgp zzm;
                public final /* synthetic */ zzfhl zzn;
                public final /* synthetic */ zzehs zzo;

                public /* synthetic */ zzcjt(Context context2, zzcla zzclaVar2, String str2, boolean z102, boolean z112, zzavi zzaviVar2, zzbhj zzbhjVar2, zzcei zzceiVar2, zzbgu zzbguVar2, l lVar2, com.google.android.gms.ads.internal.a aVar2, zzbbp zzbbpVar2, zzfgm zzfgmVar2, zzfgp zzfgpVar2, zzfhl zzfhlVar2, zzehs zzehsVar2) {
                    this.zza = context2;
                    this.zzb = zzclaVar2;
                    this.zzc = str2;
                    this.zzd = z102;
                    this.zze = z112;
                    this.zzf = zzaviVar2;
                    this.zzg = zzbhjVar2;
                    this.zzh = zzceiVar2;
                    this.zzi = lVar2;
                    this.zzj = aVar2;
                    this.zzk = zzbbpVar2;
                    this.zzl = zzfgmVar2;
                    this.zzm = zzfgpVar2;
                    this.zzn = zzfhlVar2;
                    this.zzo = zzehsVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object zza() {
                    zzcla zzclaVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    zzbbp zzbbpVar2 = this.zzk;
                    boolean z13 = this.zze;
                    zzavi zzaviVar2 = this.zzf;
                    zzfgm zzfgmVar2 = this.zzl;
                    zzbhj zzbhjVar2 = this.zzg;
                    l lVar2 = this.zzi;
                    zzfgp zzfgpVar2 = this.zzm;
                    Context context2 = this.zza;
                    zzcei zzceiVar2 = this.zzh;
                    com.google.android.gms.ads.internal.a aVar2 = this.zzj;
                    zzfhl zzfhlVar2 = this.zzn;
                    zzehs zzehsVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzckf.zza;
                        zzcka zzckaVar = new zzcka(new zzckf(new zzckz(context2), zzclaVar2, str2, z12, z13, zzaviVar2, zzbhjVar2, zzceiVar2, null, lVar2, aVar2, zzbbpVar2, zzfgmVar2, zzfgpVar2, zzfhlVar2));
                        zzckaVar.setWebViewClient(t.s().c(zzckaVar, zzbbpVar2, z13, zzehsVar2));
                        zzckaVar.setWebChromeClient(new zzcjj(zzckaVar));
                        return zzckaVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzcjtVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            throw new zzcjw("Webview initialization failed.", th2);
        }
    }
}
