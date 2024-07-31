package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.x */
/* loaded from: classes.dex */
class C1213x implements InterfaceC1195q0 {

    /* renamed from: a */
    private static final C1213x f5028a = new C1213x();

    private C1213x() {
    }

    /* renamed from: c */
    public static C1213x m6541c() {
        return f5028a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1195q0
    /* renamed from: a */
    public InterfaceC1192p0 mo5987a(Class<?> cls) {
        if (!AbstractC1215y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC1192p0) AbstractC1215y.m6550w(cls.asSubclass(AbstractC1215y.class)).m6555p();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1195q0
    /* renamed from: b */
    public boolean mo5988b(Class<?> cls) {
        return AbstractC1215y.class.isAssignableFrom(cls);
    }
}
