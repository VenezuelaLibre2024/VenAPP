package androidx.work.impl;

/* loaded from: classes.dex */
public final class n extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final n f5883c = new n();

    private n() {
        super(8, 9);
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
