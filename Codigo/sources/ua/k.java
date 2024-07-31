package ua;

/* loaded from: classes2.dex */
public final class k extends o {

    /* renamed from: c, reason: collision with root package name */
    public final float f27522c;

    public k(float f10) {
        super(2, Float.valueOf(Math.max(f10, 0.0f)));
        this.f27522c = Math.max(f10, 0.0f);
    }

    @Override // ua.o
    public String toString() {
        return "[Gap: length=" + this.f27522c + "]";
    }
}
