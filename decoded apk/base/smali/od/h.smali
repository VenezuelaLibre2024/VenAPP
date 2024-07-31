.class public Lod/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lpc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpc/c<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lod/h$a;

    invoke-direct {v0}, Lod/h$a;-><init>()V

    const-class v1, Lod/g;

    invoke-static {v0, v1}, Lpc/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lpc/c;

    move-result-object v0

    return-object v0
.end method
