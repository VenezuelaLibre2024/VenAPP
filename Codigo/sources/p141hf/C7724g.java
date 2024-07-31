package p141hf;

import android.net.Uri;
import gf.C7566h;
import p485zb.C12867g;

/* renamed from: hf.g */
/* loaded from: classes2.dex */
public class C7724g extends AbstractC7723f {

    /* renamed from: m */
    private final Uri f18398m;

    /* renamed from: n */
    private final byte[] f18399n;

    /* renamed from: o */
    private final long f18400o;

    /* renamed from: p */
    private final boolean f18401p;

    /* renamed from: q */
    private final int f18402q;

    public C7724g(C7566h c7566h, C12867g c12867g, Uri uri, byte[] bArr, long j10, int i10, boolean z10) {
        super(c7566h, c12867g);
        if (bArr == null && i10 != -1) {
            this.f18388a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j10 < 0) {
            this.f18388a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f18402q = i10;
        this.f18398m = uri;
        this.f18399n = i10 <= 0 ? null : bArr;
        this.f18400o = j10;
        this.f18401p = z10;
        super.m23553G("X-Goog-Upload-Protocol", "resumable");
        super.m23553G("X-Goog-Upload-Command", (!z10 || i10 <= 0) ? z10 ? "finalize" : "upload" : "upload, finalize");
        super.m23553G("X-Goog-Upload-Offset", Long.toString(j10));
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: e */
    protected String mo23538e() {
        return "POST";
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: h */
    protected byte[] mo23557h() {
        return this.f18399n;
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: i */
    protected int mo23558i() {
        int i10 = this.f18402q;
        if (i10 > 0) {
            return i10;
        }
        return 0;
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: u */
    public Uri mo23540u() {
        return this.f18398m;
    }
}
