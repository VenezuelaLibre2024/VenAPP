package s8;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.net.URLDecoder;
import t6.b3;
import t8.r0;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: e, reason: collision with root package name */
    private n f25261e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f25262f;

    /* renamed from: g, reason: collision with root package name */
    private int f25263g;

    /* renamed from: h, reason: collision with root package name */
    private int f25264h;

    public i() {
        super(false);
    }

    @Override // s8.j
    public void close() {
        if (this.f25262f != null) {
            this.f25262f = null;
            s();
        }
        this.f25261e = null;
    }

    @Override // s8.j
    public Uri getUri() {
        n nVar = this.f25261e;
        if (nVar != null) {
            return nVar.f25288a;
        }
        return null;
    }

    @Override // s8.j
    public long o(n nVar) {
        t(nVar);
        this.f25261e = nVar;
        Uri uri = nVar.f25288a;
        String scheme = uri.getScheme();
        t8.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] R0 = r0.R0(uri.getSchemeSpecificPart(), ",");
        if (R0.length != 2) {
            throw b3.b("Unexpected URI format: " + uri, null);
        }
        String str = R0[1];
        if (R0[0].contains(";base64")) {
            try {
                this.f25262f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw b3.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f25262f = r0.m0(URLDecoder.decode(str, eb.e.f14594a.name()));
        }
        long j10 = nVar.f25294g;
        byte[] bArr = this.f25262f;
        if (j10 > bArr.length) {
            this.f25262f = null;
            throw new k(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i10 = (int) j10;
        this.f25263g = i10;
        int length = bArr.length - i10;
        this.f25264h = length;
        long j11 = nVar.f25295h;
        if (j11 != -1) {
            this.f25264h = (int) Math.min(length, j11);
        }
        u(nVar);
        long j12 = nVar.f25295h;
        return j12 != -1 ? j12 : this.f25264h;
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f25264h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(r0.j(this.f25262f), this.f25263g, bArr, i10, min);
        this.f25263g += min;
        this.f25264h -= min;
        r(min);
        return min;
    }
}
