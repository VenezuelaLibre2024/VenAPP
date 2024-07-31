package androidx.work.impl;

import r1.u;

/* loaded from: classes.dex */
public final class c extends u.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5797a = new c();

    private c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // r1.u.b
    public void c(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        super.c(db2);
        db2.t();
        try {
            db2.x(e());
            db2.M();
        } finally {
            db2.X();
        }
    }

    public final long d() {
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        j10 = z.f5963a;
        return currentTimeMillis - j10;
    }
}
