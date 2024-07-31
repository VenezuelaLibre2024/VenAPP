package v6;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import t6.i3;
import t6.u1;
import u6.m3;

/* loaded from: classes.dex */
public interface v {

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final u1 f28125a;

        public a(String str, u1 u1Var) {
            super(str);
            this.f28125a = u1Var;
        }

        public a(Throwable th2, u1 u1Var) {
            super(th2);
            this.f28125a = u1Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f28126a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28127b;

        /* renamed from: c, reason: collision with root package name */
        public final u1 f28128c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r4, int r5, int r6, int r7, t6.u1 r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L38
                java.lang.String r5 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r5 = ""
            L3a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.f28126a = r4
                r3.f28127b = r9
                r3.f28128c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.v.b.<init>(int, int, int, int, t6.u1, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        default void a(Exception exc) {
        }

        default void b(long j10) {
        }

        default void c() {
        }

        void d(int i10, long j10, long j11);

        void e();

        default void f() {
        }

        void onSkipSilenceEnabledChanged(boolean z10);
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f28129a;

        /* renamed from: b, reason: collision with root package name */
        public final long f28130b;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f28129a = j10;
            this.f28130b = j11;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f28131a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28132b;

        /* renamed from: c, reason: collision with root package name */
        public final u1 f28133c;

        public e(int i10, u1 u1Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f28132b = z10;
            this.f28131a = i10;
            this.f28133c = u1Var;
        }
    }

    boolean a(u1 u1Var);

    void b(i3 i3Var);

    i3 c();

    void d();

    boolean e();

    void f(c cVar);

    void flush();

    boolean g();

    void h(int i10);

    void i(y yVar);

    void j();

    default void k(m3 m3Var) {
    }

    int l(u1 u1Var);

    boolean m(ByteBuffer byteBuffer, long j10, int i10);

    void n();

    void o(u1 u1Var, int i10, int[] iArr);

    void p();

    void pause();

    long q(boolean z10);

    default void r(long j10) {
    }

    void reset();

    void s();

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    void setVolume(float f10);

    void t(v6.e eVar);

    void u();

    void v(boolean z10);
}
