package p436x6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p376u6.C11391m3;
import p414w6.InterfaceC12077b;
import p436x6.C12318m;

/* renamed from: x6.b0 */
/* loaded from: classes.dex */
public interface InterfaceC12297b0 {

    /* renamed from: x6.b0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final byte[] f32945a;

        /* renamed from: b */
        private final String f32946b;

        /* renamed from: c */
        private final int f32947c;

        public a(byte[] bArr, String str, int i10) {
            this.f32945a = bArr;
            this.f32946b = str;
            this.f32947c = i10;
        }

        /* renamed from: a */
        public byte[] m39719a() {
            return this.f32945a;
        }

        /* renamed from: b */
        public String m39720b() {
            return this.f32946b;
        }
    }

    /* renamed from: x6.b0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo39721a(InterfaceC12297b0 interfaceC12297b0, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* renamed from: x6.b0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC12297b0 mo39722a(UUID uuid);
    }

    /* renamed from: x6.b0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final byte[] f32948a;

        /* renamed from: b */
        private final String f32949b;

        public d(byte[] bArr, String str) {
            this.f32948a = bArr;
            this.f32949b = str;
        }

        /* renamed from: a */
        public byte[] m39723a() {
            return this.f32948a;
        }

        /* renamed from: b */
        public String m39724b() {
            return this.f32949b;
        }
    }

    /* renamed from: a */
    Map<String, String> mo39706a(byte[] bArr);

    /* renamed from: b */
    d mo39707b();

    /* renamed from: c */
    byte[] mo39708c();

    /* renamed from: d */
    void mo39709d(byte[] bArr, byte[] bArr2);

    /* renamed from: e */
    void mo39710e(byte[] bArr);

    /* renamed from: f */
    int mo39711f();

    /* renamed from: g */
    default void mo39712g(byte[] bArr, C11391m3 c11391m3) {
    }

    /* renamed from: h */
    void mo39713h(b bVar);

    /* renamed from: i */
    InterfaceC12077b mo39714i(byte[] bArr);

    /* renamed from: j */
    boolean mo39715j(byte[] bArr, String str);

    /* renamed from: k */
    void mo39716k(byte[] bArr);

    /* renamed from: l */
    byte[] mo39717l(byte[] bArr, byte[] bArr2);

    /* renamed from: m */
    a mo39718m(byte[] bArr, List<C12318m.b> list, int i10, HashMap<String, String> hashMap);

    void release();
}
