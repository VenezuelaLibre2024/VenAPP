package p395v5;

import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p435x5.C12290f;
import p435x5.InterfaceC12289e;

/* renamed from: v5.a */
/* loaded from: classes.dex */
public final class C11627a {

    /* renamed from: a */
    private final long f30236a;

    /* renamed from: b */
    private String f30237b;

    /* renamed from: c */
    private final long f30238c;

    /* renamed from: d */
    private final long f30239d;

    /* renamed from: e */
    private final int f30240e;

    /* renamed from: f */
    private final int f30241f;

    /* renamed from: g */
    private final int f30242g;

    /* renamed from: h */
    private final String f30243h;

    /* renamed from: i */
    private final long f30244i;

    /* renamed from: j */
    private final int f30245j;

    /* renamed from: k */
    private Double f30246k;

    /* renamed from: l */
    private Double f30247l;

    /* renamed from: m */
    private final String f30248m;

    /* renamed from: n */
    private final String f30249n;

    public C11627a(long j10, String path, long j11, long j12, int i10, int i11, int i12, String displayName, long j13, int i13, Double d10, Double d11, String str, String str2) {
        C9322n.m27781e(path, "path");
        C9322n.m27781e(displayName, "displayName");
        this.f30236a = j10;
        this.f30237b = path;
        this.f30238c = j11;
        this.f30239d = j12;
        this.f30240e = i10;
        this.f30241f = i11;
        this.f30242g = i12;
        this.f30243h = displayName;
        this.f30244i = j13;
        this.f30245j = i13;
        this.f30246k = d10;
        this.f30247l = d11;
        this.f30248m = str;
        this.f30249n = str2;
    }

    public /* synthetic */ C11627a(long j10, String str, long j11, long j12, int i10, int i11, int i12, String str2, long j13, int i13, Double d10, Double d11, String str3, String str4, int i14, C9315g c9315g) {
        this(j10, str, j11, j12, i10, i11, i12, str2, j13, i13, (i14 & RecognitionOptions.UPC_E) != 0 ? null : d10, (i14 & RecognitionOptions.PDF417) != 0 ? null : d11, (i14 & RecognitionOptions.AZTEC) != 0 ? null : str3, (i14 & 8192) != 0 ? null : str4);
    }

    /* renamed from: a */
    public final long m36428a() {
        return this.f30239d;
    }

    /* renamed from: b */
    public final String m36429b() {
        return this.f30243h;
    }

    /* renamed from: c */
    public final long m36430c() {
        return this.f30238c;
    }

    /* renamed from: d */
    public final int m36431d() {
        return this.f30241f;
    }

    /* renamed from: e */
    public final long m36432e() {
        return this.f30236a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11627a)) {
            return false;
        }
        C11627a c11627a = (C11627a) obj;
        return this.f30236a == c11627a.f30236a && C9322n.m27777a(this.f30237b, c11627a.f30237b) && this.f30238c == c11627a.f30238c && this.f30239d == c11627a.f30239d && this.f30240e == c11627a.f30240e && this.f30241f == c11627a.f30241f && this.f30242g == c11627a.f30242g && C9322n.m27777a(this.f30243h, c11627a.f30243h) && this.f30244i == c11627a.f30244i && this.f30245j == c11627a.f30245j && C9322n.m27777a(this.f30246k, c11627a.f30246k) && C9322n.m27777a(this.f30247l, c11627a.f30247l) && C9322n.m27777a(this.f30248m, c11627a.f30248m) && C9322n.m27777a(this.f30249n, c11627a.f30249n);
    }

    /* renamed from: f */
    public final Double m36433f() {
        return this.f30246k;
    }

    /* renamed from: g */
    public final Double m36434g() {
        return this.f30247l;
    }

    /* renamed from: h */
    public final String m36435h() {
        return this.f30249n;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Long.hashCode(this.f30236a) * 31) + this.f30237b.hashCode()) * 31) + Long.hashCode(this.f30238c)) * 31) + Long.hashCode(this.f30239d)) * 31) + Integer.hashCode(this.f30240e)) * 31) + Integer.hashCode(this.f30241f)) * 31) + Integer.hashCode(this.f30242g)) * 31) + this.f30243h.hashCode()) * 31) + Long.hashCode(this.f30244i)) * 31) + Integer.hashCode(this.f30245j)) * 31;
        Double d10 = this.f30246k;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f30247l;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.f30248m;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30249n;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: i */
    public final long m36436i() {
        return this.f30244i;
    }

    /* renamed from: j */
    public final int m36437j() {
        return this.f30245j;
    }

    /* renamed from: k */
    public final String m36438k() {
        return this.f30237b;
    }

    /* renamed from: l */
    public final String m36439l() {
        return InterfaceC12289e.f32929a.m39639f() ? this.f30248m : new File(this.f30237b).getParent();
    }

    /* renamed from: m */
    public final int m36440m() {
        return this.f30242g;
    }

    /* renamed from: n */
    public final Uri m36441n() {
        C12290f c12290f = C12290f.f32937a;
        return c12290f.m39681c(this.f30236a, c12290f.m39679a(this.f30242g));
    }

    /* renamed from: o */
    public final int m36442o() {
        return this.f30240e;
    }

    public String toString() {
        return "AssetEntity(id=" + this.f30236a + ", path=" + this.f30237b + ", duration=" + this.f30238c + ", createDt=" + this.f30239d + ", width=" + this.f30240e + ", height=" + this.f30241f + ", type=" + this.f30242g + ", displayName=" + this.f30243h + ", modifiedDate=" + this.f30244i + ", orientation=" + this.f30245j + ", lat=" + this.f30246k + ", lng=" + this.f30247l + ", androidQRelativePath=" + this.f30248m + ", mimeType=" + this.f30249n + ')';
    }
}
