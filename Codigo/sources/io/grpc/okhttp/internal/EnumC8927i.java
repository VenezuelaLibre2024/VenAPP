package io.grpc.okhttp.internal;

import java.io.IOException;

/* renamed from: io.grpc.okhttp.internal.i */
/* loaded from: classes3.dex */
public enum EnumC8927i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String protocol;

    EnumC8927i(String str) {
        this.protocol = str;
    }

    /* renamed from: b */
    public static EnumC8927i m26100b(String str) {
        EnumC8927i enumC8927i = HTTP_1_0;
        if (str.equals(enumC8927i.protocol)) {
            return enumC8927i;
        }
        EnumC8927i enumC8927i2 = HTTP_1_1;
        if (str.equals(enumC8927i2.protocol)) {
            return enumC8927i2;
        }
        EnumC8927i enumC8927i3 = HTTP_2;
        if (str.equals(enumC8927i3.protocol)) {
            return enumC8927i3;
        }
        EnumC8927i enumC8927i4 = SPDY_3;
        if (str.equals(enumC8927i4.protocol)) {
            return enumC8927i4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
