package kg;

import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f20668a;

    /* renamed from: b, reason: collision with root package name */
    private int f20669b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20670c;

    /* renamed from: d, reason: collision with root package name */
    private final List<byte[]> f20671d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20672e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f20673f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f20674g;

    /* renamed from: h, reason: collision with root package name */
    private Object f20675h;

    /* renamed from: i, reason: collision with root package name */
    private final int f20676i;

    /* renamed from: j, reason: collision with root package name */
    private final int f20677j;

    /* renamed from: k, reason: collision with root package name */
    private final int f20678k;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10) {
        this(bArr, str, list, str2, -1, -1, i10);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11, int i12) {
        this.f20668a = bArr;
        this.f20669b = bArr == null ? 0 : bArr.length * 8;
        this.f20670c = str;
        this.f20671d = list;
        this.f20672e = str2;
        this.f20676i = i11;
        this.f20677j = i10;
        this.f20678k = i12;
    }

    public List<byte[]> a() {
        return this.f20671d;
    }

    public String b() {
        return this.f20672e;
    }

    public int c() {
        return this.f20669b;
    }

    public Object d() {
        return this.f20675h;
    }

    public byte[] e() {
        return this.f20668a;
    }

    public int f() {
        return this.f20676i;
    }

    public int g() {
        return this.f20677j;
    }

    public int h() {
        return this.f20678k;
    }

    public String i() {
        return this.f20670c;
    }

    public boolean j() {
        return this.f20676i >= 0 && this.f20677j >= 0;
    }

    public void k(Integer num) {
        this.f20674g = num;
    }

    public void l(Integer num) {
        this.f20673f = num;
    }

    public void m(int i10) {
        this.f20669b = i10;
    }

    public void n(Object obj) {
        this.f20675h = obj;
    }
}
