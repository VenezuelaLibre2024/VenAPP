package p382ud;

import android.os.CountDownTimer;

/* renamed from: ud.n */
/* loaded from: classes.dex */
public class C11545n {

    /* renamed from: a */
    private CountDownTimer f29948a;

    /* renamed from: ud.n$a */
    /* loaded from: classes.dex */
    class a extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ b f29949a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, long j11, b bVar) {
            super(j10, j11);
            this.f29949a = bVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f29949a.mo33273a();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    /* renamed from: ud.n$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo33273a();
    }

    /* renamed from: a */
    public void m36188a() {
        CountDownTimer countDownTimer = this.f29948a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f29948a = null;
        }
    }

    /* renamed from: b */
    public void m36189b(b bVar, long j10, long j11) {
        this.f29948a = new a(j10, j11, bVar).start();
    }
}
