package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;

/* loaded from: classes2.dex */
public final class zzefk implements zzdhv {
    private final String zzc;
    private final zzflw zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final w1 zze = t.q().zzi();

    public zzefk(String str, zzflw zzflwVar) {
        this.zzc = str;
        this.zzd = zzflwVar;
    }

    private final zzflv zzg(String str) {
        String str2 = this.zze.zzQ() ? "" : this.zzc;
        zzflv zzb = zzflv.zzb(str);
        zzb.zza("tms", Long.toString(t.b().b(), 10));
        zzb.zza("tid", str2);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zza(String str) {
        zzflv zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzb(String str, String str2) {
        zzflv zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzc(String str) {
        zzflv zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzd(String str) {
        zzflv zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
