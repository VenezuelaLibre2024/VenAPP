package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.w1;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzevn implements zzexq {
    private final zzgey zza;
    private final zzfhh zzb;
    private final PackageInfo zzc;
    private final w1 zzd;

    public zzevn(zzgey zzgeyVar, zzfhh zzfhhVar, PackageInfo packageInfo, w1 w1Var) {
        this.zza = zzgeyVar;
        this.zzb = zzfhhVar;
        this.zzc = packageInfo;
        this.zzd = w1Var;
    }

    public static /* synthetic */ zzevo zzc(final zzevn zzevnVar) {
        final ArrayList arrayList = zzevnVar.zzb.zzg;
        return arrayList == null ? new zzevo() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzevo() { // from class: com.google.android.gms.internal.ads.zzevl
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzevo() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                zzevn.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevn.zzc(zzevn.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r9 == 3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevn.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
