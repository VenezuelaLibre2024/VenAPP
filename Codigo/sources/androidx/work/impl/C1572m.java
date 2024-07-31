package androidx.work.impl;

import kotlin.jvm.internal.C9322n;
import p344s1.AbstractC10767b;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.m */
/* loaded from: classes.dex */
public final class C1572m extends AbstractC10767b {

    /* renamed from: c */
    public static final C1572m f6737c = new C1572m();

    private C1572m() {
        super(7, 8);
    }

    @Override // p344s1.AbstractC10767b
    /* renamed from: a */
    public void mo8672a(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        db2.mo32144x("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
