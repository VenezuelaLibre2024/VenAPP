.class public final Lh6/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lf6/f;Lf6/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f<",
            "*>;",
            "Lf6/d;",
            ")V"
        }
    .end annotation

    instance-of v0, p0, Lh6/s;

    if-eqz v0, :cond_0

    check-cast p0, Lh6/s;

    invoke-virtual {p0}, Lh6/s;->d()Lh6/p;

    move-result-object p0

    invoke-virtual {p0, p1}, Lh6/p;->f(Lf6/d;)Lh6/p;

    move-result-object p0

    invoke-static {}, Lh6/u;->c()Lh6/u;

    move-result-object p1

    invoke-virtual {p1}, Lh6/u;->e()Lo6/r;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lo6/r;->u(Lh6/p;I)Li6/g;

    goto :goto_0

    :cond_0
    const-string p1, "ForcedSender"

    const-string v0, "Expected instance of `TransportImpl`, got `%s`."

    invoke-static {p1, v0, p0}, Ll6/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
