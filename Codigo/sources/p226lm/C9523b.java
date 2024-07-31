package p226lm;

import kotlin.jvm.internal.C9322n;

/* renamed from: lm.b */
/* loaded from: classes3.dex */
public final class C9523b {

    /* renamed from: a */
    private int f23134a;

    /* renamed from: b */
    private String f23135b;

    /* renamed from: c */
    private EnumC9522a f23136c;

    /* renamed from: d */
    private int f23137d;

    /* renamed from: e */
    private String f23138e;

    /* renamed from: f */
    private String f23139f;

    /* renamed from: g */
    private String f23140g;

    /* renamed from: h */
    private String f23141h;

    /* renamed from: i */
    private String f23142i;

    /* renamed from: j */
    private boolean f23143j;

    /* renamed from: k */
    private boolean f23144k;

    /* renamed from: l */
    private boolean f23145l;

    /* renamed from: m */
    private long f23146m;

    /* renamed from: n */
    private boolean f23147n;

    /* renamed from: o */
    private boolean f23148o;

    public C9523b(int i10, String taskId, EnumC9522a status, int i11, String url, String str, String savedDir, String headers, String mimeType, boolean z10, boolean z11, boolean z12, long j10, boolean z13, boolean z14) {
        C9322n.m27781e(taskId, "taskId");
        C9322n.m27781e(status, "status");
        C9322n.m27781e(url, "url");
        C9322n.m27781e(savedDir, "savedDir");
        C9322n.m27781e(headers, "headers");
        C9322n.m27781e(mimeType, "mimeType");
        this.f23134a = i10;
        this.f23135b = taskId;
        this.f23136c = status;
        this.f23137d = i11;
        this.f23138e = url;
        this.f23139f = str;
        this.f23140g = savedDir;
        this.f23141h = headers;
        this.f23142i = mimeType;
        this.f23143j = z10;
        this.f23144k = z11;
        this.f23145l = z12;
        this.f23146m = j10;
        this.f23147n = z13;
        this.f23148o = z14;
    }

    /* renamed from: a */
    public final boolean m28329a() {
        return this.f23148o;
    }

    /* renamed from: b */
    public final String m28330b() {
        return this.f23139f;
    }

    /* renamed from: c */
    public final String m28331c() {
        return this.f23141h;
    }

    /* renamed from: d */
    public final String m28332d() {
        return this.f23142i;
    }

    /* renamed from: e */
    public final boolean m28333e() {
        return this.f23145l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9523b)) {
            return false;
        }
        C9523b c9523b = (C9523b) obj;
        return this.f23134a == c9523b.f23134a && C9322n.m27777a(this.f23135b, c9523b.f23135b) && this.f23136c == c9523b.f23136c && this.f23137d == c9523b.f23137d && C9322n.m27777a(this.f23138e, c9523b.f23138e) && C9322n.m27777a(this.f23139f, c9523b.f23139f) && C9322n.m27777a(this.f23140g, c9523b.f23140g) && C9322n.m27777a(this.f23141h, c9523b.f23141h) && C9322n.m27777a(this.f23142i, c9523b.f23142i) && this.f23143j == c9523b.f23143j && this.f23144k == c9523b.f23144k && this.f23145l == c9523b.f23145l && this.f23146m == c9523b.f23146m && this.f23147n == c9523b.f23147n && this.f23148o == c9523b.f23148o;
    }

    /* renamed from: f */
    public final int m28334f() {
        return this.f23134a;
    }

    /* renamed from: g */
    public final int m28335g() {
        return this.f23137d;
    }

    /* renamed from: h */
    public final boolean m28336h() {
        return this.f23143j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f23134a) * 31) + this.f23135b.hashCode()) * 31) + this.f23136c.hashCode()) * 31) + Integer.hashCode(this.f23137d)) * 31) + this.f23138e.hashCode()) * 31;
        String str = this.f23139f;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f23140g.hashCode()) * 31) + this.f23141h.hashCode()) * 31) + this.f23142i.hashCode()) * 31;
        boolean z10 = this.f23143j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.f23144k;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f23145l;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int hashCode3 = (((i13 + i14) * 31) + Long.hashCode(this.f23146m)) * 31;
        boolean z13 = this.f23147n;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode3 + i15) * 31;
        boolean z14 = this.f23148o;
        return i16 + (z14 ? 1 : z14 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m28337i() {
        return this.f23147n;
    }

    /* renamed from: j */
    public final String m28338j() {
        return this.f23140g;
    }

    /* renamed from: k */
    public final boolean m28339k() {
        return this.f23144k;
    }

    /* renamed from: l */
    public final EnumC9522a m28340l() {
        return this.f23136c;
    }

    /* renamed from: m */
    public final String m28341m() {
        return this.f23135b;
    }

    /* renamed from: n */
    public final long m28342n() {
        return this.f23146m;
    }

    /* renamed from: o */
    public final String m28343o() {
        return this.f23138e;
    }

    public String toString() {
        return "DownloadTask(primaryId=" + this.f23134a + ", taskId=" + this.f23135b + ", status=" + this.f23136c + ", progress=" + this.f23137d + ", url=" + this.f23138e + ", filename=" + this.f23139f + ", savedDir=" + this.f23140g + ", headers=" + this.f23141h + ", mimeType=" + this.f23142i + ", resumable=" + this.f23143j + ", showNotification=" + this.f23144k + ", openFileFromNotification=" + this.f23145l + ", timeCreated=" + this.f23146m + ", saveInPublicStorage=" + this.f23147n + ", allowCellular=" + this.f23148o + ')';
    }
}
