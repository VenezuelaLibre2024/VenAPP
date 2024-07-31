package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import v1.j;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends r1.u {

    /* renamed from: p */
    public static final a f5720p = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static final v1.j c(Context context, j.b configuration) {
            kotlin.jvm.internal.n.e(context, "$context");
            kotlin.jvm.internal.n.e(configuration, "configuration");
            j.b.a a10 = j.b.f27865f.a(context);
            a10.d(configuration.f27867b).c(configuration.f27868c).e(true).a(true);
            return new w1.f().a(a10.b());
        }

        public final WorkDatabase b(Context context, Executor queryExecutor, boolean z10) {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(queryExecutor, "queryExecutor");
            return (WorkDatabase) (z10 ? r1.t.c(context, WorkDatabase.class).c() : r1.t.a(context, WorkDatabase.class, "androidx.work.workdb").f(new j.c() { // from class: androidx.work.impl.y

                /* renamed from: a */
                public final /* synthetic */ Context f5962a;

                public /* synthetic */ y(Context context2) {
                    r1 = context2;
                }

                @Override // v1.j.c
                public final v1.j a(j.b bVar) {
                    v1.j c10;
                    c10 = WorkDatabase.a.c(r1, bVar);
                    return c10;
                }
            })).g(queryExecutor).a(c.f5797a).b(i.f5878c).b(new s(context2, 2, 3)).b(j.f5879c).b(k.f5880c).b(new s(context2, 5, 6)).b(l.f5881c).b(m.f5882c).b(n.f5883c).b(new f0(context2)).b(new s(context2, 10, 11)).b(f.f5815c).b(g.f5845c).b(h.f5848c).e().d();
        }
    }

    public static final WorkDatabase D(Context context, Executor executor, boolean z10) {
        return f5720p.b(context, executor, z10);
    }

    public abstract k2.b E();

    public abstract k2.e F();

    public abstract k2.j G();

    public abstract k2.o H();

    public abstract k2.r I();

    public abstract k2.v J();

    public abstract k2.z K();
}
