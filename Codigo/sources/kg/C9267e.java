package kg;

import java.util.List;

/* renamed from: kg.e */
/* loaded from: classes2.dex */
public final class C9267e {

    /* renamed from: a */
    private final byte[] f22490a;

    /* renamed from: b */
    private int f22491b;

    /* renamed from: c */
    private final String f22492c;

    /* renamed from: d */
    private final List<byte[]> f22493d;

    /* renamed from: e */
    private final String f22494e;

    /* renamed from: f */
    private Integer f22495f;

    /* renamed from: g */
    private Integer f22496g;

    /* renamed from: h */
    private Object f22497h;

    /* renamed from: i */
    private final int f22498i;

    /* renamed from: j */
    private final int f22499j;

    /* renamed from: k */
    private final int f22500k;

    public C9267e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }

    public C9267e(byte[] bArr, String str, List<byte[]> list, String str2, int i10) {
        this(bArr, str, list, str2, -1, -1, i10);
    }

    public C9267e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11, int i12) {
        this.f22490a = bArr;
        this.f22491b = bArr == null ? 0 : bArr.length * 8;
        this.f22492c = str;
        this.f22493d = list;
        this.f22494e = str2;
        this.f22498i = i11;
        this.f22499j = i10;
        this.f22500k = i12;
    }

    /* renamed from: a */
    public List<byte[]> m27625a() {
        return this.f22493d;
    }

    /* renamed from: b */
    public String m27626b() {
        return this.f22494e;
    }

    /* renamed from: c */
    public int m27627c() {
        return this.f22491b;
    }

    /* renamed from: d */
    public Object m27628d() {
        return this.f22497h;
    }

    /* renamed from: e */
    public byte[] m27629e() {
        return this.f22490a;
    }

    /* renamed from: f */
    public int m27630f() {
        return this.f22498i;
    }

    /* renamed from: g */
    public int m27631g() {
        return this.f22499j;
    }

    /* renamed from: h */
    public int m27632h() {
        return this.f22500k;
    }

    /* renamed from: i */
    public String m27633i() {
        return this.f22492c;
    }

    /* renamed from: j */
    public boolean m27634j() {
        return this.f22498i >= 0 && this.f22499j >= 0;
    }

    /* renamed from: k */
    public void m27635k(Integer num) {
        this.f22496g = num;
    }

    /* renamed from: l */
    public void m27636l(Integer num) {
        this.f22495f = num;
    }

    /* renamed from: m */
    public void m27637m(int i10) {
        this.f22491b = i10;
    }

    /* renamed from: n */
    public void m27638n(Object obj) {
        this.f22497h = obj;
    }
}
