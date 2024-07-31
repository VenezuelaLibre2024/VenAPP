package p089el;

import com.google.android.gms.common.api.C5101a;
import p450xk.C12523o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: el.k0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7229k0 {
    /* renamed from: a */
    public static final int m21598a(String str, int i10, int i11, int i12) {
        return (int) C7225i0.m21577c(str, i10, i11, i12);
    }

    /* renamed from: b */
    public static final long m21599b(String str, long j10, long j11, long j12) {
        Long m41025k;
        String m21578d = C7225i0.m21578d(str);
        if (m21578d == null) {
            return j10;
        }
        m41025k = C12523o.m41025k(m21578d);
        if (m41025k == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m21578d + '\'').toString());
        }
        long longValue = m41025k.longValue();
        boolean z10 = false;
        if (j11 <= longValue && longValue <= j12) {
            z10 = true;
        }
        if (z10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: c */
    public static final String m21600c(String str, String str2) {
        String m21578d = C7225i0.m21578d(str);
        return m21578d == null ? str2 : m21578d;
    }

    /* renamed from: d */
    public static final boolean m21601d(String str, boolean z10) {
        String m21578d = C7225i0.m21578d(str);
        return m21578d != null ? Boolean.parseBoolean(m21578d) : z10;
    }

    /* renamed from: e */
    public static /* synthetic */ int m21602e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = C5101a.e.API_PRIORITY_OTHER;
        }
        return C7225i0.m21576b(str, i10, i11, i12);
    }

    /* renamed from: f */
    public static /* synthetic */ long m21603f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return C7225i0.m21577c(str, j10, j13, j12);
    }
}
