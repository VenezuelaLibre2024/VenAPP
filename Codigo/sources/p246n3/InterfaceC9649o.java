package p246n3;

import com.bumptech.glide.load.data.InterfaceC2133d;
import java.util.Collections;
import java.util.List;
import p036c4.C1870k;
import p129h3.C7624h;
import p129h3.InterfaceC7622f;

/* renamed from: n3.o */
/* loaded from: classes.dex */
public interface InterfaceC9649o<Model, Data> {

    /* renamed from: n3.o$a */
    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a */
        public final InterfaceC7622f f23681a;

        /* renamed from: b */
        public final List<InterfaceC7622f> f23682b;

        /* renamed from: c */
        public final InterfaceC2133d<Data> f23683c;

        public a(InterfaceC7622f interfaceC7622f, InterfaceC2133d<Data> interfaceC2133d) {
            this(interfaceC7622f, Collections.emptyList(), interfaceC2133d);
        }

        public a(InterfaceC7622f interfaceC7622f, List<InterfaceC7622f> list, InterfaceC2133d<Data> interfaceC2133d) {
            this.f23681a = (InterfaceC7622f) C1870k.m9950d(interfaceC7622f);
            this.f23682b = (List) C1870k.m9950d(list);
            this.f23683c = (InterfaceC2133d) C1870k.m9950d(interfaceC2133d);
        }
    }

    /* renamed from: a */
    boolean mo28847a(Model model);

    /* renamed from: b */
    a<Data> mo28848b(Model model, int i10, int i11, C7624h c7624h);
}
