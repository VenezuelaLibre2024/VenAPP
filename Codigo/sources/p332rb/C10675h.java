package p332rb;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import p179jb.C9030v;
import p179jb.C9032x;
import p179jb.InterfaceC9031w;

/* renamed from: rb.h */
/* loaded from: classes2.dex */
public class C10675h implements InterfaceC9031w<InterfaceC10674g, InterfaceC10674g> {

    /* renamed from: a */
    private static final C10675h f26993a = new C10675h();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rb.h$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC10674g {

        /* renamed from: a */
        private final C9030v<InterfaceC10674g> f26994a;

        private b(C9030v<InterfaceC10674g> c9030v) {
            this.f26994a = c9030v;
        }
    }

    private C10675h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m32494d() {
        C9032x.m26537n(f26993a);
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: b */
    public Class<InterfaceC10674g> mo26522b() {
        return InterfaceC10674g.class;
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: c */
    public Class<InterfaceC10674g> mo26523c() {
        return InterfaceC10674g.class;
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC10674g mo26521a(C9030v<InterfaceC10674g> c9030v) {
        if (c9030v == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (c9030v.m26502e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<C9030v.c<InterfaceC10674g>>> it = c9030v.m26500c().iterator();
        while (it.hasNext()) {
            Iterator<C9030v.c<InterfaceC10674g>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().m26512a();
            }
        }
        return new b(c9030v);
    }
}
