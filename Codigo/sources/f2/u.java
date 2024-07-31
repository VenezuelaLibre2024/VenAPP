package f2;

import dk.q0;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: d */
    public static final b f14902d = new b(null);

    /* renamed from: a */
    private final UUID f14903a;

    /* renamed from: b */
    private final k2.u f14904b;

    /* renamed from: c */
    private final Set<String> f14905c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<B, ?>, W extends u> {

        /* renamed from: a */
        private final Class<? extends androidx.work.c> f14906a;

        /* renamed from: b */
        private boolean f14907b;

        /* renamed from: c */
        private UUID f14908c;

        /* renamed from: d */
        private k2.u f14909d;

        /* renamed from: e */
        private final Set<String> f14910e;

        public a(Class<? extends androidx.work.c> workerClass) {
            Set<String> g10;
            kotlin.jvm.internal.n.e(workerClass, "workerClass");
            this.f14906a = workerClass;
            UUID randomUUID = UUID.randomUUID();
            kotlin.jvm.internal.n.d(randomUUID, "randomUUID()");
            this.f14908c = randomUUID;
            String uuid = this.f14908c.toString();
            kotlin.jvm.internal.n.d(uuid, "id.toString()");
            String name = workerClass.getName();
            kotlin.jvm.internal.n.d(name, "workerClass.name");
            this.f14909d = new k2.u(uuid, name);
            String name2 = workerClass.getName();
            kotlin.jvm.internal.n.d(name2, "workerClass.name");
            g10 = q0.g(name2);
            this.f14910e = g10;
        }

        public final B a(String tag) {
            kotlin.jvm.internal.n.e(tag, "tag");
            this.f14910e.add(tag);
            return g();
        }

        public final W b() {
            W c10 = c();
            f2.b bVar = this.f14909d.f20232j;
            boolean z10 = bVar.e() || bVar.f() || bVar.g() || bVar.h();
            k2.u uVar = this.f14909d;
            if (uVar.f20239q) {
                if (!(!z10)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (!(uVar.f20229g <= 0)) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            kotlin.jvm.internal.n.d(randomUUID, "randomUUID()");
            k(randomUUID);
            return c10;
        }

        public abstract W c();

        public final boolean d() {
            return this.f14907b;
        }

        public final UUID e() {
            return this.f14908c;
        }

        public final Set<String> f() {
            return this.f14910e;
        }

        public abstract B g();

        public final k2.u h() {
            return this.f14909d;
        }

        public final B i(f2.a backoffPolicy, long j10, TimeUnit timeUnit) {
            kotlin.jvm.internal.n.e(backoffPolicy, "backoffPolicy");
            kotlin.jvm.internal.n.e(timeUnit, "timeUnit");
            this.f14907b = true;
            k2.u uVar = this.f14909d;
            uVar.f20234l = backoffPolicy;
            uVar.k(timeUnit.toMillis(j10));
            return g();
        }

        public final B j(f2.b constraints) {
            kotlin.jvm.internal.n.e(constraints, "constraints");
            this.f14909d.f20232j = constraints;
            return g();
        }

        public final B k(UUID id2) {
            kotlin.jvm.internal.n.e(id2, "id");
            this.f14908c = id2;
            String uuid = id2.toString();
            kotlin.jvm.internal.n.d(uuid, "id.toString()");
            this.f14909d = new k2.u(uuid, this.f14909d);
            return g();
        }

        public final B l(androidx.work.b inputData) {
            kotlin.jvm.internal.n.e(inputData, "inputData");
            this.f14909d.f20227e = inputData;
            return g();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public u(UUID id2, k2.u workSpec, Set<String> tags) {
        kotlin.jvm.internal.n.e(id2, "id");
        kotlin.jvm.internal.n.e(workSpec, "workSpec");
        kotlin.jvm.internal.n.e(tags, "tags");
        this.f14903a = id2;
        this.f14904b = workSpec;
        this.f14905c = tags;
    }

    public UUID a() {
        return this.f14903a;
    }

    public final String b() {
        String uuid = a().toString();
        kotlin.jvm.internal.n.d(uuid, "id.toString()");
        return uuid;
    }

    public final Set<String> c() {
        return this.f14905c;
    }

    public final k2.u d() {
        return this.f14904b;
    }
}
