.class public abstract Lg6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lg6/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg6/m;",
            ">;)",
            "Lg6/j;"
        }
    .end annotation

    new-instance v0, Lg6/d;

    invoke-direct {v0, p0}, Lg6/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Ljd/a;
    .locals 2

    new-instance v0, Lld/d;

    invoke-direct {v0}, Lld/d;-><init>()V

    sget-object v1, Lg6/b;->a:Lkd/a;

    invoke-virtual {v0, v1}, Lld/d;->i(Lkd/a;)Lld/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lld/d;->j(Z)Lld/d;

    move-result-object v0

    invoke-virtual {v0}, Lld/d;->h()Ljd/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg6/m;",
            ">;"
        }
    .end annotation
.end method
