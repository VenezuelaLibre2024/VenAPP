.class public Landroidx/camera/core/impl/utils/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lh0/c;Lh0/c;)Lh0/c;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    return-object p1

    :cond_1
    invoke-static {p0}, Lh0/c$a;->b(Lh0/c;)Lh0/c$a;

    move-result-object p0

    invoke-virtual {p1}, Lh0/c;->b()Lh0/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lh0/c;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lh0/c$a;->d(Lh0/a;)Lh0/c$a;

    :cond_2
    invoke-virtual {p1}, Lh0/c;->d()Lh0/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lh0/c;->d()Lh0/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lh0/c$a;->e(Lh0/d;)Lh0/c$a;

    :cond_3
    invoke-virtual {p1}, Lh0/c;->c()Lh0/b;

    invoke-virtual {p1}, Lh0/c;->a()I

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lh0/c;->a()I

    move-result p1

    invoke-virtual {p0, p1}, Lh0/c$a;->c(I)Lh0/c$a;

    :cond_4
    invoke-virtual {p0}, Lh0/c$a;->a()Lh0/c;

    move-result-object p0

    return-object p0
.end method
