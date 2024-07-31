package h2;

import ck.v;
import f2.j;
import i2.c;
import i2.g;
import i2.h;
import java.util.ArrayList;
import java.util.List;
import k2.u;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class e implements d, c.a {

    /* renamed from: a */
    private final c f16364a;

    /* renamed from: b */
    private final i2.c<?>[] f16365b;

    /* renamed from: c */
    private final Object f16366c;

    public e(c cVar, i2.c<?>[] constraintControllers) {
        n.e(constraintControllers, "constraintControllers");
        this.f16364a = cVar;
        this.f16365b = constraintControllers;
        this.f16366c = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(j2.n trackers, c cVar) {
        this(cVar, (i2.c<?>[]) new i2.c[]{new i2.a(trackers.a()), new i2.b(trackers.b()), new h(trackers.d()), new i2.d(trackers.c()), new g(trackers.c()), new i2.f(trackers.c()), new i2.e(trackers.c())});
        n.e(trackers, "trackers");
    }

    @Override // h2.d
    public void a(Iterable<u> workSpecs) {
        n.e(workSpecs, "workSpecs");
        synchronized (this.f16366c) {
            for (i2.c<?> cVar : this.f16365b) {
                cVar.g(null);
            }
            for (i2.c<?> cVar2 : this.f16365b) {
                cVar2.e(workSpecs);
            }
            for (i2.c<?> cVar3 : this.f16365b) {
                cVar3.g(this);
            }
            v vVar = v.f7137a;
        }
    }

    @Override // i2.c.a
    public void b(List<u> workSpecs) {
        String str;
        n.e(workSpecs, "workSpecs");
        synchronized (this.f16366c) {
            ArrayList<u> arrayList = new ArrayList();
            for (Object obj : workSpecs) {
                if (d(((u) obj).f20223a)) {
                    arrayList.add(obj);
                }
            }
            for (u uVar : arrayList) {
                j e10 = j.e();
                str = f.f16367a;
                e10.a(str, "Constraints met for " + uVar);
            }
            c cVar = this.f16364a;
            if (cVar != null) {
                cVar.f(arrayList);
                v vVar = v.f7137a;
            }
        }
    }

    @Override // i2.c.a
    public void c(List<u> workSpecs) {
        n.e(workSpecs, "workSpecs");
        synchronized (this.f16366c) {
            c cVar = this.f16364a;
            if (cVar != null) {
                cVar.b(workSpecs);
                v vVar = v.f7137a;
            }
        }
    }

    public final boolean d(String workSpecId) {
        i2.c<?> cVar;
        boolean z10;
        String str;
        n.e(workSpecId, "workSpecId");
        synchronized (this.f16366c) {
            i2.c<?>[] cVarArr = this.f16365b;
            int length = cVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArr[i10];
                if (cVar.d(workSpecId)) {
                    break;
                }
                i10++;
            }
            if (cVar != null) {
                j e10 = j.e();
                str = f.f16367a;
                e10.a(str, "Work " + workSpecId + " constrained by " + cVar.getClass().getSimpleName());
            }
            z10 = cVar == null;
        }
        return z10;
    }

    @Override // h2.d
    public void reset() {
        synchronized (this.f16366c) {
            for (i2.c<?> cVar : this.f16365b) {
                cVar.f();
            }
            v vVar = v.f7137a;
        }
    }
}
