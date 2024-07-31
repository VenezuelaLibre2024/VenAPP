package com.google.android.recaptcha;

import android.app.Application;
import ck.o;
import ck.v;
import com.google.android.recaptcha.internal.zzaa;
import com.google.android.recaptcha.internal.zzr;
import com.google.android.recaptcha.internal.zzw;
import gk.Continuation;
import hk.d;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.k0;

/* loaded from: classes2.dex */
public final class Recaptcha$getClient$2$1 extends l implements p<k0, Continuation<? super zzaa>, Object> {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$2$1(Application application, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Recaptcha$getClient$2$1(this.zzb, this.zzc, continuation);
    }

    @Override // ok.p
    public final /* bridge */ /* synthetic */ Object invoke(k0 k0Var, Continuation<? super zzaa> continuation) {
        return ((Recaptcha$getClient$2$1) create(k0Var, continuation)).invokeSuspend(v.f7137a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = d.c();
        int i10 = this.zza;
        o.b(obj);
        if (i10 == 0) {
            zzw zzwVar = zzaa.zza;
            Application application = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzwVar.zza(application, str, new zzr(null, 0L, 0L, 7, null), null, this);
            if (obj == c10) {
                return c10;
            }
        }
        return obj;
    }
}
