package p214l5;

import android.util.SparseArray;
import kotlin.jvm.internal.C9322n;
import p233m5.InterfaceC9546a;

/* renamed from: l5.a */
/* loaded from: classes.dex */
public final class C9398a {

    /* renamed from: a */
    public static final C9398a f22801a = new C9398a();

    /* renamed from: b */
    private static final SparseArray<InterfaceC9546a> f22802b = new SparseArray<>();

    private C9398a() {
    }

    /* renamed from: a */
    public final InterfaceC9546a m27986a(int i10) {
        return f22802b.get(i10);
    }

    /* renamed from: b */
    public final void m27987b(InterfaceC9546a handler) {
        C9322n.m27781e(handler, "handler");
        f22802b.append(handler.getType(), handler);
    }
}
