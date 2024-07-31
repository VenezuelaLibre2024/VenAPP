.class public final Lzk/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lgk/f;)Lzk/t0;
    .locals 1

    sget-object v0, Lgk/d;->n:Lgk/d$b;

    invoke-interface {p0, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p0

    instance-of v0, p0, Lzk/t0;

    if-eqz v0, :cond_0

    check-cast p0, Lzk/t0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, Lzk/q0;->a()Lzk/t0;

    move-result-object p0

    :cond_1
    return-object p0
.end method
