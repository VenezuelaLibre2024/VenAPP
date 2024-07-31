package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class zzdyy {
    private final zzdyi zza;
    private final zzdtx zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyy(zzdyi zzdyiVar, zzdtx zzdtxVar) {
        this.zza = zzdyiVar;
        this.zzb = zzdtxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z10;
        zzdtw zza;
        zzdtw zza2;
        zzbvg zzbvgVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbpd zzbpdVar = (zzbpd) it.next();
                if (((Boolean) a0.c().zza(zzbgc.zzjj)).booleanValue() && (zza2 = this.zzb.zza(zzbpdVar.zza)) != null && (zzbvgVar = zza2.zzc) != null) {
                    str = zzbvgVar.toString();
                    String str2 = str;
                    if (((Boolean) a0.c().zza(zzbgc.zzjk)).booleanValue() && (zza = this.zzb.zza(zzbpdVar.zza)) != null && zza.zzd) {
                        z10 = true;
                        List list2 = this.zzd;
                        String str3 = zzbpdVar.zza;
                        list2.add(new zzdyx(str3, str2, this.zzb.zzc(str3), zzbpdVar.zzb ? 1 : 0, zzbpdVar.zzd, zzbpdVar.zzc, z10));
                    }
                    z10 = false;
                    List list22 = this.zzd;
                    String str32 = zzbpdVar.zza;
                    list22.add(new zzdyx(str32, str2, this.zzb.zzc(str32), zzbpdVar.zzb ? 1 : 0, zzbpdVar.zzd, zzbpdVar.zzc, z10));
                }
                str = "";
                String str22 = str;
                if (((Boolean) a0.c().zza(zzbgc.zzjk)).booleanValue()) {
                    z10 = true;
                    List list222 = this.zzd;
                    String str322 = zzbpdVar.zza;
                    list222.add(new zzdyx(str322, str22, this.zzb.zzc(str322), zzbpdVar.zzb ? 1 : 0, zzbpdVar.zzd, zzbpdVar.zzc, z10));
                }
                z10 = false;
                List list2222 = this.zzd;
                String str3222 = zzbpdVar.zza;
                list2222.add(new zzdyx(str3222, str22, this.zzb.zzc(str3222), zzbpdVar.zzb ? 1 : 0, zzbpdVar.zzd, zzbpdVar.zzc, z10));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdyx) it.next()).zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdyw(this));
    }
}
