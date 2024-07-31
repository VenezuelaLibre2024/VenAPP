package p396v6;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p363t8.C11172r0;

/* renamed from: v6.w */
/* loaded from: classes.dex */
final class C11675w {

    /* renamed from: a */
    private final a f30508a;

    /* renamed from: b */
    private int f30509b;

    /* renamed from: c */
    private long f30510c;

    /* renamed from: d */
    private long f30511d;

    /* renamed from: e */
    private long f30512e;

    /* renamed from: f */
    private long f30513f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.w$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final AudioTrack f30514a;

        /* renamed from: b */
        private final AudioTimestamp f30515b = new AudioTimestamp();

        /* renamed from: c */
        private long f30516c;

        /* renamed from: d */
        private long f30517d;

        /* renamed from: e */
        private long f30518e;

        public a(AudioTrack audioTrack) {
            this.f30514a = audioTrack;
        }

        /* renamed from: a */
        public long m36743a() {
            return this.f30518e;
        }

        /* renamed from: b */
        public long m36744b() {
            return this.f30515b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean m36745c() {
            boolean timestamp = this.f30514a.getTimestamp(this.f30515b);
            if (timestamp) {
                long j10 = this.f30515b.framePosition;
                if (this.f30517d > j10) {
                    this.f30516c++;
                }
                this.f30517d = j10;
                this.f30518e = j10 + (this.f30516c << 32);
            }
            return timestamp;
        }
    }

    public C11675w(AudioTrack audioTrack) {
        if (C11172r0.f29040a >= 19) {
            this.f30508a = new a(audioTrack);
            m36742g();
        } else {
            this.f30508a = null;
            m36735h(3);
        }
    }

    /* renamed from: h */
    private void m36735h(int i10) {
        this.f30509b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f30512e = 0L;
            this.f30513f = -1L;
            this.f30510c = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                j10 = 10000000;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                j10 = 500000;
            }
        }
        this.f30511d = j10;
    }

    /* renamed from: a */
    public void m36736a() {
        if (this.f30509b == 4) {
            m36742g();
        }
    }

    /* renamed from: b */
    public long m36737b() {
        a aVar = this.f30508a;
        if (aVar != null) {
            return aVar.m36743a();
        }
        return -1L;
    }

    /* renamed from: c */
    public long m36738c() {
        a aVar = this.f30508a;
        if (aVar != null) {
            return aVar.m36744b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean m36739d() {
        return this.f30509b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0 == false) goto L26;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m36740e(long r7) {
        /*
            r6 = this;
            v6.w$a r0 = r6.f30508a
            r1 = 0
            if (r0 == 0) goto L71
            long r2 = r6.f30512e
            long r2 = r7 - r2
            long r4 = r6.f30511d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L10
            goto L71
        L10:
            r6.f30512e = r7
            boolean r0 = r0.m36745c()
            int r2 = r6.f30509b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L49
            r7 = 2
            if (r2 == r4) goto L33
            if (r2 == r7) goto L30
            if (r2 == r3) goto L2d
            r7 = 4
            if (r2 != r7) goto L27
            goto L70
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L2d:
            if (r0 == 0) goto L70
            goto L45
        L30:
            if (r0 != 0) goto L70
            goto L45
        L33:
            if (r0 == 0) goto L45
            v6.w$a r8 = r6.f30508a
            long r1 = r8.m36743a()
            long r3 = r6.f30513f
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L70
            r6.m36735h(r7)
            goto L70
        L45:
            r6.m36742g()
            goto L70
        L49:
            if (r0 == 0) goto L63
            v6.w$a r7 = r6.f30508a
            long r7 = r7.m36744b()
            long r2 = r6.f30510c
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L71
            v6.w$a r7 = r6.f30508a
            long r7 = r7.m36743a()
            r6.f30513f = r7
            r6.m36735h(r4)
            goto L70
        L63:
            long r1 = r6.f30510c
            long r7 = r7 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L70
            r6.m36735h(r3)
        L70:
            r1 = r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p396v6.C11675w.m36740e(long):boolean");
    }

    /* renamed from: f */
    public void m36741f() {
        m36735h(4);
    }

    /* renamed from: g */
    public void m36742g() {
        if (this.f30508a != null) {
            m36735h(0);
        }
    }
}
