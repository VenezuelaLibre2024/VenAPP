.class public final Lqj/g;
.super Ldj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/b;"
    }
.end annotation


# instance fields
.field final a:Ldj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/n<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;"
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
            "Ldj/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/b;-><init>()V

    iput-object p1, p0, Lqj/g;->a:Ldj/n;

    iput-object p2, p0, Lqj/g;->b:Ljj/e;

    return-void
.end method


# virtual methods
.method protected p(Ldj/c;)V
    .locals 2

    new-instance v0, Lqj/g$a;

    iget-object v1, p0, Lqj/g;->b:Ljj/e;

    invoke-direct {v0, p1, v1}, Lqj/g$a;-><init>(Ldj/c;Ljj/e;)V

    invoke-interface {p1, v0}, Ldj/c;->b(Lgj/b;)V

    iget-object p1, p0, Lqj/g;->a:Ldj/n;

    invoke-interface {p1, v0}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
