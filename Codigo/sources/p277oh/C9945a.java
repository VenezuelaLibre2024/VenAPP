package p277oh;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* renamed from: oh.a */
/* loaded from: classes3.dex */
public class C9945a {

    /* renamed from: a */
    private static final String f24498a = "android.support.customtabs.extra.KEEP_ALIVE";

    /* renamed from: b */
    private static final String f24499b = "android.support.customtabs.action.CustomTabsService";

    /* renamed from: c */
    private static String f24500c;

    /* renamed from: a */
    public static void m29733a(Context context, Intent intent) {
        intent.putExtra(f24498a, new Intent().setClassName(context.getPackageName(), ServiceC9946b.class.getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r6.contains("com.google.android.apps.chrome") != false) goto L21;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m29734b(android.content.Context r10) {
        /*
            java.lang.String r0 = p277oh.C9945a.f24500c
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://www.example.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L23
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L24
        L23:
            r3 = r4
        L24:
            r5 = 131072(0x20000, float:1.83671E-40)
            java.util.List r5 = r0.queryIntentActivities(r1, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = p277oh.C9945a.f24499b
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L33
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L33
        L5e:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L67
            p277oh.C9945a.f24500c = r4
            goto Lb0
        L67:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L77
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
        L74:
            p277oh.C9945a.f24500c = r10
            goto Lb0
        L77:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L8c
            boolean r10 = m29735c(r10, r1)
            if (r10 != 0) goto L8c
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto L8c
            p277oh.C9945a.f24500c = r3
            goto Lb0
        L8c:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L95
        L94:
            goto L74
        L95:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L9e
            goto L94
        L9e:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto La7
            goto L94
        La7:
            java.lang.String r10 = "com.google.android.apps.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Lb0
            goto L94
        Lb0:
            java.lang.String r10 = p277oh.C9945a.f24500c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p277oh.C9945a.m29734b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    private static boolean m29735c(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
