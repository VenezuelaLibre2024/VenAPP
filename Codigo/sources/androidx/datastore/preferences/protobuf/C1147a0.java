package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.a0 */
/* loaded from: classes.dex */
public final class C1147a0 {

    /* renamed from: a */
    static final Charset f4789a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f4790b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f4791c;

    /* renamed from: d */
    public static final ByteBuffer f4792d;

    /* renamed from: e */
    public static final AbstractC1170i f4793e;

    /* renamed from: androidx.datastore.preferences.protobuf.a0$a */
    /* loaded from: classes.dex */
    public interface a extends i<Boolean> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a0$b */
    /* loaded from: classes.dex */
    public interface b extends i<Double> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int m5653a();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a0$d */
    /* loaded from: classes.dex */
    public interface d<T extends c> {
        /* renamed from: a */
        T m5654a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a0$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        boolean m5655a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a0$f */
    /* loaded from: classes.dex */
    public interface f extends i<Float> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a0$g */
    /* loaded from: classes.dex */
    public interface g extends i<Integer> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a0$h */
    /* loaded from: classes.dex */
    public interface h extends i<Long> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.a0$i */
    /* loaded from: classes.dex */
    public interface i<E> extends List<E>, RandomAccess {
        /* renamed from: a */
        i<E> mo5656a(int i10);

        /* renamed from: b */
        void mo5657b();

        /* renamed from: g */
        boolean mo5658g();
    }

    static {
        byte[] bArr = new byte[0];
        f4791c = bArr;
        f4792d = ByteBuffer.wrap(bArr);
        f4793e = AbstractC1170i.m5846h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T m5643a(T t10) {
        t10.getClass();
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T m5644b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m5645c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m5646d(byte[] bArr) {
        return m5647e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m5647e(byte[] bArr, int i10, int i11) {
        int m5651i = m5651i(i11, bArr, i10, i11);
        if (m5651i == 0) {
            return 1;
        }
        return m5651i;
    }

    /* renamed from: f */
    public static int m5648f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: g */
    public static boolean m5649g(byte[] bArr) {
        return C1202s1.m6391m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Object m5650h(Object obj, Object obj2) {
        return ((InterfaceC1198r0) obj).mo6308a().mo5642y((InterfaceC1198r0) obj2).mo6313f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m5651i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* renamed from: j */
    public static String m5652j(byte[] bArr) {
        return new String(bArr, f4789a);
    }
}
