package h8;

import g8.i;
import g8.j;
import g8.n;
import g8.o;
import h8.e;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import t8.r0;
import w6.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e implements j {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f16613a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<o> f16614b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue<b> f16615c;

    /* renamed from: d, reason: collision with root package name */
    private b f16616d;

    /* renamed from: e, reason: collision with root package name */
    private long f16617e;

    /* renamed from: f, reason: collision with root package name */
    private long f16618f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends n implements Comparable<b> {

        /* renamed from: u, reason: collision with root package name */
        private long f16619u;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (s() != bVar.s()) {
                return s() ? 1 : -1;
            }
            long j10 = this.f29681e - bVar.f29681e;
            if (j10 == 0) {
                j10 = this.f16619u - bVar.f16619u;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends o {

        /* renamed from: f, reason: collision with root package name */
        private h.a<c> f16620f;

        public c(h.a<c> aVar) {
            this.f16620f = aVar;
        }

        @Override // w6.h
        public final void x() {
            this.f16620f.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f16613a.add(new b());
        }
        this.f16614b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f16614b.add(new c(new h.a() { // from class: h8.d
                @Override // w6.h.a
                public final void a(h hVar) {
                    e.this.n((e.c) hVar);
                }
            }));
        }
        this.f16615c = new PriorityQueue<>();
    }

    private void m(b bVar) {
        bVar.n();
        this.f16613a.add(bVar);
    }

    @Override // g8.j
    public void a(long j10) {
        this.f16617e = j10;
    }

    protected abstract i e();

    protected abstract void f(n nVar);

    @Override // w6.d
    public void flush() {
        this.f16618f = 0L;
        this.f16617e = 0L;
        while (!this.f16615c.isEmpty()) {
            m((b) r0.j(this.f16615c.poll()));
        }
        b bVar = this.f16616d;
        if (bVar != null) {
            m(bVar);
            this.f16616d = null;
        }
    }

    @Override // w6.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public n d() {
        t8.a.g(this.f16616d == null);
        if (this.f16613a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f16613a.pollFirst();
        this.f16616d = pollFirst;
        return pollFirst;
    }

    @Override // w6.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public o b() {
        o oVar;
        if (this.f16614b.isEmpty()) {
            return null;
        }
        while (!this.f16615c.isEmpty() && ((b) r0.j(this.f16615c.peek())).f29681e <= this.f16617e) {
            b bVar = (b) r0.j(this.f16615c.poll());
            if (bVar.s()) {
                oVar = (o) r0.j(this.f16614b.pollFirst());
                oVar.m(4);
            } else {
                f(bVar);
                if (k()) {
                    i e10 = e();
                    oVar = (o) r0.j(this.f16614b.pollFirst());
                    oVar.y(bVar.f29681e, e10, Long.MAX_VALUE);
                } else {
                    m(bVar);
                }
            }
            m(bVar);
            return oVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final o i() {
        return this.f16614b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long j() {
        return this.f16617e;
    }

    protected abstract boolean k();

    @Override // w6.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void c(n nVar) {
        t8.a.a(nVar == this.f16616d);
        b bVar = (b) nVar;
        if (bVar.r()) {
            m(bVar);
        } else {
            long j10 = this.f16618f;
            this.f16618f = 1 + j10;
            bVar.f16619u = j10;
            this.f16615c.add(bVar);
        }
        this.f16616d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(o oVar) {
        oVar.n();
        this.f16614b.add(oVar);
    }

    @Override // w6.d
    public void release() {
    }
}
