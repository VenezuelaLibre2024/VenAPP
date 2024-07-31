package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b */
    public static final a f7728b = new a(null);

    /* renamed from: a */
    private Uri f7729a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public Uri a(String action, Bundle bundle) {
            kotlin.jvm.internal.n.e(action, "action");
            n0 n0Var = n0.f7780a;
            return n0.g(h0.b(), i4.e0.w() + "/dialog/" + action, bundle);
        }
    }

    public e(String action, Bundle bundle) {
        Uri a10;
        kotlin.jvm.internal.n.e(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        w[] valuesCustom = w.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (w wVar : valuesCustom) {
            arrayList.add(wVar.h());
        }
        if (arrayList.contains(action)) {
            n0 n0Var = n0.f7780a;
            a10 = n0.g(h0.g(), kotlin.jvm.internal.n.k("/dialog/", action), bundle);
        } else {
            a10 = f7728b.a(action, bundle);
        }
        this.f7729a = a10;
    }

    public final boolean a(Activity activity, String str) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.n.e(activity, "activity");
            androidx.browser.customtabs.d b10 = new d.b(com.facebook.login.d.f7909a.b()).b();
            b10.f1766a.setPackage(str);
            try {
                b10.b(activity, this.f7729a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    public final void b(Uri uri) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(uri, "<set-?>");
            this.f7729a = uri;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
