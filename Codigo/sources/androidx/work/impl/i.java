package androidx.work.impl;

/* loaded from: classes.dex */
public final class i extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final i f5878c = new i();

    private i() {
        super(1, 2);
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        db2.x("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        db2.x("DROP TABLE IF EXISTS alarmInfo");
        db2.x("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
