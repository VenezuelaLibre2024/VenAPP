package fh;

import dh.h;
import dh.j;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private h f15221a;

    /* renamed from: b, reason: collision with root package name */
    private dh.f f15222b;

    /* renamed from: c, reason: collision with root package name */
    private j f15223c;

    /* renamed from: d, reason: collision with root package name */
    private int f15224d = -1;

    /* renamed from: e, reason: collision with root package name */
    private b f15225e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f15225e;
    }

    public void c(dh.f fVar) {
        this.f15222b = fVar;
    }

    public void d(int i10) {
        this.f15224d = i10;
    }

    public void e(b bVar) {
        this.f15225e = bVar;
    }

    public void f(h hVar) {
        this.f15221a = hVar;
    }

    public void g(j jVar) {
        this.f15223c = jVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f15221a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f15222b);
        sb2.append("\n version: ");
        sb2.append(this.f15223c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f15224d);
        if (this.f15225e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f15225e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
