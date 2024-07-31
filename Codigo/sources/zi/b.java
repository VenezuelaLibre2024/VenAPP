package zi;

import com.google.protobuf.b0;
import com.google.protobuf.h;
import com.google.protobuf.o;
import com.google.protobuf.r0;
import com.google.protobuf.z0;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import vi.x0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static volatile o f32822a = o.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a<T extends r0> implements x0.c {

        /* renamed from: c, reason: collision with root package name */
        private static final ThreadLocal<Reference<byte[]>> f32823c = new ThreadLocal<>();

        /* renamed from: a, reason: collision with root package name */
        private final z0<T> f32824a;

        /* renamed from: b, reason: collision with root package name */
        private final T f32825b;

        a(T t10) {
            this.f32825b = t10;
            this.f32824a = (z0<T>) t10.g();
        }

        private T d(h hVar) {
            T b10 = this.f32824a.b(hVar, b.f32822a);
            try {
                hVar.a(0);
                return b10;
            } catch (b0 e10) {
                e10.k(b10);
                throw e10;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
        @Override // vi.x0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T b(java.io.InputStream r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof zi.a
                if (r0 == 0) goto L17
                r0 = r6
                zi.a r0 = (zi.a) r0
                com.google.protobuf.z0 r0 = r0.e()
                com.google.protobuf.z0<T extends com.google.protobuf.r0> r1 = r5.f32824a
                if (r0 != r1) goto L17
                r0 = r6
                zi.a r0 = (zi.a) r0     // Catch: java.lang.IllegalStateException -> L17
                com.google.protobuf.r0 r6 = r0.b()     // Catch: java.lang.IllegalStateException -> L17
                return r6
            L17:
                boolean r0 = r6 instanceof vi.o0     // Catch: java.io.IOException -> La5
                if (r0 == 0) goto L81
                int r0 = r6.available()     // Catch: java.io.IOException -> La5
                if (r0 <= 0) goto L7c
                r1 = 4194304(0x400000, float:5.877472E-39)
                if (r0 > r1) goto L7c
                java.lang.ThreadLocal<java.lang.ref.Reference<byte[]>> r1 = zi.b.a.f32823c     // Catch: java.io.IOException -> La5
                java.lang.Object r2 = r1.get()     // Catch: java.io.IOException -> La5
                java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2     // Catch: java.io.IOException -> La5
                if (r2 == 0) goto L3a
                java.lang.Object r2 = r2.get()     // Catch: java.io.IOException -> La5
                byte[] r2 = (byte[]) r2     // Catch: java.io.IOException -> La5
                if (r2 == 0) goto L3a
                int r3 = r2.length     // Catch: java.io.IOException -> La5
                if (r3 >= r0) goto L44
            L3a:
                byte[] r2 = new byte[r0]     // Catch: java.io.IOException -> La5
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.io.IOException -> La5
                r3.<init>(r2)     // Catch: java.io.IOException -> La5
                r1.set(r3)     // Catch: java.io.IOException -> La5
            L44:
                r1 = r0
            L45:
                if (r1 <= 0) goto L53
                int r3 = r0 - r1
                int r3 = r6.read(r2, r3, r1)     // Catch: java.io.IOException -> La5
                r4 = -1
                if (r3 != r4) goto L51
                goto L53
            L51:
                int r1 = r1 - r3
                goto L45
            L53:
                if (r1 != 0) goto L5b
                r1 = 0
                com.google.protobuf.h r0 = com.google.protobuf.h.i(r2, r1, r0)     // Catch: java.io.IOException -> La5
                goto L82
            L5b:
                int r6 = r0 - r1
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.io.IOException -> La5
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La5
                r2.<init>()     // Catch: java.io.IOException -> La5
                java.lang.String r3 = "size inaccurate: "
                r2.append(r3)     // Catch: java.io.IOException -> La5
                r2.append(r0)     // Catch: java.io.IOException -> La5
                java.lang.String r0 = " != "
                r2.append(r0)     // Catch: java.io.IOException -> La5
                r2.append(r6)     // Catch: java.io.IOException -> La5
                java.lang.String r6 = r2.toString()     // Catch: java.io.IOException -> La5
                r1.<init>(r6)     // Catch: java.io.IOException -> La5
                throw r1     // Catch: java.io.IOException -> La5
            L7c:
                if (r0 != 0) goto L81
                T extends com.google.protobuf.r0 r6 = r5.f32825b     // Catch: java.io.IOException -> La5
                return r6
            L81:
                r0 = 0
            L82:
                if (r0 != 0) goto L88
                com.google.protobuf.h r0 = com.google.protobuf.h.f(r6)
            L88:
                r6 = 2147483647(0x7fffffff, float:NaN)
                r0.E(r6)
                com.google.protobuf.r0 r6 = r5.d(r0)     // Catch: com.google.protobuf.b0 -> L93
                return r6
            L93:
                r6 = move-exception
                vi.g1 r0 = vi.g1.f29114t
                java.lang.String r1 = "Invalid protobuf byte sequence"
                vi.g1 r0 = r0.r(r1)
                vi.g1 r6 = r0.q(r6)
                vi.i1 r6 = r6.d()
                throw r6
            La5:
                r6 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.b.a.b(java.io.InputStream):com.google.protobuf.r0");
        }

        @Override // vi.x0.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream a(T t10) {
            return new zi.a(t10, this.f32824a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(InputStream inputStream, OutputStream outputStream) {
        eb.o.p(inputStream, "inputStream cannot be null!");
        eb.o.p(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    public static <T extends r0> x0.c<T> b(T t10) {
        return new a(t10);
    }
}
