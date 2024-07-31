package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b0 */
/* loaded from: classes2.dex */
public class C5953b0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a */
    private InterfaceC6001r0 f12556a;

    /* renamed from: b */
    private boolean f12557b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.b0$a */
    /* loaded from: classes2.dex */
    public static class a extends C5953b0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C5953b0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f12556a = null;
    }

    public C5953b0(String str) {
        super(str);
        this.f12556a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C5953b0 m15323b() {
        return new C5953b0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C5953b0 m15324c() {
        return new C5953b0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C5953b0 m15325d() {
        return new C5953b0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static a m15326e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C5953b0 m15327f() {
        return new C5953b0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C5953b0 m15328g() {
        return new C5953b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C5953b0 m15329h() {
        return new C5953b0("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C5953b0 m15330i() {
        return new C5953b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C5953b0 m15331l() {
        return new C5953b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static C5953b0 m15332m() {
        return new C5953b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m15333a() {
        return this.f12557b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m15334j() {
        this.f12557b = true;
    }

    /* renamed from: k */
    public C5953b0 m15335k(InterfaceC6001r0 interfaceC6001r0) {
        this.f12556a = interfaceC6001r0;
        return this;
    }
}
