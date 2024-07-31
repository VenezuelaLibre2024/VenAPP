package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.d5;
import com.google.android.gms.ads.internal.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzeis {
    private final String zzc;
    private zzfgp zzd = null;
    private zzfgm zze = null;
    private d5 zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeis(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfgm zzfgmVar) {
        return ((Boolean) a0.c().zza(zzbgc.zzds)).booleanValue() ? zzfgmVar.zzaq : zzfgmVar.zzx;
    }

    private final synchronized void zzk(zzfgm zzfgmVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String zzj = zzj(zzfgmVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfgmVar.zzw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfgmVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) a0.c().zza(zzbgc.zzgO)).booleanValue()) {
            str = zzfgmVar.zzG;
            str2 = zzfgmVar.zzH;
            str3 = zzfgmVar.zzI;
            str4 = zzfgmVar.zzJ;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        d5 d5Var = new d5(zzfgmVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i10, d5Var);
        } catch (IndexOutOfBoundsException e10) {
            t.q().zzw(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, d5Var);
    }

    private final void zzl(zzfgm zzfgmVar, long j10, c3 c3Var, boolean z10) {
        Map map = this.zzb;
        String zzj = zzj(zzfgmVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfgmVar;
            }
            d5 d5Var = (d5) this.zzb.get(zzj);
            d5Var.f8650b = j10;
            d5Var.f8651c = c3Var;
            if (((Boolean) a0.c().zza(zzbgc.zzgP)).booleanValue() && z10) {
                this.zzf = d5Var;
            }
        }
    }

    public final d5 zza() {
        return this.zzf;
    }

    public final zzdaq zzb() {
        return new zzdaq(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfgm zzfgmVar) {
        zzk(zzfgmVar, this.zza.size());
    }

    public final void zze(zzfgm zzfgmVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfgmVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            return;
        }
        this.zzf = (d5) this.zza.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= this.zza.size()) {
                return;
            }
            d5 d5Var = (d5) this.zza.get(indexOf);
            d5Var.f8650b = 0L;
            d5Var.f8651c = null;
        }
    }

    public final void zzf(zzfgm zzfgmVar, long j10, c3 c3Var) {
        zzl(zzfgmVar, j10, c3Var, false);
    }

    public final void zzg(zzfgm zzfgmVar, long j10, c3 c3Var) {
        zzl(zzfgmVar, j10, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((d5) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e10) {
                t.q().zzw(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfgm) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfgp zzfgpVar) {
        this.zzd = zzfgpVar;
    }
}
