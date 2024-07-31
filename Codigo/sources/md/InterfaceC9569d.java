package md;

/* renamed from: md.d */
/* loaded from: classes.dex */
public @interface InterfaceC9569d {

    /* renamed from: md.d$a */
    /* loaded from: classes.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
