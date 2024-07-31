package p260o0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p190k0.C9102d;
import p243n0.C9619b;
import p243n0.C9621d;
import p243n0.C9622e;
import p243n0.C9623f;

/* renamed from: o0.o */
/* loaded from: classes.dex */
public class C9767o {

    /* renamed from: g */
    static int f24044g;

    /* renamed from: b */
    int f24046b;

    /* renamed from: d */
    int f24048d;

    /* renamed from: a */
    ArrayList<C9622e> f24045a = new ArrayList<>();

    /* renamed from: c */
    boolean f24047c = false;

    /* renamed from: e */
    ArrayList<a> f24049e = null;

    /* renamed from: f */
    private int f24050f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.o$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        WeakReference<C9622e> f24051a;

        /* renamed from: b */
        int f24052b;

        /* renamed from: c */
        int f24053c;

        /* renamed from: d */
        int f24054d;

        /* renamed from: e */
        int f24055e;

        /* renamed from: f */
        int f24056f;

        /* renamed from: g */
        int f24057g;

        public a(C9622e c9622e, C9102d c9102d, int i10) {
            this.f24051a = new WeakReference<>(c9622e);
            this.f24052b = c9102d.m26796x(c9622e.f23477O);
            this.f24053c = c9102d.m26796x(c9622e.f23478P);
            this.f24054d = c9102d.m26796x(c9622e.f23479Q);
            this.f24055e = c9102d.m26796x(c9622e.f23480R);
            this.f24056f = c9102d.m26796x(c9622e.f23481S);
            this.f24057g = i10;
        }
    }

    public C9767o(int i10) {
        int i11 = f24044g;
        f24044g = i11 + 1;
        this.f24046b = i11;
        this.f24048d = i10;
    }

    /* renamed from: e */
    private String m29286e() {
        int i10 = this.f24048d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m29287j(C9102d c9102d, ArrayList<C9622e> arrayList, int i10) {
        int m26796x;
        C9621d c9621d;
        C9623f c9623f = (C9623f) arrayList.get(0).m28686I();
        c9102d.m26778D();
        c9623f.mo28625g(c9102d, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).mo28625g(c9102d, false);
        }
        if (i10 == 0 && c9623f.f23553W0 > 0) {
            C9619b.m28639b(c9623f, c9102d, arrayList, 0);
        }
        if (i10 == 1 && c9623f.f23554X0 > 0) {
            C9619b.m28639b(c9623f, c9102d, arrayList, 1);
        }
        try {
            c9102d.m26797z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f24049e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f24049e.add(new a(arrayList.get(i12), c9102d, i10));
        }
        if (i10 == 0) {
            m26796x = c9102d.m26796x(c9623f.f23477O);
            c9621d = c9623f.f23479Q;
        } else {
            m26796x = c9102d.m26796x(c9623f.f23478P);
            c9621d = c9623f.f23480R;
        }
        int m26796x2 = c9102d.m26796x(c9621d);
        c9102d.m26778D();
        return m26796x2 - m26796x;
    }

    /* renamed from: a */
    public boolean m29288a(C9622e c9622e) {
        if (this.f24045a.contains(c9622e)) {
            return false;
        }
        this.f24045a.add(c9622e);
        return true;
    }

    /* renamed from: b */
    public void m29289b(ArrayList<C9767o> arrayList) {
        int size = this.f24045a.size();
        if (this.f24050f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                C9767o c9767o = arrayList.get(i10);
                if (this.f24050f == c9767o.f24046b) {
                    m29293g(this.f24048d, c9767o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m29290c() {
        return this.f24046b;
    }

    /* renamed from: d */
    public int m29291d() {
        return this.f24048d;
    }

    /* renamed from: f */
    public int m29292f(C9102d c9102d, int i10) {
        if (this.f24045a.size() == 0) {
            return 0;
        }
        return m29287j(c9102d, this.f24045a, i10);
    }

    /* renamed from: g */
    public void m29293g(int i10, C9767o c9767o) {
        Iterator<C9622e> it = this.f24045a.iterator();
        while (it.hasNext()) {
            C9622e next = it.next();
            c9767o.m29288a(next);
            int m29290c = c9767o.m29290c();
            if (i10 == 0) {
                next.f23470I0 = m29290c;
            } else {
                next.f23472J0 = m29290c;
            }
        }
        this.f24050f = c9767o.f24046b;
    }

    /* renamed from: h */
    public void m29294h(boolean z10) {
        this.f24047c = z10;
    }

    /* renamed from: i */
    public void m29295i(int i10) {
        this.f24048d = i10;
    }

    public String toString() {
        String str = m29286e() + " [" + this.f24046b + "] <";
        Iterator<C9622e> it = this.f24045a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().m28758r();
        }
        return str + " >";
    }
}
