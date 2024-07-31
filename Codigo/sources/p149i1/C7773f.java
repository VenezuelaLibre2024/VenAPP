package p149i1;

import androidx.lifecycle.AbstractC1303g0;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;

/* renamed from: i1.f */
/* loaded from: classes.dex */
public final class C7773f<T extends AbstractC1303g0> {

    /* renamed from: a */
    private final Class<T> f18527a;

    /* renamed from: b */
    private final InterfaceC9998l<AbstractC7768a, T> f18528b;

    /* JADX WARN: Multi-variable type inference failed */
    public C7773f(Class<T> clazz, InterfaceC9998l<? super AbstractC7768a, ? extends T> initializer) {
        C9322n.m27781e(clazz, "clazz");
        C9322n.m27781e(initializer, "initializer");
        this.f18527a = clazz;
        this.f18528b = initializer;
    }

    /* renamed from: a */
    public final Class<T> m23724a() {
        return this.f18527a;
    }

    /* renamed from: b */
    public final InterfaceC9998l<AbstractC7768a, T> m23725b() {
        return this.f18528b;
    }
}
