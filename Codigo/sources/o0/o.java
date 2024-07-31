package o0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f22111g;

    /* renamed from: b, reason: collision with root package name */
    int f22113b;

    /* renamed from: d, reason: collision with root package name */
    int f22115d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<n0.e> f22112a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    boolean f22114c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a> f22116e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f22117f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<n0.e> f22118a;

        /* renamed from: b, reason: collision with root package name */
        int f22119b;

        /* renamed from: c, reason: collision with root package name */
        int f22120c;

        /* renamed from: d, reason: collision with root package name */
        int f22121d;

        /* renamed from: e, reason: collision with root package name */
        int f22122e;

        /* renamed from: f, reason: collision with root package name */
        int f22123f;

        /* renamed from: g, reason: collision with root package name */
        int f22124g;

        public a(n0.e eVar, k0.d dVar, int i10) {
            this.f22118a = new WeakReference<>(eVar);
            this.f22119b = dVar.x(eVar.O);
            this.f22120c = dVar.x(eVar.P);
            this.f22121d = dVar.x(eVar.Q);
            this.f22122e = dVar.x(eVar.R);
            this.f22123f = dVar.x(eVar.S);
            this.f22124g = i10;
        }
    }

    public o(int i10) {
        int i11 = f22111g;
        f22111g = i11 + 1;
        this.f22113b = i11;
        this.f22115d = i10;
    }

    private String e() {
        int i10 = this.f22115d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(k0.d dVar, ArrayList<n0.e> arrayList, int i10) {
        int x10;
        n0.d dVar2;
        n0.f fVar = (n0.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            n0.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            n0.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f22116e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f22116e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            x10 = dVar.x(fVar.O);
            dVar2 = fVar.Q;
        } else {
            x10 = dVar.x(fVar.P);
            dVar2 = fVar.R;
        }
        int x11 = dVar.x(dVar2);
        dVar.D();
        return x11 - x10;
    }

    public boolean a(n0.e eVar) {
        if (this.f22112a.contains(eVar)) {
            return false;
        }
        this.f22112a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f22112a.size();
        if (this.f22117f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f22117f == oVar.f22113b) {
                    g(this.f22115d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f22113b;
    }

    public int d() {
        return this.f22115d;
    }

    public int f(k0.d dVar, int i10) {
        if (this.f22112a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f22112a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<n0.e> it = this.f22112a.iterator();
        while (it.hasNext()) {
            n0.e next = it.next();
            oVar.a(next);
            int c10 = oVar.c();
            if (i10 == 0) {
                next.I0 = c10;
            } else {
                next.J0 = c10;
            }
        }
        this.f22117f = oVar.f22113b;
    }

    public void h(boolean z10) {
        this.f22114c = z10;
    }

    public void i(int i10) {
        this.f22115d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f22113b + "] <";
        Iterator<n0.e> it = this.f22112a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
