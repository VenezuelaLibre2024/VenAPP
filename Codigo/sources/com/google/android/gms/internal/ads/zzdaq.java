package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.d5;
import com.google.android.gms.ads.internal.client.o2;
import com.google.android.gms.ads.internal.t;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzdaq extends o2 {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeis zzh;
    private final Bundle zzi;

    public zzdaq(zzfgm zzfgmVar, String str, zzeis zzeisVar, zzfgp zzfgpVar, String str2) {
        String str3 = null;
        this.zzb = zzfgmVar == null ? null : zzfgmVar.zzac;
        this.zzc = str2;
        this.zzd = zzfgpVar == null ? null : zzfgpVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str3 = zzfgmVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str3 != null ? str3 : str;
        this.zze = zzeisVar.zzc();
        this.zzh = zzeisVar;
        this.zzf = t.b().a() / 1000;
        this.zzi = (!((Boolean) a0.c().zza(zzbgc.zzgQ)).booleanValue() || zzfgpVar == null) ? new Bundle() : zzfgpVar.zzj;
        this.zzg = (!((Boolean) a0.c().zza(zzbgc.zzje)).booleanValue() || zzfgpVar == null || TextUtils.isEmpty(zzfgpVar.zzh)) ? "" : zzfgpVar.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final d5 zzf() {
        zzeis zzeisVar = this.zzh;
        if (zzeisVar != null) {
            return zzeisVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
