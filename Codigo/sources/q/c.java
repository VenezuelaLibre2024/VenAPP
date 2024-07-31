package q;

import androidx.camera.core.impl.k1;
import androidx.camera.core.impl.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends k1<b> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<b> f23307a = new ArrayList();

        a(List<b> list) {
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                this.f23307a.add(it.next());
            }
        }

        public void a() {
            Iterator<b> it = this.f23307a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public List<l0> b() {
            ArrayList arrayList = new ArrayList();
            Iterator<b> it = this.f23307a.iterator();
            while (it.hasNext()) {
                l0 b10 = it.next().b();
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
            return arrayList;
        }

        public List<l0> c() {
            ArrayList arrayList = new ArrayList();
            Iterator<b> it = this.f23307a.iterator();
            while (it.hasNext()) {
                l0 c10 = it.next().c();
                if (c10 != null) {
                    arrayList.add(c10);
                }
            }
            return arrayList;
        }

        public List<l0> d() {
            ArrayList arrayList = new ArrayList();
            Iterator<b> it = this.f23307a.iterator();
            while (it.hasNext()) {
                l0 d10 = it.next().d();
                if (d10 != null) {
                    arrayList.add(d10);
                }
            }
            return arrayList;
        }

        public List<l0> e() {
            ArrayList arrayList = new ArrayList();
            Iterator<b> it = this.f23307a.iterator();
            while (it.hasNext()) {
                l0 e10 = it.next().e();
                if (e10 != null) {
                    arrayList.add(e10);
                }
            }
            return arrayList;
        }
    }

    public c(b... bVarArr) {
        a(Arrays.asList(bVarArr));
    }

    public static c e() {
        return new c(new b[0]);
    }

    @Override // androidx.camera.core.impl.k1
    /* renamed from: b */
    public k1<b> clone() {
        c e10 = e();
        e10.a(c());
        return e10;
    }

    public a d() {
        return new a(c());
    }
}
