.class public final Lk2/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lk2/j;Lk2/m;)Lk2/i;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lk2/m;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lk2/m;->a()I

    move-result p1

    invoke-interface {p0, v0, p1}, Lk2/j;->b(Ljava/lang/String;I)Lk2/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lk2/j;Lk2/m;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lk2/m;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lk2/m;->a()I

    move-result p1

    invoke-interface {p0, v0, p1}, Lk2/j;->f(Ljava/lang/String;I)V

    return-void
.end method
