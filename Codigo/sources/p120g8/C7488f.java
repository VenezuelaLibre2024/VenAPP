package p120g8;

import android.os.Bundle;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.List;
import p361t6.InterfaceC11076o;
import p363t8.C11141c;
import p363t8.C11172r0;

/* renamed from: g8.f */
/* loaded from: classes.dex */
public final class C7488f implements InterfaceC11076o {

    /* renamed from: c */
    public static final C7488f f17688c = new C7488f(AbstractC5907w.m15081v(), 0);

    /* renamed from: d */
    private static final String f17689d = C11172r0.m34945r0(0);

    /* renamed from: e */
    private static final String f17690e = C11172r0.m34945r0(1);

    /* renamed from: f */
    public static final InterfaceC11076o.a<C7488f> f17691f = new InterfaceC11076o.a() { // from class: g8.e
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C7488f m22787d;
            m22787d = C7488f.m22787d(bundle);
            return m22787d;
        }
    };

    /* renamed from: a */
    public final AbstractC5907w<C7484b> f17692a;

    /* renamed from: b */
    public final long f17693b;

    public C7488f(List<C7484b> list, long j10) {
        this.f17692a = AbstractC5907w.m15079r(list);
        this.f17693b = j10;
    }

    /* renamed from: c */
    private static AbstractC5907w<C7484b> m22786c(List<C7484b> list) {
        AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f17659d == null) {
                m15077p.mo14724a(list.get(i10));
            }
        }
        return m15077p.m15094k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final C7488f m22787d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f17689d);
        return new C7488f(parcelableArrayList == null ? AbstractC5907w.m15081v() : C11141c.m34616b(C7484b.f17653U, parcelableArrayList), bundle.getLong(f17690e));
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f17689d, C11141c.m34618d(m22786c(this.f17692a)));
        bundle.putLong(f17690e, this.f17693b);
        return bundle;
    }
}
