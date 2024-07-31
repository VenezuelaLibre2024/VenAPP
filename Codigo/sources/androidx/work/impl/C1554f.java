package androidx.work.impl;

import kotlin.jvm.internal.C9322n;
import p344s1.AbstractC10767b;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.f */
/* loaded from: classes.dex */
public final class C1554f extends AbstractC10767b {

    /* renamed from: c */
    public static final C1554f f6666c = new C1554f();

    private C1554f() {
        super(11, 12);
    }

    @Override // p344s1.AbstractC10767b
    /* renamed from: a */
    public void mo8672a(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        db2.mo32144x("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
