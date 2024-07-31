package xd;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.model.MessageType;
import ud.l;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static int f31189b = 327938;

    /* renamed from: c, reason: collision with root package name */
    public static int f31190c = 327970;

    /* renamed from: a, reason: collision with root package name */
    private int f31191a = 65824;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31192a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f31192a = iArr;
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31192a[MessageType.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31192a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31192a[MessageType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String a(MessageType messageType, int i10) {
        if (i10 == 1) {
            int i11 = a.f31192a[messageType.ordinal()];
            if (i11 == 1) {
                return "MODAL_PORTRAIT";
            }
            if (i11 == 2) {
                return "CARD_PORTRAIT";
            }
            if (i11 == 3) {
                return "IMAGE_ONLY_PORTRAIT";
            }
            if (i11 != 4) {
                return null;
            }
            return "BANNER_PORTRAIT";
        }
        int i12 = a.f31192a[messageType.ordinal()];
        if (i12 == 1) {
            return "MODAL_LANDSCAPE";
        }
        if (i12 == 2) {
            return "CARD_LANDSCAPE";
        }
        if (i12 == 3) {
            return "IMAGE_ONLY_LANDSCAPE";
        }
        if (i12 != 4) {
            return null;
        }
        return "BANNER_LANDSCAPE";
    }

    public ud.l b(DisplayMetrics displayMetrics) {
        l.a q10 = ud.l.q();
        Float valueOf = Float.valueOf(0.3f);
        l.a m10 = q10.i(valueOf).j(valueOf).g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).k(48).l(Integer.valueOf(this.f31191a)).n(-1).m(-2);
        Boolean bool = Boolean.TRUE;
        return m10.d(bool).b(bool).c(bool).a();
    }

    public ud.l c(DisplayMetrics displayMetrics) {
        l.a q10 = ud.l.q();
        Float valueOf = Float.valueOf(0.3f);
        l.a m10 = q10.i(valueOf).j(valueOf).g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).k(48).l(Integer.valueOf(this.f31191a)).n(-1).m(-2);
        Boolean bool = Boolean.TRUE;
        return m10.d(bool).b(bool).c(bool).a();
    }

    public ud.l d(DisplayMetrics displayMetrics) {
        l.a m10 = ud.l.q().g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).h(Integer.valueOf(displayMetrics.widthPixels)).i(Float.valueOf(1.0f)).j(Float.valueOf(0.5f)).k(17).l(Integer.valueOf(f31190c)).n(-2).m(-2);
        Boolean bool = Boolean.FALSE;
        return m10.d(bool).b(bool).c(bool).a();
    }

    public ud.l e(DisplayMetrics displayMetrics) {
        l.a m10 = ud.l.q().g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).i(Float.valueOf(0.6f)).j(Float.valueOf(1.0f)).e(Float.valueOf(0.1f)).f(Float.valueOf(0.9f)).k(17).l(Integer.valueOf(f31190c)).n(-2).m(-2);
        Boolean bool = Boolean.FALSE;
        return m10.d(bool).b(bool).c(bool).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DisplayMetrics f(Application application) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public ud.l g(DisplayMetrics displayMetrics) {
        l.a h10 = ud.l.q().g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        l.a m10 = h10.j(valueOf).i(valueOf).k(17).l(Integer.valueOf(f31189b)).n(-2).m(-2);
        Boolean bool = Boolean.FALSE;
        return m10.d(bool).b(bool).c(bool).a();
    }

    public ud.l h(DisplayMetrics displayMetrics) {
        l.a i10 = ud.l.q().g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).h(Integer.valueOf(displayMetrics.widthPixels)).i(Float.valueOf(1.0f));
        Float valueOf = Float.valueOf(0.4f);
        l.a m10 = i10.j(valueOf).e(Float.valueOf(0.6f)).f(valueOf).k(17).l(Integer.valueOf(f31189b)).n(-1).m(-1);
        Boolean bool = Boolean.FALSE;
        return m10.d(bool).b(bool).c(bool).a();
    }

    public ud.l i(DisplayMetrics displayMetrics) {
        l.a e10 = ud.l.q().g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).i(Float.valueOf(0.6f)).e(Float.valueOf(0.1f));
        Float valueOf = Float.valueOf(0.9f);
        l.a m10 = e10.j(valueOf).f(valueOf).k(17).l(Integer.valueOf(f31189b)).n(-1).m(-2);
        Boolean bool = Boolean.FALSE;
        return m10.d(bool).b(bool).c(bool).a();
    }

    public ud.l j(DisplayMetrics displayMetrics) {
        l.a h10 = ud.l.q().g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        l.a m10 = h10.j(valueOf).i(valueOf).k(17).l(Integer.valueOf(f31189b)).n(-2).m(-2);
        Boolean bool = Boolean.FALSE;
        return m10.d(bool).b(bool).c(bool).a();
    }
}
