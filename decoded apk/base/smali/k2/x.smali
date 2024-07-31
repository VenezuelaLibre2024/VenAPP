.class public final Lk2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lk2/u;)Lk2/m;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk2/m;

    iget-object v1, p0, Lk2/u;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lk2/u;->f()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lk2/m;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method
