package ua;

/* loaded from: classes2.dex */
public final class i extends o {

    /* renamed from: c, reason: collision with root package name */
    public final float f27519c;

    public i(float f10) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.f27519c = Math.max(f10, 0.0f);
    }

    @Override // ua.o
    public String toString() {
        return "[Dash: length=" + this.f27519c + "]";
    }
}
