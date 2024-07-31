package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p152i4.C7801f0;

/* renamed from: com.facebook.internal.o0 */
/* loaded from: classes.dex */
public final class C4636o0 {

    /* renamed from: a */
    public static final C4636o0 f8773a = new C4636o0();

    /* renamed from: b */
    private static final String f8774b = C4636o0.class.getName();

    private C4636o0() {
    }

    /* renamed from: a */
    public static final <T> void m11350a(Collection<? extends T> container, String name) {
        C9322n.m27781e(container, "container");
        C9322n.m27781e(name, "name");
        Iterator<? extends T> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    /* renamed from: b */
    public static final String m11351b() {
        String m23861m = C7799e0.m23861m();
        if (m23861m != null) {
            return m23861m;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    /* renamed from: c */
    public static final String m11352c() {
        String m23866r = C7799e0.m23866r();
        if (m23866r != null) {
            return m23866r;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    /* renamed from: d */
    public static final boolean m11353d(Context context, String redirectURI) {
        List<ResolveInfo> list;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!C9322n.m27777a(activityInfo.name, "com.facebook.CustomTabActivity") || !C9322n.m27777a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m11354e(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C9322n.m27781e(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L18
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 != 0) goto L31
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L27
            java.lang.String r4 = com.facebook.internal.C4636o0.f8774b
            android.util.Log.w(r4, r5)
            goto L31
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C4636o0.m11354e(android.content.Context, boolean):void");
    }

    /* renamed from: f */
    public static final void m11355f(Context context, boolean z10) {
        C9322n.m27781e(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!(!z10)) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
            }
            Log.w(f8774b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    /* renamed from: g */
    public static final void m11356g(String arg, String name) {
        C9322n.m27781e(arg, "arg");
        C9322n.m27781e(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }

    /* renamed from: h */
    public static final <T> void m11357h(Collection<? extends T> container, String name) {
        C9322n.m27781e(container, "container");
        C9322n.m27781e(name, "name");
        if (!container.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
    }

    /* renamed from: i */
    public static final <T> void m11358i(Collection<? extends T> container, String name) {
        C9322n.m27781e(container, "container");
        C9322n.m27781e(name, "name");
        m11350a(container, name);
        m11357h(container, name);
    }

    /* renamed from: j */
    public static final void m11359j(Object obj, String name) {
        C9322n.m27781e(name, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    /* renamed from: k */
    public static final String m11360k(String str, String name) {
        C9322n.m27781e(name, "name");
        boolean z10 = false;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            }
        }
        if (z10) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    /* renamed from: l */
    public static final void m11361l() {
        if (!C7799e0.m23833F()) {
            throw new C7801f0("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
