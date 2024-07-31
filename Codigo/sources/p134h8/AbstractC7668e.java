package p134h8;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p120g8.AbstractC7497o;
import p120g8.C7496n;
import p120g8.InterfaceC7491i;
import p120g8.InterfaceC7492j;
import p134h8.AbstractC7668e;
import p363t8.C11137a;
import p363t8.C11172r0;
import p414w6.AbstractC12083h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h8.e */
/* loaded from: classes.dex */
public abstract class AbstractC7668e implements InterfaceC7492j {

    /* renamed from: a */
    private final ArrayDeque<b> f18263a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<AbstractC7497o> f18264b;

    /* renamed from: c */
    private final PriorityQueue<b> f18265c;

    /* renamed from: d */
    private b f18266d;

    /* renamed from: e */
    private long f18267e;

    /* renamed from: f */
    private long f18268f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.e$b */
    /* loaded from: classes.dex */
    public static final class b extends C7496n implements Comparable<b> {

        /* renamed from: u */
        private long f18269u;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (m38794s() != bVar.m38794s()) {
                return m38794s() ? 1 : -1;
            }
            long j10 = this.f32144e - bVar.f32144e;
            if (j10 == 0) {
                j10 = this.f18269u - bVar.f18269u;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.e$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC7497o {

        /* renamed from: f */
        private AbstractC12083h.a<c> f18270f;

        public c(AbstractC12083h.a<c> aVar) {
            this.f18270f = aVar;
        }

        @Override // p414w6.AbstractC12083h
        /* renamed from: x */
        public final void mo22797x() {
            this.f18270f.mo23378a(this);
        }
    }

    public AbstractC7668e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f18263a.add(new b());
        }
        this.f18264b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f18264b.add(new c(new AbstractC12083h.a() { // from class: h8.d
                @Override // p414w6.AbstractC12083h.a
                /* renamed from: a */
                public final void mo23378a(AbstractC12083h abstractC12083h) {
                    AbstractC7668e.this.m23382n((AbstractC7668e.c) abstractC12083h);
                }
            }));
        }
        this.f18265c = new PriorityQueue<>();
    }

    /* renamed from: m */
    private void m23379m(b bVar) {
        bVar.mo22818n();
        this.f18263a.add(bVar);
    }

    @Override // p120g8.InterfaceC7492j
    /* renamed from: a */
    public void mo22790a(long j10) {
        this.f18267e = j10;
    }

    /* renamed from: e */
    protected abstract InterfaceC7491i mo23318e();

    /* renamed from: f */
    protected abstract void mo23319f(C7496n c7496n);

    @Override // p414w6.InterfaceC12079d
    public void flush() {
        this.f18268f = 0L;
        this.f18267e = 0L;
        while (!this.f18265c.isEmpty()) {
            m23379m((b) C11172r0.m34928j(this.f18265c.poll()));
        }
        b bVar = this.f18266d;
        if (bVar != null) {
            m23379m(bVar);
            this.f18266d = null;
        }
    }

    @Override // p414w6.InterfaceC12079d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C7496n mo22793d() {
        C11137a.m34605g(this.f18266d == null);
        if (this.f18263a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f18263a.pollFirst();
        this.f18266d = pollFirst;
        return pollFirst;
    }

    @Override // p414w6.InterfaceC12079d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC7497o mo22791b() {
        AbstractC7497o abstractC7497o;
        if (this.f18264b.isEmpty()) {
            return null;
        }
        while (!this.f18265c.isEmpty() && ((b) C11172r0.m34928j(this.f18265c.peek())).f32144e <= this.f18267e) {
            b bVar = (b) C11172r0.m34928j(this.f18265c.poll());
            if (bVar.m38794s()) {
                abstractC7497o = (AbstractC7497o) C11172r0.m34928j(this.f18264b.pollFirst());
                abstractC7497o.m38789m(4);
            } else {
                mo23319f(bVar);
                if (mo23322k()) {
                    InterfaceC7491i mo23318e = mo23318e();
                    abstractC7497o = (AbstractC7497o) C11172r0.m34928j(this.f18264b.pollFirst());
                    abstractC7497o.m22819y(bVar.f32144e, mo23318e, Long.MAX_VALUE);
                } else {
                    m23379m(bVar);
                }
            }
            m23379m(bVar);
            return abstractC7497o;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final AbstractC7497o m23380i() {
        return this.f18264b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final long m23381j() {
        return this.f18267e;
    }

    /* renamed from: k */
    protected abstract boolean mo23322k();

    @Override // p414w6.InterfaceC12079d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22792c(C7496n c7496n) {
        C11137a.m34599a(c7496n == this.f18266d);
        b bVar = (b) c7496n;
        if (bVar.m38793r()) {
            m23379m(bVar);
        } else {
            long j10 = this.f18268f;
            this.f18268f = 1 + j10;
            bVar.f18269u = j10;
            this.f18265c.add(bVar);
        }
        this.f18266d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m23382n(AbstractC7497o abstractC7497o) {
        abstractC7497o.mo22818n();
        this.f18264b.add(abstractC7497o);
    }

    @Override // p414w6.InterfaceC12079d
    public void release() {
    }
}
