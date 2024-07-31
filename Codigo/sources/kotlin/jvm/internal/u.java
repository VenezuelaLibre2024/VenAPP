package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public abstract class u extends c implements vk.h {

    /* renamed from: a */
    private final boolean f20756a;

    public u() {
        this.f20756a = false;
    }

    public u(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f20756a = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: a */
    public vk.h getReflected() {
        if (this.f20756a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (vk.h) super.getReflected();
    }

    @Override // kotlin.jvm.internal.c
    public vk.b compute() {
        return this.f20756a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return getOwner().equals(uVar.getOwner()) && getName().equals(uVar.getName()) && getSignature().equals(uVar.getSignature()) && n.a(getBoundReceiver(), uVar.getBoundReceiver());
        }
        if (obj instanceof vk.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        vk.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
