package p397v7;

import android.os.Bundle;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import p361t6.InterfaceC11076o;
import p363t8.C11141c;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: v7.f1 */
/* loaded from: classes.dex */
public final class C11700f1 implements InterfaceC11076o {

    /* renamed from: d */
    public static final C11700f1 f30689d = new C11700f1(new C11694d1[0]);

    /* renamed from: e */
    private static final String f30690e = C11172r0.m34945r0(0);

    /* renamed from: f */
    public static final InterfaceC11076o.a<C11700f1> f30691f = new InterfaceC11076o.a() { // from class: v7.e1
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11700f1 m36855e;
            m36855e = C11700f1.m36855e(bundle);
            return m36855e;
        }
    };

    /* renamed from: a */
    public final int f30692a;

    /* renamed from: b */
    private final AbstractC5907w<C11694d1> f30693b;

    /* renamed from: c */
    private int f30694c;

    public C11700f1(C11694d1... c11694d1Arr) {
        this.f30693b = AbstractC5907w.m15080s(c11694d1Arr);
        this.f30692a = c11694d1Arr.length;
        m36856f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ C11700f1 m36855e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f30690e);
        return parcelableArrayList == null ? new C11700f1(new C11694d1[0]) : new C11700f1((C11694d1[]) C11141c.m34616b(C11694d1.f30657s, parcelableArrayList).toArray(new C11694d1[0]));
    }

    /* renamed from: f */
    private void m36856f() {
        int i10 = 0;
        while (i10 < this.f30693b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f30693b.size(); i12++) {
                if (this.f30693b.get(i10).equals(this.f30693b.get(i12))) {
                    C11173s.m34965d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f30690e, C11141c.m34618d(this.f30693b));
        return bundle;
    }

    /* renamed from: c */
    public C11694d1 m36857c(int i10) {
        return this.f30693b.get(i10);
    }

    /* renamed from: d */
    public int m36858d(C11694d1 c11694d1) {
        int indexOf = this.f30693b.indexOf(c11694d1);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11700f1.class != obj.getClass()) {
            return false;
        }
        C11700f1 c11700f1 = (C11700f1) obj;
        return this.f30692a == c11700f1.f30692a && this.f30693b.equals(c11700f1.f30693b);
    }

    public int hashCode() {
        if (this.f30694c == 0) {
            this.f30694c = this.f30693b.hashCode();
        }
        return this.f30694c;
    }
}
