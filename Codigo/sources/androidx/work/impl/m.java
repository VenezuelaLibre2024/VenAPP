package androidx.work.impl;

/* loaded from: classes.dex */
public final class m extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final m f5882c = new m();

    private m() {
        super(7, 8);
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
