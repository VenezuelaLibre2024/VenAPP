package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class zzbgu {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbgu(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbgr zzf() {
        return new zzbgr(t.b().b(), null, null);
    }

    public final zzbgt zza() {
        zzbgt zzbgtVar;
        boolean booleanValue = ((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbgr zzbgrVar : this.zza) {
                long zza = zzbgrVar.zza();
                String zzc = zzbgrVar.zzc();
                zzbgr zzb = zzbgrVar.zzb();
                if (zzb != null && zza > 0) {
                    long zza2 = zza - zzb.zza();
                    sb2.append(zzc);
                    sb2.append('.');
                    sb2.append(zza2);
                    sb2.append(',');
                    if (booleanValue) {
                        if (hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb3.append('+');
                            sb3.append(zzc);
                        } else {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    sb4.append(t.b().a() + (((Long) entry.getKey()).longValue() - t.b().b()));
                    sb4.append(',');
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                str = sb4.toString();
            }
            zzbgtVar = new zzbgt(sb2.toString(), str);
        }
        return zzbgtVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            t.q().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbgu zzbguVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbgk zzg;
        if (TextUtils.isEmpty(str2) || (zzg = t.q().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbgq zza = zzg.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbgr zzbgrVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            for (int i10 = 0; i10 <= 0; i10++) {
                this.zza.add(new zzbgr(j10, strArr[i10], zzbgrVar));
            }
        }
        return true;
    }
}
