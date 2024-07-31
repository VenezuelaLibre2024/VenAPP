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

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f7793a = new o0();

    /* renamed from: b, reason: collision with root package name */
    private static final String f7794b = o0.class.getName();

    private o0() {
    }

    public static final <T> void a(Collection<? extends T> container, String name) {
        kotlin.jvm.internal.n.e(container, "container");
        kotlin.jvm.internal.n.e(name, "name");
        Iterator<? extends T> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    public static final String b() {
        String m10 = i4.e0.m();
        if (m10 != null) {
            return m10;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    public static final String c() {
        String r10 = i4.e0.r();
        if (r10 != null) {
            return r10;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    public static final boolean d(Context context, String redirectURI) {
        List<ResolveInfo> list;
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(redirectURI, "redirectURI");
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
            if (!kotlin.jvm.internal.n.a(activityInfo.name, "com.facebook.CustomTabActivity") || !kotlin.jvm.internal.n.a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.n.e(r4, r0)
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
            java.lang.String r4 = com.facebook.internal.o0.f7794b
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.o0.e(android.content.Context, boolean):void");
    }

    public static final void f(Context context, boolean z10) {
        kotlin.jvm.internal.n.e(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!(!z10)) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
            }
            Log.w(f7794b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static final void g(String arg, String name) {
        kotlin.jvm.internal.n.e(arg, "arg");
        kotlin.jvm.internal.n.e(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }

    public static final <T> void h(Collection<? extends T> container, String name) {
        kotlin.jvm.internal.n.e(container, "container");
        kotlin.jvm.internal.n.e(name, "name");
        if (!container.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
    }

    public static final <T> void i(Collection<? extends T> container, String name) {
        kotlin.jvm.internal.n.e(container, "container");
        kotlin.jvm.internal.n.e(name, "name");
        a(container, name);
        h(container, name);
    }

    public static final void j(Object obj, String name) {
        kotlin.jvm.internal.n.e(name, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    public static final String k(String str, String name) {
        kotlin.jvm.internal.n.e(name, "name");
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

    public static final void l() {
        if (!i4.e0.F()) {
            throw new i4.f0("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
