package hf;

import android.net.Uri;

/* loaded from: classes2.dex */
public class h extends f {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f16753n = false;

    /* renamed from: m, reason: collision with root package name */
    private final Uri f16754m;

    public h(gf.h hVar, zb.g gVar, Uri uri) {
        super(hVar, gVar);
        f16753n = true;
        this.f16754m = uri;
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", "cancel");
    }

    @Override // hf.e
    protected String e() {
        return "POST";
    }

    @Override // hf.e
    public Uri u() {
        return this.f16754m;
    }
}
