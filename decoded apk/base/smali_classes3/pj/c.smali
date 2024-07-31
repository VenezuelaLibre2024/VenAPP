.class public final Lpj/c;
.super Ldj/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/c$f;,
        Lpj/c$c;,
        Lpj/c$e;,
        Lpj/c$d;,
        Lpj/c$h;,
        Lpj/c$g;,
        Lpj/c$b;
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
.field final b:Ldj/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:Ldj/a;


# direct methods
.method public constructor <init>(Ldj/h;Ldj/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/h<",
            "TT;>;",
            "Ldj/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/f;-><init>()V

    iput-object p1, p0, Lpj/c;->b:Ldj/h;

    iput-object p2, p0, Lpj/c;->c:Ldj/a;

    return-void
.end method


# virtual methods
.method public I(Lim/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, Lpj/c$a;->a:[I

    iget-object v1, p0, Lpj/c;->c:Ldj/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Lpj/c$c;

    invoke-static {}, Ldj/f;->b()I

    move-result v1

    invoke-direct {v0, p1, v1}, Lpj/c$c;-><init>(Lim/b;I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lpj/c$f;

    invoke-direct {v0, p1}, Lpj/c$f;-><init>(Lim/b;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lpj/c$d;

    invoke-direct {v0, p1}, Lpj/c$d;-><init>(Lim/b;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lpj/c$e;

    invoke-direct {v0, p1}, Lpj/c$e;-><init>(Lim/b;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lpj/c$g;

    invoke-direct {v0, p1}, Lpj/c$g;-><init>(Lim/b;)V

    :goto_0
    invoke-interface {p1, v0}, Lim/b;->d(Lim/c;)V

    :try_start_0
    iget-object p1, p0, Lpj/c;->b:Ldj/h;

    invoke-interface {p1, v0}, Ldj/h;->a(Ldj/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lpj/c$b;->e(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
