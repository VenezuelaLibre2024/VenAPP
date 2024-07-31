package p407w;

import androidx.camera.core.impl.C0631i1;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.core.util.C0984h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: w.p */
/* loaded from: classes.dex */
public final class C12030p {

    /* renamed from: b */
    public static final C12030p f31981b = new a().m38658d(0).m38657b();

    /* renamed from: c */
    public static final C12030p f31982c = new a().m38658d(1).m38657b();

    /* renamed from: a */
    private LinkedHashSet<InterfaceC12026n> f31983a;

    /* renamed from: w.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final LinkedHashSet<InterfaceC12026n> f31984a;

        public a() {
            this.f31984a = new LinkedHashSet<>();
        }

        private a(LinkedHashSet<InterfaceC12026n> linkedHashSet) {
            this.f31984a = new LinkedHashSet<>(linkedHashSet);
        }

        /* renamed from: c */
        public static a m38655c(C12030p c12030p) {
            return new a(c12030p.m38652c());
        }

        /* renamed from: a */
        public a m38656a(InterfaceC12026n interfaceC12026n) {
            this.f31984a.add(interfaceC12026n);
            return this;
        }

        /* renamed from: b */
        public C12030p m38657b() {
            return new C12030p(this.f31984a);
        }

        /* renamed from: d */
        public a m38658d(int i10) {
            C0984h.m4836n(i10 != -1, "The specified lens facing is invalid.");
            this.f31984a.add(new C0631i1(i10));
            return this;
        }
    }

    C12030p(LinkedHashSet<InterfaceC12026n> linkedHashSet) {
        this.f31983a = linkedHashSet;
    }

    /* renamed from: a */
    public LinkedHashSet<InterfaceC0606c0> m38650a(LinkedHashSet<InterfaceC0606c0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC0606c0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo2999b());
        }
        List<InterfaceC12028o> m38651b = m38651b(arrayList);
        LinkedHashSet<InterfaceC0606c0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<InterfaceC0606c0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC0606c0 next = it2.next();
            if (m38651b.contains(next.mo2999b())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: b */
    public List<InterfaceC12028o> m38651b(List<InterfaceC12028o> list) {
        List<InterfaceC12028o> arrayList = new ArrayList<>(list);
        Iterator<InterfaceC12026n> it = this.f31983a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().mo3101b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public LinkedHashSet<InterfaceC12026n> m38652c() {
        return this.f31983a;
    }

    /* renamed from: d */
    public Integer m38653d() {
        Iterator<InterfaceC12026n> it = this.f31983a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC12026n next = it.next();
            if (next instanceof C0631i1) {
                Integer valueOf = Integer.valueOf(((C0631i1) next).m3102c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: e */
    public InterfaceC0606c0 m38654e(LinkedHashSet<InterfaceC0606c0> linkedHashSet) {
        Iterator<InterfaceC0606c0> it = m38650a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
