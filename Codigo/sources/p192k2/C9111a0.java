package p192k2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p192k2.InterfaceC9137z;
import p322r1.AbstractC10585d0;
import p322r1.AbstractC10592i;
import p322r1.AbstractC10604u;
import p322r1.C10607x;
import p356t1.C10973b;
import p391v1.InterfaceC11614m;

/* renamed from: k2.a0 */
/* loaded from: classes.dex */
public final class C9111a0 implements InterfaceC9137z {

    /* renamed from: a */
    private final AbstractC10604u f21958a;

    /* renamed from: b */
    private final AbstractC10592i<C9136y> f21959b;

    /* renamed from: c */
    private final AbstractC10585d0 f21960c;

    /* renamed from: k2.a0$a */
    /* loaded from: classes.dex */
    class a extends AbstractC10592i<C9136y> {
        a(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p322r1.AbstractC10592i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo26837i(InterfaceC11614m interfaceC11614m, C9136y c9136y) {
            if (c9136y.m26935a() == null) {
                interfaceC11614m.mo32161g1(1);
            } else {
                interfaceC11614m.mo32163x0(1, c9136y.m26935a());
            }
            if (c9136y.m26936b() == null) {
                interfaceC11614m.mo32161g1(2);
            } else {
                interfaceC11614m.mo32163x0(2, c9136y.m26936b());
            }
        }
    }

    /* renamed from: k2.a0$b */
    /* loaded from: classes.dex */
    class b extends AbstractC10585d0 {
        b(AbstractC10604u abstractC10604u) {
            super(abstractC10604u);
        }

        @Override // p322r1.AbstractC10585d0
        /* renamed from: e */
        public String mo26836e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C9111a0(AbstractC10604u abstractC10604u) {
        this.f21958a = abstractC10604u;
        this.f21959b = new a(abstractC10604u);
        this.f21960c = new b(abstractC10604u);
    }

    /* renamed from: d */
    public static List<Class<?>> m26832d() {
        return Collections.emptyList();
    }

    @Override // p192k2.InterfaceC9137z
    /* renamed from: a */
    public List<String> mo26833a(String str) {
        C10607x m32298e = C10607x.m32298e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            m32298e.mo32161g1(1);
        } else {
            m32298e.mo32163x0(1, str);
        }
        this.f21958a.m32252d();
        Cursor m33488b = C10973b.m33488b(this.f21958a, m32298e, false, null);
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

    @Override // p192k2.InterfaceC9137z
    /* renamed from: b */
    public void mo26834b(C9136y c9136y) {
        this.f21958a.m32252d();
        this.f21958a.m32253e();
        try {
            this.f21959b.m32181j(c9136y);
            this.f21958a.m32250B();
        } finally {
            this.f21958a.m32255i();
        }
    }

    @Override // p192k2.InterfaceC9137z
    /* renamed from: c */
    public void mo26835c(String str, Set<String> set) {
        InterfaceC9137z.a.m26937a(this, str, set);
    }
}
