.class public final Lpj/b;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/b$e;,
        Lpj/b$f;,
        Lpj/b$c;,
        Lpj/b$g;,
        Lpj/b$d;,
        Lpj/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lpj/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field final c:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final d:I

.field final e:Lxj/f;


# direct methods
.method public constructor <init>(Ldj/f;Ljj/e;ILxj/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;I",
            "Lxj/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p2, p0, Lpj/b;->c:Ljj/e;

    iput p3, p0, Lpj/b;->d:I

    iput-object p4, p0, Lpj/b;->e:Lxj/f;

    return-void
.end method

.method public static K(Lim/b;Ljj/e;ILxj/f;)Lim/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lim/b<",
            "-TR;>;",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;I",
            "Lxj/f;",
            ")",
            "Lim/b<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lpj/b$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 v1, 0x2

    if-eq p3, v1, :cond_0

    new-instance p3, Lpj/b$d;

    invoke-direct {p3, p0, p1, p2}, Lpj/b$d;-><init>(Lim/b;Ljj/e;I)V

    return-object p3

    :cond_0
    new-instance p3, Lpj/b$c;

    invoke-direct {p3, p0, p1, p2, v0}, Lpj/b$c;-><init>(Lim/b;Ljj/e;IZ)V

    return-object p3

    :cond_1
    new-instance p3, Lpj/b$c;

    const/4 v0, 0x0

    invoke-direct {p3, p0, p1, p2, v0}, Lpj/b$c;-><init>(Lim/b;Ljj/e;IZ)V

    return-object p3
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    iget-object v1, p0, Lpj/b;->c:Ljj/e;

    invoke-static {v0, p1, v1}, Lpj/x;->b(Lim/a;Lim/b;Ljj/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    iget-object v1, p0, Lpj/b;->c:Ljj/e;

    iget v2, p0, Lpj/b;->d:I

    iget-object v3, p0, Lpj/b;->e:Lxj/f;

    invoke-static {p1, v1, v2, v3}, Lpj/b;->K(Lim/b;Ljj/e;ILxj/f;)Lim/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Ldj/f;->a(Lim/b;)V

    return-void
.end method
