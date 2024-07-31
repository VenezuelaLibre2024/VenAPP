package p307q8;

import android.os.Bundle;
import com.google.common.collect.AbstractC5907w;
import java.util.Collections;
import java.util.List;
import p137hb.C7690e;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.C11694d1;

/* renamed from: q8.w */
/* loaded from: classes.dex */
public final class C10317w implements InterfaceC11076o {

    /* renamed from: c */
    private static final String f25746c = C11172r0.m34945r0(0);

    /* renamed from: d */
    private static final String f25747d = C11172r0.m34945r0(1);

    /* renamed from: e */
    public static final InterfaceC11076o.a<C10317w> f25748e = new InterfaceC11076o.a() { // from class: q8.v
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C10317w m31049d;
            m31049d = C10317w.m31049d(bundle);
            return m31049d;
        }
    };

    /* renamed from: a */
    public final C11694d1 f25749a;

    /* renamed from: b */
    public final AbstractC5907w<Integer> f25750b;

    public C10317w(C11694d1 c11694d1, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c11694d1.f30658a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f25749a = c11694d1;
        this.f25750b = AbstractC5907w.m15079r(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C10317w m31049d(Bundle bundle) {
        return new C10317w(C11694d1.f30657s.mo22759a((Bundle) C11137a.m34603e(bundle.getBundle(f25746c))), C7690e.m23412c((int[]) C11137a.m34603e(bundle.getIntArray(f25747d))));
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f25746c, this.f25749a.mo22762a());
        bundle.putIntArray(f25747d, C7690e.m23421l(this.f25750b));
        return bundle;
    }

    /* renamed from: c */
    public int m31050c() {
        return this.f25749a.f30660c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10317w.class != obj.getClass()) {
            return false;
        }
        C10317w c10317w = (C10317w) obj;
        return this.f25749a.equals(c10317w.f25749a) && this.f25750b.equals(c10317w.f25750b);
    }

    public int hashCode() {
        return this.f25749a.hashCode() + (this.f25750b.hashCode() * 31);
    }
}
