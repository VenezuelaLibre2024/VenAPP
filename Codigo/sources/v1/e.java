package v1;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f27861a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle extras) {
        n.e(cursor, "cursor");
        n.e(extras, "extras");
        cursor.setExtras(extras);
    }
}
