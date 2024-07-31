package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.zzcec;
import f2.b;
import f2.l;

/* loaded from: classes.dex */
public class WorkManagerUtil extends u0 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void f2(Context context) {
        try {
            f2.t.g(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.v0
    public final void zze(com.google.android.gms.dynamic.b bVar) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        f2(context);
        try {
            f2.t e10 = f2.t.e(context);
            e10.a("offline_ping_sender_work");
            e10.c(new l.a(OfflinePingSender.class).j(new b.a().b(f2.k.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e11) {
            zzcec.zzk("Failed to instantiate WorkManager.", e11);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.v0
    public final boolean zzf(com.google.android.gms.dynamic.b bVar, String str, String str2) {
        return zzg(bVar, new f9.a(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.v0
    public final boolean zzg(com.google.android.gms.dynamic.b bVar, f9.a aVar) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        f2(context);
        f2.b a10 = new b.a().b(f2.k.CONNECTED).a();
        try {
            f2.t.e(context).c(new l.a(OfflineNotificationPoster.class).j(a10).l(new b.a().h("uri", aVar.f15056a).h("gws_query_id", aVar.f15057b).h("image_url", aVar.f15058c).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e10) {
            zzcec.zzk("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
