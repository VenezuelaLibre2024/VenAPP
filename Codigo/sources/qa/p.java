package qa;

/* loaded from: classes.dex */
public enum p implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ES384(-35),
    ES512(-36);

    private final int zzb;

    p(int i10) {
        this.zzb = i10;
    }

    @Override // qa.a
    public int b() {
        return this.zzb;
    }
}
