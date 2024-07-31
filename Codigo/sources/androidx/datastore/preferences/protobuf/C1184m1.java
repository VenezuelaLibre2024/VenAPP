package androidx.datastore.preferences.protobuf;

import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.m1 */
/* loaded from: classes.dex */
public class C1184m1 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: a */
    private final List<String> f4937a;

    public C1184m1(InterfaceC1198r0 interfaceC1198r0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f4937a = null;
    }

    /* renamed from: a */
    public C1150b0 m6226a() {
        return new C1150b0(getMessage());
    }
}
