.class public final Loj/g;
.super Ldj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loj/g$a;
    }
.end annotation


# instance fields
.field final a:Ldj/d;

.field final b:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-",
            "Lgj/b;",
            ">;"
        }
    .end annotation
.end field

.field final c:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field final d:Ljj/a;

.field final e:Ljj/a;

.field final f:Ljj/a;

.field final r:Ljj/a;


# direct methods
.method public constructor <init>(Ldj/d;Ljj/d;Ljj/d;Ljj/a;Ljj/a;Ljj/a;Ljj/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/d;",
            "Ljj/d<",
            "-",
            "Lgj/b;",
            ">;",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljj/a;",
            "Ljj/a;",
            "Ljj/a;",
            "Ljj/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/b;-><init>()V

    iput-object p1, p0, Loj/g;->a:Ldj/d;

    iput-object p2, p0, Loj/g;->b:Ljj/d;

    iput-object p3, p0, Loj/g;->c:Ljj/d;

    iput-object p4, p0, Loj/g;->d:Ljj/a;

    iput-object p5, p0, Loj/g;->e:Ljj/a;

    iput-object p6, p0, Loj/g;->f:Ljj/a;

    iput-object p7, p0, Loj/g;->r:Ljj/a;

    return-void
.end method


# virtual methods
.method protected p(Ldj/c;)V
    .locals 2

    iget-object v0, p0, Loj/g;->a:Ldj/d;

    new-instance v1, Loj/g$a;

    invoke-direct {v1, p0, p1}, Loj/g$a;-><init>(Loj/g;Ldj/c;)V

    invoke-interface {v0, v1}, Ldj/d;->a(Ldj/c;)V

    return-void
.end method
