package pf;

import p015aj.AbstractC0125a;
import p015aj.AbstractC0126b;
import p015aj.C0127c;
import p492zi.C13030b;
import vi.AbstractC11904d;
import vi.C11901c;
import vi.C11955x0;

/* renamed from: pf.g */
/* loaded from: classes2.dex */
public final class C10169g {

    /* renamed from: a */
    private static volatile C11955x0<C10166d, C10167e> f24980a;

    /* renamed from: pf.g$a */
    /* loaded from: classes2.dex */
    class a implements AbstractC0126b.a<b> {
        a() {
        }

        @Override // p015aj.AbstractC0126b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo580a(AbstractC11904d abstractC11904d, C11901c c11901c) {
            return new b(abstractC11904d, c11901c, null);
        }
    }

    /* renamed from: pf.g$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC0125a<b> {
        private b(AbstractC11904d abstractC11904d, C11901c c11901c) {
            super(abstractC11904d, c11901c);
        }

        /* synthetic */ b(AbstractC11904d abstractC11904d, C11901c c11901c, C10168f c10168f) {
            this(abstractC11904d, c11901c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p015aj.AbstractC0126b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b mo576a(AbstractC11904d abstractC11904d, C11901c c11901c) {
            return new b(abstractC11904d, c11901c);
        }

        /* renamed from: h */
        public C10167e m30435h(C10166d c10166d) {
            return (C10167e) C0127c.m582b(m578c(), C10169g.m30431a(), m577b(), c10166d);
        }
    }

    private C10169g() {
    }

    /* renamed from: a */
    public static C11955x0<C10166d, C10167e> m30431a() {
        C11955x0<C10166d, C10167e> c11955x0 = f24980a;
        if (c11955x0 == null) {
            synchronized (C10169g.class) {
                c11955x0 = f24980a;
                if (c11955x0 == null) {
                    c11955x0 = C11955x0.m38339g().m38352f(C11955x0.d.UNARY).m38348b(C11955x0.m38338b("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns")).m38351e(true).m38349c(C13030b.m43019b(C10166d.m30413i0())).m38350d(C13030b.m43019b(C10167e.m30424d0())).m38347a();
                    f24980a = c11955x0;
                }
            }
        }
        return c11955x0;
    }

    /* renamed from: b */
    public static b m30432b(AbstractC11904d abstractC11904d) {
        return (b) AbstractC0125a.m574e(new a(), abstractC11904d);
    }
}
