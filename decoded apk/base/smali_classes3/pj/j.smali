.class public final Lpj/j;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/j$a;
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
            "Ldj/n<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final d:Z

.field final e:I


# direct methods
.method public constructor <init>(Ldj/f;Ljj/e;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+",
            "Ldj/n<",
            "+TR;>;>;ZI)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p2, p0, Lpj/j;->c:Ljj/e;

    iput-boolean p3, p0, Lpj/j;->d:Z

    iput p4, p0, Lpj/j;->e:I

    return-void
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    new-instance v1, Lpj/j$a;

    iget-object v2, p0, Lpj/j;->c:Ljj/e;

    iget-boolean v3, p0, Lpj/j;->d:Z

    iget v4, p0, Lpj/j;->e:I

    invoke-direct {v1, p1, v2, v3, v4}, Lpj/j$a;-><init>(Lim/b;Ljj/e;ZI)V

    invoke-virtual {v0, v1}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
