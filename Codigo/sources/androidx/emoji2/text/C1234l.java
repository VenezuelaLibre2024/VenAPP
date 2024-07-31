package androidx.emoji2.text;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p019b1.C1606b;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
class C1234l {

    /* renamed from: androidx.emoji2.text.l$a */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: a */
        private final ByteBuffer f5123a;

        a(ByteBuffer byteBuffer) {
            this.f5123a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.C1234l.c
        /* renamed from: a */
        public void mo6695a(int i10) {
            ByteBuffer byteBuffer = this.f5123a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.C1234l.c
        /* renamed from: b */
        public int mo6696b() {
            return this.f5123a.getInt();
        }

        @Override // androidx.emoji2.text.C1234l.c
        /* renamed from: c */
        public long mo6697c() {
            return C1234l.m6693c(this.f5123a.getInt());
        }

        @Override // androidx.emoji2.text.C1234l.c
        public long getPosition() {
            return this.f5123a.position();
        }

        @Override // androidx.emoji2.text.C1234l.c
        public int readUnsignedShort() {
            return C1234l.m6694d(this.f5123a.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.l$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final long f5124a;

        /* renamed from: b */
        private final long f5125b;

        b(long j10, long j11) {
            this.f5124a = j10;
            this.f5125b = j11;
        }

        /* renamed from: a */
        long m6698a() {
            return this.f5124a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.l$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo6695a(int i10);

        /* renamed from: b */
        int mo6696b();

        /* renamed from: c */
        long mo6697c();

        long getPosition();

        int readUnsignedShort();
    }

    /* renamed from: a */
    private static b m6691a(c cVar) {
        long j10;
        cVar.mo6695a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.mo6695a(6);
        int i10 = 0;
        while (true) {
            if (i10 >= readUnsignedShort) {
                j10 = -1;
                break;
            }
            int mo6696b = cVar.mo6696b();
            cVar.mo6695a(4);
            j10 = cVar.mo6697c();
            cVar.mo6695a(4);
            if (1835365473 == mo6696b) {
                break;
            }
            i10++;
        }
        if (j10 != -1) {
            cVar.mo6695a((int) (j10 - cVar.getPosition()));
            cVar.mo6695a(12);
            long mo6697c = cVar.mo6697c();
            for (int i11 = 0; i11 < mo6697c; i11++) {
                int mo6696b2 = cVar.mo6696b();
                long mo6697c2 = cVar.mo6697c();
                long mo6697c3 = cVar.mo6697c();
                if (1164798569 == mo6696b2 || 1701669481 == mo6696b2) {
                    return new b(mo6697c2 + j10, mo6697c3);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1606b m6692b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m6691a(new a(duplicate)).m6698a());
        return C1606b.m8938h(duplicate);
    }

    /* renamed from: c */
    static long m6693c(int i10) {
        return i10 & KeyboardMap.kValueMask;
    }

    /* renamed from: d */
    static int m6694d(short s10) {
        return s10 & 65535;
    }
}
