package lm;

import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f21281a;

    /* renamed from: b, reason: collision with root package name */
    private String f21282b;

    /* renamed from: c, reason: collision with root package name */
    private a f21283c;

    /* renamed from: d, reason: collision with root package name */
    private int f21284d;

    /* renamed from: e, reason: collision with root package name */
    private String f21285e;

    /* renamed from: f, reason: collision with root package name */
    private String f21286f;

    /* renamed from: g, reason: collision with root package name */
    private String f21287g;

    /* renamed from: h, reason: collision with root package name */
    private String f21288h;

    /* renamed from: i, reason: collision with root package name */
    private String f21289i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21290j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21291k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21292l;

    /* renamed from: m, reason: collision with root package name */
    private long f21293m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21294n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21295o;

    public b(int i10, String taskId, a status, int i11, String url, String str, String savedDir, String headers, String mimeType, boolean z10, boolean z11, boolean z12, long j10, boolean z13, boolean z14) {
        n.e(taskId, "taskId");
        n.e(status, "status");
        n.e(url, "url");
        n.e(savedDir, "savedDir");
        n.e(headers, "headers");
        n.e(mimeType, "mimeType");
        this.f21281a = i10;
        this.f21282b = taskId;
        this.f21283c = status;
        this.f21284d = i11;
        this.f21285e = url;
        this.f21286f = str;
        this.f21287g = savedDir;
        this.f21288h = headers;
        this.f21289i = mimeType;
        this.f21290j = z10;
        this.f21291k = z11;
        this.f21292l = z12;
        this.f21293m = j10;
        this.f21294n = z13;
        this.f21295o = z14;
    }

    public final boolean a() {
        return this.f21295o;
    }

    public final String b() {
        return this.f21286f;
    }

    public final String c() {
        return this.f21288h;
    }

    public final String d() {
        return this.f21289i;
    }

    public final boolean e() {
        return this.f21292l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21281a == bVar.f21281a && n.a(this.f21282b, bVar.f21282b) && this.f21283c == bVar.f21283c && this.f21284d == bVar.f21284d && n.a(this.f21285e, bVar.f21285e) && n.a(this.f21286f, bVar.f21286f) && n.a(this.f21287g, bVar.f21287g) && n.a(this.f21288h, bVar.f21288h) && n.a(this.f21289i, bVar.f21289i) && this.f21290j == bVar.f21290j && this.f21291k == bVar.f21291k && this.f21292l == bVar.f21292l && this.f21293m == bVar.f21293m && this.f21294n == bVar.f21294n && this.f21295o == bVar.f21295o;
    }

    public final int f() {
        return this.f21281a;
    }

    public final int g() {
        return this.f21284d;
    }

    public final boolean h() {
        return this.f21290j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f21281a) * 31) + this.f21282b.hashCode()) * 31) + this.f21283c.hashCode()) * 31) + Integer.hashCode(this.f21284d)) * 31) + this.f21285e.hashCode()) * 31;
        String str = this.f21286f;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f21287g.hashCode()) * 31) + this.f21288h.hashCode()) * 31) + this.f21289i.hashCode()) * 31;
        boolean z10 = this.f21290j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.f21291k;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f21292l;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int hashCode3 = (((i13 + i14) * 31) + Long.hashCode(this.f21293m)) * 31;
        boolean z13 = this.f21294n;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode3 + i15) * 31;
        boolean z14 = this.f21295o;
        return i16 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final boolean i() {
        return this.f21294n;
    }

    public final String j() {
        return this.f21287g;
    }

    public final boolean k() {
        return this.f21291k;
    }

    public final a l() {
        return this.f21283c;
    }

    public final String m() {
        return this.f21282b;
    }

    public final long n() {
        return this.f21293m;
    }

    public final String o() {
        return this.f21285e;
    }

    public String toString() {
        return "DownloadTask(primaryId=" + this.f21281a + ", taskId=" + this.f21282b + ", status=" + this.f21283c + ", progress=" + this.f21284d + ", url=" + this.f21285e + ", filename=" + this.f21286f + ", savedDir=" + this.f21287g + ", headers=" + this.f21288h + ", mimeType=" + this.f21289i + ", resumable=" + this.f21290j + ", showNotification=" + this.f21291k + ", openFileFromNotification=" + this.f21292l + ", timeCreated=" + this.f21293m + ", saveInPublicStorage=" + this.f21294n + ", allowCellular=" + this.f21295o + ')';
    }
}
