package androidx.work.impl;

/* loaded from: classes.dex */
public final class g extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final g f5845c = new g();

    private g() {
        super(12, 13);
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.x("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
