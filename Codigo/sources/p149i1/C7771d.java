package p149i1;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p149i1.AbstractC7768a;

/* renamed from: i1.d */
/* loaded from: classes.dex */
public final class C7771d extends AbstractC7768a {
    public C7771d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C7771d(AbstractC7768a initialExtras) {
        C9322n.m27781e(initialExtras, "initialExtras");
        m23720b().putAll(initialExtras.m23720b());
    }

    public /* synthetic */ C7771d(AbstractC7768a abstractC7768a, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? AbstractC7768a.a.f18523b : abstractC7768a);
    }

    @Override // p149i1.AbstractC7768a
    /* renamed from: a */
    public <T> T mo23719a(AbstractC7768a.b<T> key) {
        C9322n.m27781e(key, "key");
        return (T) m23720b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T> void m23723c(AbstractC7768a.b<T> key, T t10) {
        C9322n.m27781e(key, "key");
        m23720b().put(key, t10);
    }
}
