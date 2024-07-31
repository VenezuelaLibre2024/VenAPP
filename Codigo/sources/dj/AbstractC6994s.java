package dj;

import p145hj.C7744b;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p186jj.InterfaceC9079g;
import p224lj.C9512a;
import p224lj.C9513b;
import p241mj.InterfaceC9592b;
import p317qj.C10500f;
import p471yj.C12727a;
import sj.C10926a;
import sj.C10927b;
import sj.C10928c;
import sj.C10929d;
import sj.C10930e;

/* renamed from: dj.s */
/* loaded from: classes3.dex */
public abstract class AbstractC6994s<T> implements InterfaceC6996u<T> {
    /* renamed from: h */
    public static <T> AbstractC6994s<T> m20304h(T t10) {
        C9513b.m28324d(t10, "value is null");
        return C12727a.m41992n(new C10928c(t10));
    }

    @Override // dj.InterfaceC6996u
    /* renamed from: c */
    public final void mo20305c(InterfaceC6995t<? super T> interfaceC6995t) {
        C9513b.m28324d(interfaceC6995t, "subscriber is null");
        InterfaceC6995t<? super T> m42001w = C12727a.m42001w(this, interfaceC6995t);
        C9513b.m28324d(m42001w, "subscriber returned by the RxJavaPlugins hook is null");
        try {
            mo20311k(m42001w);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public final AbstractC6994s<T> m20306e(InterfaceC9076d<? super Throwable> interfaceC9076d) {
        C9513b.m28324d(interfaceC9076d, "onError is null");
        return C12727a.m41992n(new C10926a(this, interfaceC9076d));
    }

    /* renamed from: f */
    public final AbstractC6994s<T> m20307f(InterfaceC9076d<? super T> interfaceC9076d) {
        C9513b.m28324d(interfaceC9076d, "onSuccess is null");
        return C12727a.m41992n(new C10927b(this, interfaceC9076d));
    }

    /* renamed from: g */
    public final AbstractC6985j<T> m20308g(InterfaceC9079g<? super T> interfaceC9079g) {
        C9513b.m28324d(interfaceC9079g, "predicate is null");
        return C12727a.m41990l(new C10500f(this, interfaceC9079g));
    }

    /* renamed from: i */
    public final AbstractC6994s<T> m20309i(AbstractC6994s<? extends T> abstractC6994s) {
        C9513b.m28324d(abstractC6994s, "resumeSingleInCaseOfError is null");
        return m20310j(C9512a.m28313e(abstractC6994s));
    }

    /* renamed from: j */
    public final AbstractC6994s<T> m20310j(InterfaceC9077e<? super Throwable, ? extends InterfaceC6996u<? extends T>> interfaceC9077e) {
        C9513b.m28324d(interfaceC9077e, "resumeFunctionInCaseOfError is null");
        return C12727a.m41992n(new C10929d(this, interfaceC9077e));
    }

    /* renamed from: k */
    protected abstract void mo20311k(InterfaceC6995t<? super T> interfaceC6995t);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final AbstractC6981f<T> m20312l() {
        return this instanceof InterfaceC9592b ? ((InterfaceC9592b) this).mo28587d() : C12727a.m41989k(new C10930e(this));
    }
}
