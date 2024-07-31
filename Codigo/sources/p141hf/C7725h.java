package p141hf;

import android.net.Uri;
import gf.C7566h;
import p485zb.C12867g;

/* renamed from: hf.h */
/* loaded from: classes2.dex */
public class C7725h extends AbstractC7723f {

    /* renamed from: n */
    public static boolean f18403n = false;

    /* renamed from: m */
    private final Uri f18404m;

    public C7725h(C7566h c7566h, C12867g c12867g, Uri uri) {
        super(c7566h, c12867g);
        f18403n = true;
        this.f18404m = uri;
        super.m23553G("X-Goog-Upload-Protocol", "resumable");
        super.m23553G("X-Goog-Upload-Command", "cancel");
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: e */
    protected String mo23538e() {
        return "POST";
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: u */
    public Uri mo23540u() {
        return this.f18404m;
    }
}
