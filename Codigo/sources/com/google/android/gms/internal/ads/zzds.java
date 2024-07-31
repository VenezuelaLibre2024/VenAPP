package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzds extends Exception {
    public final zzdr zza;

    public zzds(String str, zzdr zzdrVar) {
        super("Unhandled input format: ".concat(String.valueOf(zzdrVar)));
        this.zza = zzdrVar;
    }
}
