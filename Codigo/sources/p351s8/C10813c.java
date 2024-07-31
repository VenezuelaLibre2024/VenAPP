package p351s8;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: s8.c */
/* loaded from: classes.dex */
public final class C10813c extends AbstractC10819f {

    /* renamed from: e */
    private final AssetManager f27312e;

    /* renamed from: f */
    private Uri f27313f;

    /* renamed from: g */
    private InputStream f27314g;

    /* renamed from: h */
    private long f27315h;

    /* renamed from: i */
    private boolean f27316i;

    /* renamed from: s8.c$a */
    /* loaded from: classes.dex */
    public static final class a extends C10829k {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C10813c(Context context) {
        super(false);
        this.f27312e = context.getAssets();
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        this.f27313f = null;
        try {
            try {
                InputStream inputStream = this.f27314g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f27314g = null;
            if (this.f27316i) {
                this.f27316i = false;
                m32995s();
            }
        }
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return this.f27313f;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        try {
            Uri uri = c10835n.f27407a;
            this.f27313f = uri;
            String str = (String) C11137a.m34603e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            m32996t(c10835n);
            InputStream open = this.f27312e.open(str, 1);
            this.f27314g = open;
            if (open.skip(c10835n.f27413g) < c10835n.f27413g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j10 = c10835n.f27414h;
            if (j10 != -1) {
                this.f27315h = j10;
            } else {
                long available = this.f27314g.available();
                this.f27315h = available;
                if (available == 2147483647L) {
                    this.f27315h = -1L;
                }
            }
            this.f27316i = true;
            m32997u(c10835n);
            return this.f27315h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f27315h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((InputStream) C11172r0.m34928j(this.f27314g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f27315h;
        if (j11 != -1) {
            this.f27315h = j11 - read;
        }
        m32994r(read);
        return read;
    }
}
