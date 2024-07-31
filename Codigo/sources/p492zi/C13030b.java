package p492zi;

import com.google.protobuf.AbstractC6583h;
import com.google.protobuf.C6566b0;
import com.google.protobuf.C6604o;
import com.google.protobuf.InterfaceC6614r0;
import com.google.protobuf.InterfaceC6634z0;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import p082eb.C7159o;
import vi.C11955x0;

/* renamed from: zi.b */
/* loaded from: classes3.dex */
public final class C13030b {

    /* renamed from: a */
    static volatile C6604o f35373a = C6604o.m18973b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zi.b$a */
    /* loaded from: classes3.dex */
    public static final class a<T extends InterfaceC6614r0> implements C11955x0.c {

        /* renamed from: c */
        private static final ThreadLocal<Reference<byte[]>> f35374c = new ThreadLocal<>();

        /* renamed from: a */
        private final InterfaceC6634z0<T> f35375a;

        /* renamed from: b */
        private final T f35376b;

        a(T t10) {
            this.f35376b = t10;
            this.f35375a = (InterfaceC6634z0<T>) t10.mo19035g();
        }

        /* renamed from: d */
        private T m43020d(AbstractC6583h abstractC6583h) {
            T mo18389b = this.f35375a.mo18389b(abstractC6583h, C13030b.f35373a);
            try {
                abstractC6583h.mo18562a(0);
                return mo18389b;
            } catch (C6566b0 e10) {
                e10.m18409k(mo18389b);
                throw e10;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
        @Override // vi.C11955x0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T mo38354b(java.io.InputStream r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof p492zi.C13029a
                if (r0 == 0) goto L17
                r0 = r6
                zi.a r0 = (p492zi.C13029a) r0
                com.google.protobuf.z0 r0 = r0.m43017e()
                com.google.protobuf.z0<T extends com.google.protobuf.r0> r1 = r5.f35375a
                if (r0 != r1) goto L17
                r0 = r6
                zi.a r0 = (p492zi.C13029a) r0     // Catch: java.lang.IllegalStateException -> L17
                com.google.protobuf.r0 r6 = r0.m43016b()     // Catch: java.lang.IllegalStateException -> L17
                return r6
            L17:
                boolean r0 = r6 instanceof vi.InterfaceC11937o0     // Catch: java.io.IOException -> La5
                if (r0 == 0) goto L81
                int r0 = r6.available()     // Catch: java.io.IOException -> La5
                if (r0 <= 0) goto L7c
                r1 = 4194304(0x400000, float:5.877472E-39)
                if (r0 > r1) goto L7c
                java.lang.ThreadLocal<java.lang.ref.Reference<byte[]>> r1 = p492zi.C13030b.a.f35374c     // Catch: java.io.IOException -> La5
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
                com.google.protobuf.h r0 = com.google.protobuf.AbstractC6583h.m18554i(r2, r1, r0)     // Catch: java.io.IOException -> La5
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
                T extends com.google.protobuf.r0 r6 = r5.f35376b     // Catch: java.io.IOException -> La5
                return r6
            L81:
                r0 = 0
            L82:
                if (r0 != 0) goto L88
                com.google.protobuf.h r0 = com.google.protobuf.AbstractC6583h.m18551f(r6)
            L88:
                r6 = 2147483647(0x7fffffff, float:NaN)
                r0.m18560E(r6)
                com.google.protobuf.r0 r6 = r5.m43020d(r0)     // Catch: com.google.protobuf.C6566b0 -> L93
                return r6
            L93:
                r6 = move-exception
                vi.g1 r0 = vi.C11915g1.f31548t
                java.lang.String r1 = "Invalid protobuf byte sequence"
                vi.g1 r0 = r0.m38147r(r1)
                vi.g1 r6 = r0.m38146q(r6)
                vi.i1 r6 = r6.m38139d()
                throw r6
            La5:
                r6 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p492zi.C13030b.a.mo38354b(java.io.InputStream):com.google.protobuf.r0");
        }

        @Override // vi.C11955x0.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream mo38353a(T t10) {
            return new C13029a(t10, this.f35375a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m43018a(InputStream inputStream, OutputStream outputStream) {
        C7159o.m21313p(inputStream, "inputStream cannot be null!");
        C7159o.m21313p(outputStream, "outputStream cannot be null!");
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

    /* renamed from: b */
    public static <T extends InterfaceC6614r0> C11955x0.c<T> m43019b(T t10) {
        return new a(t10);
    }
}
