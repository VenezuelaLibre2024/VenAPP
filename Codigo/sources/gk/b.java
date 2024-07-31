package gk;

import gk.f;
import gk.f.b;
import kotlin.jvm.internal.n;
import ok.l;

/* loaded from: classes3.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: a, reason: collision with root package name */
    private final l<f.b, E> f16282a;

    /* renamed from: b, reason: collision with root package name */
    private final f.c<?> f16283b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [gk.f$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [ok.l<? super gk.f$b, ? extends E extends B>, ok.l<gk.f$b, E extends B>, java.lang.Object] */
    public b(f.c<B> baseKey, l<? super f.b, ? extends E> safeCast) {
        n.e(baseKey, "baseKey");
        n.e(safeCast, "safeCast");
        this.f16282a = safeCast;
        this.f16283b = baseKey instanceof b ? (f.c<B>) ((b) baseKey).f16283b : baseKey;
    }

    public final boolean a(f.c<?> key) {
        n.e(key, "key");
        return key == this || this.f16283b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lgk/f$b;)TE; */
    public final f.b b(f.b element) {
        n.e(element, "element");
        return (f.b) this.f16282a.invoke(element);
    }
}
