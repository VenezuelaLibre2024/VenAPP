package h6;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q implements f6.g {

    /* renamed from: a */
    private final Set<f6.b> f16452a;

    /* renamed from: b */
    private final p f16453b;

    /* renamed from: c */
    private final t f16454c;

    public q(Set<f6.b> set, p pVar, t tVar) {
        this.f16452a = set;
        this.f16453b = pVar;
        this.f16454c = tVar;
    }

    @Override // f6.g
    public <T> f6.f<T> a(String str, Class<T> cls, f6.e<T, byte[]> eVar) {
        return b(str, cls, f6.b.b("proto"), eVar);
    }

    @Override // f6.g
    public <T> f6.f<T> b(String str, Class<T> cls, f6.b bVar, f6.e<T, byte[]> eVar) {
        if (this.f16452a.contains(bVar)) {
            return new s(this.f16453b, str, bVar, eVar, this.f16454c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f16452a));
    }
}
