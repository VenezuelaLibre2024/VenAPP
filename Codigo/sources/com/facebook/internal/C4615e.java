package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.C0394d;
import com.facebook.login.C4659d;
import java.util.ArrayList;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: com.facebook.internal.e */
/* loaded from: classes.dex */
public class C4615e {

    /* renamed from: b */
    public static final a f8703b = new a(null);

    /* renamed from: a */
    private Uri f8704a;

    /* renamed from: com.facebook.internal.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public Uri m11153a(String action, Bundle bundle) {
            C9322n.m27781e(action, "action");
            C4634n0 c4634n0 = C4634n0.f8760a;
            return C4634n0.m11305g(C4622h0.m11211b(), C7799e0.m23871w() + "/dialog/" + action, bundle);
        }
    }

    public C4615e(String action, Bundle bundle) {
        Uri m11153a;
        C9322n.m27781e(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        EnumC4649w[] valuesCustom = EnumC4649w.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (EnumC4649w enumC4649w : valuesCustom) {
            arrayList.add(enumC4649w.m11461h());
        }
        if (arrayList.contains(action)) {
            C4634n0 c4634n0 = C4634n0.f8760a;
            m11153a = C4634n0.m11305g(C4622h0.m11216g(), C9322n.m27787k("/dialog/", action), bundle);
        } else {
            m11153a = f8703b.m11153a(action, bundle);
        }
        this.f8704a = m11153a;
    }

    /* renamed from: a */
    public final boolean m11151a(Activity activity, String str) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            C9322n.m27781e(activity, "activity");
            C0394d m2113b = new C0394d.b(C4659d.f8889a.m11509b()).m2113b();
            m2113b.f2069a.setPackage(str);
            try {
                m2113b.m2108b(activity, this.f8704a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m11152b(Uri uri) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(uri, "<set-?>");
            this.f8704a = uri;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
