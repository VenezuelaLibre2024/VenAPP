.class public final Lsj/a;
.super Ldj/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsj/a$a;
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
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/u;Ljj/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/u<",
            "TT;>;",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/s;-><init>()V

    iput-object p1, p0, Lsj/a;->a:Ldj/u;

    iput-object p2, p0, Lsj/a;->b:Ljj/d;

    return-void
.end method


# virtual methods
.method protected k(Ldj/t;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lsj/a;->a:Ldj/u;

    new-instance v1, Lsj/a$a;

    invoke-direct {v1, p0, p1}, Lsj/a$a;-><init>(Lsj/a;Ldj/t;)V

    invoke-interface {v0, v1}, Ldj/u;->c(Ldj/t;)V

    return-void
.end method
