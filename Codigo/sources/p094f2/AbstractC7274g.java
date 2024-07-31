package p094f2;

import androidx.work.C1522b;
import java.util.List;

/* renamed from: f2.g */
/* loaded from: classes.dex */
public abstract class AbstractC7274g {

    /* renamed from: a */
    private static final String f16305a = AbstractC7277j.m21769i("InputMerger");

    /* renamed from: a */
    public static AbstractC7274g m21760a(String str) {
        try {
            return (AbstractC7274g) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            AbstractC7277j.m21767e().mo21773d(f16305a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C1522b mo8485b(List<C1522b> list);
}
