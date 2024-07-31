package p246n3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p036c4.C1870k;
import p129h3.InterfaceC7622f;

/* renamed from: n3.h */
/* loaded from: classes.dex */
public class C9642h implements InterfaceC7622f {

    /* renamed from: b */
    private final InterfaceC9643i f23653b;

    /* renamed from: c */
    private final URL f23654c;

    /* renamed from: d */
    private final String f23655d;

    /* renamed from: e */
    private String f23656e;

    /* renamed from: f */
    private URL f23657f;

    /* renamed from: g */
    private volatile byte[] f23658g;

    /* renamed from: h */
    private int f23659h;

    public C9642h(String str) {
        this(str, InterfaceC9643i.f23661b);
    }

    public C9642h(String str, InterfaceC9643i interfaceC9643i) {
        this.f23654c = null;
        this.f23655d = C1870k.m9948b(str);
        this.f23653b = (InterfaceC9643i) C1870k.m9950d(interfaceC9643i);
    }

    public C9642h(URL url) {
        this(url, InterfaceC9643i.f23661b);
    }

    public C9642h(URL url, InterfaceC9643i interfaceC9643i) {
        this.f23654c = (URL) C1870k.m9950d(url);
        this.f23655d = null;
        this.f23653b = (InterfaceC9643i) C1870k.m9950d(interfaceC9643i);
    }

    /* renamed from: d */
    private byte[] m28889d() {
        if (this.f23658g == null) {
            this.f23658g = m28892c().getBytes(InterfaceC7622f.f18006a);
        }
        return this.f23658g;
    }

    /* renamed from: f */
    private String m28890f() {
        if (TextUtils.isEmpty(this.f23656e)) {
            String str = this.f23655d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C1870k.m9950d(this.f23654c)).toString();
            }
            this.f23656e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f23656e;
    }

    /* renamed from: g */
    private URL m28891g() {
        if (this.f23657f == null) {
            this.f23657f = new URL(m28890f());
        }
        return this.f23657f;
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        messageDigest.update(m28889d());
    }

    /* renamed from: c */
    public String m28892c() {
        String str = this.f23655d;
        return str != null ? str : ((URL) C1870k.m9950d(this.f23654c)).toString();
    }

    /* renamed from: e */
    public Map<String, String> m28893e() {
        return this.f23653b.mo28895a();
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (!(obj instanceof C9642h)) {
            return false;
        }
        C9642h c9642h = (C9642h) obj;
        return m28892c().equals(c9642h.m28892c()) && this.f23653b.equals(c9642h.f23653b);
    }

    /* renamed from: h */
    public URL m28894h() {
        return m28891g();
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        if (this.f23659h == 0) {
            int hashCode = m28892c().hashCode();
            this.f23659h = hashCode;
            this.f23659h = (hashCode * 31) + this.f23653b.hashCode();
        }
        return this.f23659h;
    }

    public String toString() {
        return m28892c();
    }
}
