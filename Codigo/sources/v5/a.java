package v5;

import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import x5.e;
import x5.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f27912a;

    /* renamed from: b, reason: collision with root package name */
    private String f27913b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27914c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27915d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27916e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27917f;

    /* renamed from: g, reason: collision with root package name */
    private final int f27918g;

    /* renamed from: h, reason: collision with root package name */
    private final String f27919h;

    /* renamed from: i, reason: collision with root package name */
    private final long f27920i;

    /* renamed from: j, reason: collision with root package name */
    private final int f27921j;

    /* renamed from: k, reason: collision with root package name */
    private Double f27922k;

    /* renamed from: l, reason: collision with root package name */
    private Double f27923l;

    /* renamed from: m, reason: collision with root package name */
    private final String f27924m;

    /* renamed from: n, reason: collision with root package name */
    private final String f27925n;

    public a(long j10, String path, long j11, long j12, int i10, int i11, int i12, String displayName, long j13, int i13, Double d10, Double d11, String str, String str2) {
        n.e(path, "path");
        n.e(displayName, "displayName");
        this.f27912a = j10;
        this.f27913b = path;
        this.f27914c = j11;
        this.f27915d = j12;
        this.f27916e = i10;
        this.f27917f = i11;
        this.f27918g = i12;
        this.f27919h = displayName;
        this.f27920i = j13;
        this.f27921j = i13;
        this.f27922k = d10;
        this.f27923l = d11;
        this.f27924m = str;
        this.f27925n = str2;
    }

    public /* synthetic */ a(long j10, String str, long j11, long j12, int i10, int i11, int i12, String str2, long j13, int i13, Double d10, Double d11, String str3, String str4, int i14, g gVar) {
        this(j10, str, j11, j12, i10, i11, i12, str2, j13, i13, (i14 & RecognitionOptions.UPC_E) != 0 ? null : d10, (i14 & RecognitionOptions.PDF417) != 0 ? null : d11, (i14 & RecognitionOptions.AZTEC) != 0 ? null : str3, (i14 & 8192) != 0 ? null : str4);
    }

    public final long a() {
        return this.f27915d;
    }

    public final String b() {
        return this.f27919h;
    }

    public final long c() {
        return this.f27914c;
    }

    public final int d() {
        return this.f27917f;
    }

    public final long e() {
        return this.f27912a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27912a == aVar.f27912a && n.a(this.f27913b, aVar.f27913b) && this.f27914c == aVar.f27914c && this.f27915d == aVar.f27915d && this.f27916e == aVar.f27916e && this.f27917f == aVar.f27917f && this.f27918g == aVar.f27918g && n.a(this.f27919h, aVar.f27919h) && this.f27920i == aVar.f27920i && this.f27921j == aVar.f27921j && n.a(this.f27922k, aVar.f27922k) && n.a(this.f27923l, aVar.f27923l) && n.a(this.f27924m, aVar.f27924m) && n.a(this.f27925n, aVar.f27925n);
    }

    public final Double f() {
        return this.f27922k;
    }

    public final Double g() {
        return this.f27923l;
    }

    public final String h() {
        return this.f27925n;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Long.hashCode(this.f27912a) * 31) + this.f27913b.hashCode()) * 31) + Long.hashCode(this.f27914c)) * 31) + Long.hashCode(this.f27915d)) * 31) + Integer.hashCode(this.f27916e)) * 31) + Integer.hashCode(this.f27917f)) * 31) + Integer.hashCode(this.f27918g)) * 31) + this.f27919h.hashCode()) * 31) + Long.hashCode(this.f27920i)) * 31) + Integer.hashCode(this.f27921j)) * 31;
        Double d10 = this.f27922k;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f27923l;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.f27924m;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27925n;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final long i() {
        return this.f27920i;
    }

    public final int j() {
        return this.f27921j;
    }

    public final String k() {
        return this.f27913b;
    }

    public final String l() {
        return e.f30417a.f() ? this.f27924m : new File(this.f27913b).getParent();
    }

    public final int m() {
        return this.f27918g;
    }

    public final Uri n() {
        f fVar = f.f30425a;
        return fVar.c(this.f27912a, fVar.a(this.f27918g));
    }

    public final int o() {
        return this.f27916e;
    }

    public String toString() {
        return "AssetEntity(id=" + this.f27912a + ", path=" + this.f27913b + ", duration=" + this.f27914c + ", createDt=" + this.f27915d + ", width=" + this.f27916e + ", height=" + this.f27917f + ", type=" + this.f27918g + ", displayName=" + this.f27919h + ", modifiedDate=" + this.f27920i + ", orientation=" + this.f27921j + ", lat=" + this.f27922k + ", lng=" + this.f27923l + ", androidQRelativePath=" + this.f27924m + ", mimeType=" + this.f27925n + ')';
    }
}
