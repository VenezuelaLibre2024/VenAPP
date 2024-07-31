package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class zzggs {
    private final Class zza;
    private zzggt zzd;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zzgrw zze = zzgrw.zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggs(Class cls, zzggr zzggrVar) {
        this.zza = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzggs zze(java.lang.Object r13, java.lang.Object r14, com.google.android.gms.internal.ads.zzgvf r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzggs.zze(java.lang.Object, java.lang.Object, com.google.android.gms.internal.ads.zzgvf, boolean):com.google.android.gms.internal.ads.zzggs");
    }

    public final zzggs zza(Object obj, Object obj2, zzgvf zzgvfVar) {
        zze(obj, obj2, zzgvfVar, false);
        return this;
    }

    public final zzggs zzb(Object obj, Object obj2, zzgvf zzgvfVar) {
        zze(obj, obj2, zzgvfVar, true);
        return this;
    }

    public final zzggs zzc(zzgrw zzgrwVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgrwVar;
        return this;
    }

    public final zzggx zzd() {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzggx zzggxVar = new zzggx(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzggxVar;
    }
}
