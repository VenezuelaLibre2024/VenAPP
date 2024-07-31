package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.api.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfiw implements zzfiv {
    private final ConcurrentHashMap zza;
    private final zzfjc zzb;
    private final zzfiy zzc = new zzfiy();

    public zzfiw(zzfjc zzfjcVar) {
        this.zza = new ConcurrentHashMap(zzfjcVar.zzd);
        this.zzb = zzfjcVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfjc> creator = zzfjc.CREATOR;
        if (((Boolean) a0.c().zza(zzbgc.zzgs)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.zzb.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfjf) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfiu) entry.getValue()).zzb(); i11++) {
                    sb2.append("[O]");
                }
                for (int zzb = ((zzfiu) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfiu) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < this.zzb.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            zzcec.zze(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final zzfjc zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final synchronized zzfje zzb(zzfjf zzfjfVar) {
        zzfje zzfjeVar;
        zzfiu zzfiuVar = (zzfiu) this.zza.get(zzfjfVar);
        if (zzfiuVar != null) {
            zzfjeVar = zzfiuVar.zze();
            if (zzfjeVar == null) {
                this.zzc.zze();
            }
            zzfjs zzf = zzfiuVar.zzf();
            if (zzfjeVar != null) {
                zzbce zza = zzbck.zza();
                zzbcc zza2 = zzbcd.zza();
                zza2.zzd(2);
                zzbcg zza3 = zzbch.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzfjeVar.zza.zzb().zzc().zzi((zzbck) zza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfjeVar = null;
        }
        return zzfjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    @Deprecated
    public final zzfjf zzc(u4 u4Var, String str, f5 f5Var) {
        return new zzfjg(u4Var, str, new zzbzi(this.zzb.zza).zza().zzk, this.zzb.zzf, f5Var);
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final synchronized boolean zzd(zzfjf zzfjfVar, zzfje zzfjeVar) {
        boolean zzh;
        ConcurrentHashMap concurrentHashMap;
        zzfiu zzfiuVar = (zzfiu) this.zza.get(zzfjfVar);
        zzfjeVar.zzd = t.b().a();
        if (zzfiuVar == null) {
            zzfjc zzfjcVar = this.zzb;
            zzfiu zzfiuVar2 = new zzfiu(zzfjcVar.zzd, zzfjcVar.zze * AdError.NETWORK_ERROR_CODE);
            if (this.zza.size() == this.zzb.zzc) {
                int i10 = this.zzb.zzg;
                int i11 = i10 - 1;
                zzfjf zzfjfVar2 = null;
                if (i10 == 0) {
                    throw null;
                }
                long j10 = Long.MAX_VALUE;
                if (i11 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfiu) entry.getValue()).zzc() < j10) {
                            j10 = ((zzfiu) entry.getValue()).zzc();
                            zzfjfVar2 = (zzfjf) entry.getKey();
                        }
                    }
                    if (zzfjfVar2 != null) {
                        concurrentHashMap = this.zza;
                        concurrentHashMap.remove(zzfjfVar2);
                    }
                    this.zzc.zzg();
                } else if (i11 != 1) {
                    if (i11 == 2) {
                        int i12 = a.e.API_PRIORITY_OTHER;
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfiu) entry2.getValue()).zza() < i12) {
                                i12 = ((zzfiu) entry2.getValue()).zza();
                                zzfjfVar2 = (zzfjf) entry2.getKey();
                            }
                        }
                        if (zzfjfVar2 != null) {
                            concurrentHashMap = this.zza;
                            concurrentHashMap.remove(zzfjfVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfiu) entry3.getValue()).zzd() < j10) {
                            j10 = ((zzfiu) entry3.getValue()).zzd();
                            zzfjfVar2 = (zzfjf) entry3.getKey();
                        }
                    }
                    if (zzfjfVar2 != null) {
                        concurrentHashMap = this.zza;
                        concurrentHashMap.remove(zzfjfVar2);
                    }
                    this.zzc.zzg();
                }
            }
            this.zza.put(zzfjfVar, zzfiuVar2);
            this.zzc.zzd();
            zzfiuVar = zzfiuVar2;
        }
        zzh = zzfiuVar.zzh(zzfjeVar);
        this.zzc.zzc();
        zzfix zza = this.zzc.zza();
        zzfjs zzf = zzfiuVar.zzf();
        zzbce zza2 = zzbck.zza();
        zzbcc zza3 = zzbcd.zza();
        zza3.zzd(2);
        zzbci zza4 = zzbcj.zza();
        zza4.zza(zza.zza);
        zza4.zzb(zza.zzb);
        zza4.zzc(zzf.zzb);
        zza3.zzc(zza4);
        zza2.zza(zza3);
        zzfjeVar.zza.zzb().zzc().zzj((zzbck) zza2.zzal());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final synchronized boolean zze(zzfjf zzfjfVar) {
        zzfiu zzfiuVar = (zzfiu) this.zza.get(zzfjfVar);
        if (zzfiuVar == null) {
            return true;
        }
        return zzfiuVar.zzb() < this.zzb.zzd;
    }
}
