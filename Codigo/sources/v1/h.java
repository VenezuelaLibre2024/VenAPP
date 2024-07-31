package v1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f27862a = new h();

    private h() {
    }

    public static final List<Uri> a(Cursor cursor) {
        List<Uri> notificationUris;
        n.e(cursor, "cursor");
        notificationUris = cursor.getNotificationUris();
        n.b(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
        n.e(cursor, "cursor");
        n.e(cr, "cr");
        n.e(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
