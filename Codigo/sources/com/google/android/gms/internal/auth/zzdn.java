package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class zzdn {
    public static zzdj zza(zzdj zzdjVar) {
        return ((zzdjVar instanceof zzdl) || (zzdjVar instanceof zzdk)) ? zzdjVar : zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdl(zzdjVar);
    }

    public static zzdj zzb(Object obj) {
        return new zzdm(obj);
    }
}
