package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.C9322n;
import p211l2.C9360l;
import p211l2.C9366r;
import p344s1.AbstractC10767b;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.f0 */
/* loaded from: classes.dex */
public final class C1555f0 extends AbstractC10767b {

    /* renamed from: c */
    private final Context f6667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555f0(Context context) {
        super(9, 10);
        C9322n.m27781e(context, "context");
        this.f6667c = context;
    }

    @Override // p344s1.AbstractC10767b
    /* renamed from: a */
    public void mo8672a(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        db2.mo32144x("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        C9366r.m27879c(this.f6667c, db2);
        C9360l.m27869c(this.f6667c, db2);
    }
}
