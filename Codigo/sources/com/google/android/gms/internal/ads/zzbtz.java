package com.google.android.gms.internal.ads;

import a9.e;
import android.location.Location;
import com.google.android.gms.ads.internal.client.m3;
import com.google.android.gms.ads.internal.client.n4;
import i9.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x8.c0;

/* loaded from: classes2.dex */
public final class zzbtz implements z {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbjb zzg;
    private final boolean zzi;
    private final String zzk;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbtz(Date date, int i10, Set set, Location location, boolean z10, int i11, zzbjb zzbjbVar, List list, boolean z11, int i12, String str) {
        Map map;
        String str2;
        Boolean bool;
        this.zza = date;
        this.zzb = i10;
        this.zzc = set;
        this.zze = location;
        this.zzd = z10;
        this.zzf = i11;
        this.zzg = zzbjbVar;
        this.zzi = z11;
        this.zzk = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.startsWith("custom:")) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.zzj;
                            str2 = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            map = this.zzj;
                            str2 = split[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.zzh.add(str3);
                }
            }
        }
    }

    public final float getAdVolume() {
        return m3.h().c();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // i9.f
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // i9.z
    public final a9.e getNativeAdOptions() {
        e.a aVar = new e.a();
        zzbjb zzbjbVar = this.zzg;
        if (zzbjbVar != null) {
            int i10 = zzbjbVar.zza;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        aVar.e(zzbjbVar.zzg);
                        aVar.d(zzbjbVar.zzh);
                    }
                    aVar.g(zzbjbVar.zzb);
                    aVar.c(zzbjbVar.zzc);
                    aVar.f(zzbjbVar.zzd);
                }
                n4 n4Var = zzbjbVar.zzf;
                if (n4Var != null) {
                    aVar.h(new c0(n4Var));
                }
            }
            aVar.b(zzbjbVar.zze);
            aVar.g(zzbjbVar.zzb);
            aVar.c(zzbjbVar.zzc);
            aVar.f(zzbjbVar.zzd);
        }
        return aVar.a();
    }

    @Override // i9.z
    public final com.google.android.gms.ads.nativead.c getNativeAdRequestOptions() {
        return zzbjb.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        return m3.h().w();
    }

    @Override // i9.f
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // i9.f
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // i9.z
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // i9.f
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // i9.z
    public final Map zza() {
        return this.zzj;
    }

    @Override // i9.z
    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
