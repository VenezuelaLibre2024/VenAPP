package p289p6;

import android.content.Context;
import p029bk.InterfaceC1806a;
import p174j6.C8991d;
import p174j6.InterfaceC8989b;

/* renamed from: p6.h */
/* loaded from: classes.dex */
public final class C10075h implements InterfaceC8989b<String> {

    /* renamed from: a */
    private final InterfaceC1806a<Context> f24733a;

    public C10075h(InterfaceC1806a<Context> interfaceC1806a) {
        this.f24733a = interfaceC1806a;
    }

    /* renamed from: a */
    public static C10075h m30042a(InterfaceC1806a<Context> interfaceC1806a) {
        return new C10075h(interfaceC1806a);
    }

    /* renamed from: c */
    public static String m30043c(Context context) {
        return (String) C8991d.m26386c(AbstractC10071f.m30034b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m30043c(this.f24733a.get());
    }
}
