package vc;

import ad.C0103f;
import java.io.File;
import java.io.IOException;
import sc.C10889g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vc.s */
/* loaded from: classes.dex */
public class C11859s {

    /* renamed from: a */
    private final String f31341a;

    /* renamed from: b */
    private final C0103f f31342b;

    public C11859s(String str, C0103f c0103f) {
        this.f31341a = str;
        this.f31342b = c0103f;
    }

    /* renamed from: b */
    private File m37895b() {
        return this.f31342b.m452e(this.f31341a);
    }

    /* renamed from: a */
    public boolean m37896a() {
        try {
            return m37895b().createNewFile();
        } catch (IOException e10) {
            C10889g.m33216f().m33220e("Error creating marker: " + this.f31341a, e10);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m37897c() {
        return m37895b().exists();
    }

    /* renamed from: d */
    public boolean m37898d() {
        return m37895b().delete();
    }
}
