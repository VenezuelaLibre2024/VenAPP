.class public final Lgk/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgk/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lgk/d;Lgk/f$c;)Lgk/f$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lgk/f$b;",
            ">(",
            "Lgk/d;",
            "Lgk/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgk/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lgk/b;

    invoke-interface {p0}, Lgk/f$b;->getKey()Lgk/f$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgk/b;->a(Lgk/f$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lgk/b;->b(Lgk/f$b;)Lgk/f$b;

    move-result-object p0

    instance-of p1, p0, Lgk/f$b;

    if-eqz p1, :cond_0

    move-object v1, p0

    :cond_0
    return-object v1

    :cond_1
    sget-object v0, Lgk/d;->n:Lgk/d$b;

    if-ne v0, p1, :cond_2

    const-string p1, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lgk/d;Lgk/f$c;)Lgk/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/d;",
            "Lgk/f$c<",
            "*>;)",
            "Lgk/f;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgk/b;

    if-eqz v0, :cond_1

    check-cast p1, Lgk/b;

    invoke-interface {p0}, Lgk/f$b;->getKey()Lgk/f$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgk/b;->a(Lgk/f$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lgk/b;->b(Lgk/f$b;)Lgk/f$b;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p0, Lgk/g;->a:Lgk/g;

    :cond_0
    return-object p0

    :cond_1
    sget-object v0, Lgk/d;->n:Lgk/d$b;

    if-ne v0, p1, :cond_2

    sget-object p0, Lgk/g;->a:Lgk/g;

    :cond_2
    return-object p0
.end method
