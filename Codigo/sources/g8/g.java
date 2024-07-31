package g8;

import com.google.common.collect.w;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final c f16080a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final n f16081b = new n();

    /* renamed from: c, reason: collision with root package name */
    private final Deque<o> f16082c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private int f16083d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16084e;

    /* loaded from: classes.dex */
    class a extends o {
        a() {
        }

        @Override // w6.h
        public void x() {
            g.this.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        private final long f16086a;

        /* renamed from: b, reason: collision with root package name */
        private final w<g8.b> f16087b;

        public b(long j10, w<g8.b> wVar) {
            this.f16086a = j10;
            this.f16087b = wVar;
        }

        @Override // g8.i
        public int b(long j10) {
            return this.f16086a > j10 ? 0 : -1;
        }

        @Override // g8.i
        public List<g8.b> h(long j10) {
            return j10 >= this.f16086a ? this.f16087b : w.v();
        }

        @Override // g8.i
        public long i(int i10) {
            t8.a.a(i10 == 0);
            return this.f16086a;
        }

        @Override // g8.i
        public int l() {
            return 1;
        }
    }

    public g() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f16082c.addFirst(new a());
        }
        this.f16083d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(o oVar) {
        t8.a.g(this.f16082c.size() < 2);
        t8.a.a(!this.f16082c.contains(oVar));
        oVar.n();
        this.f16082c.addFirst(oVar);
    }

    @Override // g8.j
    public void a(long j10) {
    }

    @Override // w6.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public n d() {
        t8.a.g(!this.f16084e);
        if (this.f16083d != 0) {
            return null;
        }
        this.f16083d = 1;
        return this.f16081b;
    }

    @Override // w6.d
    public void flush() {
        t8.a.g(!this.f16084e);
        this.f16081b.n();
        this.f16083d = 0;
    }

    @Override // w6.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o b() {
        t8.a.g(!this.f16084e);
        if (this.f16083d != 2 || this.f16082c.isEmpty()) {
            return null;
        }
        o removeFirst = this.f16082c.removeFirst();
        if (this.f16081b.s()) {
            removeFirst.m(4);
        } else {
            n nVar = this.f16081b;
            removeFirst.y(this.f16081b.f29681e, new b(nVar.f29681e, this.f16080a.a(((ByteBuffer) t8.a.e(nVar.f29679c)).array())), 0L);
        }
        this.f16081b.n();
        this.f16083d = 0;
        return removeFirst;
    }

    @Override // w6.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(n nVar) {
        t8.a.g(!this.f16084e);
        t8.a.g(this.f16083d == 1);
        t8.a.a(this.f16081b == nVar);
        this.f16083d = 2;
    }

    @Override // w6.d
    public void release() {
        this.f16084e = true;
    }
}
