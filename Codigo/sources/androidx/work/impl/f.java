package androidx.work.impl;

/* loaded from: classes.dex */
public final class f extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final f f5815c = new f();

    private f() {
        super(11, 12);
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
