package s8;

import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import s8.d0;
import s8.e0;
import t6.b3;

/* loaded from: classes.dex */
public class v implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25391a;

    public v() {
        this(-1);
    }

    public v(int i10) {
        this.f25391a = i10;
    }

    @Override // s8.d0
    public int a(int i10) {
        int i11 = this.f25391a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // s8.d0
    public d0.b b(d0.a aVar, d0.c cVar) {
        if (!e(cVar.f25212c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new d0.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new d0.b(2, 60000L);
        }
        return null;
    }

    @Override // s8.d0
    public long d(d0.c cVar) {
        IOException iOException = cVar.f25212c;
        if ((iOException instanceof b3) || (iOException instanceof FileNotFoundException) || (iOException instanceof x) || (iOException instanceof e0.h) || k.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f25213d - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof a0)) {
            return false;
        }
        int i10 = ((a0) iOException).f25187d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }
}
