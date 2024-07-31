package androidx.work.impl;

import kotlin.jvm.internal.C9322n;
import p344s1.AbstractC10767b;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.n */
/* loaded from: classes.dex */
public final class C1573n extends AbstractC10767b {

    /* renamed from: c */
    public static final C1573n f6738c = new C1573n();

    private C1573n() {
        super(8, 9);
    }

    @Override // p344s1.AbstractC10767b
    /* renamed from: a */
    public void mo8672a(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        db2.mo32144x("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
