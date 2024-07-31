package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.b0 */
/* loaded from: classes.dex */
public class C1150b0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a */
    private InterfaceC1198r0 f4795a;

    /* renamed from: androidx.datastore.preferences.protobuf.b0$a */
    /* loaded from: classes.dex */
    public static class a extends C1150b0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C1150b0(String str) {
        super(str);
        this.f4795a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1150b0 m5664a() {
        return new C1150b0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1150b0 m5665b() {
        return new C1150b0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1150b0 m5666c() {
        return new C1150b0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static a m5667d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1150b0 m5668e() {
        return new C1150b0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C1150b0 m5669f() {
        return new C1150b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C1150b0 m5670g() {
        return new C1150b0("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C1150b0 m5671h() {
        return new C1150b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C1150b0 m5672j() {
        return new C1150b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C1150b0 m5673k() {
        return new C1150b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: i */
    public C1150b0 m5674i(InterfaceC1198r0 interfaceC1198r0) {
        this.f4795a = interfaceC1198r0;
        return this;
    }
}
