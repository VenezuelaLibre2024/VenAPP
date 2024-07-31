package ih;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class j implements g {

    /* renamed from: a */
    private Collection<dg.a> f17791a;

    /* renamed from: b */
    private Map<dg.e, ?> f17792b;

    /* renamed from: c */
    private String f17793c;

    /* renamed from: d */
    private int f17794d;

    public j() {
    }

    public j(Collection<dg.a> collection, Map<dg.e, ?> map, String str, int i10) {
        this.f17791a = collection;
        this.f17792b = map;
        this.f17793c = str;
        this.f17794d = i10;
    }

    @Override // ih.g
    public f a(Map<dg.e, ?> map) {
        EnumMap enumMap = new EnumMap(dg.e.class);
        enumMap.putAll(map);
        Map<dg.e, ?> map2 = this.f17792b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<dg.a> collection = this.f17791a;
        if (collection != null) {
            enumMap.put((EnumMap) dg.e.POSSIBLE_FORMATS, (dg.e) collection);
        }
        String str = this.f17793c;
        if (str != null) {
            enumMap.put((EnumMap) dg.e.CHARACTER_SET, (dg.e) str);
        }
        dg.k kVar = new dg.k();
        kVar.e(enumMap);
        int i10 = this.f17794d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new f(kVar) : new l(kVar) : new k(kVar) : new f(kVar);
    }
}
