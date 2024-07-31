package androidx.work.impl;

/* loaded from: classes.dex */
public final class k extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final k f5880c = new k();

    private k() {
        super(4, 5);
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db2.x("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
