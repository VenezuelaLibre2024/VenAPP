package j3;

import j3.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class t<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<Data> f19700a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.core.util.e<List<Throwable>> f19701b;

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f19702c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19703d;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, androidx.core.util.e<List<Throwable>> eVar) {
        this.f19700a = cls;
        this.f19701b = eVar;
        this.f19702c = (List) c4.k.c(list);
        this.f19703d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, h3.h hVar, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) {
        int size = this.f19702c.size();
        v<Transcode> vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVar = this.f19702c.get(i12).a(eVar, i10, i11, hVar, aVar);
            } catch (q e10) {
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f19703d, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, h3.h hVar, int i10, int i11, i.a<ResourceType> aVar) {
        List<Throwable> list = (List) c4.k.d(this.f19701b.b());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f19701b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f19702c.toArray()) + '}';
    }
}
