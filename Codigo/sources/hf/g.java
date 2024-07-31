package hf;

import android.net.Uri;

/* loaded from: classes2.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    private final Uri f16748m;

    /* renamed from: n, reason: collision with root package name */
    private final byte[] f16749n;

    /* renamed from: o, reason: collision with root package name */
    private final long f16750o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f16751p;

    /* renamed from: q, reason: collision with root package name */
    private final int f16752q;

    public g(gf.h hVar, zb.g gVar, Uri uri, byte[] bArr, long j10, int i10, boolean z10) {
        super(hVar, gVar);
        if (bArr == null && i10 != -1) {
            this.f16738a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j10 < 0) {
            this.f16738a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f16752q = i10;
        this.f16748m = uri;
        this.f16749n = i10 <= 0 ? null : bArr;
        this.f16750o = j10;
        this.f16751p = z10;
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", (!z10 || i10 <= 0) ? z10 ? "finalize" : "upload" : "upload, finalize");
        super.G("X-Goog-Upload-Offset", Long.toString(j10));
    }

    @Override // hf.e
    protected String e() {
        return "POST";
    }

    @Override // hf.e
    protected byte[] h() {
        return this.f16749n;
    }

    @Override // hf.e
    protected int i() {
        int i10 = this.f16752q;
        if (i10 > 0) {
            return i10;
        }
        return 0;
    }

    @Override // hf.e
    public Uri u() {
        return this.f16748m;
    }
}
