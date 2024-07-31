package p246n3;

import java.util.Queue;
import p036c4.C1867h;
import p036c4.C1871l;

/* renamed from: n3.n */
/* loaded from: classes.dex */
public class C9648n<A, B> {

    /* renamed from: a */
    private final C1867h<b<A>, B> f23675a;

    /* renamed from: n3.n$a */
    /* loaded from: classes.dex */
    class a extends C1867h<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p036c4.C1867h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo9940j(b<A> bVar, B b10) {
            bVar.m28915c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n3.n$b */
    /* loaded from: classes.dex */
    public static final class b<A> {

        /* renamed from: d */
        private static final Queue<b<?>> f23677d = C1871l.m9957f(0);

        /* renamed from: a */
        private int f23678a;

        /* renamed from: b */
        private int f23679b;

        /* renamed from: c */
        private A f23680c;

        private b() {
        }

        /* renamed from: a */
        static <A> b<A> m28913a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f23677d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.m28914b(a10, i10, i11);
            return bVar;
        }

        /* renamed from: b */
        private void m28914b(A a10, int i10, int i11) {
            this.f23680c = a10;
            this.f23679b = i10;
            this.f23678a = i11;
        }

        /* renamed from: c */
        public void m28915c() {
            Queue<b<?>> queue = f23677d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23679b == bVar.f23679b && this.f23678a == bVar.f23678a && this.f23680c.equals(bVar.f23680c);
        }

        public int hashCode() {
            return (((this.f23678a * 31) + this.f23679b) * 31) + this.f23680c.hashCode();
        }
    }

    public C9648n(long j10) {
        this.f23675a = new a(j10);
    }

    /* renamed from: a */
    public B m28910a(A a10, int i10, int i11) {
        b<A> m28913a = b.m28913a(a10, i10, i11);
        B m9937g = this.f23675a.m9937g(m28913a);
        m28913a.m28915c();
        return m9937g;
    }

    /* renamed from: b */
    public void m28911b(A a10, int i10, int i11, B b10) {
        this.f23675a.m9941k(b.m28913a(a10, i10, i11), b10);
    }
}
