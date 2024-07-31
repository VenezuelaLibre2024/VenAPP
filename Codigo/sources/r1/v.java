package r1;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f24676a = new v();

    private v() {
    }

    public static final String a(String hash) {
        kotlin.jvm.internal.n.e(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
