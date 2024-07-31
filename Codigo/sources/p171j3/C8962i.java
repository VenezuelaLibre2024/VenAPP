package p171j3;

import android.util.Log;
import androidx.core.util.InterfaceC0981e;
import com.bumptech.glide.load.data.InterfaceC2134e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p036c4.C1870k;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p393v3.InterfaceC11623e;

/* renamed from: j3.i */
/* loaded from: classes.dex */
public class C8962i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f21383a;

    /* renamed from: b */
    private final List<? extends InterfaceC7626j<DataType, ResourceType>> f21384b;

    /* renamed from: c */
    private final InterfaceC11623e<ResourceType, Transcode> f21385c;

    /* renamed from: d */
    private final InterfaceC0981e<List<Throwable>> f21386d;

    /* renamed from: e */
    private final String f21387e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.i$a */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        /* renamed from: a */
        InterfaceC8975v<ResourceType> mo26247a(InterfaceC8975v<ResourceType> interfaceC8975v);
    }

    public C8962i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC7626j<DataType, ResourceType>> list, InterfaceC11623e<ResourceType, Transcode> interfaceC11623e, InterfaceC0981e<List<Throwable>> interfaceC0981e) {
        this.f21383a = cls;
        this.f21384b = list;
        this.f21385c = interfaceC11623e;
        this.f21386d = interfaceC0981e;
        this.f21387e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC8975v<ResourceType> m26258b(InterfaceC2134e<DataType> interfaceC2134e, int i10, int i11, C7624h c7624h) {
        List<Throwable> list = (List) C1870k.m9950d(this.f21386d.mo4821b());
        try {
            return m26259c(interfaceC2134e, i10, i11, c7624h, list);
        } finally {
            this.f21386d.mo4820a(list);
        }
    }

    /* renamed from: c */
    private InterfaceC8975v<ResourceType> m26259c(InterfaceC2134e<DataType> interfaceC2134e, int i10, int i11, C7624h c7624h, List<Throwable> list) {
        int size = this.f21384b.size();
        InterfaceC8975v<ResourceType> interfaceC8975v = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC7626j<DataType, ResourceType> interfaceC7626j = this.f21384b.get(i12);
            try {
                if (interfaceC7626j.mo23151a(interfaceC2134e.mo10754a(), c7624h)) {
                    interfaceC8975v = interfaceC7626j.mo23152b(interfaceC2134e.mo10754a(), i10, i11, c7624h);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC7626j, e10);
                }
                list.add(e10);
            }
            if (interfaceC8975v != null) {
                break;
            }
        }
        if (interfaceC8975v != null) {
            return interfaceC8975v;
        }
        throw new C8970q(this.f21387e, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC8975v<Transcode> m26260a(InterfaceC2134e<DataType> interfaceC2134e, int i10, int i11, C7624h c7624h, a<ResourceType> aVar) {
        return this.f21385c.mo36414a(aVar.mo26247a(m26258b(interfaceC2134e, i10, i11, c7624h)), c7624h);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f21383a + ", decoders=" + this.f21384b + ", transcoder=" + this.f21385c + '}';
    }
}
