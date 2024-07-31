package p192k2;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import p322r1.AbstractC10592i;
import p322r1.AbstractC10604u;
import p322r1.C10607x;
import p356t1.C10973b;
import p391v1.InterfaceC11614m;

/* renamed from: k2.f */
/* loaded from: classes.dex */
public final class C9117f implements InterfaceC9116e {

    /* renamed from: a */
    private final AbstractC10604u f21973a;

    /* renamed from: b */
    private final AbstractC10592i<C9115d> f21974b;

    /* renamed from: k2.f$a */
    /* loaded from: classes.dex */
    class a extends AbstractC10592i<C9115d> {
        a(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p322r1.AbstractC10592i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo26837i(InterfaceC11614m interfaceC11614m, C9115d c9115d) {
            if (c9115d.m26855a() == null) {
                interfaceC11614m.mo32161g1(1);
            } else {
                interfaceC11614m.mo32163x0(1, c9115d.m26855a());
            }
            if (c9115d.m26856b() == null) {
                interfaceC11614m.mo32161g1(2);
            } else {
                interfaceC11614m.mo32159M0(2, c9115d.m26856b().longValue());
            }
        }
    }

    public C9117f(AbstractC10604u abstractC10604u) {
        this.f21973a = abstractC10604u;
        this.f21974b = new a(abstractC10604u);
    }

    /* renamed from: c */
    public static List<Class<?>> m26859c() {
        return Collections.emptyList();
    }

    @Override // p192k2.InterfaceC9116e
    /* renamed from: a */
    public void mo26857a(C9115d c9115d) {
        this.f21973a.m32252d();
        this.f21973a.m32253e();
        try {
            this.f21974b.m32181j(c9115d);
            this.f21973a.m32250B();
        } finally {
            this.f21973a.m32255i();
        }
    }

    @Override // p192k2.InterfaceC9116e
    /* renamed from: b */
    public Long mo26858b(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f21973a.m32252d();
        Long l10 = null;
        Cursor m33488b = C10973b.m33488b(this.f21973a, m32298e, false, null);
        try {
            if (m33488b.moveToFirst() && !m33488b.isNull(0)) {
                l10 = Long.valueOf(m33488b.getLong(0));
            }
            return l10;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }
}
