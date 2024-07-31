package p124gk;

import ck.C2029n;
import ck.C2037v;
import hk.C7751c;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC10002p;

/* renamed from: gk.e */
/* loaded from: classes3.dex */
public final class C7586e {
    /* renamed from: a */
    public static final <R, T> void m23040a(InterfaceC10002p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, R r10, Continuation<? super T> completion) {
        Continuation m23653a;
        Continuation m23654b;
        C9322n.m27781e(interfaceC10002p, "<this>");
        C9322n.m27781e(completion, "completion");
        m23653a = C7751c.m23653a(interfaceC10002p, r10, completion);
        m23654b = C7751c.m23654b(m23653a);
        C2029n.a aVar = C2029n.f8078b;
        m23654b.resumeWith(C2029n.m10340b(C2037v.f8089a));
    }
}
