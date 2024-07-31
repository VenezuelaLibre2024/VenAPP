package androidx.work.impl;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class b implements s1.a {
    @Override // s1.a
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.N0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
