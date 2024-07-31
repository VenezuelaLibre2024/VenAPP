package p322r1;

import kotlin.jvm.internal.C9322n;
import p391v1.InterfaceC11614m;

/* renamed from: r1.i */
/* loaded from: classes.dex */
public abstract class AbstractC10592i<T> extends AbstractC10585d0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10592i(AbstractC10604u database) {
        super(database);
        C9322n.m27781e(database, "database");
    }

    /* renamed from: i */
    protected abstract void mo26837i(InterfaceC11614m interfaceC11614m, T t10);

    /* renamed from: j */
    public final void m32181j(T t10) {
        InterfaceC11614m m32172b = m32172b();
        try {
            mo26837i(m32172b, t10);
            m32172b.mo32162t0();
        } finally {
            m32174h(m32172b);
        }
    }
}
