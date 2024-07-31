package io.grpc.okhttp.internal;

import dm.C7061e;
import java.io.UnsupportedEncodingException;

/* renamed from: io.grpc.okhttp.internal.c */
/* loaded from: classes3.dex */
public final class C8921c {
    /* renamed from: a */
    public static String m26053a(String str, String str2) {
        try {
            return "Basic " + C7061e.m20754u((str + ":" + str2).getBytes("ISO-8859-1")).mo20762b();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
