package lm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f21300a = new g();

    private g() {
    }

    private final Intent a(Context context, File file, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(androidx.core.content.e.getUriForFile(context, context.getPackageName() + ".flutter_downloader.provider", file), str);
        intent.setFlags(268435456);
        intent.addFlags(1);
        return intent;
    }

    private final boolean b(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        n.d(queryIntentActivities, "queryIntentActivities(...)");
        return queryIntentActivities.size() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[Catch: all -> 0x0066, TryCatch #3 {, blocks: (B:3:0x0001, B:14:0x0026, B:16:0x0045, B:18:0x004b, B:26:0x002b, B:33:0x003a, B:36:0x003f, B:43:0x005d, B:41:0x0065, B:46:0x0062), top: B:2:0x0001, inners: #0, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:14:0x0026, B:16:0x0045, B:18:0x004b, B:26:0x002b, B:33:0x003a, B:36:0x003f, B:43:0x005d, B:41:0x0065, B:46:0x0062), top: B:2:0x0001, inners: #0, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.content.Intent c(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.n.e(r4, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "path"
            kotlin.jvm.internal.n.e(r5, r0)     // Catch: java.lang.Throwable -> L66
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L66
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L66
            android.content.Intent r6 = r3.a(r4, r0, r6)     // Catch: java.lang.Throwable -> L66
            boolean r1 = r3.b(r4, r6)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L1c
            monitor-exit(r3)
            return r6
        L1c:
            r6 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.String r2 = java.net.URLConnection.guessContentTypeFromStream(r1)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L59
            r1.close()     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L66
            goto L43
        L2a:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L66
            goto L43
        L2f:
            r2 = move-exception
            goto L35
        L31:
            r4 = move-exception
            goto L5b
        L33:
            r2 = move-exception
            r1 = r6
        L35:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L66
            goto L42
        L3e:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L66
        L42:
            r2 = r6
        L43:
            if (r2 != 0) goto L49
            java.lang.String r2 = java.net.URLConnection.guessContentTypeFromName(r5)     // Catch: java.lang.Throwable -> L66
        L49:
            if (r2 == 0) goto L57
            android.content.Intent r5 = r3.a(r4, r0, r2)     // Catch: java.lang.Throwable -> L66
            boolean r4 = r3.b(r4, r5)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L57
            monitor-exit(r3)
            return r5
        L57:
            monitor-exit(r3)
            return r6
        L59:
            r4 = move-exception
            r6 = r1
        L5b:
            if (r6 == 0) goto L65
            r6.close()     // Catch: java.io.IOException -> L61 java.lang.Throwable -> L66
            goto L65
        L61:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L66
        L65:
            throw r4     // Catch: java.lang.Throwable -> L66
        L66:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.g.c(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }
}
