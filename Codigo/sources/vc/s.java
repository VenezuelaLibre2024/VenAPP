package vc;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f28907a;

    /* renamed from: b, reason: collision with root package name */
    private final ad.f f28908b;

    public s(String str, ad.f fVar) {
        this.f28907a = str;
        this.f28908b = fVar;
    }

    private File b() {
        return this.f28908b.e(this.f28907a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            sc.g.f().e("Error creating marker: " + this.f28907a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
