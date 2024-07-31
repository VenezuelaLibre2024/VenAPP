package n3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class h implements h3.f {

    /* renamed from: b, reason: collision with root package name */
    private final i f21720b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f21721c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21722d;

    /* renamed from: e, reason: collision with root package name */
    private String f21723e;

    /* renamed from: f, reason: collision with root package name */
    private URL f21724f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f21725g;

    /* renamed from: h, reason: collision with root package name */
    private int f21726h;

    public h(String str) {
        this(str, i.f21728b);
    }

    public h(String str, i iVar) {
        this.f21721c = null;
        this.f21722d = c4.k.b(str);
        this.f21720b = (i) c4.k.d(iVar);
    }

    public h(URL url) {
        this(url, i.f21728b);
    }

    public h(URL url, i iVar) {
        this.f21721c = (URL) c4.k.d(url);
        this.f21722d = null;
        this.f21720b = (i) c4.k.d(iVar);
    }

    private byte[] d() {
        if (this.f21725g == null) {
            this.f21725g = c().getBytes(h3.f.f16369a);
        }
        return this.f21725g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f21723e)) {
            String str = this.f21722d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) c4.k.d(this.f21721c)).toString();
            }
            this.f21723e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f21723e;
    }

    private URL g() {
        if (this.f21724f == null) {
            this.f21724f = new URL(f());
        }
        return this.f21724f;
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f21722d;
        return str != null ? str : ((URL) c4.k.d(this.f21721c)).toString();
    }

    public Map<String, String> e() {
        return this.f21720b.a();
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c().equals(hVar.c()) && this.f21720b.equals(hVar.f21720b);
    }

    public URL h() {
        return g();
    }

    @Override // h3.f
    public int hashCode() {
        if (this.f21726h == 0) {
            int hashCode = c().hashCode();
            this.f21726h = hashCode;
            this.f21726h = (hashCode * 31) + this.f21720b.hashCode();
        }
        return this.f21726h;
    }

    public String toString() {
        return c();
    }
}
