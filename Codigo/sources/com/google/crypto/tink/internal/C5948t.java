package com.google.crypto.tink.internal;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import p441xb.C12413a;

/* renamed from: com.google.crypto.tink.internal.t */
/* loaded from: classes2.dex */
public final class C5948t {

    /* renamed from: a */
    public static final Charset f12548a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static Integer m15286a() {
        if (m15287b()) {
            return C5929a.m15194a();
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m15287b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    /* renamed from: c */
    public static int m15288c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i10;
    }

    /* renamed from: d */
    private static final byte m15289d(char c10) {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new C5947s("Not a printable ASCII character: " + c10);
    }

    /* renamed from: e */
    public static final C12413a m15290e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = m15289d(str.charAt(i10));
        }
        return C12413a.m40067a(bArr);
    }
}
