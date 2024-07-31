.class public final Lqj/f;
.super Ldj/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/j<",
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

.field final b:Ljj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/g<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/u;Ljj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/u<",
            "TT;>;",
            "Ljj/g<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/j;-><init>()V

    iput-object p1, p0, Lqj/f;->a:Ldj/u;

    iput-object p2, p0, Lqj/f;->b:Ljj/g;

    return-void
.end method


# virtual methods
.method protected u(Ldj/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/f;->a:Ldj/u;

    new-instance v1, Lqj/f$a;

    iget-object v2, p0, Lqj/f;->b:Ljj/g;

    invoke-direct {v1, p1, v2}, Lqj/f$a;-><init>(Ldj/l;Ljj/g;)V

    invoke-interface {v0, v1}, Ldj/u;->c(Ldj/t;)V

    return-void
.end method
