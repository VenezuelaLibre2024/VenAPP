package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.z */
/* loaded from: classes2.dex */
public final class C6633z {

    /* renamed from: a */
    static final Charset f14672a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f14673b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f14674c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f14675d;

    /* renamed from: e */
    public static final ByteBuffer f14676e;

    /* renamed from: f */
    public static final AbstractC6583h f14677f;

    /* renamed from: com.google.protobuf.z$a */
    /* loaded from: classes2.dex */
    public interface a extends i<Boolean> {
    }

    /* renamed from: com.google.protobuf.z$b */
    /* loaded from: classes2.dex */
    public interface b extends i<Double> {
    }

    /* renamed from: com.google.protobuf.z$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        int mo19357a();
    }

    /* renamed from: com.google.protobuf.z$d */
    /* loaded from: classes2.dex */
    public interface d<T extends c> {
        /* renamed from: a */
        T mo19358a(int i10);
    }

    /* renamed from: com.google.protobuf.z$e */
    /* loaded from: classes2.dex */
    public interface e {
        /* renamed from: a */
        boolean mo19359a(int i10);
    }

    /* renamed from: com.google.protobuf.z$f */
    /* loaded from: classes2.dex */
    public interface f extends i<Float> {
    }

    /* renamed from: com.google.protobuf.z$g */
    /* loaded from: classes2.dex */
    public interface g extends i<Integer> {
        /* renamed from: F0 */
        void mo19337F0(int i10);

        @Override // com.google.protobuf.C6633z.i
        /* renamed from: a */
        i<Integer> mo18430a(int i10);

        int getInt(int i10);
    }

    /* renamed from: com.google.protobuf.z$h */
    /* loaded from: classes2.dex */
    public interface h extends i<Long> {
    }

    /* renamed from: com.google.protobuf.z$i */
    /* loaded from: classes2.dex */
    public interface i<E> extends List<E>, RandomAccess {
        /* renamed from: a */
        i<E> mo18430a(int i10);

        /* renamed from: b */
        void mo18411b();

        /* renamed from: g */
        boolean mo18413g();
    }

    static {
        byte[] bArr = new byte[0];
        f14675d = bArr;
        f14676e = ByteBuffer.wrap(bArr);
        f14677f = AbstractC6583h.m18553h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T m19347a(T t10) {
        t10.getClass();
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T m19348b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m19349c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m19350d(byte[] bArr) {
        return m19351e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m19351e(byte[] bArr, int i10, int i11) {
        int m19355i = m19355i(i11, bArr, i10, i11);
        if (m19355i == 0) {
            return 1;
        }
        return m19355i;
    }

    /* renamed from: f */
    public static int m19352f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: g */
    public static boolean m19353g(byte[] bArr) {
        return C6618s1.m19118m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Object m19354h(Object obj, Object obj2) {
        return ((InterfaceC6614r0) obj).mo19032a().mo18383a0((InterfaceC6614r0) obj2).mo19038f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m19355i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* renamed from: j */
    public static String m19356j(byte[] bArr) {
        return new String(bArr, f14673b);
    }
}
