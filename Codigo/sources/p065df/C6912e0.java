package p065df;

import kotlin.jvm.internal.C9322n;

/* renamed from: df.e0 */
/* loaded from: classes2.dex */
public final class C6912e0 {

    /* renamed from: a */
    private final String f15397a;

    /* renamed from: b */
    private final String f15398b;

    /* renamed from: c */
    private final int f15399c;

    /* renamed from: d */
    private final long f15400d;

    /* renamed from: e */
    private final C6911e f15401e;

    /* renamed from: f */
    private final String f15402f;

    public C6912e0(String sessionId, String firstSessionId, int i10, long j10, C6911e dataCollectionStatus, String firebaseInstallationId) {
        C9322n.m27781e(sessionId, "sessionId");
        C9322n.m27781e(firstSessionId, "firstSessionId");
        C9322n.m27781e(dataCollectionStatus, "dataCollectionStatus");
        C9322n.m27781e(firebaseInstallationId, "firebaseInstallationId");
        this.f15397a = sessionId;
        this.f15398b = firstSessionId;
        this.f15399c = i10;
        this.f15400d = j10;
        this.f15401e = dataCollectionStatus;
        this.f15402f = firebaseInstallationId;
    }

    /* renamed from: a */
    public final C6911e m20006a() {
        return this.f15401e;
    }

    /* renamed from: b */
    public final long m20007b() {
        return this.f15400d;
    }

    /* renamed from: c */
    public final String m20008c() {
        return this.f15402f;
    }

    /* renamed from: d */
    public final String m20009d() {
        return this.f15398b;
    }

    /* renamed from: e */
    public final String m20010e() {
        return this.f15397a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6912e0)) {
            return false;
        }
        C6912e0 c6912e0 = (C6912e0) obj;
        return C9322n.m27777a(this.f15397a, c6912e0.f15397a) && C9322n.m27777a(this.f15398b, c6912e0.f15398b) && this.f15399c == c6912e0.f15399c && this.f15400d == c6912e0.f15400d && C9322n.m27777a(this.f15401e, c6912e0.f15401e) && C9322n.m27777a(this.f15402f, c6912e0.f15402f);
    }

    /* renamed from: f */
    public final int m20011f() {
        return this.f15399c;
    }

    public int hashCode() {
        return (((((((((this.f15397a.hashCode() * 31) + this.f15398b.hashCode()) * 31) + Integer.hashCode(this.f15399c)) * 31) + Long.hashCode(this.f15400d)) * 31) + this.f15401e.hashCode()) * 31) + this.f15402f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f15397a + ", firstSessionId=" + this.f15398b + ", sessionIndex=" + this.f15399c + ", eventTimestampUs=" + this.f15400d + ", dataCollectionStatus=" + this.f15401e + ", firebaseInstallationId=" + this.f15402f + ')';
    }
}
