package p427wk;

import java.util.Iterator;
import kotlin.jvm.internal.C9322n;
import pk.InterfaceC10201a;

/* renamed from: wk.b */
/* loaded from: classes3.dex */
public final class C12226b<T> implements InterfaceC12228d<T>, InterfaceC12227c<T> {

    /* renamed from: a */
    private final InterfaceC12228d<T> f32695a;

    /* renamed from: b */
    private final int f32696b;

    /* renamed from: wk.b$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, InterfaceC10201a {

        /* renamed from: a */
        private final Iterator<T> f32697a;

        /* renamed from: b */
        private int f32698b;

        a(C12226b<T> c12226b) {
            this.f32697a = ((C12226b) c12226b).f32695a.iterator();
            this.f32698b = ((C12226b) c12226b).f32696b;
        }

        /* renamed from: a */
        private final void m39364a() {
            while (this.f32698b > 0 && this.f32697a.hasNext()) {
                this.f32697a.next();
                this.f32698b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m39364a();
            return this.f32697a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m39364a();
            return this.f32697a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12226b(InterfaceC12228d<? extends T> sequence, int i10) {
        C9322n.m27781e(sequence, "sequence");
        this.f32695a = sequence;
        this.f32696b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // p427wk.InterfaceC12227c
    /* renamed from: a */
    public InterfaceC12228d<T> mo39363a(int i10) {
        int i11 = this.f32696b + i10;
        return i11 < 0 ? new C12226b(this, i10) : new C12226b(this.f32695a, i11);
    }

    @Override // p427wk.InterfaceC12228d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
