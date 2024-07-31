package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebResourceRequest;

/* renamed from: androidx.webkit.internal.b */
/* loaded from: classes.dex */
public class C1434b {
    /* renamed from: a */
    public static Uri m8267a(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    /* renamed from: b */
    public static boolean m8268b(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
