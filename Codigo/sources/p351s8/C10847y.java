package p351s8;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p082eb.C7147c;

/* renamed from: s8.y */
/* loaded from: classes.dex */
public class C10847y extends C10829k {

    /* renamed from: b */
    public final C10835n f27515b;

    /* renamed from: c */
    public final int f27516c;

    public C10847y(IOException iOException, C10835n c10835n, int i10, int i11) {
        super(iOException, m33087b(i10, i11));
        this.f27515b = c10835n;
        this.f27516c = i11;
    }

    public C10847y(String str, IOException iOException, C10835n c10835n, int i10, int i11) {
        super(str, iOException, m33087b(i10, i11));
        this.f27515b = c10835n;
        this.f27516c = i11;
    }

    public C10847y(String str, C10835n c10835n, int i10, int i11) {
        super(str, m33087b(i10, i11));
        this.f27515b = c10835n;
        this.f27516c = i11;
    }

    public C10847y(C10835n c10835n, int i10, int i11) {
        super(m33087b(i10, i11));
        this.f27515b = c10835n;
        this.f27516c = i11;
    }

    /* renamed from: b */
    private static int m33087b(int i10, int i11) {
        return (i10 == 2000 && i11 == 1) ? AdError.INTERNAL_ERROR_CODE : i10;
    }

    /* renamed from: c */
    public static C10847y m33088c(IOException iOException, C10835n c10835n, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C7147c.m21253e(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
        return i11 == 2007 ? new C10846x(iOException, c10835n) : new C10847y(iOException, c10835n, i11, i10);
    }
}
