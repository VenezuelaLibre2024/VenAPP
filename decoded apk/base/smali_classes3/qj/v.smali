.class public final Lqj/v;
.super Ldj/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/v$a;,
        Lqj/v$c;,
        Lqj/v$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/j<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final a:[Ldj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ldj/n<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ldj/n;Ljj/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ldj/n<",
            "+TT;>;",
            "Ljj/e<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/j;-><init>()V

    iput-object p1, p0, Lqj/v;->a:[Ldj/n;

    iput-object p2, p0, Lqj/v;->b:Ljj/e;

    return-void
.end method


# virtual methods
.method protected u(Ldj/l;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/v;->a:[Ldj/n;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    aget-object v0, v0, v3

    new-instance v1, Lqj/n$a;

    new-instance v2, Lqj/v$a;

    invoke-direct {v2, p0}, Lqj/v$a;-><init>(Lqj/v;)V

    invoke-direct {v1, p1, v2}, Lqj/n$a;-><init>(Ldj/l;Ljj/e;)V

    invoke-interface {v0, v1}, Ldj/n;->a(Ldj/l;)V

    return-void

    :cond_0
    new-instance v2, Lqj/v$b;

    iget-object v4, p0, Lqj/v;->b:Ljj/e;

    invoke-direct {v2, p1, v1, v4}, Lqj/v$b;-><init>(Ldj/l;ILjj/e;)V

    invoke-interface {p1, v2}, Ldj/l;->b(Lgj/b;)V

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {v2}, Lqj/v$b;->h()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    aget-object p1, v0, v3

    if-nez p1, :cond_2

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "One of the sources is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1, v3}, Lqj/v$b;->c(Ljava/lang/Throwable;I)V

    return-void

    :cond_2
    iget-object v4, v2, Lqj/v$b;->c:[Lqj/v$c;

    aget-object v4, v4, v3

    invoke-interface {p1, v4}, Ldj/n;->a(Ldj/l;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
