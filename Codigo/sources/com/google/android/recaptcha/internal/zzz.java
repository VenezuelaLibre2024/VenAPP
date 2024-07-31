package com.google.android.recaptcha.internal;

import ck.n;
import ck.o;
import ck.v;
import com.google.android.recaptcha.RecaptchaAction;
import gk.Continuation;
import hk.d;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.k0;

/* loaded from: classes2.dex */
final class zzz extends l implements p {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ RecaptchaAction zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, RecaptchaAction recaptchaAction, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzaaVar;
        this.zzc = recaptchaAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzz(this.zzb, this.zzc, continuation);
    }

    @Override // ok.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzz) create((k0) obj, (Continuation) obj2)).invokeSuspend(v.f7137a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object zzf;
        c10 = d.c();
        int i10 = this.zza;
        o.b(obj);
        if (i10 != 0) {
            zzf = ((n) obj).i();
        } else {
            zzda zzb = this.zzb.zzb();
            RecaptchaAction recaptchaAction = this.zzc;
            this.zza = 1;
            zzf = zzb.zzf(recaptchaAction, this);
            if (zzf == c10) {
                return c10;
            }
        }
        o.b(zzf);
        return zzf;
    }
}
