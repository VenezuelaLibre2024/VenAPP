package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.b0 */
/* loaded from: classes2.dex */
public class C6566b0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a */
    private InterfaceC6614r0 f14429a;

    /* renamed from: b */
    private boolean f14430b;

    /* renamed from: com.google.protobuf.b0$a */
    /* loaded from: classes2.dex */
    public static class a extends C6566b0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C6566b0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f14429a = null;
    }

    public C6566b0(String str) {
        super(str);
        this.f14429a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6566b0 m18397b() {
        return new C6566b0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C6566b0 m18398c() {
        return new C6566b0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C6566b0 m18399d() {
        return new C6566b0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static a m18400e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C6566b0 m18401f() {
        return new C6566b0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C6566b0 m18402g() {
        return new C6566b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C6566b0 m18403h() {
        return new C6566b0("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C6566b0 m18404i() {
        return new C6566b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C6566b0 m18405l() {
        return new C6566b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static C6566b0 m18406m() {
        return new C6566b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m18407a() {
        return this.f14430b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m18408j() {
        this.f14430b = true;
    }

    /* renamed from: k */
    public C6566b0 m18409k(InterfaceC6614r0 interfaceC6614r0) {
        this.f14429a = interfaceC6614r0;
        return this;
    }
}
