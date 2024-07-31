package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.m1 */
/* loaded from: classes2.dex */
public class C6600m1 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: a */
    private final List<String> f14566a;

    public C6600m1(InterfaceC6614r0 interfaceC6614r0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f14566a = null;
    }

    /* renamed from: a */
    public C6566b0 m18947a() {
        return new C6566b0(getMessage());
    }
}
