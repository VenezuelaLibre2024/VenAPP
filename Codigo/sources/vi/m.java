package vi;

import java.util.concurrent.Executor;
import vi.b;

/* loaded from: classes3.dex */
public final class m extends b {

    /* renamed from: a, reason: collision with root package name */
    private final b f29163a;

    /* renamed from: b, reason: collision with root package name */
    private final b f29164b;

    /* loaded from: classes3.dex */
    private final class a extends b.a {

        /* renamed from: a, reason: collision with root package name */
        private final b.AbstractC0469b f29165a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f29166b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f29167c;

        /* renamed from: d, reason: collision with root package name */
        private final r f29168d;

        public a(b.AbstractC0469b abstractC0469b, Executor executor, b.a aVar, r rVar) {
            this.f29165a = abstractC0469b;
            this.f29166b = executor;
            this.f29167c = (b.a) eb.o.p(aVar, "delegate");
            this.f29168d = (r) eb.o.p(rVar, "context");
        }
    }

    public m(b bVar, b bVar2) {
        this.f29163a = (b) eb.o.p(bVar, "creds1");
        this.f29164b = (b) eb.o.p(bVar2, "creds2");
    }

    @Override // vi.b
    public void a(b.AbstractC0469b abstractC0469b, Executor executor, b.a aVar) {
        this.f29163a.a(abstractC0469b, executor, new a(abstractC0469b, executor, aVar, r.e()));
    }
}
