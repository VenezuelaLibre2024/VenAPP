package p065df;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;
import p450xk.C12524p;
import p485zb.C12863c;
import p485zb.C12874n;

/* renamed from: df.d0 */
/* loaded from: classes2.dex */
public final class C6910d0 {

    /* renamed from: f */
    public static final b f15387f = new b(null);

    /* renamed from: a */
    private final InterfaceC6922j0 f15388a;

    /* renamed from: b */
    private final InterfaceC9987a<UUID> f15389b;

    /* renamed from: c */
    private final String f15390c;

    /* renamed from: d */
    private int f15391d;

    /* renamed from: e */
    private C6938y f15392e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: df.d0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends C9319k implements InterfaceC9987a<UUID> {

        /* renamed from: a */
        public static final a f15393a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* renamed from: df.d0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C6910d0 m20002a() {
            Object m42629k = C12874n.m42641a(C12863c.f35064a).m42629k(C6910d0.class);
            C9322n.m27780d(m42629k, "Firebase.app[SessionGenerator::class.java]");
            return (C6910d0) m42629k;
        }
    }

    public C6910d0(InterfaceC6922j0 timeProvider, InterfaceC9987a<UUID> uuidGenerator) {
        C9322n.m27781e(timeProvider, "timeProvider");
        C9322n.m27781e(uuidGenerator, "uuidGenerator");
        this.f15388a = timeProvider;
        this.f15389b = uuidGenerator;
        this.f15390c = m19998b();
        this.f15391d = -1;
    }

    public /* synthetic */ C6910d0(InterfaceC6922j0 interfaceC6922j0, InterfaceC9987a interfaceC9987a, int i10, C9315g c9315g) {
        this(interfaceC6922j0, (i10 & 2) != 0 ? a.f15393a : interfaceC9987a);
    }

    /* renamed from: b */
    private final String m19998b() {
        String m41027A;
        String uuid = this.f15389b.invoke().toString();
        C9322n.m27780d(uuid, "uuidGenerator().toString()");
        m41027A = C12524p.m41027A(uuid, "-", "", false, 4, null);
        String lowerCase = m41027A.toLowerCase(Locale.ROOT);
        C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: a */
    public final C6938y m19999a() {
        int i10 = this.f15391d + 1;
        this.f15391d = i10;
        this.f15392e = new C6938y(i10 == 0 ? this.f15390c : m19998b(), this.f15390c, this.f15391d, this.f15388a.mo20037a());
        return m20000c();
    }

    /* renamed from: c */
    public final C6938y m20000c() {
        C6938y c6938y = this.f15392e;
        if (c6938y != null) {
            return c6938y;
        }
        C9322n.m27792p("currentSession");
        return null;
    }
}
