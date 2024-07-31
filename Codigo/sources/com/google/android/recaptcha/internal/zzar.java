package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzar {
    public static final zzar zza = new zzar();

    private zzar() {
    }

    public static final zzlg zza(zzn zznVar, zzn zznVar2) {
        zzlf zzf = zzlg.zzf();
        zzf.zzp(zzka.zzb(zznVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzf.zzq(zzjy.zzb(zznVar.zza(timeUnit)));
        zzf.zzd(zzka.zzb(zznVar2.zzb()));
        zzf.zze(zzjy.zzb(zznVar2.zza(timeUnit)));
        return (zzlg) zzf.zzj();
    }
}
