package p120g8;

import com.google.common.collect.AbstractC5907w;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import p363t8.C11137a;

/* renamed from: g8.g */
/* loaded from: classes.dex */
public final class C7489g implements InterfaceC7492j {

    /* renamed from: a */
    private final C7485c f17694a = new C7485c();

    /* renamed from: b */
    private final C7496n f17695b = new C7496n();

    /* renamed from: c */
    private final Deque<AbstractC7497o> f17696c = new ArrayDeque();

    /* renamed from: d */
    private int f17697d;

    /* renamed from: e */
    private boolean f17698e;

    /* renamed from: g8.g$a */
    /* loaded from: classes.dex */
    class a extends AbstractC7497o {
        a() {
        }

        @Override // p414w6.AbstractC12083h
        /* renamed from: x */
        public void mo22797x() {
            C7489g.this.m22789i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g8.g$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC7491i {

        /* renamed from: a */
        private final long f17700a;

        /* renamed from: b */
        private final AbstractC5907w<C7484b> f17701b;

        public b(long j10, AbstractC5907w<C7484b> abstractC5907w) {
            this.f17700a = j10;
            this.f17701b = abstractC5907w;
        }

        @Override // p120g8.InterfaceC7491i
        /* renamed from: b */
        public int mo22798b(long j10) {
            return this.f17700a > j10 ? 0 : -1;
        }

        @Override // p120g8.InterfaceC7491i
        /* renamed from: h */
        public List<C7484b> mo22799h(long j10) {
            return j10 >= this.f17700a ? this.f17701b : AbstractC5907w.m15081v();
        }

        @Override // p120g8.InterfaceC7491i
        /* renamed from: i */
        public long mo22800i(int i10) {
            C11137a.m34599a(i10 == 0);
            return this.f17700a;
        }

        @Override // p120g8.InterfaceC7491i
        /* renamed from: l */
        public int mo22801l() {
            return 1;
        }
    }

    public C7489g() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f17696c.addFirst(new a());
        }
        this.f17697d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m22789i(AbstractC7497o abstractC7497o) {
        C11137a.m34605g(this.f17696c.size() < 2);
        C11137a.m34599a(!this.f17696c.contains(abstractC7497o));
        abstractC7497o.mo22818n();
        this.f17696c.addFirst(abstractC7497o);
    }

    @Override // p120g8.InterfaceC7492j
    /* renamed from: a */
    public void mo22790a(long j10) {
    }

    @Override // p414w6.InterfaceC12079d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C7496n mo22793d() {
        C11137a.m34605g(!this.f17698e);
        if (this.f17697d != 0) {
            return null;
        }
        this.f17697d = 1;
        return this.f17695b;
    }

    @Override // p414w6.InterfaceC12079d
    public void flush() {
        C11137a.m34605g(!this.f17698e);
        this.f17695b.mo22818n();
        this.f17697d = 0;
    }

    @Override // p414w6.InterfaceC12079d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC7497o mo22791b() {
        C11137a.m34605g(!this.f17698e);
        if (this.f17697d != 2 || this.f17696c.isEmpty()) {
            return null;
        }
        AbstractC7497o removeFirst = this.f17696c.removeFirst();
        if (this.f17695b.m38794s()) {
            removeFirst.m38789m(4);
        } else {
            C7496n c7496n = this.f17695b;
            removeFirst.m22819y(this.f17695b.f32144e, new b(c7496n.f32144e, this.f17694a.m22783a(((ByteBuffer) C11137a.m34603e(c7496n.f32142c)).array())), 0L);
        }
        this.f17695b.mo22818n();
        this.f17697d = 0;
        return removeFirst;
    }

    @Override // p414w6.InterfaceC12079d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo22792c(C7496n c7496n) {
        C11137a.m34605g(!this.f17698e);
        C11137a.m34605g(this.f17697d == 1);
        C11137a.m34599a(this.f17695b == c7496n);
        this.f17697d = 2;
    }

    @Override // p414w6.InterfaceC12079d
    public void release() {
        this.f17698e = true;
    }
}
