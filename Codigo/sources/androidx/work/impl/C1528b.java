package androidx.work.impl;

import android.content.ContentValues;
import kotlin.jvm.internal.C9322n;
import p344s1.InterfaceC10766a;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.b */
/* loaded from: classes.dex */
public final class C1528b implements InterfaceC10766a {
    @Override // p344s1.InterfaceC10766a
    /* renamed from: a */
    public void mo8594a(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        db2.mo32144x("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.mo32133N0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
