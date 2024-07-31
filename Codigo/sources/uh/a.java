package uh;

import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;
import ql.y;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27695a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final y f27696b;

    /* renamed from: c, reason: collision with root package name */
    private static final Gson f27697c;

    static {
        y.a aVar = new y.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f27696b = aVar.b(60L, timeUnit).K(60L, timeUnit).G(60L, timeUnit).a();
        f27697c = new Gson();
    }

    private a() {
    }

    public final void a() {
    }
}
