package zk;

import gk.f;
import java.io.Closeable;

/* loaded from: classes3.dex */
public abstract class m1 extends h0 implements Closeable {

    /* renamed from: c */
    public static final a f32908c = new a(null);

    /* loaded from: classes3.dex */
    public static final class a extends gk.b<h0, m1> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zk.m1$a$a */
        /* loaded from: classes3.dex */
        public static final class C0546a extends kotlin.jvm.internal.o implements ok.l<f.b, m1> {

            /* renamed from: a */
            public static final C0546a f32909a = new C0546a();

            C0546a() {
                super(1);
            }

            @Override // ok.l
            /* renamed from: a */
            public final m1 invoke(f.b bVar) {
                if (bVar instanceof m1) {
                    return (m1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(h0.f32893b, C0546a.f32909a);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }
}
