package cl;

import ck.C2037v;
import hk.C7752d;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;

/* renamed from: cl.l */
/* loaded from: classes3.dex */
final class C2049l<T> extends AbstractC2038a<T> {

    /* renamed from: a */
    private final InterfaceC10002p<InterfaceC2040c<? super T>, Continuation<? super C2037v>, Object> f8125a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2049l(InterfaceC10002p<? super InterfaceC2040c<? super T>, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10002p) {
        this.f8125a = interfaceC10002p;
    }

    @Override // cl.AbstractC2038a
    /* renamed from: b */
    public Object mo10356b(InterfaceC2040c<? super T> interfaceC2040c, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object invoke = this.f8125a.invoke(interfaceC2040c, continuation);
        m23655c = C7752d.m23655c();
        return invoke == m23655c ? invoke : C2037v.f8089a;
    }
}
