package gk;

import ck.n;
import ck.v;
import kotlin.jvm.internal.n;
import ok.p;

/* loaded from: classes3.dex */
public final class e {
    public static final <R, T> void a(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> completion) {
        Continuation a10;
        Continuation b10;
        n.e(pVar, "<this>");
        n.e(completion, "completion");
        a10 = hk.c.a(pVar, r10, completion);
        b10 = hk.c.b(a10);
        n.a aVar = ck.n.f7126b;
        b10.resumeWith(ck.n.b(v.f7137a));
    }
}
