package p494zk;

import ck.C2037v;
import p124gk.Continuation;
import p280ok.InterfaceC9998l;

/* renamed from: zk.m */
/* loaded from: classes3.dex */
public interface InterfaceC13083m<T> extends Continuation<T> {

    /* renamed from: zk.m$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m43235a(InterfaceC13083m interfaceC13083m, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return interfaceC13083m.mo24600d(th2);
        }
    }

    /* renamed from: c */
    void mo24599c(T t10, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l);

    /* renamed from: d */
    boolean mo24600d(Throwable th2);

    /* renamed from: k */
    void mo24601k(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l);

    /* renamed from: l */
    Object mo24602l(T t10, Object obj, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l);

    /* renamed from: o */
    void mo24603o(Object obj);
}
