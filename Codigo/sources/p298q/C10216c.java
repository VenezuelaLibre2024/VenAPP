package p298q;

import androidx.camera.core.impl.AbstractC0639k1;
import androidx.camera.core.impl.C0642l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C10216c extends AbstractC0639k1<AbstractC10215b> {

    /* renamed from: q.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<AbstractC10215b> f25254a = new ArrayList();

        a(List<AbstractC10215b> list) {
            Iterator<AbstractC10215b> it = list.iterator();
            while (it.hasNext()) {
                this.f25254a.add(it.next());
            }
        }

        /* renamed from: a */
        public void m30579a() {
            Iterator<AbstractC10215b> it = this.f25254a.iterator();
            while (it.hasNext()) {
                it.next().m30572a();
            }
        }

        /* renamed from: b */
        public List<C0642l0> m30580b() {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC10215b> it = this.f25254a.iterator();
            while (it.hasNext()) {
                C0642l0 m30573b = it.next().m30573b();
                if (m30573b != null) {
                    arrayList.add(m30573b);
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public List<C0642l0> m30581c() {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC10215b> it = this.f25254a.iterator();
            while (it.hasNext()) {
                C0642l0 m30574c = it.next().m30574c();
                if (m30574c != null) {
                    arrayList.add(m30574c);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public List<C0642l0> m30582d() {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC10215b> it = this.f25254a.iterator();
            while (it.hasNext()) {
                C0642l0 m30575d = it.next().m30575d();
                if (m30575d != null) {
                    arrayList.add(m30575d);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        public List<C0642l0> m30583e() {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC10215b> it = this.f25254a.iterator();
            while (it.hasNext()) {
                C0642l0 m30576e = it.next().m30576e();
                if (m30576e != null) {
                    arrayList.add(m30576e);
                }
            }
            return arrayList;
        }
    }

    public C10216c(AbstractC10215b... abstractC10215bArr) {
        m3135a(Arrays.asList(abstractC10215bArr));
    }

    /* renamed from: e */
    public static C10216c m30577e() {
        return new C10216c(new AbstractC10215b[0]);
    }

    @Override // androidx.camera.core.impl.AbstractC0639k1
    /* renamed from: b */
    public AbstractC0639k1<AbstractC10215b> clone() {
        C10216c m30577e = m30577e();
        m30577e.m3135a(m3137c());
        return m30577e;
    }

    /* renamed from: d */
    public a m30578d() {
        return new a(m3137c());
    }
}
