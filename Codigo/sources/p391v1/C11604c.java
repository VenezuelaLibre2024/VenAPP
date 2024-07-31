package p391v1;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.C9322n;

/* renamed from: v1.c */
/* loaded from: classes.dex */
public final class C11604c {

    /* renamed from: a */
    public static final C11604c f30183a = new C11604c();

    private C11604c() {
    }

    /* renamed from: a */
    public static final Uri m36381a(Cursor cursor) {
        C9322n.m27781e(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        C9322n.m27780d(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    /* renamed from: b */
    public static final boolean m36382b(ActivityManager activityManager) {
        C9322n.m27781e(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
