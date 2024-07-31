package p382ud;

import com.bumptech.glide.ComponentCallbacks2C2125k;
import p029bk.InterfaceC1806a;

/* renamed from: ud.f */
/* loaded from: classes.dex */
public final class C11537f implements InterfaceC1806a {

    /* renamed from: a */
    private final InterfaceC1806a<ComponentCallbacks2C2125k> f29922a;

    public C11537f(InterfaceC1806a<ComponentCallbacks2C2125k> interfaceC1806a) {
        this.f29922a = interfaceC1806a;
    }

    /* renamed from: a */
    public static C11537f m36115a(InterfaceC1806a<ComponentCallbacks2C2125k> interfaceC1806a) {
        return new C11537f(interfaceC1806a);
    }

    /* renamed from: c */
    public static C11536e m36116c(ComponentCallbacks2C2125k componentCallbacks2C2125k) {
        return new C11536e(componentCallbacks2C2125k);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11536e get() {
        return m36116c(this.f29922a.get());
    }
}
