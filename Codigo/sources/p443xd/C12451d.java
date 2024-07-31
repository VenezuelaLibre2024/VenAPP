package p443xd;

import android.app.Application;
import com.bumptech.glide.ComponentCallbacks2C2125k;
import p029bk.InterfaceC1806a;
import p382ud.C11541j;
import td.C11246d;

/* renamed from: xd.d */
/* loaded from: classes.dex */
public final class C12451d implements InterfaceC1806a {

    /* renamed from: a */
    private final C12450c f33704a;

    /* renamed from: b */
    private final InterfaceC1806a<Application> f33705b;

    /* renamed from: c */
    private final InterfaceC1806a<C11541j> f33706c;

    public C12451d(C12450c c12450c, InterfaceC1806a<Application> interfaceC1806a, InterfaceC1806a<C11541j> interfaceC1806a2) {
        this.f33704a = c12450c;
        this.f33705b = interfaceC1806a;
        this.f33706c = interfaceC1806a2;
    }

    /* renamed from: a */
    public static C12451d m40432a(C12450c c12450c, InterfaceC1806a<Application> interfaceC1806a, InterfaceC1806a<C11541j> interfaceC1806a2) {
        return new C12451d(c12450c, interfaceC1806a, interfaceC1806a2);
    }

    /* renamed from: c */
    public static ComponentCallbacks2C2125k m40433c(C12450c c12450c, Application application, C11541j c11541j) {
        return (ComponentCallbacks2C2125k) C11246d.m35132d(c12450c.m40431a(application, c11541j));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ComponentCallbacks2C2125k get() {
        return m40433c(this.f33704a, this.f33705b.get(), this.f33706c.get());
    }
}
