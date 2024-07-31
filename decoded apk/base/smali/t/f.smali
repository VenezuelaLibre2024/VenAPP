.class public Lt/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ls/q;

    invoke-static {v0}, Ls/l;->a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object v0

    check-cast v0, Ls/q;

    iput-object v0, p0, Lt/f;->a:Ls/q;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt/f;->a:Ls/q;

    if-nez v0, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Ls/q;->d(Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
