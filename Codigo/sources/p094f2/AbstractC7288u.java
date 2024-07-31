package p094f2;

import androidx.work.AbstractC1523c;
import androidx.work.C1522b;
import dk.C7030q0;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p192k2.C9132u;

/* renamed from: f2.u */
/* loaded from: classes.dex */
public abstract class AbstractC7288u {

    /* renamed from: d */
    public static final b f16325d = new b(null);

    /* renamed from: a */
    private final UUID f16326a;

    /* renamed from: b */
    private final C9132u f16327b;

    /* renamed from: c */
    private final Set<String> f16328c;

    /* renamed from: f2.u$a */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<B, ?>, W extends AbstractC7288u> {

        /* renamed from: a */
        private final Class<? extends AbstractC1523c> f16329a;

        /* renamed from: b */
        private boolean f16330b;

        /* renamed from: c */
        private UUID f16331c;

        /* renamed from: d */
        private C9132u f16332d;

        /* renamed from: e */
        private final Set<String> f16333e;

        public a(Class<? extends AbstractC1523c> workerClass) {
            Set<String> m20575g;
            C9322n.m27781e(workerClass, "workerClass");
            this.f16329a = workerClass;
            UUID randomUUID = UUID.randomUUID();
            C9322n.m27780d(randomUUID, "randomUUID()");
            this.f16331c = randomUUID;
            String uuid = this.f16331c.toString();
            C9322n.m27780d(uuid, "id.toString()");
            String name = workerClass.getName();
            C9322n.m27780d(name, "workerClass.name");
            this.f16332d = new C9132u(uuid, name);
            String name2 = workerClass.getName();
            C9322n.m27780d(name2, "workerClass.name");
            m20575g = C7030q0.m20575g(name2);
            this.f16333e = m20575g;
        }

        /* renamed from: a */
        public final B m21802a(String tag) {
            C9322n.m27781e(tag, "tag");
            this.f16333e.add(tag);
            return mo21782g();
        }

        /* renamed from: b */
        public final W m21803b() {
            W mo21781c = mo21781c();
            C7269b c7269b = this.f16332d.f22014j;
            boolean z10 = c7269b.m21745e() || c7269b.m21746f() || c7269b.m21747g() || c7269b.m21748h();
            C9132u c9132u = this.f16332d;
            if (c9132u.f22021q) {
                if (!(!z10)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (!(c9132u.f22011g <= 0)) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            C9322n.m27780d(randomUUID, "randomUUID()");
            m21810k(randomUUID);
            return mo21781c;
        }

        /* renamed from: c */
        public abstract W mo21781c();

        /* renamed from: d */
        public final boolean m21804d() {
            return this.f16330b;
        }

        /* renamed from: e */
        public final UUID m21805e() {
            return this.f16331c;
        }

        /* renamed from: f */
        public final Set<String> m21806f() {
            return this.f16333e;
        }

        /* renamed from: g */
        public abstract B mo21782g();

        /* renamed from: h */
        public final C9132u m21807h() {
            return this.f16332d;
        }

        /* renamed from: i */
        public final B m21808i(EnumC7268a backoffPolicy, long j10, TimeUnit timeUnit) {
            C9322n.m27781e(backoffPolicy, "backoffPolicy");
            C9322n.m27781e(timeUnit, "timeUnit");
            this.f16330b = true;
            C9132u c9132u = this.f16332d;
            c9132u.f22016l = backoffPolicy;
            c9132u.m26900k(timeUnit.toMillis(j10));
            return mo21782g();
        }

        /* renamed from: j */
        public final B m21809j(C7269b constraints) {
            C9322n.m27781e(constraints, "constraints");
            this.f16332d.f22014j = constraints;
            return mo21782g();
        }

        /* renamed from: k */
        public final B m21810k(UUID id2) {
            C9322n.m27781e(id2, "id");
            this.f16331c = id2;
            String uuid = id2.toString();
            C9322n.m27780d(uuid, "id.toString()");
            this.f16332d = new C9132u(uuid, this.f16332d);
            return mo21782g();
        }

        /* renamed from: l */
        public final B m21811l(C1522b inputData) {
            C9322n.m27781e(inputData, "inputData");
            this.f16332d.f22009e = inputData;
            return mo21782g();
        }
    }

    /* renamed from: f2.u$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    public AbstractC7288u(UUID id2, C9132u workSpec, Set<String> tags) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(workSpec, "workSpec");
        C9322n.m27781e(tags, "tags");
        this.f16326a = id2;
        this.f16327b = workSpec;
        this.f16328c = tags;
    }

    /* renamed from: a */
    public UUID m21798a() {
        return this.f16326a;
    }

    /* renamed from: b */
    public final String m21799b() {
        String uuid = m21798a().toString();
        C9322n.m27780d(uuid, "id.toString()");
        return uuid;
    }

    /* renamed from: c */
    public final Set<String> m21800c() {
        return this.f16328c;
    }

    /* renamed from: d */
    public final C9132u m21801d() {
        return this.f16327b;
    }
}
