package n3;

import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a */
    private final List<o<Model, Data>> f21755a;

    /* renamed from: b */
    private final androidx.core.util.e<List<Throwable>> f21756b;

    /* loaded from: classes.dex */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a */
        private final List<com.bumptech.glide.load.data.d<Data>> f21757a;

        /* renamed from: b */
        private final androidx.core.util.e<List<Throwable>> f21758b;

        /* renamed from: c */
        private int f21759c;

        /* renamed from: d */
        private com.bumptech.glide.g f21760d;

        /* renamed from: e */
        private d.a<? super Data> f21761e;

        /* renamed from: f */
        private List<Throwable> f21762f;

        /* renamed from: r */
        private boolean f21763r;

        a(List<com.bumptech.glide.load.data.d<Data>> list, androidx.core.util.e<List<Throwable>> eVar) {
            this.f21758b = eVar;
            c4.k.c(list);
            this.f21757a = list;
            this.f21759c = 0;
        }

        private void g() {
            if (this.f21763r) {
                return;
            }
            if (this.f21759c < this.f21757a.size() - 1) {
                this.f21759c++;
                e(this.f21760d, this.f21761e);
            } else {
                c4.k.d(this.f21762f);
                this.f21761e.c(new j3.q("Fetch failed", new ArrayList(this.f21762f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f21757a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f21762f;
            if (list != null) {
                this.f21758b.a(list);
            }
            this.f21762f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f21757a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) c4.k.d(this.f21762f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f21763r = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f21757a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public h3.a d() {
            return this.f21757a.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            this.f21760d = gVar;
            this.f21761e = aVar;
            this.f21762f = this.f21758b.b();
            this.f21757a.get(this.f21759c).e(gVar, this);
            if (this.f21763r) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Data data) {
            if (data != null) {
                this.f21761e.f(data);
            } else {
                g();
            }
        }
    }

    public r(List<o<Model, Data>> list, androidx.core.util.e<List<Throwable>> eVar) {
        this.f21755a = list;
        this.f21756b = eVar;
    }

    @Override // n3.o
    public boolean a(Model model) {
        Iterator<o<Model, Data>> it = this.f21755a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // n3.o
    public o.a<Data> b(Model model, int i10, int i11, h3.h hVar) {
        o.a<Data> b10;
        int size = this.f21755a.size();
        ArrayList arrayList = new ArrayList(size);
        h3.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            o<Model, Data> oVar = this.f21755a.get(i12);
            if (oVar.a(model) && (b10 = oVar.b(model, i10, i11, hVar)) != null) {
                fVar = b10.f21748a;
                arrayList.add(b10.f21750c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new o.a<>(fVar, new a(arrayList, this.f21756b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f21755a.toArray()) + '}';
    }
}
