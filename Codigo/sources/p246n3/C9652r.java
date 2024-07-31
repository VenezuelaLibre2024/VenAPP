package p246n3;

import androidx.core.util.InterfaceC0981e;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p036c4.C1870k;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p129h3.InterfaceC7622f;
import p171j3.C8970q;
import p246n3.InterfaceC9649o;

/* renamed from: n3.r */
/* loaded from: classes.dex */
class C9652r<Model, Data> implements InterfaceC9649o<Model, Data> {

    /* renamed from: a */
    private final List<InterfaceC9649o<Model, Data>> f23688a;

    /* renamed from: b */
    private final InterfaceC0981e<List<Throwable>> f23689b;

    /* renamed from: n3.r$a */
    /* loaded from: classes.dex */
    static class a<Data> implements InterfaceC2133d<Data>, InterfaceC2133d.a<Data> {

        /* renamed from: a */
        private final List<InterfaceC2133d<Data>> f23690a;

        /* renamed from: b */
        private final InterfaceC0981e<List<Throwable>> f23691b;

        /* renamed from: c */
        private int f23692c;

        /* renamed from: d */
        private EnumC2121g f23693d;

        /* renamed from: e */
        private InterfaceC2133d.a<? super Data> f23694e;

        /* renamed from: f */
        private List<Throwable> f23695f;

        /* renamed from: r */
        private boolean f23696r;

        a(List<InterfaceC2133d<Data>> list, InterfaceC0981e<List<Throwable>> interfaceC0981e) {
            this.f23691b = interfaceC0981e;
            C1870k.m9949c(list);
            this.f23690a = list;
            this.f23692c = 0;
        }

        /* renamed from: g */
        private void m28924g() {
            if (this.f23696r) {
                return;
            }
            if (this.f23692c < this.f23690a.size() - 1) {
                this.f23692c++;
                mo10768e(this.f23693d, this.f23694e);
            } else {
                C1870k.m9950d(this.f23695f);
                this.f23694e.mo10773c(new C8970q("Fetch failed", new ArrayList(this.f23695f)));
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<Data> mo10760a() {
            return this.f23690a.get(0).mo10760a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: b */
        public void mo10765b() {
            List<Throwable> list = this.f23695f;
            if (list != null) {
                this.f23691b.mo4820a(list);
            }
            this.f23695f = null;
            Iterator<InterfaceC2133d<Data>> it = this.f23690a.iterator();
            while (it.hasNext()) {
                it.next().mo10765b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d.a
        /* renamed from: c */
        public void mo10773c(Exception exc) {
            ((List) C1870k.m9950d(this.f23695f)).add(exc);
            m28924g();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        public void cancel() {
            this.f23696r = true;
            Iterator<InterfaceC2133d<Data>> it = this.f23690a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: d */
        public EnumC7617a mo10767d() {
            return this.f23690a.get(0).mo10767d();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: e */
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super Data> aVar) {
            this.f23693d = enumC2121g;
            this.f23694e = aVar;
            this.f23695f = this.f23691b.mo4821b();
            this.f23690a.get(this.f23692c).mo10768e(enumC2121g, this);
            if (this.f23696r) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d.a
        /* renamed from: f */
        public void mo10774f(Data data) {
            if (data != null) {
                this.f23694e.mo10774f(data);
            } else {
                m28924g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9652r(List<InterfaceC9649o<Model, Data>> list, InterfaceC0981e<List<Throwable>> interfaceC0981e) {
        this.f23688a = list;
        this.f23689b = interfaceC0981e;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: a */
    public boolean mo28847a(Model model) {
        Iterator<InterfaceC9649o<Model, Data>> it = this.f23688a.iterator();
        while (it.hasNext()) {
            if (it.next().mo28847a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: b */
    public InterfaceC9649o.a<Data> mo28848b(Model model, int i10, int i11, C7624h c7624h) {
        InterfaceC9649o.a<Data> mo28848b;
        int size = this.f23688a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC7622f interfaceC7622f = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC9649o<Model, Data> interfaceC9649o = this.f23688a.get(i12);
            if (interfaceC9649o.mo28847a(model) && (mo28848b = interfaceC9649o.mo28848b(model, i10, i11, c7624h)) != null) {
                interfaceC7622f = mo28848b.f23681a;
                arrayList.add(mo28848b.f23683c);
            }
        }
        if (arrayList.isEmpty() || interfaceC7622f == null) {
            return null;
        }
        return new InterfaceC9649o.a<>(interfaceC7622f, new a(arrayList, this.f23689b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f23688a.toArray()) + '}';
    }
}
