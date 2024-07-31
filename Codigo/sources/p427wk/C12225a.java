package p427wk;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C9322n;

/* renamed from: wk.a */
/* loaded from: classes3.dex */
public final class C12225a<T> implements InterfaceC12228d<T> {

    /* renamed from: a */
    private final AtomicReference<InterfaceC12228d<T>> f32694a;

    public C12225a(InterfaceC12228d<? extends T> sequence) {
        C9322n.m27781e(sequence, "sequence");
        this.f32694a = new AtomicReference<>(sequence);
    }

    @Override // p427wk.InterfaceC12228d
    public Iterator<T> iterator() {
        InterfaceC12228d<T> andSet = this.f32694a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
