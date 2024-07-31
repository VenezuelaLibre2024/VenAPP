package p073e2;

import android.webkit.WebResourceRequest;
import androidx.webkit.internal.AbstractC1431a;
import androidx.webkit.internal.C1440d;
import androidx.webkit.internal.C1454h1;
import androidx.webkit.internal.C1460j1;
import androidx.webkit.internal.C1463k1;

/* renamed from: e2.p */
/* loaded from: classes.dex */
public class C7112p {
    /* renamed from: a */
    private static C1454h1 m20959a(WebResourceRequest webResourceRequest) {
        return C1463k1.m8376c().m8428k(webResourceRequest);
    }

    /* renamed from: b */
    public static boolean m20960b(WebResourceRequest webResourceRequest) {
        AbstractC1431a.c cVar = C1460j1.f6446u;
        if (cVar.mo8259c()) {
            return C1440d.m8302j(webResourceRequest);
        }
        if (cVar.mo8260d()) {
            return m20959a(webResourceRequest).m8335a();
        }
        throw C1460j1.m8361a();
    }
}
