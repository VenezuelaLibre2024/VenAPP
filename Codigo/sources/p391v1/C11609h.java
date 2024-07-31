package p391v1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: v1.h */
/* loaded from: classes.dex */
public final class C11609h {

    /* renamed from: a */
    public static final C11609h f30186a = new C11609h();

    private C11609h() {
    }

    /* renamed from: a */
    public static final List<Uri> m36387a(Cursor cursor) {
        List<Uri> notificationUris;
        C9322n.m27781e(cursor, "cursor");
        notificationUris = cursor.getNotificationUris();
        C9322n.m27778b(notificationUris);
        return notificationUris;
    }

    /* renamed from: b */
    public static final void m36388b(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
        C9322n.m27781e(cursor, "cursor");
        C9322n.m27781e(cr, "cr");
        C9322n.m27781e(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
