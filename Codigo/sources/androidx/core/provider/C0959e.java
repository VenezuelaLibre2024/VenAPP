package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C0984h;
import java.util.List;

/* renamed from: androidx.core.provider.e */
/* loaded from: classes.dex */
public final class C0959e {

    /* renamed from: a */
    private final String f4488a;

    /* renamed from: b */
    private final String f4489b;

    /* renamed from: c */
    private final String f4490c;

    /* renamed from: d */
    private final List<List<byte[]>> f4491d;

    /* renamed from: e */
    private final int f4492e = 0;

    /* renamed from: f */
    private final String f4493f;

    public C0959e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f4488a = (String) C0984h.m4833k(str);
        this.f4489b = (String) C0984h.m4833k(str2);
        this.f4490c = (String) C0984h.m4833k(str3);
        this.f4491d = (List) C0984h.m4833k(list);
        this.f4493f = m4752a(str, str2, str3);
    }

    /* renamed from: a */
    private String m4752a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m4753b() {
        return this.f4491d;
    }

    /* renamed from: c */
    public int m4754c() {
        return this.f4492e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m4755d() {
        return this.f4493f;
    }

    /* renamed from: e */
    public String m4756e() {
        return this.f4488a;
    }

    /* renamed from: f */
    public String m4757f() {
        return this.f4489b;
    }

    /* renamed from: g */
    public String m4758g() {
        return this.f4490c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f4488a + ", mProviderPackage: " + this.f4489b + ", mQuery: " + this.f4490c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f4491d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f4491d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f4492e);
        return sb2.toString();
    }
}
