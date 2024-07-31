package io.grpc.okhttp.internal;

import java.net.ProtocolException;

/* renamed from: io.grpc.okhttp.internal.j */
/* loaded from: classes3.dex */
public final class C8928j {

    /* renamed from: a */
    public final EnumC8927i f21216a;

    /* renamed from: b */
    public final int f21217b;

    /* renamed from: c */
    public final String f21218c;

    public C8928j(EnumC8927i enumC8927i, int i10, String str) {
        this.f21216a = enumC8927i;
        this.f21217b = i10;
        this.f21218c = str;
    }

    /* renamed from: a */
    public static C8928j m26101a(String str) {
        EnumC8927i enumC8927i;
        int i10;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                enumC8927i = EnumC8927i.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC8927i = EnumC8927i.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            enumC8927i = EnumC8927i.HTTP_1_0;
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                str2 = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i10 + 4);
            }
            return new C8928j(enumC8927i, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21216a == EnumC8927i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f21217b);
        if (this.f21218c != null) {
            sb2.append(' ');
            sb2.append(this.f21218c);
        }
        return sb2.toString();
    }
}
