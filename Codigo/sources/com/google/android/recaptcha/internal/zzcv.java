package com.google.android.recaptcha.internal;

import ck.n;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcv extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzda zzb;
    int zzc;
    zzda zzd;
    String zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzda zzdaVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzdaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzf = this.zzb.zzf(null, this);
        c10 = hk.d.c();
        return zzf == c10 ? zzf : n.a(zzf);
    }
}
