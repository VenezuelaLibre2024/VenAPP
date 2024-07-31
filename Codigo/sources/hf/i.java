package hf;

import android.net.Uri;

/* loaded from: classes2.dex */
public class i extends f {

    /* renamed from: m, reason: collision with root package name */
    private final Uri f16755m;

    public i(gf.h hVar, zb.g gVar, Uri uri) {
        super(hVar, gVar);
        this.f16755m = uri;
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", "query");
    }

    @Override // hf.e
    protected String e() {
        return "POST";
    }

    @Override // hf.e
    public Uri u() {
        return this.f16755m;
    }
}
