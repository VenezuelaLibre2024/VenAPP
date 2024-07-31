package p427wk;

import java.util.Iterator;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import pk.InterfaceC10201a;

/* renamed from: wk.m */
/* loaded from: classes3.dex */
public final class C12237m<T, R> implements InterfaceC12228d<R> {

    /* renamed from: a */
    private final InterfaceC12228d<T> f32706a;

    /* renamed from: b */
    private final InterfaceC9998l<T, R> f32707b;

    /* renamed from: wk.m$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<R>, InterfaceC10201a {

        /* renamed from: a */
        private final Iterator<T> f32708a;

        /* renamed from: b */
        final /* synthetic */ C12237m<T, R> f32709b;

        a(C12237m<T, R> c12237m) {
            this.f32709b = c12237m;
            this.f32708a = ((C12237m) c12237m).f32706a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32708a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((C12237m) this.f32709b).f32707b.invoke(this.f32708a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12237m(InterfaceC12228d<? extends T> sequence, InterfaceC9998l<? super T, ? extends R> transformer) {
        C9322n.m27781e(sequence, "sequence");
        C9322n.m27781e(transformer, "transformer");
        this.f32706a = sequence;
        this.f32707b = transformer;
    }

    @Override // p427wk.InterfaceC12228d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
