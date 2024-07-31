package s8;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import t8.r0;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f25193e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f25194f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f25195g;

    /* renamed from: h, reason: collision with root package name */
    private long f25196h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25197i;

    /* loaded from: classes.dex */
    public static final class a extends k {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f25193e = context.getAssets();
    }

    @Override // s8.j
    public void close() {
        this.f25194f = null;
        try {
            try {
                InputStream inputStream = this.f25195g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f25195g = null;
            if (this.f25197i) {
                this.f25197i = false;
                s();
            }
        }
    }

    @Override // s8.j
    public Uri getUri() {
        return this.f25194f;
    }

    @Override // s8.j
    public long o(n nVar) {
        try {
            Uri uri = nVar.f25288a;
            this.f25194f = uri;
            String str = (String) t8.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            t(nVar);
            InputStream open = this.f25193e.open(str, 1);
            this.f25195g = open;
            if (open.skip(nVar.f25294g) < nVar.f25294g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j10 = nVar.f25295h;
            if (j10 != -1) {
                this.f25196h = j10;
            } else {
                long available = this.f25195g.available();
                this.f25196h = available;
                if (available == 2147483647L) {
                    this.f25196h = -1L;
                }
            }
            this.f25197i = true;
            u(nVar);
            return this.f25196h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f25196h;
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
        int read = ((InputStream) r0.j(this.f25195g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f25196h;
        if (j11 != -1) {
            this.f25196h = j11 - read;
        }
        r(read);
        return read;
    }
}
