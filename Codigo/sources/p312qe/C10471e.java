package p312qe;

import com.google.firebase.remoteconfig.C6344c;
import ee.InterfaceC7183b;
import p029bk.InterfaceC1806a;
import p144hi.C7742b;

/* renamed from: qe.e */
/* loaded from: classes.dex */
public final class C10471e implements InterfaceC1806a {

    /* renamed from: a */
    private final C10467a f26017a;

    public C10471e(C10467a c10467a) {
        this.f26017a = c10467a;
    }

    /* renamed from: a */
    public static C10471e m31406a(C10467a c10467a) {
        return new C10471e(c10467a);
    }

    /* renamed from: c */
    public static InterfaceC7183b<C6344c> m31407c(C10467a c10467a) {
        return (InterfaceC7183b) C7742b.m23640c(c10467a.m31393d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7183b<C6344c> get() {
        return m31407c(this.f26017a);
    }
}
