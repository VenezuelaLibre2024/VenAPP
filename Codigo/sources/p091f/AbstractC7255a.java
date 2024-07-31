package p091f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C9322n;

/* renamed from: f.a */
/* loaded from: classes.dex */
public abstract class AbstractC7255a<I, O> {

    /* renamed from: f.a$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        private final T f16255a;

        public a(T t10) {
            this.f16255a = t10;
        }

        /* renamed from: a */
        public final T m21705a() {
            return this.f16255a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo7118a(Context context, I i10);

    /* renamed from: b */
    public a<O> mo21704b(Context context, I i10) {
        C9322n.m27781e(context, "context");
        return null;
    }

    /* renamed from: c */
    public abstract O mo7119c(int i10, Intent intent);
}
