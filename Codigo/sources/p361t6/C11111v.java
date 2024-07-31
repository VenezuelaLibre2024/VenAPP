package p361t6;

import android.os.Bundle;
import p361t6.InterfaceC11076o;
import p363t8.C11172r0;

/* renamed from: t6.v */
/* loaded from: classes.dex */
public final class C11111v implements InterfaceC11076o {

    /* renamed from: d */
    public static final C11111v f28843d = new C11111v(0, 0, 0);

    /* renamed from: e */
    private static final String f28844e = C11172r0.m34945r0(0);

    /* renamed from: f */
    private static final String f28845f = C11172r0.m34945r0(1);

    /* renamed from: r */
    private static final String f28846r = C11172r0.m34945r0(2);

    /* renamed from: s */
    public static final InterfaceC11076o.a<C11111v> f28847s = new InterfaceC11076o.a() { // from class: t6.u
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11111v m34562c;
            m34562c = C11111v.m34562c(bundle);
            return m34562c;
        }
    };

    /* renamed from: a */
    public final int f28848a;

    /* renamed from: b */
    public final int f28849b;

    /* renamed from: c */
    public final int f28850c;

    public C11111v(int i10, int i11, int i12) {
        this.f28848a = i10;
        this.f28849b = i11;
        this.f28850c = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C11111v m34562c(Bundle bundle) {
        return new C11111v(bundle.getInt(f28844e, 0), bundle.getInt(f28845f, 0), bundle.getInt(f28846r, 0));
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f28844e, this.f28848a);
        bundle.putInt(f28845f, this.f28849b);
        bundle.putInt(f28846r, this.f28850c);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11111v)) {
            return false;
        }
        C11111v c11111v = (C11111v) obj;
        return this.f28848a == c11111v.f28848a && this.f28849b == c11111v.f28849b && this.f28850c == c11111v.f28850c;
    }

    public int hashCode() {
        return ((((527 + this.f28848a) * 31) + this.f28849b) * 31) + this.f28850c;
    }
}
