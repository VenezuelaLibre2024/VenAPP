package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f11334a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f11335b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f11336c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f11337d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f11338e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.i f11339f;

    /* loaded from: classes2.dex */
    public interface a extends i<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface b extends i<Double> {
    }

    /* loaded from: classes2.dex */
    public interface c {
        int a();
    }

    /* loaded from: classes2.dex */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* loaded from: classes2.dex */
    public interface e {
        boolean a(int i10);
    }

    /* loaded from: classes2.dex */
    public interface f extends i<Float> {
    }

    /* loaded from: classes2.dex */
    public interface g extends i<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface h extends i<Long> {
    }

    /* loaded from: classes2.dex */
    public interface i<E> extends List<E>, RandomAccess {
        i<E> a(int i10);

        void b();

        boolean g();
    }

    static {
        byte[] bArr = new byte[0];
        f11337d = bArr;
        f11338e = ByteBuffer.wrap(bArr);
        f11339f = com.google.crypto.tink.shaded.protobuf.i.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return s1.m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, Object obj2) {
        return ((r0) obj).a().Y0((r0) obj2).f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f11335b);
    }
}
