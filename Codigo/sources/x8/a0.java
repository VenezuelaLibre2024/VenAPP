package x8;

import java.util.Locale;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    protected final int f30651a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f30652b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f30653c;

    public a0(int i10, int i11, int i12) {
        this.f30651a = i10;
        this.f30652b = i11;
        this.f30653c = i12;
    }

    public int a() {
        return this.f30651a;
    }

    public int b() {
        return this.f30653c;
    }

    public int c() {
        return this.f30652b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f30651a), Integer.valueOf(this.f30652b), Integer.valueOf(this.f30653c));
    }
}
