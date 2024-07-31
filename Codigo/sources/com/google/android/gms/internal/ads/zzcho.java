package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b0;
import com.google.android.gms.ads.internal.util.j2;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcho extends b0 {
    final zzcgl zza;
    final zzchw zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcho(zzcgl zzcglVar, zzchw zzchwVar, String str, String[] strArr) {
        this.zza = zzcglVar;
        this.zzb = zzchwVar;
        this.zzc = str;
        this.zzd = strArr;
        t.A().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.b0
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            j2.f8993l.post(new zzchn(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.b0
    public final com.google.common.util.concurrent.f zzb() {
        return (((Boolean) a0.c().zza(zzbgc.zzbW)).booleanValue() && (this.zzb instanceof zzcif)) ? zzcep.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzchm
            public /* synthetic */ zzchm() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcho.this.zzd();
            }
        }) : super.zzb();
    }

    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
