.class public final Lsj/d;
.super Ldj/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsj/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/s<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/u<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/u<",
            "+TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/u;Ljj/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/u<",
            "+TT;>;",
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/u<",
            "+TT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/s;-><init>()V

    iput-object p1, p0, Lsj/d;->a:Ldj/u;

    iput-object p2, p0, Lsj/d;->b:Ljj/e;

    return-void
.end method


# virtual methods
.method protected k(Ldj/t;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lsj/d;->a:Ldj/u;

    new-instance v1, Lsj/d$a;

    iget-object v2, p0, Lsj/d;->b:Ljj/e;

    invoke-direct {v1, p1, v2}, Lsj/d$a;-><init>(Ldj/t;Ljj/e;)V

    invoke-interface {v0, v1}, Ldj/u;->c(Ldj/t;)V

    return-void
.end method
