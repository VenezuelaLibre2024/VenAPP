package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m1 */
/* loaded from: classes2.dex */
public class C5987m1 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: a */
    private final List<String> f12685a;

    public C5987m1(InterfaceC6001r0 interfaceC6001r0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f12685a = null;
    }

    /* renamed from: a */
    public C5953b0 m15885a() {
        return new C5953b0(getMessage());
    }
}
