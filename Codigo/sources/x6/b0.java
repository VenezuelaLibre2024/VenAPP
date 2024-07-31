package x6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import u6.m3;
import x6.m;

/* loaded from: classes.dex */
public interface b0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f30433a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30434b;

        /* renamed from: c, reason: collision with root package name */
        private final int f30435c;

        public a(byte[] bArr, String str, int i10) {
            this.f30433a = bArr;
            this.f30434b = str;
            this.f30435c = i10;
        }

        public byte[] a() {
            return this.f30433a;
        }

        public String b() {
            return this.f30434b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(b0 b0Var, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* loaded from: classes.dex */
    public interface c {
        b0 a(UUID uuid);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f30436a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30437b;

        public d(byte[] bArr, String str) {
            this.f30436a = bArr;
            this.f30437b = str;
        }

        public byte[] a() {
            return this.f30436a;
        }

        public String b() {
            return this.f30437b;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr);

    int f();

    default void g(byte[] bArr, m3 m3Var) {
    }

    void h(b bVar);

    w6.b i(byte[] bArr);

    boolean j(byte[] bArr, String str);

    void k(byte[] bArr);

    byte[] l(byte[] bArr, byte[] bArr2);

    a m(byte[] bArr, List<m.b> list, int i10, HashMap<String, String> hashMap);

    void release();
}
