package p459y6;

import java.util.Arrays;
import p351s8.InterfaceC10823h;
import p361t6.C11108u1;
import p363t8.C11146e0;

/* renamed from: y6.b0 */
/* loaded from: classes.dex */
public interface InterfaceC12609b0 {

    /* renamed from: y6.b0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f34225a;

        /* renamed from: b */
        public final byte[] f34226b;

        /* renamed from: c */
        public final int f34227c;

        /* renamed from: d */
        public final int f34228d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f34225a = i10;
            this.f34226b = bArr;
            this.f34227c = i11;
            this.f34228d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f34225a == aVar.f34225a && this.f34227c == aVar.f34227c && this.f34228d == aVar.f34228d && Arrays.equals(this.f34226b, aVar.f34226b);
        }

        public int hashCode() {
            return (((((this.f34225a * 31) + Arrays.hashCode(this.f34226b)) * 31) + this.f34227c) * 31) + this.f34228d;
        }
    }

    /* renamed from: a */
    default void m41511a(C11146e0 c11146e0, int i10) {
        mo333d(c11146e0, i10, 0);
    }

    /* renamed from: b */
    void mo331b(long j10, int i10, int i11, int i12, a aVar);

    /* renamed from: c */
    void mo332c(C11108u1 c11108u1);

    /* renamed from: d */
    void mo333d(C11146e0 c11146e0, int i10, int i11);

    /* renamed from: e */
    int mo334e(InterfaceC10823h interfaceC10823h, int i10, boolean z10, int i11);

    /* renamed from: f */
    default int m41512f(InterfaceC10823h interfaceC10823h, int i10, boolean z10) {
        return mo334e(interfaceC10823h, i10, z10, 0);
    }
}
