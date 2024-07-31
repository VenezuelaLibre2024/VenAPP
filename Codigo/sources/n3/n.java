package n3;

import java.util.Queue;

/* loaded from: classes.dex */
public class n<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final c4.h<b<A>, B> f21742a;

    /* loaded from: classes.dex */
    class a extends c4.h<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c4.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b10) {
            bVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f21744d = c4.l.f(0);

        /* renamed from: a, reason: collision with root package name */
        private int f21745a;

        /* renamed from: b, reason: collision with root package name */
        private int f21746b;

        /* renamed from: c, reason: collision with root package name */
        private A f21747c;

        private b() {
        }

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f21744d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        private void b(A a10, int i10, int i11) {
            this.f21747c = a10;
            this.f21746b = i10;
            this.f21745a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f21744d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f21746b == bVar.f21746b && this.f21745a == bVar.f21745a && this.f21747c.equals(bVar.f21747c);
        }

        public int hashCode() {
            return (((this.f21745a * 31) + this.f21746b) * 31) + this.f21747c.hashCode();
        }
    }

    public n(long j10) {
        this.f21742a = new a(j10);
    }

    public B a(A a10, int i10, int i11) {
        b<A> a11 = b.a(a10, i10, i11);
        B g10 = this.f21742a.g(a11);
        a11.c();
        return g10;
    }

    public void b(A a10, int i10, int i11, B b10) {
        this.f21742a.k(b.a(a10, i10, i11), b10);
    }
}
