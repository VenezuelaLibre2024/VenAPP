package p322r1;

import kotlin.jvm.internal.C9322n;

/* renamed from: r1.v */
/* loaded from: classes.dex */
public final class C10605v {

    /* renamed from: a */
    public static final C10605v f26790a = new C10605v();

    private C10605v() {
    }

    /* renamed from: a */
    public static final String m32287a(String hash) {
        C9322n.m27781e(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
