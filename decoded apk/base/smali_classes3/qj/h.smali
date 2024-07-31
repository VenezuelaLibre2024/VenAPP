.class public final Lqj/h;
.super Lqj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lqj/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ldj/n<",
            "+TR;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/n;Ljj/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+",
            "Ldj/n<",
            "+TR;>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lqj/a;-><init>(Ldj/n;)V

    iput-object p2, p0, Lqj/h;->b:Ljj/e;

    return-void
.end method


# virtual methods
.method protected u(Ldj/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/a;->a:Ldj/n;

    new-instance v1, Lqj/h$a;

    iget-object v2, p0, Lqj/h;->b:Ljj/e;

    invoke-direct {v1, p1, v2}, Lqj/h$a;-><init>(Ldj/l;Ljj/e;)V

    invoke-interface {v0, v1}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
