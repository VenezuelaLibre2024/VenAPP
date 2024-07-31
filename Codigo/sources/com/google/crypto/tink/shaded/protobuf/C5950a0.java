package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a0 */
/* loaded from: classes2.dex */
public final class C5950a0 {

    /* renamed from: a */
    static final Charset f12549a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f12550b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f12551c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f12552d;

    /* renamed from: e */
    public static final ByteBuffer f12553e;

    /* renamed from: f */
    public static final AbstractC5973i f12554f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$a */
    /* loaded from: classes2.dex */
    public interface a extends i<Boolean> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$b */
    /* loaded from: classes2.dex */
    public interface b extends i<Double> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        int mo15312a();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$d */
    /* loaded from: classes2.dex */
    public interface d<T extends c> {
        /* renamed from: a */
        T mo15313a(int i10);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$e */
    /* loaded from: classes2.dex */
    public interface e {
        /* renamed from: a */
        boolean m15314a(int i10);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$f */
    /* loaded from: classes2.dex */
    public interface f extends i<Float> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$g */
    /* loaded from: classes2.dex */
    public interface g extends i<Integer> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$h */
    /* loaded from: classes2.dex */
    public interface h extends i<Long> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$i */
    /* loaded from: classes2.dex */
    public interface i<E> extends List<E>, RandomAccess {
        /* renamed from: a */
        i<E> mo15315a(int i10);

        /* renamed from: b */
        void mo15316b();

        /* renamed from: g */
        boolean mo15317g();
    }

    static {
        byte[] bArr = new byte[0];
        f12552d = bArr;
        f12553e = ByteBuffer.wrap(bArr);
        f12554f = AbstractC5973i.m15526h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T m15302a(T t10) {
        t10.getClass();
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T m15303b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m15304c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m15305d(byte[] bArr) {
        return m15306e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m15306e(byte[] bArr, int i10, int i11) {
        int m15310i = m15310i(i11, bArr, i10, i11);
        if (m15310i == 0) {
            return 1;
        }
        return m15310i;
    }

    /* renamed from: f */
    public static int m15307f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: g */
    public static boolean m15308g(byte[] bArr) {
        return C6005s1.m16056m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Object m15309h(Object obj, Object obj2) {
        return ((InterfaceC6001r0) obj).mo15967a().mo15299Y0((InterfaceC6001r0) obj2).mo15973f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m15310i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* renamed from: j */
    public static String m15311j(byte[] bArr) {
        return new String(bArr, f12550b);
    }
}
