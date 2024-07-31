package com.google.android.recaptcha.internal;

import ck.o;
import ck.v;
import gk.Continuation;
import hk.d;
import kotlin.coroutines.jvm.internal.l;
import ok.p;

/* loaded from: classes2.dex */
final class zzo extends l implements p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzo(continuation);
    }

    @Override // ok.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzo((Continuation) obj2).invokeSuspend(v.f7137a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d.c();
        o.b(obj);
        Thread.currentThread().setPriority(8);
        return v.f7137a;
    }
}
