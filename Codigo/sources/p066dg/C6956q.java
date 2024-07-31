package p066dg;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: dg.q */
/* loaded from: classes2.dex */
public final class C6956q {

    /* renamed from: a */
    private final String f15502a;

    /* renamed from: b */
    private final byte[] f15503b;

    /* renamed from: c */
    private final int f15504c;

    /* renamed from: d */
    private C6958s[] f15505d;

    /* renamed from: e */
    private final EnumC6940a f15506e;

    /* renamed from: f */
    private Map<EnumC6957r, Object> f15507f;

    /* renamed from: g */
    private final long f15508g;

    public C6956q(String str, byte[] bArr, int i10, C6958s[] c6958sArr, EnumC6940a enumC6940a, long j10) {
        this.f15502a = str;
        this.f15503b = bArr;
        this.f15504c = i10;
        this.f15505d = c6958sArr;
        this.f15506e = enumC6940a;
        this.f15507f = null;
        this.f15508g = j10;
    }

    public C6956q(String str, byte[] bArr, C6958s[] c6958sArr, EnumC6940a enumC6940a) {
        this(str, bArr, c6958sArr, enumC6940a, System.currentTimeMillis());
    }

    public C6956q(String str, byte[] bArr, C6958s[] c6958sArr, EnumC6940a enumC6940a, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, c6958sArr, enumC6940a, j10);
    }

    /* renamed from: a */
    public void m20108a(C6958s[] c6958sArr) {
        C6958s[] c6958sArr2 = this.f15505d;
        if (c6958sArr2 == null) {
            this.f15505d = c6958sArr;
            return;
        }
        if (c6958sArr == null || c6958sArr.length <= 0) {
            return;
        }
        C6958s[] c6958sArr3 = new C6958s[c6958sArr2.length + c6958sArr.length];
        System.arraycopy(c6958sArr2, 0, c6958sArr3, 0, c6958sArr2.length);
        System.arraycopy(c6958sArr, 0, c6958sArr3, c6958sArr2.length, c6958sArr.length);
        this.f15505d = c6958sArr3;
    }

    /* renamed from: b */
    public EnumC6940a m20109b() {
        return this.f15506e;
    }

    /* renamed from: c */
    public byte[] m20110c() {
        return this.f15503b;
    }

    /* renamed from: d */
    public Map<EnumC6957r, Object> m20111d() {
        return this.f15507f;
    }

    /* renamed from: e */
    public C6958s[] m20112e() {
        return this.f15505d;
    }

    /* renamed from: f */
    public String m20113f() {
        return this.f15502a;
    }

    /* renamed from: g */
    public void m20114g(Map<EnumC6957r, Object> map) {
        if (map != null) {
            Map<EnumC6957r, Object> map2 = this.f15507f;
            if (map2 == null) {
                this.f15507f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void m20115h(EnumC6957r enumC6957r, Object obj) {
        if (this.f15507f == null) {
            this.f15507f = new EnumMap(EnumC6957r.class);
        }
        this.f15507f.put(enumC6957r, obj);
    }

    public String toString() {
        return this.f15502a;
    }
}
