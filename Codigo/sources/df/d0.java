package df;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: f */
    public static final b f14033f = new b(null);

    /* renamed from: a */
    private final j0 f14034a;

    /* renamed from: b */
    private final ok.a<UUID> f14035b;

    /* renamed from: c */
    private final String f14036c;

    /* renamed from: d */
    private int f14037d;

    /* renamed from: e */
    private y f14038e;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements ok.a<UUID> {

        /* renamed from: a */
        public static final a f14039a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // ok.a
        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final d0 a() {
            Object k10 = zb.n.a(zb.c.f32513a).k(d0.class);
            kotlin.jvm.internal.n.d(k10, "Firebase.app[SessionGenerator::class.java]");
            return (d0) k10;
        }
    }

    public d0(j0 timeProvider, ok.a<UUID> uuidGenerator) {
        kotlin.jvm.internal.n.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.n.e(uuidGenerator, "uuidGenerator");
        this.f14034a = timeProvider;
        this.f14035b = uuidGenerator;
        this.f14036c = b();
        this.f14037d = -1;
    }

    public /* synthetic */ d0(j0 j0Var, ok.a aVar, int i10, kotlin.jvm.internal.g gVar) {
        this(j0Var, (i10 & 2) != 0 ? a.f14039a : aVar);
    }

    private final String b() {
        String A;
        String uuid = this.f14035b.invoke().toString();
        kotlin.jvm.internal.n.d(uuid, "uuidGenerator().toString()");
        A = xk.p.A(uuid, "-", "", false, 4, null);
        String lowerCase = A.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final y a() {
        int i10 = this.f14037d + 1;
        this.f14037d = i10;
        this.f14038e = new y(i10 == 0 ? this.f14036c : b(), this.f14036c, this.f14037d, this.f14034a.a());
        return c();
    }

    public final y c() {
        y yVar = this.f14038e;
        if (yVar != null) {
            return yVar;
        }
        kotlin.jvm.internal.n.p("currentSession");
        return null;
    }
}
