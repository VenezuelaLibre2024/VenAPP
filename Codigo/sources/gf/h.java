package gf;

import android.net.Uri;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a */
    private final Uri f16249a;

    /* renamed from: b */
    private final Uri f16250b;

    /* renamed from: c */
    private final Uri f16251c;

    public h(Uri uri, id.a aVar) {
        Uri parse;
        this.f16251c = uri;
        if (aVar == null) {
            parse = hf.e.f16736k;
        } else {
            parse = Uri.parse("http://" + aVar.a() + ":" + aVar.b() + "/v0");
        }
        this.f16249a = parse;
        Uri.Builder appendEncodedPath = parse.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String a10 = d.a(uri.getPath());
        if (a10.length() > 0 && !"/".equals(a10)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(a10);
        }
        this.f16250b = appendEncodedPath.build();
    }

    public Uri a() {
        return this.f16251c;
    }

    public Uri b() {
        return this.f16249a;
    }

    public Uri c() {
        return this.f16250b;
    }
}
