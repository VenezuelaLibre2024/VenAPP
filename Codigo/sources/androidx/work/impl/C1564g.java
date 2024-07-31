package androidx.work.impl;

import kotlin.jvm.internal.C9322n;
import p344s1.AbstractC10767b;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.g */
/* loaded from: classes.dex */
public final class C1564g extends AbstractC10767b {

    /* renamed from: c */
    public static final C1564g f6696c = new C1564g();

    private C1564g() {
        super(12, 13);
    }

    @Override // p344s1.AbstractC10767b
    /* renamed from: a */
    public void mo8672a(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        db2.mo32144x("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.mo32144x("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
