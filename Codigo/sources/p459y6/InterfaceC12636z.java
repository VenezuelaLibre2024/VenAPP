package p459y6;

import p363t8.C11137a;

/* renamed from: y6.z */
/* loaded from: classes.dex */
public interface InterfaceC12636z {

    /* renamed from: y6.z$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C12607a0 f34332a;

        /* renamed from: b */
        public final C12607a0 f34333b;

        public a(C12607a0 c12607a0) {
            this(c12607a0, c12607a0);
        }

        public a(C12607a0 c12607a0, C12607a0 c12607a02) {
            this.f34332a = (C12607a0) C11137a.m34603e(c12607a0);
            this.f34333b = (C12607a0) C11137a.m34603e(c12607a02);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f34332a.equals(aVar.f34332a) && this.f34333b.equals(aVar.f34333b);
        }

        public int hashCode() {
            return (this.f34332a.hashCode() * 31) + this.f34333b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f34332a);
            if (this.f34332a.equals(this.f34333b)) {
                str = "";
            } else {
                str = ", " + this.f34333b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: y6.z$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC12636z {

        /* renamed from: a */
        private final long f34334a;

        /* renamed from: b */
        private final a f34335b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f34334a = j10;
            this.f34335b = new a(j11 == 0 ? C12607a0.f34222c : new C12607a0(0L, j11));
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: d */
        public a mo125d(long j10) {
            return this.f34335b;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: h */
        public boolean mo126h() {
            return false;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: i */
        public long mo127i() {
            return this.f34334a;
        }
    }

    /* renamed from: d */
    a mo125d(long j10);

    /* renamed from: h */
    boolean mo126h();

    /* renamed from: i */
    long mo127i();
}
