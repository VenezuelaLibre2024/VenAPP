package p351s8;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.net.URLDecoder;
import p082eb.C7149e;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: s8.i */
/* loaded from: classes.dex */
public final class C10825i extends AbstractC10819f {

    /* renamed from: e */
    private C10835n f27380e;

    /* renamed from: f */
    private byte[] f27381f;

    /* renamed from: g */
    private int f27382g;

    /* renamed from: h */
    private int f27383h;

    public C10825i() {
        super(false);
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        if (this.f27381f != null) {
            this.f27381f = null;
            m32995s();
        }
        this.f27380e = null;
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        C10835n c10835n = this.f27380e;
        if (c10835n != null) {
            return c10835n.f27407a;
        }
        return null;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        m32996t(c10835n);
        this.f27380e = c10835n;
        Uri uri = c10835n.f27407a;
        String scheme = uri.getScheme();
        C11137a.m34600b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] m34891R0 = C11172r0.m34891R0(uri.getSchemeSpecificPart(), ",");
        if (m34891R0.length != 2) {
            throw C11005b3.m33716b("Unexpected URI format: " + uri, null);
        }
        String str = m34891R0[1];
        if (m34891R0[0].contains(";base64")) {
            try {
                this.f27381f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw C11005b3.m33716b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f27381f = C11172r0.m34935m0(URLDecoder.decode(str, C7149e.f16017a.name()));
        }
        long j10 = c10835n.f27413g;
        byte[] bArr = this.f27381f;
        if (j10 > bArr.length) {
            this.f27381f = null;
            throw new C10829k(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i10 = (int) j10;
        this.f27382g = i10;
        int length = bArr.length - i10;
        this.f27383h = length;
        long j11 = c10835n.f27414h;
        if (j11 != -1) {
            this.f27383h = (int) Math.min(length, j11);
        }
        m32997u(c10835n);
        long j12 = c10835n.f27414h;
        return j12 != -1 ? j12 : this.f27383h;
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f27383h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(C11172r0.m34928j(this.f27381f), this.f27382g, bArr, i10, min);
        this.f27382g += min;
        this.f27383h -= min;
        m32994r(min);
        return min;
    }
}
