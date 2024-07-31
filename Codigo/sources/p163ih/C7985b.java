package p163ih;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6957r;

/* renamed from: ih.b */
/* loaded from: classes3.dex */
public class C7985b {

    /* renamed from: a */
    protected C6956q f19432a;

    /* renamed from: b */
    protected C8000q f19433b;

    /* renamed from: c */
    private final int f19434c = 2;

    public C7985b(C6956q c6956q, C8000q c8000q) {
        this.f19432a = c6956q;
        this.f19433b = c8000q;
    }

    /* renamed from: f */
    public static List<C6958s> m24528f(List<C6958s> list, C8000q c8000q) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C6958s> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c8000q.m24577f(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public EnumC6940a m24529a() {
        return this.f19432a.m20109b();
    }

    /* renamed from: b */
    public Bitmap m24530b() {
        return this.f19433b.m24573b(null, 2);
    }

    /* renamed from: c */
    public byte[] m24531c() {
        return this.f19432a.m20110c();
    }

    /* renamed from: d */
    public Map<EnumC6957r, Object> m24532d() {
        return this.f19432a.m20111d();
    }

    /* renamed from: e */
    public String m24533e() {
        return this.f19432a.m20113f();
    }

    public String toString() {
        return this.f19432a.m20113f();
    }
}
