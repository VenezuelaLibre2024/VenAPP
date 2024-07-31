package p128h2;

import ck.C2037v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p150i2.AbstractC7776c;
import p150i2.C7774a;
import p150i2.C7775b;
import p150i2.C7777d;
import p150i2.C7778e;
import p150i2.C7779f;
import p150i2.C7780g;
import p150i2.C7781h;
import p170j2.C8953n;
import p192k2.C9132u;

/* renamed from: h2.e */
/* loaded from: classes.dex */
public final class C7615e implements InterfaceC7614d, AbstractC7776c.a {

    /* renamed from: a */
    private final InterfaceC7613c f18001a;

    /* renamed from: b */
    private final AbstractC7776c<?>[] f18002b;

    /* renamed from: c */
    private final Object f18003c;

    public C7615e(InterfaceC7613c interfaceC7613c, AbstractC7776c<?>[] constraintControllers) {
        C9322n.m27781e(constraintControllers, "constraintControllers");
        this.f18001a = interfaceC7613c;
        this.f18002b = constraintControllers;
        this.f18003c = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7615e(C8953n trackers, InterfaceC7613c interfaceC7613c) {
        this(interfaceC7613c, (AbstractC7776c<?>[]) new AbstractC7776c[]{new C7774a(trackers.m26176a()), new C7775b(trackers.m26177b()), new C7781h(trackers.m26179d()), new C7777d(trackers.m26178c()), new C7780g(trackers.m26178c()), new C7779f(trackers.m26178c()), new C7778e(trackers.m26178c())});
        C9322n.m27781e(trackers, "trackers");
    }

    @Override // p128h2.InterfaceC7614d
    /* renamed from: a */
    public void mo23132a(Iterable<C9132u> workSpecs) {
        C9322n.m27781e(workSpecs, "workSpecs");
        synchronized (this.f18003c) {
            for (AbstractC7776c<?> abstractC7776c : this.f18002b) {
                abstractC7776c.m23734g(null);
            }
            for (AbstractC7776c<?> abstractC7776c2 : this.f18002b) {
                abstractC7776c2.m23732e(workSpecs);
            }
            for (AbstractC7776c<?> abstractC7776c3 : this.f18002b) {
                abstractC7776c3.m23734g(this);
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    @Override // p150i2.AbstractC7776c.a
    /* renamed from: b */
    public void mo23133b(List<C9132u> workSpecs) {
        String str;
        C9322n.m27781e(workSpecs, "workSpecs");
        synchronized (this.f18003c) {
            ArrayList<C9132u> arrayList = new ArrayList();
            for (Object obj : workSpecs) {
                if (m23135d(((C9132u) obj).f22005a)) {
                    arrayList.add(obj);
                }
            }
            for (C9132u c9132u : arrayList) {
                AbstractC7277j m21767e = AbstractC7277j.m21767e();
                str = C7616f.f18004a;
                m21767e.mo21770a(str, "Constraints met for " + c9132u);
            }
            InterfaceC7613c interfaceC7613c = this.f18001a;
            if (interfaceC7613c != null) {
                interfaceC7613c.mo8631f(arrayList);
                C2037v c2037v = C2037v.f8089a;
            }
        }
    }

    @Override // p150i2.AbstractC7776c.a
    /* renamed from: c */
    public void mo23134c(List<C9132u> workSpecs) {
        C9322n.m27781e(workSpecs, "workSpecs");
        synchronized (this.f18003c) {
            InterfaceC7613c interfaceC7613c = this.f18001a;
            if (interfaceC7613c != null) {
                interfaceC7613c.mo8630b(workSpecs);
                C2037v c2037v = C2037v.f8089a;
            }
        }
    }

    /* renamed from: d */
    public final boolean m23135d(String workSpecId) {
        AbstractC7776c<?> abstractC7776c;
        boolean z10;
        String str;
        C9322n.m27781e(workSpecId, "workSpecId");
        synchronized (this.f18003c) {
            AbstractC7776c<?>[] abstractC7776cArr = this.f18002b;
            int length = abstractC7776cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    abstractC7776c = null;
                    break;
                }
                abstractC7776c = abstractC7776cArr[i10];
                if (abstractC7776c.m23731d(workSpecId)) {
                    break;
                }
                i10++;
            }
            if (abstractC7776c != null) {
                AbstractC7277j m21767e = AbstractC7277j.m21767e();
                str = C7616f.f18004a;
                m21767e.mo21770a(str, "Work " + workSpecId + " constrained by " + abstractC7776c.getClass().getSimpleName());
            }
            z10 = abstractC7776c == null;
        }
        return z10;
    }

    @Override // p128h2.InterfaceC7614d
    public void reset() {
        synchronized (this.f18003c) {
            for (AbstractC7776c<?> abstractC7776c : this.f18002b) {
                abstractC7776c.m23733f();
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }
}
