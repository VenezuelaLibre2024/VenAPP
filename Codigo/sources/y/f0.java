package y;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a */
    private final n.g f31490a;

    /* renamed from: b */
    private final Rect f31491b;

    /* renamed from: c */
    private final int f31492c;

    /* renamed from: d */
    private final int f31493d;

    /* renamed from: e */
    private final Matrix f31494e;

    /* renamed from: f */
    private final n0 f31495f;

    /* renamed from: g */
    private final String f31496g;

    /* renamed from: h */
    private final List<Integer> f31497h = new ArrayList();

    /* renamed from: i */
    final com.google.common.util.concurrent.f<Void> f31498i;

    public f0(androidx.camera.core.impl.k0 k0Var, n.g gVar, Rect rect, int i10, int i11, Matrix matrix, n0 n0Var, com.google.common.util.concurrent.f<Void> fVar) {
        this.f31490a = gVar;
        this.f31493d = i11;
        this.f31492c = i10;
        this.f31491b = rect;
        this.f31494e = matrix;
        this.f31495f = n0Var;
        this.f31496g = String.valueOf(k0Var.hashCode());
        List<androidx.camera.core.impl.m0> a10 = k0Var.a();
        Objects.requireNonNull(a10);
        Iterator<androidx.camera.core.impl.m0> it = a10.iterator();
        while (it.hasNext()) {
            this.f31497h.add(Integer.valueOf(it.next().getId()));
        }
        this.f31498i = fVar;
    }

    public com.google.common.util.concurrent.f<Void> a() {
        return this.f31498i;
    }

    public Rect b() {
        return this.f31491b;
    }

    public int c() {
        return this.f31493d;
    }

    public n.g d() {
        return this.f31490a;
    }

    public int e() {
        return this.f31492c;
    }

    public Matrix f() {
        return this.f31494e;
    }

    public List<Integer> g() {
        return this.f31497h;
    }

    public String h() {
        return this.f31496g;
    }

    public boolean i() {
        return this.f31495f.isAborted();
    }

    public boolean j() {
        return d() == null;
    }

    public void k(w.g0 g0Var) {
        this.f31495f.e(g0Var);
    }

    public void l(n.h hVar) {
        this.f31495f.b(hVar);
    }

    public void m(androidx.camera.core.o oVar) {
        this.f31495f.c(oVar);
    }

    public void n() {
        this.f31495f.d();
    }

    public void o(w.g0 g0Var) {
        this.f31495f.a(g0Var);
    }
}
