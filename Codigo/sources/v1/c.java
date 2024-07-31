package v1;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f27859a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        n.e(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        n.d(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        n.e(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
