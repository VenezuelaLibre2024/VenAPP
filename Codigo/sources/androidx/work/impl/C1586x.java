package androidx.work.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p094f2.AbstractC7277j;
import p094f2.AbstractC7285r;
import p094f2.AbstractC7288u;
import p094f2.EnumC7271d;
import p094f2.InterfaceC7280m;
import p211l2.RunnableC9350d;

/* renamed from: androidx.work.impl.x */
/* loaded from: classes.dex */
public class C1586x extends AbstractC7285r {

    /* renamed from: j */
    private static final String f6807j = AbstractC7277j.m21769i("WorkContinuationImpl");

    /* renamed from: a */
    private final C1553e0 f6808a;

    /* renamed from: b */
    private final String f6809b;

    /* renamed from: c */
    private final EnumC7271d f6810c;

    /* renamed from: d */
    private final List<? extends AbstractC7288u> f6811d;

    /* renamed from: e */
    private final List<String> f6812e;

    /* renamed from: f */
    private final List<String> f6813f;

    /* renamed from: g */
    private final List<C1586x> f6814g;

    /* renamed from: h */
    private boolean f6815h;

    /* renamed from: i */
    private InterfaceC7280m f6816i;

    public C1586x(C1553e0 c1553e0, String str, EnumC7271d enumC7271d, List<? extends AbstractC7288u> list, List<C1586x> list2) {
        this.f6808a = c1553e0;
        this.f6809b = str;
        this.f6810c = enumC7271d;
        this.f6811d = list;
        this.f6814g = list2;
        this.f6812e = new ArrayList(list.size());
        this.f6813f = new ArrayList();
        if (list2 != null) {
            Iterator<C1586x> it = list2.iterator();
            while (it.hasNext()) {
                this.f6813f.addAll(it.next().f6813f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String m21799b = list.get(i10).m21799b();
            this.f6812e.add(m21799b);
            this.f6813f.add(m21799b);
        }
    }

    public C1586x(C1553e0 c1553e0, List<? extends AbstractC7288u> list) {
        this(c1553e0, null, EnumC7271d.KEEP, list, null);
    }

    /* renamed from: i */
    private static boolean m8813i(C1586x c1586x, Set<String> set) {
        set.addAll(c1586x.m8817c());
        Set<String> m8814l = m8814l(c1586x);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (m8814l.contains(it.next())) {
                return true;
            }
        }
        List<C1586x> m8819e = c1586x.m8819e();
        if (m8819e != null && !m8819e.isEmpty()) {
            Iterator<C1586x> it2 = m8819e.iterator();
            while (it2.hasNext()) {
                if (m8813i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c1586x.m8817c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m8814l(C1586x c1586x) {
        HashSet hashSet = new HashSet();
        List<C1586x> m8819e = c1586x.m8819e();
        if (m8819e != null && !m8819e.isEmpty()) {
            Iterator<C1586x> it = m8819e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().m8817c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public InterfaceC7280m m8815a() {
        if (this.f6815h) {
            AbstractC7277j.m21767e().mo21777k(f6807j, "Already enqueued work ids (" + TextUtils.join(", ", this.f6812e) + ")");
        } else {
            RunnableC9350d runnableC9350d = new RunnableC9350d(this);
            this.f6808a.m8693s().m28365c(runnableC9350d);
            this.f6816i = runnableC9350d.m27852d();
        }
        return this.f6816i;
    }

    /* renamed from: b */
    public EnumC7271d m8816b() {
        return this.f6810c;
    }

    /* renamed from: c */
    public List<String> m8817c() {
        return this.f6812e;
    }

    /* renamed from: d */
    public String m8818d() {
        return this.f6809b;
    }

    /* renamed from: e */
    public List<C1586x> m8819e() {
        return this.f6814g;
    }

    /* renamed from: f */
    public List<? extends AbstractC7288u> m8820f() {
        return this.f6811d;
    }

    /* renamed from: g */
    public C1553e0 m8821g() {
        return this.f6808a;
    }

    /* renamed from: h */
    public boolean m8822h() {
        return m8813i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean m8823j() {
        return this.f6815h;
    }

    /* renamed from: k */
    public void m8824k() {
        this.f6815h = true;
    }
}
