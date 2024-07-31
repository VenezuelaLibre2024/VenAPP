package p151i3;

import android.net.Uri;

/* renamed from: i3.b */
/* loaded from: classes.dex */
public final class C7783b {
    /* renamed from: a */
    public static boolean m23743a(Uri uri) {
        return m23744b(uri) && !m23747e(uri);
    }

    /* renamed from: b */
    public static boolean m23744b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m23745c(Uri uri) {
        return m23744b(uri) && m23747e(uri);
    }

    /* renamed from: d */
    public static boolean m23746d(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    /* renamed from: e */
    private static boolean m23747e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
