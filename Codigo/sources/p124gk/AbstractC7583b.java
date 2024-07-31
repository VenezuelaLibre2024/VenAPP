package p124gk;

import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;
import p124gk.InterfaceC7587f.b;
import p280ok.InterfaceC9998l;

/* renamed from: gk.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7583b<B extends InterfaceC7587f.b, E extends B> implements InterfaceC7587f.c<E> {

    /* renamed from: a */
    private final InterfaceC9998l<InterfaceC7587f.b, E> f17919a;

    /* renamed from: b */
    private final InterfaceC7587f.c<?> f17920b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [gk.f$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [ok.l<? super gk.f$b, ? extends E extends B>, ok.l<gk.f$b, E extends B>, java.lang.Object] */
    public AbstractC7583b(InterfaceC7587f.c<B> baseKey, InterfaceC9998l<? super InterfaceC7587f.b, ? extends E> safeCast) {
        C9322n.m27781e(baseKey, "baseKey");
        C9322n.m27781e(safeCast, "safeCast");
        this.f17919a = safeCast;
        this.f17920b = baseKey instanceof AbstractC7583b ? (InterfaceC7587f.c<B>) ((AbstractC7583b) baseKey).f17920b : baseKey;
    }

    /* renamed from: a */
    public final boolean m23029a(InterfaceC7587f.c<?> key) {
        C9322n.m27781e(key, "key");
        return key == this || this.f17920b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lgk/f$b;)TE; */
    /* renamed from: b */
    public final InterfaceC7587f.b m23030b(InterfaceC7587f.b element) {
        C9322n.m27781e(element, "element");
        return (InterfaceC7587f.b) this.f17919a.invoke(element);
    }
}
