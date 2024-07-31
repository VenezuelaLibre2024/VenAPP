.class public final Lrj/f;
.super Lrj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/f$a;,
        Lrj/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lrj/a<",
        "TT;TU;>;"
    }
.end annotation


# instance fields
.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field final c:Z

.field final d:I

.field final e:I


# direct methods
.method public constructor <init>(Ldj/p;Ljj/e;ZII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/p<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
            "+TU;>;>;ZII)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lrj/a;-><init>(Ldj/p;)V

    iput-object p2, p0, Lrj/f;->b:Ljj/e;

    iput-boolean p3, p0, Lrj/f;->c:Z

    iput p4, p0, Lrj/f;->d:I

    iput p5, p0, Lrj/f;->e:I

    return-void
.end method


# virtual methods
.method public s(Ldj/q;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TU;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lrj/a;->a:Ldj/p;

    iget-object v1, p0, Lrj/f;->b:Ljj/e;

    invoke-static {v0, p1, v1}, Lrj/l;->b(Ldj/p;Ldj/q;Ljj/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lrj/a;->a:Ldj/p;

    new-instance v7, Lrj/f$b;

    iget-object v3, p0, Lrj/f;->b:Ljj/e;

    iget-boolean v4, p0, Lrj/f;->c:Z

    iget v5, p0, Lrj/f;->d:I

    iget v6, p0, Lrj/f;->e:I

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lrj/f$b;-><init>(Ldj/q;Ljj/e;ZII)V

    invoke-interface {v0, v7}, Ldj/p;->d(Ldj/q;)V

    return-void
.end method
