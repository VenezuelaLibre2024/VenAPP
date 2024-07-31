package androidx.work.impl;

import kotlin.jvm.internal.C9322n;
import p344s1.AbstractC10767b;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.j */
/* loaded from: classes.dex */
public final class C1569j extends AbstractC10767b {

    /* renamed from: c */
    public static final C1569j f6734c = new C1569j();

    private C1569j() {
        super(3, 4);
    }

    @Override // p344s1.AbstractC10767b
    /* renamed from: a */
    public void mo8672a(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        db2.mo32144x("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
