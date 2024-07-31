.class public Lye/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lye/h$a;Lpc/d;)Lye/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lye/h;->d(Ljava/lang/String;Lye/h$a;Lpc/d;)Lye/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lpc/c<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lye/f;->a(Ljava/lang/String;Ljava/lang/String;)Lye/f;

    move-result-object p0

    const-class p1, Lye/f;

    invoke-static {p0, p1}, Lpc/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lpc/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lye/h$a;)Lpc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lye/h$a<",
            "Landroid/content/Context;",
            ">;)",
            "Lpc/c<",
            "*>;"
        }
    .end annotation

    const-class v0, Lye/f;

    invoke-static {v0}, Lpc/c;->m(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    new-instance v1, Lye/g;

    invoke-direct {v1, p0, p1}, Lye/g;-><init>(Ljava/lang/String;Lye/h$a;)V

    invoke-virtual {v0, v1}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lpc/c$b;->d()Lpc/c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Ljava/lang/String;Lye/h$a;Lpc/d;)Lye/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lye/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lye/f;->a(Ljava/lang/String;Ljava/lang/String;)Lye/f;

    move-result-object p0

    return-object p0
.end method
