package p098f6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f6.a */
/* loaded from: classes.dex */
public final class C7297a<T> extends AbstractC7299c<T> {

    /* renamed from: a */
    private final Integer f16377a;

    /* renamed from: b */
    private final T f16378b;

    /* renamed from: c */
    private final EnumC7300d f16379c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7297a(Integer num, T t10, EnumC7300d enumC7300d) {
        this.f16377a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f16378b = t10;
        if (enumC7300d == null) {
            throw new NullPointerException("Null priority");
        }
        this.f16379c = enumC7300d;
    }

    @Override // p098f6.AbstractC7299c
    /* renamed from: a */
    public Integer mo21875a() {
        return this.f16377a;
    }

    @Override // p098f6.AbstractC7299c
    /* renamed from: b */
    public T mo21876b() {
        return this.f16378b;
    }

    @Override // p098f6.AbstractC7299c
    /* renamed from: c */
    public EnumC7300d mo21877c() {
        return this.f16379c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7299c)) {
            return false;
        }
        AbstractC7299c abstractC7299c = (AbstractC7299c) obj;
        Integer num = this.f16377a;
        if (num != null ? num.equals(abstractC7299c.mo21875a()) : abstractC7299c.mo21875a() == null) {
            if (this.f16378b.equals(abstractC7299c.mo21876b()) && this.f16379c.equals(abstractC7299c.mo21877c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f16377a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f16378b.hashCode()) * 1000003) ^ this.f16379c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f16377a + ", payload=" + this.f16378b + ", priority=" + this.f16379c + "}";
    }
}
