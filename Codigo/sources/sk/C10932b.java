package sk;

import java.util.Random;
import kotlin.jvm.internal.C9322n;

/* renamed from: sk.b */
/* loaded from: classes3.dex */
public final class C10932b extends AbstractC10931a {

    /* renamed from: c */
    private final a f27827c = new a();

    /* renamed from: sk.b$a */
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

    @Override // sk.AbstractC10931a
    /* renamed from: f */
    public Random mo33399f() {
        Random random = this.f27827c.get();
        C9322n.m27780d(random, "implStorage.get()");
        return random;
    }
}
