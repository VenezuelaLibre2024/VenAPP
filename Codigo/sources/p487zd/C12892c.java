package p487zd;

import android.text.TextUtils;
import cc.InterfaceC1940a;
import dj.AbstractC6981f;
import dj.EnumC6976a;
import dj.InterfaceC6982g;
import dj.InterfaceC6983h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p165ij.AbstractC8003a;
import p275of.C9938c;
import p311qd.C10447h;
import pf.C10167e;

/* renamed from: zd.c */
/* loaded from: classes.dex */
public class C12892c {

    /* renamed from: a */
    private final InterfaceC1940a f35113a;

    /* renamed from: b */
    private final AbstractC8003a<String> f35114b;

    /* renamed from: c */
    private InterfaceC1940a.a f35115c;

    /* renamed from: zd.c$a */
    /* loaded from: classes.dex */
    private class a implements InterfaceC6983h<String> {
        a() {
        }

        @Override // dj.InterfaceC6983h
        /* renamed from: a */
        public void mo9367a(InterfaceC6982g<String> interfaceC6982g) {
            C12940l2.m42840a("Subscribing to analytics events.");
            C12892c c12892c = C12892c.this;
            c12892c.f35115c = c12892c.f35113a.mo10147b("fiam", new C12923i0(interfaceC6982g));
        }
    }

    public C12892c(InterfaceC1940a interfaceC1940a) {
        this.f35113a = interfaceC1940a;
        AbstractC8003a<String> m20223C = AbstractC6981f.m20214e(new a(), EnumC6976a.BUFFER).m20223C();
        this.f35114b = m20223C;
        m20223C.m24580K();
    }

    /* renamed from: c */
    static Set<String> m42688c(C10167e c10167e) {
        HashSet hashSet = new HashSet();
        Iterator<C9938c> it = c10167e.m30429f0().iterator();
        while (it.hasNext()) {
            for (C10447h c10447h : it.next().m29686i0()) {
                if (!TextUtils.isEmpty(c10447h.m31345b0().m31309d0())) {
                    hashSet.add(c10447h.m31345b0().m31309d0());
                }
            }
        }
        if (hashSet.size() > 50) {
            C12940l2.m42842c("Too many contextual triggers defined - limiting to 50");
        }
        return hashSet;
    }

    /* renamed from: d */
    public AbstractC8003a<String> m42689d() {
        return this.f35114b;
    }

    /* renamed from: e */
    public void m42690e(C10167e c10167e) {
        Set<String> m42688c = m42688c(c10167e);
        C12940l2.m42840a("Updating contextual triggers for the following analytics events: " + m42688c);
        this.f35115c.mo10153a(m42688c);
    }
}
