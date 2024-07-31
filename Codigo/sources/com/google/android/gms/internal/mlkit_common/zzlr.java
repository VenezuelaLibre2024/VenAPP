package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes2.dex */
public final class zzlr {
    private zzmd zza;
    private Long zzb;
    private zzlm zzc;
    private Long zzd;
    private zzls zze;
    private Long zzf;

    public static /* bridge */ /* synthetic */ zzlm zza(zzlr zzlrVar) {
        return zzlrVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzls zzh(zzlr zzlrVar) {
        return zzlrVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzmd zzj(zzlr zzlrVar) {
        return zzlrVar.zza;
    }

    public static /* bridge */ /* synthetic */ Long zzk(zzlr zzlrVar) {
        return zzlrVar.zzf;
    }

    public static /* bridge */ /* synthetic */ Long zzl(zzlr zzlrVar) {
        return zzlrVar.zzd;
    }

    public static /* bridge */ /* synthetic */ Long zzm(zzlr zzlrVar) {
        return zzlrVar.zzb;
    }

    public final zzlr zzb(Long l10) {
        this.zzf = l10;
        return this;
    }

    public final zzlr zzc(zzls zzlsVar) {
        this.zze = zzlsVar;
        return this;
    }

    public final zzlr zzd(zzlm zzlmVar) {
        this.zzc = zzlmVar;
        return this;
    }

    public final zzlr zze(Long l10) {
        this.zzd = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzlr zzf(zzmd zzmdVar) {
        this.zza = zzmdVar;
        return this;
    }

    public final zzlr zzg(Long l10) {
        this.zzb = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzlu zzi() {
        return new zzlu(this, null);
    }
}
