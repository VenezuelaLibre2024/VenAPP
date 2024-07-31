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

/* renamed from: k2.c */
/* loaded from: classes.dex */
public final class C9114c implements InterfaceC9112b {

    /* renamed from: a */
    private final AbstractC10604u f21968a;

    /* renamed from: b */
    private final AbstractC10592i<C9110a> f21969b;

    /* renamed from: k2.c$a */
    /* loaded from: classes.dex */
    class a extends AbstractC10592i<C9110a> {
        a(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p322r1.AbstractC10592i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo26837i(InterfaceC11614m interfaceC11614m, C9110a c9110a) {
            if (c9110a.m26831b() == null) {
                interfaceC11614m.mo32161g1(1);
            } else {
                interfaceC11614m.mo32163x0(1, c9110a.m26831b());
            }
            if (c9110a.m26830a() == null) {
                interfaceC11614m.mo32161g1(2);
            } else {
                interfaceC11614m.mo32163x0(2, c9110a.m26830a());
            }
        }
    }

    public C9114c(AbstractC10604u abstractC10604u) {
        this.f21968a = abstractC10604u;
        this.f21969b = new a(abstractC10604u);
    }

    /* renamed from: e */
    public static List<Class<?>> m26853e() {
        return Collections.emptyList();
    }

    @Override // p192k2.InterfaceC9112b
    /* renamed from: a */
    public List<String> mo26839a(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f21968a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f21968a, m32298e, false, null);
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

    @Override // p192k2.InterfaceC9112b
    /* renamed from: b */
    public boolean mo26840b(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f21968a.m32252d();
        boolean z10 = false;
        Cursor m33488b = C10973b.m33488b(this.f21968a, m32298e, false, null);
        try {
            if (m33488b.moveToFirst()) {
                z10 = m33488b.getInt(0) != 0;
            }
            return z10;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }

    @Override // p192k2.InterfaceC9112b
    /* renamed from: c */
    public void mo26841c(C9110a c9110a) {
        this.f21968a.m32252d();
        this.f21968a.m32253e();
        try {
            this.f21969b.m32181j(c9110a);
            this.f21968a.m32250B();
        } finally {
            this.f21968a.m32255i();
        }
    }

    @Override // p192k2.InterfaceC9112b
    /* renamed from: d */
    public boolean mo26842d(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f21968a.m32252d();
        boolean z10 = false;
        Cursor m33488b = C10973b.m33488b(this.f21968a, m32298e, false, null);
        try {
            if (m33488b.moveToFirst()) {
                z10 = m33488b.getInt(0) != 0;
            }
            return z10;
        } finally {
            m33488b.close();
            m32298e.m32303i();
        }
    }
}
