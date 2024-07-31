package ud;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private CountDownTimer f27625a;

    /* loaded from: classes.dex */
    class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f27626a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, long j11, b bVar) {
            super(j10, j11);
            this.f27626a = bVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f27626a.a();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public void a() {
        CountDownTimer countDownTimer = this.f27625a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f27625a = null;
        }
    }

    public void b(b bVar, long j10, long j11) {
        this.f27625a = new a(j10, j11, bVar).start();
    }
}
