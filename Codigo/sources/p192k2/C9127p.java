package p192k2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p322r1.AbstractC10592i;
import p322r1.AbstractC10604u;
import p322r1.C10607x;
import p356t1.C10973b;
import p391v1.InterfaceC11614m;

/* renamed from: k2.p */
/* loaded from: classes.dex */
public final class C9127p implements InterfaceC9126o {

    /* renamed from: a */
    private final AbstractC10604u f21990a;

    /* renamed from: b */
    private final AbstractC10592i<C9125n> f21991b;

    /* renamed from: k2.p$a */
    /* loaded from: classes.dex */
    class a extends AbstractC10592i<C9125n> {
        a(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p322r1.AbstractC10592i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo26837i(InterfaceC11614m interfaceC11614m, C9125n c9125n) {
            if (c9125n.m26877a() == null) {
                interfaceC11614m.mo32161g1(1);
            } else {
                interfaceC11614m.mo32163x0(1, c9125n.m26877a());
            }
            if (c9125n.m26878b() == null) {
                interfaceC11614m.mo32161g1(2);
            } else {
                interfaceC11614m.mo32163x0(2, c9125n.m26878b());
            }
        }
    }

    public C9127p(AbstractC10604u abstractC10604u) {
        this.f21990a = abstractC10604u;
        this.f21991b = new a(abstractC10604u);
    }

    /* renamed from: c */
    public static List<Class<?>> m26881c() {
        return Collections.emptyList();
    }

    @Override // p192k2.InterfaceC9126o
    /* renamed from: a */
    public void mo26879a(C9125n c9125n) {
        this.f21990a.m32252d();
        this.f21990a.m32253e();
        try {
            this.f21991b.m32181j(c9125n);
            this.f21990a.m32250B();
        } finally {
            this.f21990a.m32255i();
        }
    }

    @Override // p192k2.InterfaceC9126o
    /* renamed from: b */
    public List<String> mo26880b(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f21990a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f21990a, m32298e, false, null);
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
}
