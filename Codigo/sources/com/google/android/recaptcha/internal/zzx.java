package com.google.android.recaptcha.internal;

import ck.n;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzx extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaa zzb;
    int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzaa zzaaVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzaaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo9executegIAlus = this.zzb.mo9executegIAlus(null, this);
        c10 = hk.d.c();
        return mo9executegIAlus == c10 ? mo9executegIAlus : n.a(mo9executegIAlus);
    }
}
