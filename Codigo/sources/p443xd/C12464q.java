package p443xd;

import android.app.Application;
import android.view.LayoutInflater;
import de.AbstractC6896i;
import p382ud.C11543l;

/* renamed from: xd.q */
/* loaded from: classes.dex */
public class C12464q {

    /* renamed from: a */
    private final AbstractC6896i f33731a;

    /* renamed from: b */
    private final C11543l f33732b;

    /* renamed from: c */
    private final Application f33733c;

    public C12464q(AbstractC6896i abstractC6896i, C11543l c11543l, Application application) {
        this.f33731a = abstractC6896i;
        this.f33732b = c11543l;
        this.f33733c = application;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C11543l m40476a() {
        return this.f33732b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC6896i m40477b() {
        return this.f33731a;
    }

    /* renamed from: c */
    public LayoutInflater m40478c() {
        return (LayoutInflater) this.f33733c.getSystemService("layout_inflater");
    }
}
