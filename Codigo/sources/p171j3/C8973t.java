package p171j3;

import androidx.core.util.InterfaceC0981e;
import com.bumptech.glide.load.data.InterfaceC2134e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p036c4.C1870k;
import p129h3.C7624h;
import p171j3.C8962i;

/* renamed from: j3.t */
/* loaded from: classes.dex */
public class C8973t<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f21479a;

    /* renamed from: b */
    private final InterfaceC0981e<List<Throwable>> f21480b;

    /* renamed from: c */
    private final List<? extends C8962i<Data, ResourceType, Transcode>> f21481c;

    /* renamed from: d */
    private final String f21482d;

    public C8973t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C8962i<Data, ResourceType, Transcode>> list, InterfaceC0981e<List<Throwable>> interfaceC0981e) {
        this.f21479a = cls;
        this.f21480b = interfaceC0981e;
        this.f21481c = (List) C1870k.m9949c(list);
        this.f21482d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC8975v<Transcode> m26328b(InterfaceC2134e<Data> interfaceC2134e, C7624h c7624h, int i10, int i11, C8962i.a<ResourceType> aVar, List<Throwable> list) {
        int size = this.f21481c.size();
        InterfaceC8975v<Transcode> interfaceC8975v = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                interfaceC8975v = this.f21481c.get(i12).m26260a(interfaceC2134e, i10, i11, c7624h, aVar);
            } catch (C8970q e10) {
                list.add(e10);
            }
            if (interfaceC8975v != null) {
                break;
            }
        }
        if (interfaceC8975v != null) {
            return interfaceC8975v;
        }
        throw new C8970q(this.f21482d, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC8975v<Transcode> m26329a(InterfaceC2134e<Data> interfaceC2134e, C7624h c7624h, int i10, int i11, C8962i.a<ResourceType> aVar) {
        List<Throwable> list = (List) C1870k.m9950d(this.f21480b.mo4821b());
        try {
            return m26328b(interfaceC2134e, c7624h, i10, i11, aVar, list);
        } finally {
            this.f21480b.mo4820a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f21481c.toArray()) + '}';
    }
}
