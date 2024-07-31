package gf;

import android.net.Uri;
import id.C7960a;
import p141hf.AbstractC7722e;

/* renamed from: gf.h */
/* loaded from: classes2.dex */
public class C7566h {

    /* renamed from: a */
    private final Uri f17886a;

    /* renamed from: b */
    private final Uri f17887b;

    /* renamed from: c */
    private final Uri f17888c;

    public C7566h(Uri uri, C7960a c7960a) {
        Uri parse;
        this.f17888c = uri;
        if (c7960a == null) {
            parse = AbstractC7722e.f18386k;
        } else {
            parse = Uri.parse("http://" + c7960a.m24453a() + ":" + c7960a.m24454b() + "/v0");
        }
        this.f17886a = parse;
        Uri.Builder appendEncodedPath = parse.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String m22961a = C7562d.m22961a(uri.getPath());
        if (m22961a.length() > 0 && !"/".equals(m22961a)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(m22961a);
        }
        this.f17887b = appendEncodedPath.build();
    }

    /* renamed from: a */
    public Uri m22966a() {
        return this.f17888c;
    }

    /* renamed from: b */
    public Uri m22967b() {
        return this.f17886a;
    }

    /* renamed from: c */
    public Uri m22968c() {
        return this.f17887b;
    }
}
