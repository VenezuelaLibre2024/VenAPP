package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f3816a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3817b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3818c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f3819d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3820e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f3821f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f3816a = (String) androidx.core.util.h.k(str);
        this.f3817b = (String) androidx.core.util.h.k(str2);
        this.f3818c = (String) androidx.core.util.h.k(str3);
        this.f3819d = (List) androidx.core.util.h.k(list);
        this.f3821f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f3819d;
    }

    public int c() {
        return this.f3820e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f3821f;
    }

    public String e() {
        return this.f3816a;
    }

    public String f() {
        return this.f3817b;
    }

    public String g() {
        return this.f3818c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f3816a + ", mProviderPackage: " + this.f3817b + ", mQuery: " + this.f3818c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f3819d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f3819d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f3820e);
        return sb2.toString();
    }
}
