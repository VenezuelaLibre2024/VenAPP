package io.grpc.internal;

import io.grpc.internal.C8842e0;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;
import vi.AbstractC11898b;
import vi.AbstractC11907e;
import vi.AbstractC11945s0;
import vi.AbstractC11947t0;
import vi.AbstractC11957y0;
import vi.C11897a1;
import vi.C11902c0;
import vi.C11914g0;
import vi.C11936o;
import vi.C11950v;
import vi.InterfaceC11906d1;
import vi.InterfaceC11916h;

/* renamed from: io.grpc.internal.g1 */
/* loaded from: classes3.dex */
public final class C8851g1 extends AbstractC11947t0<C8851g1> {

    /* renamed from: H */
    private static final Logger f20584H = Logger.getLogger(C8851g1.class.getName());

    /* renamed from: I */
    static final long f20585I = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: J */
    static final long f20586J = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: K */
    private static final InterfaceC8883o1<? extends Executor> f20587K = C8848f2.m25567c(C8890q0.f20848u);

    /* renamed from: L */
    private static final C11950v f20588L = C11950v.m38278c();

    /* renamed from: M */
    private static final C11936o f20589M = C11936o.m38206a();

    /* renamed from: A */
    private boolean f20590A;

    /* renamed from: B */
    private boolean f20591B;

    /* renamed from: C */
    private boolean f20592C;

    /* renamed from: D */
    private boolean f20593D;

    /* renamed from: E */
    private boolean f20594E;

    /* renamed from: F */
    private final c f20595F;

    /* renamed from: G */
    private final b f20596G;

    /* renamed from: a */
    InterfaceC8883o1<? extends Executor> f20597a;

    /* renamed from: b */
    InterfaceC8883o1<? extends Executor> f20598b;

    /* renamed from: c */
    private final List<InterfaceC11916h> f20599c;

    /* renamed from: d */
    final C11897a1 f20600d;

    /* renamed from: e */
    AbstractC11957y0.d f20601e;

    /* renamed from: f */
    final String f20602f;

    /* renamed from: g */
    final AbstractC11898b f20603g;

    /* renamed from: h */
    private final SocketAddress f20604h;

    /* renamed from: i */
    String f20605i;

    /* renamed from: j */
    String f20606j;

    /* renamed from: k */
    String f20607k;

    /* renamed from: l */
    boolean f20608l;

    /* renamed from: m */
    C11950v f20609m;

    /* renamed from: n */
    C11936o f20610n;

    /* renamed from: o */
    long f20611o;

    /* renamed from: p */
    int f20612p;

    /* renamed from: q */
    int f20613q;

    /* renamed from: r */
    long f20614r;

    /* renamed from: s */
    long f20615s;

    /* renamed from: t */
    boolean f20616t;

    /* renamed from: u */
    C11902c0 f20617u;

    /* renamed from: v */
    int f20618v;

    /* renamed from: w */
    Map<String, ?> f20619w;

    /* renamed from: x */
    boolean f20620x;

    /* renamed from: y */
    InterfaceC11906d1 f20621y;

    /* renamed from: z */
    private boolean f20622z;

    /* renamed from: io.grpc.internal.g1$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        int mo25577a();
    }

    /* renamed from: io.grpc.internal.g1$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC8898t mo25578a();
    }

    /* renamed from: io.grpc.internal.g1$d */
    /* loaded from: classes3.dex */
    private static final class d implements b {
        private d() {
        }

        @Override // io.grpc.internal.C8851g1.b
        /* renamed from: a */
        public int mo25577a() {
            return 443;
        }
    }

    public C8851g1(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    public C8851g1(String str, AbstractC11907e abstractC11907e, AbstractC11898b abstractC11898b, c cVar, b bVar) {
        InterfaceC8883o1<? extends Executor> interfaceC8883o1 = f20587K;
        this.f20597a = interfaceC8883o1;
        this.f20598b = interfaceC8883o1;
        this.f20599c = new ArrayList();
        C11897a1 m38057d = C11897a1.m38057d();
        this.f20600d = m38057d;
        this.f20601e = m38057d.m38060c();
        this.f20607k = "pick_first";
        this.f20609m = f20588L;
        this.f20610n = f20589M;
        this.f20611o = f20585I;
        this.f20612p = 5;
        this.f20613q = 5;
        this.f20614r = 16777216L;
        this.f20615s = 1048576L;
        this.f20616t = true;
        this.f20617u = C11902c0.m38104g();
        this.f20620x = true;
        this.f20622z = true;
        this.f20590A = true;
        this.f20591B = true;
        this.f20592C = false;
        this.f20593D = true;
        this.f20594E = true;
        this.f20602f = (String) C7159o.m21313p(str, "target");
        this.f20603g = abstractC11898b;
        this.f20595F = (c) C7159o.m21313p(cVar, "clientTransportFactoryBuilder");
        this.f20604h = null;
        if (bVar != null) {
            this.f20596G = bVar;
        } else {
            this.f20596G = new d();
        }
    }

    @Override // vi.AbstractC11947t0
    /* renamed from: a */
    public AbstractC11945s0 mo25274a() {
        return new C8855h1(new C8847f1(this, this.f20595F.mo25578a(), new C8842e0.a(), C8848f2.m25567c(C8890q0.f20848u), C8890q0.f20850w, m25576d(), InterfaceC8868k2.f20692a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m25575c() {
        return this.f20596G.mo25577a();
    }

    /* renamed from: d */
    List<InterfaceC11916h> m25576d() {
        boolean z10;
        InterfaceC11916h interfaceC11916h;
        ArrayList arrayList = new ArrayList(this.f20599c);
        List<InterfaceC11916h> m38129a = C11914g0.m38129a();
        if (m38129a != null) {
            arrayList.addAll(m38129a);
            z10 = true;
        } else {
            z10 = false;
        }
        InterfaceC11916h interfaceC11916h2 = null;
        if (!z10 && this.f20622z) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class<?> cls2 = Boolean.TYPE;
                interfaceC11916h = (InterfaceC11916h) cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.f20590A), Boolean.valueOf(this.f20591B), Boolean.valueOf(this.f20592C), Boolean.valueOf(this.f20593D));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                f20584H.log(Level.FINE, "Unable to apply census stats", e10);
                interfaceC11916h = null;
            }
            if (interfaceC11916h != null) {
                arrayList.add(0, interfaceC11916h);
            }
        }
        if (!z10 && this.f20594E) {
            try {
                interfaceC11916h2 = (InterfaceC11916h) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                f20584H.log(Level.FINE, "Unable to apply census stats", e11);
            }
            if (interfaceC11916h2 != null) {
                arrayList.add(0, interfaceC11916h2);
            }
        }
        return arrayList;
    }
}
