package dg;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f14148a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14149b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14150c;

    /* renamed from: d, reason: collision with root package name */
    private s[] f14151d;

    /* renamed from: e, reason: collision with root package name */
    private final a f14152e;

    /* renamed from: f, reason: collision with root package name */
    private Map<r, Object> f14153f;

    /* renamed from: g, reason: collision with root package name */
    private final long f14154g;

    public q(String str, byte[] bArr, int i10, s[] sVarArr, a aVar, long j10) {
        this.f14148a = str;
        this.f14149b = bArr;
        this.f14150c = i10;
        this.f14151d = sVarArr;
        this.f14152e = aVar;
        this.f14153f = null;
        this.f14154g = j10;
    }

    public q(String str, byte[] bArr, s[] sVarArr, a aVar) {
        this(str, bArr, sVarArr, aVar, System.currentTimeMillis());
    }

    public q(String str, byte[] bArr, s[] sVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, sVarArr, aVar, j10);
    }

    public void a(s[] sVarArr) {
        s[] sVarArr2 = this.f14151d;
        if (sVarArr2 == null) {
            this.f14151d = sVarArr;
            return;
        }
        if (sVarArr == null || sVarArr.length <= 0) {
            return;
        }
        s[] sVarArr3 = new s[sVarArr2.length + sVarArr.length];
        System.arraycopy(sVarArr2, 0, sVarArr3, 0, sVarArr2.length);
        System.arraycopy(sVarArr, 0, sVarArr3, sVarArr2.length, sVarArr.length);
        this.f14151d = sVarArr3;
    }

    public a b() {
        return this.f14152e;
    }

    public byte[] c() {
        return this.f14149b;
    }

    public Map<r, Object> d() {
        return this.f14153f;
    }

    public s[] e() {
        return this.f14151d;
    }

    public String f() {
        return this.f14148a;
    }

    public void g(Map<r, Object> map) {
        if (map != null) {
            Map<r, Object> map2 = this.f14153f;
            if (map2 == null) {
                this.f14153f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(r rVar, Object obj) {
        if (this.f14153f == null) {
            this.f14153f = new EnumMap(r.class);
        }
        this.f14153f.put(rVar, obj);
    }

    public String toString() {
        return this.f14148a;
    }
}
