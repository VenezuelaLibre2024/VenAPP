package p141hf;

import android.net.Uri;
import gf.C7566h;
import p485zb.C12867g;

/* renamed from: hf.i */
/* loaded from: classes2.dex */
public class C7726i extends AbstractC7723f {

    /* renamed from: m */
    private final Uri f18405m;

    public C7726i(C7566h c7566h, C12867g c12867g, Uri uri) {
        super(c7566h, c12867g);
        this.f18405m = uri;
        super.m23553G("X-Goog-Upload-Protocol", "resumable");
        super.m23553G("X-Goog-Upload-Command", "query");
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: e */
    protected String mo23538e() {
        return "POST";
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: u */
    public Uri mo23540u() {
        return this.f18405m;
    }
}
