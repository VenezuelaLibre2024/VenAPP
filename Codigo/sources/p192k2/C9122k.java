package p192k2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p192k2.InterfaceC9121j;
import p322r1.AbstractC10585d0;
import p322r1.AbstractC10592i;
import p322r1.AbstractC10604u;
import p322r1.C10607x;
import p356t1.C10972a;
import p356t1.C10973b;
import p391v1.InterfaceC11614m;

/* renamed from: k2.k */
/* loaded from: classes.dex */
public final class C9122k implements InterfaceC9121j {

    /* renamed from: a */
    private final AbstractC10604u f21979a;

    /* renamed from: b */
    private final AbstractC10592i<C9120i> f21980b;

    /* renamed from: c */
    private final AbstractC10585d0 f21981c;

    /* renamed from: d */
    private final AbstractC10585d0 f21982d;

    /* renamed from: k2.k$a */
    /* loaded from: classes.dex */
    class a extends AbstractC10592i<C9120i> {
        a(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // p322r1.AbstractC10592i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo26837i(InterfaceC11614m interfaceC11614m, C9120i c9120i) {
            String str = c9120i.f21976a;
            if (str == null) {
                interfaceC11614m.mo32161g1(1);
            } else {
                interfaceC11614m.mo32163x0(1, str);
            }
            interfaceC11614m.mo32159M0(2, c9120i.m26862a());
            interfaceC11614m.mo32159M0(3, c9120i.f21978c);
        }
    }

    /* renamed from: k2.k$b */
    /* loaded from: classes.dex */
    class b extends AbstractC10585d0 {
        b(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* renamed from: k2.k$c */
    /* loaded from: classes.dex */
    class c extends AbstractC10585d0 {
        c(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C9122k(AbstractC10604u abstractC10604u) {
        this.f21979a = abstractC10604u;
        this.f21980b = new a(abstractC10604u);
        this.f21981c = new b(abstractC10604u);
        this.f21982d = new c(abstractC10604u);
    }

    /* renamed from: h */
    public static List<Class<?>> m26872h() {
        return Collections.emptyList();
    }

    @Override // p192k2.InterfaceC9121j
    /* renamed from: a */
    public void mo26863a(C9124m c9124m) {
        InterfaceC9121j.a.m26871b(this, c9124m);
    }

    @Override // p192k2.InterfaceC9121j
    /* renamed from: b */
    public C9120i mo26864b(String str, int i10) {
        C10607x m32298e = C10607x.m32298e("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        m32298e.mo32159M0(2, i10);
        this.f21979a.m32252d();
        C9120i c9120i = null;
        String string = null;
        Cursor m33488b = C10973b.m33488b(this.f21979a, m32298e, false, null);
        try {
            int m33486e = C10972a.m33486e(m33488b, "work_spec_id");
            int m33486e2 = C10972a.m33486e(m33488b, "generation");
            int m33486e3 = C10972a.m33486e(m33488b, "system_id");
            if (m33488b.moveToFirst()) {
                if (!m33488b.isNull(m33486e)) {
                    string = m33488b.getString(m33486e);
                }
                c9120i = new C9120i(string, m33488b.getInt(m33486e2), m33488b.getInt(m33486e3));
            }
            return c9120i;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9121j
    /* renamed from: c */
    public void mo26865c(C9120i c9120i) {
        this.f21979a.m32252d();
        this.f21979a.m32253e();
        try {
            this.f21980b.m32181j(c9120i);
            this.f21979a.m32250B();
        } finally {
            this.f21979a.m32255i();
        }
    }

    @Override // p192k2.InterfaceC9121j
    /* renamed from: d */
    public List<String> mo26866d() {
        C10607x m32298e = C10607x.m32298e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f21979a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f21979a, m32298e, false, null);
        try {
            ArrayList arrayList = new ArrayList(m33488b.getCount());
            while (m33488b.moveToNext()) {
                arrayList.add(m33488b.isNull(0) ? null : m33488b.getString(0));
            }
            return arrayList;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9121j
    /* renamed from: e */
    public C9120i mo26867e(C9124m c9124m) {
        return InterfaceC9121j.a.m26870a(this, c9124m);
    }

    @Override // p192k2.InterfaceC9121j
    /* renamed from: f */
    public void mo26868f(String str, int i10) {
        this.f21979a.m32252d();
        InterfaceC11614m m32172b = this.f21981c.m32172b();
        if (str == null) {
            m32172b.mo32161g1(1);
        } else {
            m32172b.mo32163x0(1, str);
        }
        m32172b.mo32159M0(2, i10);
        this.f21979a.m32253e();
        try {
            m32172b.mo32164z();
            this.f21979a.m32250B();
        } finally {
            this.f21979a.m32255i();
            this.f21981c.m32174h(m32172b);
        }
    }

    @Override // p192k2.InterfaceC9121j
    /* renamed from: g */
    public void mo26869g(String str) {
        this.f21979a.m32252d();
        InterfaceC11614m m32172b = this.f21982d.m32172b();
        if (str == null) {
            m32172b.mo32161g1(1);
        } else {
            m32172b.mo32163x0(1, str);
        }
        this.f21979a.m32253e();
        try {
            m32172b.mo32164z();
            this.f21979a.m32250B();
        } finally {
            this.f21979a.m32255i();
            this.f21982d.m32174h(m32172b);
        }
    }
}
