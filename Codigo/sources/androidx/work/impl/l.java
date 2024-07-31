package androidx.work.impl;

/* loaded from: classes.dex */
public final class l extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final l f5881c = new l();

    private l() {
        super(6, 7);
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
