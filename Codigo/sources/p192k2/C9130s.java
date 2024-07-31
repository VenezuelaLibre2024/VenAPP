package p192k2;

import androidx.work.C1522b;
import java.util.Collections;
import java.util.List;
import p322r1.AbstractC10585d0;
import p322r1.AbstractC10592i;
import p322r1.AbstractC10604u;
import p391v1.InterfaceC11614m;

/* renamed from: k2.s */
/* loaded from: classes.dex */
public final class C9130s implements InterfaceC9129r {

    /* renamed from: a */
    private final AbstractC10604u f21995a;

    /* renamed from: b */
    private final AbstractC10592i<C9128q> f21996b;

    /* renamed from: c */
    private final AbstractC10585d0 f21997c;

    /* renamed from: d */
    private final AbstractC10585d0 f21998d;

    /* renamed from: k2.s$a */
    /* loaded from: classes.dex */
    class a extends AbstractC10592i<C9128q> {
        a(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p322r1.AbstractC10592i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo26837i(InterfaceC11614m interfaceC11614m, C9128q c9128q) {
            if (c9128q.m26884b() == null) {
                interfaceC11614m.mo32161g1(1);
            } else {
                interfaceC11614m.mo32163x0(1, c9128q.m26884b());
            }
            byte[] m8530o = C1522b.m8530o(c9128q.m26883a());
            if (m8530o == null) {
                interfaceC11614m.mo32161g1(2);
            } else {
                interfaceC11614m.mo32160O0(2, m8530o);
            }
        }
    }

    /* renamed from: k2.s$b */
    /* loaded from: classes.dex */
    class b extends AbstractC10585d0 {
        b(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: k2.s$c */
    /* loaded from: classes.dex */
    class c extends AbstractC10585d0 {
        c(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C9130s(AbstractC10604u abstractC10604u) {
        this.f21995a = abstractC10604u;
        this.f21996b = new a(abstractC10604u);
        this.f21997c = new b(abstractC10604u);
        this.f21998d = new c(abstractC10604u);
    }

    /* renamed from: d */
    public static List<Class<?>> m26888d() {
        return Collections.emptyList();
    }

    @Override // p192k2.InterfaceC9129r
    /* renamed from: a */
    public void mo26885a(String str) {
        this.f21995a.m32252d();
        InterfaceC11614m m32172b = this.f21997c.m32172b();
        if (str == null) {
            m32172b.mo32161g1(1);
        } else {
            m32172b.mo32163x0(1, str);
        }
        this.f21995a.m32253e();
        try {
            m32172b.mo32164z();
            this.f21995a.m32250B();
        } finally {
            this.f21995a.m32255i();
            this.f21997c.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9129r
    /* renamed from: b */
    public void mo26886b() {
        this.f21995a.m32252d();
        InterfaceC11614m m32172b = this.f21998d.m32172b();
        this.f21995a.m32253e();
        try {
            m32172b.mo32164z();
            this.f21995a.m32250B();
        } finally {
            this.f21995a.m32255i();
            this.f21998d.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9129r
    /* renamed from: c */
    public void mo26887c(C9128q c9128q) {
        this.f21995a.m32252d();
        this.f21995a.m32253e();
        try {
            this.f21996b.m32181j(c9128q);
            this.f21995a.m32250B();
        } finally {
            this.f21995a.m32255i();
        }
    }
}
