package com.google.android.recaptcha.internal;

import gk.Continuation;
import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes2.dex */
public final class zzv extends d {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzw zzf;
    int zzg;
    zzw zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzw zzwVar, Continuation continuation) {
        super(continuation);
        this.zzf = zzwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zza(null, null, null, null, this);
    }
}
