package sk;

import java.util.Random;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b extends sk.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f25683c = new a();

    /* loaded from: classes3.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // sk.a
    public Random f() {
        Random random = this.f25683c.get();
        n.d(random, "implStorage.get()");
        return random;
    }
}
