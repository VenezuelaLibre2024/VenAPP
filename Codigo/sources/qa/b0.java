package qa;

/* loaded from: classes.dex */
public enum b0 implements a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    private final int zzb;

    b0(int i10) {
        this.zzb = i10;
    }

    @Override // qa.a
    public int b() {
        return this.zzb;
    }
}
