package p443xd;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.model.MessageType;
import p382ud.C11543l;

/* renamed from: xd.g */
/* loaded from: classes.dex */
public class C12454g {

    /* renamed from: b */
    public static int f33709b = 327938;

    /* renamed from: c */
    public static int f33710c = 327970;

    /* renamed from: a */
    private int f33711a = 65824;

    /* renamed from: xd.g$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33712a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f33712a = iArr;
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33712a[MessageType.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33712a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33712a[MessageType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static String m40439a(MessageType messageType, int i10) {
        if (i10 == 1) {
            int i11 = a.f33712a[messageType.ordinal()];
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
        int i12 = a.f33712a[messageType.ordinal()];
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

    /* renamed from: b */
    public C11543l m40440b(DisplayMetrics displayMetrics) {
        C11543l.a m36154q = C11543l.m36154q();
        Float valueOf = Float.valueOf(0.3f);
        C11543l.a m36180m = m36154q.m36176i(valueOf).m36177j(valueOf).m36174g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).m36175h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).m36178k(48).m36179l(Integer.valueOf(this.f33711a)).m36181n(-1).m36180m(-2);
        Boolean bool = Boolean.TRUE;
        return m36180m.m36171d(bool).m36169b(bool).m36170c(bool).m36168a();
    }

    /* renamed from: c */
    public C11543l m40441c(DisplayMetrics displayMetrics) {
        C11543l.a m36154q = C11543l.m36154q();
        Float valueOf = Float.valueOf(0.3f);
        C11543l.a m36180m = m36154q.m36176i(valueOf).m36177j(valueOf).m36174g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).m36175h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).m36178k(48).m36179l(Integer.valueOf(this.f33711a)).m36181n(-1).m36180m(-2);
        Boolean bool = Boolean.TRUE;
        return m36180m.m36171d(bool).m36169b(bool).m36170c(bool).m36168a();
    }

    /* renamed from: d */
    public C11543l m40442d(DisplayMetrics displayMetrics) {
        C11543l.a m36180m = C11543l.m36154q().m36174g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).m36175h(Integer.valueOf(displayMetrics.widthPixels)).m36176i(Float.valueOf(1.0f)).m36177j(Float.valueOf(0.5f)).m36178k(17).m36179l(Integer.valueOf(f33710c)).m36181n(-2).m36180m(-2);
        Boolean bool = Boolean.FALSE;
        return m36180m.m36171d(bool).m36169b(bool).m36170c(bool).m36168a();
    }

    /* renamed from: e */
    public C11543l m40443e(DisplayMetrics displayMetrics) {
        C11543l.a m36180m = C11543l.m36154q().m36174g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).m36175h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).m36176i(Float.valueOf(0.6f)).m36177j(Float.valueOf(1.0f)).m36172e(Float.valueOf(0.1f)).m36173f(Float.valueOf(0.9f)).m36178k(17).m36179l(Integer.valueOf(f33710c)).m36181n(-2).m36180m(-2);
        Boolean bool = Boolean.FALSE;
        return m36180m.m36171d(bool).m36169b(bool).m36170c(bool).m36168a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public DisplayMetrics m40444f(Application application) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: g */
    public C11543l m40445g(DisplayMetrics displayMetrics) {
        C11543l.a m36175h = C11543l.m36154q().m36174g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).m36175h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        C11543l.a m36180m = m36175h.m36177j(valueOf).m36176i(valueOf).m36178k(17).m36179l(Integer.valueOf(f33709b)).m36181n(-2).m36180m(-2);
        Boolean bool = Boolean.FALSE;
        return m36180m.m36171d(bool).m36169b(bool).m36170c(bool).m36168a();
    }

    /* renamed from: h */
    public C11543l m40446h(DisplayMetrics displayMetrics) {
        C11543l.a m36176i = C11543l.m36154q().m36174g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).m36175h(Integer.valueOf(displayMetrics.widthPixels)).m36176i(Float.valueOf(1.0f));
        Float valueOf = Float.valueOf(0.4f);
        C11543l.a m36180m = m36176i.m36177j(valueOf).m36172e(Float.valueOf(0.6f)).m36173f(valueOf).m36178k(17).m36179l(Integer.valueOf(f33709b)).m36181n(-1).m36180m(-1);
        Boolean bool = Boolean.FALSE;
        return m36180m.m36171d(bool).m36169b(bool).m36170c(bool).m36168a();
    }

    /* renamed from: i */
    public C11543l m40447i(DisplayMetrics displayMetrics) {
        C11543l.a m36172e = C11543l.m36154q().m36174g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.8d))).m36175h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).m36176i(Float.valueOf(0.6f)).m36172e(Float.valueOf(0.1f));
        Float valueOf = Float.valueOf(0.9f);
        C11543l.a m36180m = m36172e.m36177j(valueOf).m36173f(valueOf).m36178k(17).m36179l(Integer.valueOf(f33709b)).m36181n(-1).m36180m(-2);
        Boolean bool = Boolean.FALSE;
        return m36180m.m36171d(bool).m36169b(bool).m36170c(bool).m36168a();
    }

    /* renamed from: j */
    public C11543l m40448j(DisplayMetrics displayMetrics) {
        C11543l.a m36175h = C11543l.m36154q().m36174g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).m36175h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float valueOf = Float.valueOf(0.8f);
        C11543l.a m36180m = m36175h.m36177j(valueOf).m36176i(valueOf).m36178k(17).m36179l(Integer.valueOf(f33709b)).m36181n(-2).m36180m(-2);
        Boolean bool = Boolean.FALSE;
        return m36180m.m36171d(bool).m36169b(bool).m36170c(bool).m36168a();
    }
}
