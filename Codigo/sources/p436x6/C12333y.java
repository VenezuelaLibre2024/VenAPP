package p436x6;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import p363t8.C11172r0;
import p436x6.C12308h;

/* renamed from: x6.y */
/* loaded from: classes.dex */
public final class C12333y {

    /* renamed from: x6.y$a */
    /* loaded from: classes.dex */
    private static final class a {
        /* renamed from: a */
        public static boolean m39878a(Throwable th2) {
            return th2 instanceof DeniedByServerException;
        }

        /* renamed from: b */
        public static boolean m39879b(Throwable th2) {
            return th2 instanceof NotProvisionedException;
        }
    }

    /* renamed from: x6.y$b */
    /* loaded from: classes.dex */
    private static final class b {
        /* renamed from: a */
        public static boolean m39880a(Throwable th2) {
            return th2 instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m39881b(Throwable th2) {
            return C11172r0.m34898V(C11172r0.m34900W(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
    }

    /* renamed from: x6.y$c */
    /* loaded from: classes.dex */
    private static final class c {
        /* renamed from: a */
        public static boolean m39882a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m39877a(Exception exc, int i10) {
        int i11 = C11172r0.f29040a;
        if (i11 >= 21 && b.m39880a(exc)) {
            return b.m39881b(exc);
        }
        if (i11 >= 23 && c.m39882a(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.m39879b(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i11 >= 18 && a.m39878a(exc)) {
            return 6007;
        }
        if (exc instanceof C12321n0) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof C12308h.e) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof C12315k0) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
