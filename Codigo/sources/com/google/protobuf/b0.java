package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class b0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a, reason: collision with root package name */
    private r0 f13155a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13156b;

    /* loaded from: classes2.dex */
    public static class a extends b0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public b0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f13155a = null;
    }

    public b0(String str) {
        super(str);
        this.f13155a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 b() {
        return new b0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 c() {
        return new b0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 d() {
        return new b0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 f() {
        return new b0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 g() {
        return new b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 h() {
        return new b0("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 i() {
        return new b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 l() {
        return new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 m() {
        return new b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f13156b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        this.f13156b = true;
    }

    public b0 k(r0 r0Var) {
        this.f13155a = r0Var;
        return this;
    }
}
