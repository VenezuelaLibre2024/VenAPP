package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class zzr {
    public static final zzq zza = new zzq(null);
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    public zzr() {
        this(null, 0L, 0L, 7, null);
    }

    public /* synthetic */ zzr(String str, long j10, long j11, int i10, g gVar) {
        this.zzb = "https://www.recaptcha.net/recaptcha/api3";
        this.zzc = "https://www.recaptcha.net/recaptcha/api3".concat("/mwv");
        this.zzd = "https://www.recaptcha.net/recaptcha/api3".concat("/mlg");
        this.zze = "https://www.recaptcha.net/recaptcha/api3".concat("/mal");
    }

    public final String zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzd;
    }
}
