package io.grpc.okhttp.internal;

import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class c {
    public static String a(String str, String str2) {
        try {
            return "Basic " + dm.e.u((str + ":" + str2).getBytes("ISO-8859-1")).b();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
