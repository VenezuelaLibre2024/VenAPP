package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzemh {
    private final la.f zza;
    private final zzemj zzb;
    private final zzfny zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) a0.c().zza(zzbgc.zzgS)).booleanValue();
    private final zzeis zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzemh(la.f fVar, zzemj zzemjVar, zzeis zzeisVar, zzfny zzfnyVar) {
        this.zza = fVar;
        this.zzb = zzemjVar;
        this.zzf = zzeisVar;
        this.zzc = zzfnyVar;
    }

    public final synchronized boolean zzq(zzfgm zzfgmVar) {
        zzemg zzemgVar = (zzemg) this.zzd.get(zzfgmVar);
        if (zzemgVar == null) {
            return false;
        }
        return zzemgVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized com.google.common.util.concurrent.f zzf(zzfgy zzfgyVar, zzfgm zzfgmVar, com.google.common.util.concurrent.f fVar, zzfnu zzfnuVar) {
        zzfgp zzfgpVar = zzfgyVar.zzb.zzb;
        long b10 = this.zza.b();
        String str = zzfgmVar.zzx;
        if (str != null) {
            this.zzd.put(zzfgmVar, new zzemg(str, zzfgmVar.zzag, 9, 0L, null));
            zzgen.zzr(fVar, new zzemf(this, b10, zzfgpVar, zzfgmVar, str, zzfnuVar, zzfgyVar), zzcep.zzf);
        }
        return fVar;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzemg zzemgVar = (zzemg) ((Map.Entry) it.next()).getValue();
            if (zzemgVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzemgVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfgm zzfgmVar) {
        this.zzh = this.zza.b() - this.zzi;
        if (zzfgmVar != null) {
            this.zzf.zze(zzfgmVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.b() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfgm zzfgmVar = (zzfgm) it.next();
            if (!TextUtils.isEmpty(zzfgmVar.zzx)) {
                this.zzd.put(zzfgmVar, new zzemg(zzfgmVar.zzx, zzfgmVar.zzag, a.e.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.b();
    }

    public final synchronized void zzm(zzfgm zzfgmVar) {
        zzemg zzemgVar = (zzemg) this.zzd.get(zzfgmVar);
        if (zzemgVar == null || this.zzg) {
            return;
        }
        zzemgVar.zzc = 8;
    }
}
