package ml;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import p207kl.C9290b;

/* renamed from: ml.a */
/* loaded from: classes3.dex */
public class C9614a {
    /* renamed from: a */
    public static List<ResolveInfo> m28610a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    /* renamed from: b */
    public static void m28611b(Context context, Intent intent) {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                m28612c(context, intent2);
                z10 = true;
            } catch (C9290b unused) {
            }
        }
        if (z10) {
            return;
        }
        m28612c(context, intent);
    }

    /* renamed from: c */
    public static void m28612c(Context context, Intent intent) {
        List<ResolveInfo> m28610a = m28610a(context, intent);
        if (m28610a.size() == 0) {
            throw new C9290b("unable to resolve intent: " + intent.toString());
        }
        for (ResolveInfo resolveInfo : m28610a) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }
}
