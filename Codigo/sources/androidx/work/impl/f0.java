package androidx.work.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class f0 extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    private final Context f5816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(9, 10);
        kotlin.jvm.internal.n.e(context, "context");
        this.f5816c = context;
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        db2.x("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        l2.r.c(this.f5816c, db2);
        l2.l.c(this.f5816c, db2);
    }
}
