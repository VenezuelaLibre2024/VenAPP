package ih;

import android.graphics.Bitmap;
import dg.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected dg.q f17769a;

    /* renamed from: b, reason: collision with root package name */
    protected q f17770b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17771c = 2;

    public b(dg.q qVar, q qVar2) {
        this.f17769a = qVar;
        this.f17770b = qVar2;
    }

    public static List<s> f(List<s> list, q qVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<s> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(qVar.f(it.next()));
        }
        return arrayList;
    }

    public dg.a a() {
        return this.f17769a.b();
    }

    public Bitmap b() {
        return this.f17770b.b(null, 2);
    }

    public byte[] c() {
        return this.f17769a.c();
    }

    public Map<dg.r, Object> d() {
        return this.f17769a.d();
    }

    public String e() {
        return this.f17769a.f();
    }

    public String toString() {
        return this.f17769a.f();
    }
}
