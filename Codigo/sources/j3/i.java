package j3;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<DataType> f19615a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends h3.j<DataType, ResourceType>> f19616b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.e<ResourceType, Transcode> f19617c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.util.e<List<Throwable>> f19618d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19619e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        v<ResourceType> a(v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends h3.j<DataType, ResourceType>> list, v3.e<ResourceType, Transcode> eVar, androidx.core.util.e<List<Throwable>> eVar2) {
        this.f19615a = cls;
        this.f19616b = list;
        this.f19617c = eVar;
        this.f19618d = eVar2;
        this.f19619e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, h3.h hVar) {
        List<Throwable> list = (List) c4.k.d(this.f19618d.b());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f19618d.a(list);
        }
    }

    private v<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, h3.h hVar, List<Throwable> list) {
        int size = this.f19616b.size();
        v<ResourceType> vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            h3.j<DataType, ResourceType> jVar = this.f19616b.get(i12);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    vVar = jVar.b(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f19619e, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, h3.h hVar, a<ResourceType> aVar) {
        return this.f19617c.a(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f19615a + ", decoders=" + this.f19616b + ", transcoder=" + this.f19617c + '}';
    }
}
