package p452y;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C0709n;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.InterfaceC0638k0;
import androidx.camera.core.impl.InterfaceC0646m0;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p407w.C12008g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.f0 */
/* loaded from: classes.dex */
public class C12541f0 {

    /* renamed from: a */
    private final C0709n.g f34010a;

    /* renamed from: b */
    private final Rect f34011b;

    /* renamed from: c */
    private final int f34012c;

    /* renamed from: d */
    private final int f34013d;

    /* renamed from: e */
    private final Matrix f34014e;

    /* renamed from: f */
    private final InterfaceC12557n0 f34015f;

    /* renamed from: g */
    private final String f34016g;

    /* renamed from: h */
    private final List<Integer> f34017h = new ArrayList();

    /* renamed from: i */
    final InterfaceFutureC5920f<Void> f34018i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12541f0(InterfaceC0638k0 interfaceC0638k0, C0709n.g gVar, Rect rect, int i10, int i11, Matrix matrix, InterfaceC12557n0 interfaceC12557n0, InterfaceFutureC5920f<Void> interfaceFutureC5920f) {
        this.f34010a = gVar;
        this.f34013d = i11;
        this.f34012c = i10;
        this.f34011b = rect;
        this.f34014e = matrix;
        this.f34015f = interfaceC12557n0;
        this.f34016g = String.valueOf(interfaceC0638k0.hashCode());
        List<InterfaceC0646m0> mo3134a = interfaceC0638k0.mo3134a();
        Objects.requireNonNull(mo3134a);
        Iterator<InterfaceC0646m0> it = mo3134a.iterator();
        while (it.hasNext()) {
            this.f34017h.add(Integer.valueOf(it.next().getId()));
        }
        this.f34018i = interfaceFutureC5920f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public InterfaceFutureC5920f<Void> m41176a() {
        return this.f34018i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Rect m41177b() {
        return this.f34011b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m41178c() {
        return this.f34013d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C0709n.g m41179d() {
        return this.f34010a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m41180e() {
        return this.f34012c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Matrix m41181f() {
        return this.f34014e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<Integer> m41182g() {
        return this.f34017h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m41183h() {
        return this.f34016g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m41184i() {
        return this.f34015f.isAborted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m41185j() {
        return m41179d() == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m41186k(C12008g0 c12008g0) {
        this.f34015f.mo41206e(c12008g0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m41187l(C0709n.h hVar) {
        this.f34015f.mo41203b(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m41188m(InterfaceC0710o interfaceC0710o) {
        this.f34015f.mo41204c(interfaceC0710o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m41189n() {
        this.f34015f.mo41205d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m41190o(C12008g0 c12008g0) {
        this.f34015f.mo41202a(c12008g0);
    }
}
