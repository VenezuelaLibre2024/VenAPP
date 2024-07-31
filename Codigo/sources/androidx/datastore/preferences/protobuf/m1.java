package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class m1 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f4226a;

    public m1(r0 r0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f4226a = null;
    }

    public b0 a() {
        return new b0(getMessage());
    }
}
