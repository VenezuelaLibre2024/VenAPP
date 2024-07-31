.class public final Ljb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljb/p;)Ljb/n;
    .locals 0

    invoke-interface {p0}, Ljb/p;->read()Lvb/c0;

    move-result-object p0

    invoke-static {p0}, Ljb/n;->e(Lvb/c0;)Ljb/n;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljb/n;Ljb/q;)V
    .locals 0

    invoke-virtual {p0}, Ljb/n;->h()Lvb/c0;

    move-result-object p0

    invoke-interface {p1, p0}, Ljb/q;->b(Lvb/c0;)V

    return-void
.end method
