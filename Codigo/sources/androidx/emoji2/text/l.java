package androidx.emoji2.text;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class l {

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f4412a;

        a(ByteBuffer byteBuffer) {
            this.f4412a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public void a(int i10) {
            ByteBuffer byteBuffer = this.f4412a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.l.c
        public int b() {
            return this.f4412a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public long c() {
            return l.c(this.f4412a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f4412a.position();
        }

        @Override // androidx.emoji2.text.l.c
        public int readUnsignedShort() {
            return l.d(this.f4412a.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f4413a;

        /* renamed from: b, reason: collision with root package name */
        private final long f4414b;

        b(long j10, long j11) {
            this.f4413a = j10;
            this.f4414b = j11;
        }

        long a() {
            return this.f4413a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        void a(int i10);

        int b();

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j10;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i10 = 0;
        while (true) {
            if (i10 >= readUnsignedShort) {
                j10 = -1;
                break;
            }
            int b10 = cVar.b();
            cVar.a(4);
            j10 = cVar.c();
            cVar.a(4);
            if (1835365473 == b10) {
                break;
            }
            i10++;
        }
        if (j10 != -1) {
            cVar.a((int) (j10 - cVar.getPosition()));
            cVar.a(12);
            long c10 = cVar.c();
            for (int i11 = 0; i11 < c10; i11++) {
                int b11 = cVar.b();
                long c11 = cVar.c();
                long c12 = cVar.c();
                if (1164798569 == b11 || 1701669481 == b11) {
                    return new b(c11 + j10, c12);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b1.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return b1.b.h(duplicate);
    }

    static long c(int i10) {
        return i10 & KeyboardMap.kValueMask;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
