package androidx.work.impl;

/* loaded from: classes.dex */
public final class j extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final j f5879c = new j();

    private j() {
        super(3, 4);
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
