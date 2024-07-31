package qa;

/* renamed from: qa.b0 */
/* loaded from: classes.dex */
public enum EnumC10334b0 implements InterfaceC10329a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    private final int zzb;

    EnumC10334b0(int i10) {
        this.zzb = i10;
    }

    @Override // qa.InterfaceC10329a
    /* renamed from: b */
    public int mo31114b() {
        return this.zzb;
    }
}
