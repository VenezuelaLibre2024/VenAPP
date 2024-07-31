package o3;

import com.bumptech.glide.load.data.j;
import h3.g;
import java.io.InputStream;
import n3.h;
import n3.n;
import n3.o;
import n3.p;
import n3.s;

/* loaded from: classes.dex */
public class a implements o<h, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final g<Integer> f22154b = g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    private final n<h, h> f22155a;

    /* renamed from: o3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0366a implements p<h, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final n<h, h> f22156a = new n<>(500);

        @Override // n3.p
        public o<h, InputStream> d(s sVar) {
            return new a(this.f22156a);
        }
    }

    public a(n<h, h> nVar) {
        this.f22155a = nVar;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(h hVar, int i10, int i11, h3.h hVar2) {
        n<h, h> nVar = this.f22155a;
        if (nVar != null) {
            h a10 = nVar.a(hVar, 0, 0);
            if (a10 == null) {
                this.f22155a.b(hVar, 0, 0, hVar);
            } else {
                hVar = a10;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) hVar2.c(f22154b)).intValue()));
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }
}
