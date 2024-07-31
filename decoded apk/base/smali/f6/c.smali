.class public abstract Lf6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/Object;)Lf6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lf6/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lf6/a;

    const/4 v1, 0x0

    sget-object v2, Lf6/d;->DEFAULT:Lf6/d;

    invoke-direct {v0, v1, p0, v2}, Lf6/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Lf6/d;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Object;)Lf6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lf6/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lf6/a;

    const/4 v1, 0x0

    sget-object v2, Lf6/d;->VERY_LOW:Lf6/d;

    invoke-direct {v0, v1, p0, v2}, Lf6/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Lf6/d;)V

    return-object v0
.end method

.method public static f(Ljava/lang/Object;)Lf6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lf6/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lf6/a;

    const/4 v1, 0x0

    sget-object v2, Lf6/d;->HIGHEST:Lf6/d;

    invoke-direct {v0, v1, p0, v2}, Lf6/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Lf6/d;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract c()Lf6/d;
.end method
