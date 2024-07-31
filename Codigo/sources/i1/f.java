package i1;

import androidx.lifecycle.g0;
import kotlin.jvm.internal.n;
import ok.l;

/* loaded from: classes.dex */
public final class f<T extends g0> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f16875a;

    /* renamed from: b, reason: collision with root package name */
    private final l<a, T> f16876b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<T> clazz, l<? super a, ? extends T> initializer) {
        n.e(clazz, "clazz");
        n.e(initializer, "initializer");
        this.f16875a = clazz;
        this.f16876b = initializer;
    }

    public final Class<T> a() {
        return this.f16875a;
    }

    public final l<a, T> b() {
        return this.f16876b;
    }
}
