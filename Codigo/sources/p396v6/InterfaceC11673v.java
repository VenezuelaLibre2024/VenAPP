package p396v6;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import p361t6.C11047i3;
import p361t6.C11108u1;
import p376u6.C11391m3;

/* renamed from: v6.v */
/* loaded from: classes.dex */
public interface InterfaceC11673v {

    /* renamed from: v6.v$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a */
        public final C11108u1 f30487a;

        public a(String str, C11108u1 c11108u1) {
            super(str);
            this.f30487a = c11108u1;
        }

        public a(Throwable th2, C11108u1 c11108u1) {
            super(th2);
            this.f30487a = c11108u1;
        }
    }

    /* renamed from: v6.v$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a */
        public final int f30488a;

        /* renamed from: b */
        public final boolean f30489b;

        /* renamed from: c */
        public final C11108u1 f30490c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r4, int r5, int r6, int r7, p361t6.C11108u1 r8, boolean r9, java.lang.Exception r10) {
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
                r3.f30488a = r4
                r3.f30489b = r9
                r3.f30490c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p396v6.InterfaceC11673v.b.<init>(int, int, int, int, t6.u1, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: v6.v$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        default void mo36663a(Exception exc) {
        }

        /* renamed from: b */
        default void mo36664b(long j10) {
        }

        /* renamed from: c */
        default void mo36665c() {
        }

        /* renamed from: d */
        void mo36666d(int i10, long j10, long j11);

        /* renamed from: e */
        void mo36667e();

        /* renamed from: f */
        default void mo36668f() {
        }

        void onSkipSilenceEnabledChanged(boolean z10);
    }

    /* renamed from: v6.v$d */
    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: a */
        public final long f30491a;

        /* renamed from: b */
        public final long f30492b;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f30491a = j10;
            this.f30492b = j11;
        }
    }

    /* renamed from: v6.v$e */
    /* loaded from: classes.dex */
    public static final class e extends Exception {

        /* renamed from: a */
        public final int f30493a;

        /* renamed from: b */
        public final boolean f30494b;

        /* renamed from: c */
        public final C11108u1 f30495c;

        public e(int i10, C11108u1 c11108u1, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f30494b = z10;
            this.f30493a = i10;
            this.f30495c = c11108u1;
        }
    }

    /* renamed from: a */
    boolean mo36561a(C11108u1 c11108u1);

    /* renamed from: b */
    void mo36562b(C11047i3 c11047i3);

    /* renamed from: c */
    C11047i3 mo36563c();

    /* renamed from: d */
    void mo36564d();

    /* renamed from: e */
    boolean mo36565e();

    /* renamed from: f */
    void mo36566f(c cVar);

    void flush();

    /* renamed from: g */
    boolean mo36567g();

    /* renamed from: h */
    void mo36568h(int i10);

    /* renamed from: i */
    void mo36569i(C11679y c11679y);

    /* renamed from: j */
    void mo36570j();

    /* renamed from: k */
    default void mo36571k(C11391m3 c11391m3) {
    }

    /* renamed from: l */
    int mo36572l(C11108u1 c11108u1);

    /* renamed from: m */
    boolean mo36573m(ByteBuffer byteBuffer, long j10, int i10);

    /* renamed from: n */
    void mo36574n();

    /* renamed from: o */
    void mo36575o(C11108u1 c11108u1, int i10, int[] iArr);

    /* renamed from: p */
    void mo36576p();

    void pause();

    /* renamed from: q */
    long mo36577q(boolean z10);

    /* renamed from: r */
    default void m36722r(long j10) {
    }

    void reset();

    /* renamed from: s */
    void mo36578s();

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    void setVolume(float f10);

    /* renamed from: t */
    void mo36579t(C11639e c11639e);

    /* renamed from: u */
    void mo36580u();

    /* renamed from: v */
    void mo36581v(boolean z10);
}
