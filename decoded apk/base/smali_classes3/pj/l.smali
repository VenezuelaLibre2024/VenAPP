.class public final Lpj/l;
.super Ldj/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/l$a;,
        Lpj/l$b;,
        Lpj/l$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/f;-><init>()V

    iput-object p1, p0, Lpj/l;->b:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public I(Lim/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    instance-of v0, p1, Lmj/a;

    if-eqz v0, :cond_0

    new-instance v0, Lpj/l$a;

    move-object v1, p1

    check-cast v1, Lmj/a;

    iget-object v2, p0, Lpj/l;->b:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Lpj/l$a;-><init>(Lmj/a;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lpj/l$b;

    iget-object v1, p0, Lpj/l;->b:[Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lpj/l$b;-><init>(Lim/b;[Ljava/lang/Object;)V

    :goto_0
    invoke-interface {p1, v0}, Lim/b;->d(Lim/c;)V

    return-void
.end method
