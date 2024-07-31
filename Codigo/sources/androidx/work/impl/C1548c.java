package androidx.work.impl;

import kotlin.jvm.internal.C9322n;
import p322r1.AbstractC10604u;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.c */
/* loaded from: classes.dex */
public final class C1548c extends AbstractC10604u.b {

    /* renamed from: a */
    public static final C1548c f6648a = new C1548c();

    private C1548c() {
    }

    /* renamed from: e */
    private final String m8669e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + m8671d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // p322r1.AbstractC10604u.b
    /* renamed from: c */
    public void mo8670c(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        super.mo8670c(db2);
        db2.mo32142t();
        try {
            db2.mo32144x(m8669e());
            db2.mo32131M();
        } finally {
            db2.mo32136X();
        }
    }

    /* renamed from: d */
    public final long m8671d() {
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        j10 = C1588z.f6818a;
        return currentTimeMillis - j10;
    }
}
