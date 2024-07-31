package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzexf implements zzexq {
    private final zzgey zza;
    private final Context zzb;
    private final zzcei zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexf(zzgey zzgeyVar, Context context, zzcei zzceiVar, String str) {
        this.zza = zzgeyVar;
        this.zzb = context;
        this.zzc = zzceiVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexf.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzexg zzc() {
        boolean g10 = na.e.a(this.zzb).g();
        t.r();
        boolean d10 = j2.d(this.zzb);
        String str = this.zzc.zza;
        t.r();
        boolean e10 = j2.e();
        t.r();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        int i10 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.zzb;
        return new zzexg(g10, d10, str, e10, i10, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
