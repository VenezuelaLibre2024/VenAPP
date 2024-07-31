package com.google.android.gms.internal.ads;

import android.app.Activity;
import g9.u;

/* loaded from: classes2.dex */
final class zzegy extends zzehu {
    private final Activity zza;
    private final u zzb;
    private final String zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzegy(Activity activity, u uVar, String str, String str2, zzegx zzegxVar) {
        this.zza = activity;
        this.zzb = uVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        u uVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzehu) {
            zzehu zzehuVar = (zzehu) obj;
            if (this.zza.equals(zzehuVar.zza()) && ((uVar = this.zzb) != null ? uVar.equals(zzehuVar.zzb()) : zzehuVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzehuVar.zzc()) : zzehuVar.zzc() == null)) {
                String str2 = this.zzd;
                String zzd = zzehuVar.zzd();
                if (str2 != null ? str2.equals(zzd) : zzd == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        u uVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (uVar == null ? 0 : uVar.hashCode())) * 1000003;
        String str = this.zzc;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        u uVar = this.zzb;
        return "OfflineUtilsParams{activity=" + this.zza.toString() + ", adOverlay=" + String.valueOf(uVar) + ", gwsQueryId=" + this.zzc + ", uri=" + this.zzd + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzehu
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzehu
    public final u zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzehu
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzehu
    public final String zzd() {
        return this.zzd;
    }
}
