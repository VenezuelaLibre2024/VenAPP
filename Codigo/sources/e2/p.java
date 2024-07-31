package e2;

import android.webkit.WebResourceRequest;
import androidx.webkit.internal.a;
import androidx.webkit.internal.h1;
import androidx.webkit.internal.j1;
import androidx.webkit.internal.k1;

/* loaded from: classes.dex */
public class p {
    private static h1 a(WebResourceRequest webResourceRequest) {
        return k1.c().k(webResourceRequest);
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        a.c cVar = j1.f5595u;
        if (cVar.c()) {
            return androidx.webkit.internal.d.j(webResourceRequest);
        }
        if (cVar.d()) {
            return a(webResourceRequest).a();
        }
        throw j1.a();
    }
}
