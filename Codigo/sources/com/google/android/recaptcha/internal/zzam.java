package com.google.android.recaptcha.internal;

import ck.o;
import ck.v;
import gk.Continuation;
import hk.d;
import java.util.Timer;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.k0;

/* loaded from: classes2.dex */
final class zzam extends l implements p {
    final /* synthetic */ zzao zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzao zzaoVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzaoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzam(this.zza, continuation);
    }

    @Override // ok.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((k0) obj, (Continuation) obj2)).invokeSuspend(v.f7137a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzad zzadVar;
        Timer timer;
        d.c();
        o.b(obj);
        zzao zzaoVar = this.zza;
        synchronized (zzaj.class) {
            zzadVar = zzaoVar.zze;
            if (zzadVar.zzb() == 0) {
                timer = zzao.zzb;
                if (timer != null) {
                    timer.cancel();
                }
                zzao.zzb = null;
            }
            zzaoVar.zzg();
        }
        return v.f7137a;
    }
}
