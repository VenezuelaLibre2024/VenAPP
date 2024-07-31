package vi;

import java.util.concurrent.Executor;
import p082eb.C7159o;
import vi.AbstractC11898b;

/* renamed from: vi.m */
/* loaded from: classes3.dex */
public final class C11931m extends AbstractC11898b {

    /* renamed from: a */
    private final AbstractC11898b f31598a;

    /* renamed from: b */
    private final AbstractC11898b f31599b;

    /* renamed from: vi.m$a */
    /* loaded from: classes3.dex */
    private final class a extends AbstractC11898b.a {

        /* renamed from: a */
        private final AbstractC11898b.b f31600a;

        /* renamed from: b */
        private final Executor f31601b;

        /* renamed from: c */
        private final AbstractC11898b.a f31602c;

        /* renamed from: d */
        private final C11942r f31603d;

        public a(AbstractC11898b.b bVar, Executor executor, AbstractC11898b.a aVar, C11942r c11942r) {
            this.f31600a = bVar;
            this.f31601b = executor;
            this.f31602c = (AbstractC11898b.a) C7159o.m21313p(aVar, "delegate");
            this.f31603d = (C11942r) C7159o.m21313p(c11942r, "context");
        }
    }

    public C11931m(AbstractC11898b abstractC11898b, AbstractC11898b abstractC11898b2) {
        this.f31598a = (AbstractC11898b) C7159o.m21313p(abstractC11898b, "creds1");
        this.f31599b = (AbstractC11898b) C7159o.m21313p(abstractC11898b2, "creds2");
    }

    @Override // vi.AbstractC11898b
    /* renamed from: a */
    public void mo38066a(AbstractC11898b.b bVar, Executor executor, AbstractC11898b.a aVar) {
        this.f31598a.mo38066a(bVar, executor, new a(bVar, executor, aVar, C11942r.m38242e()));
    }
}
