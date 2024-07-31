.class public final Loj/h;
.super Ldj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loj/h$a;
    }
.end annotation


# instance fields
.field final a:Ldj/d;

.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/d;Ljj/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/d;",
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/b;-><init>()V

    iput-object p1, p0, Loj/h;->a:Ldj/d;

    iput-object p2, p0, Loj/h;->b:Ljj/e;

    return-void
.end method


# virtual methods
.method protected p(Ldj/c;)V
    .locals 3

    new-instance v0, Lkj/e;

    invoke-direct {v0}, Lkj/e;-><init>()V

    invoke-interface {p1, v0}, Ldj/c;->b(Lgj/b;)V

    iget-object v1, p0, Loj/h;->a:Ldj/d;

    new-instance v2, Loj/h$a;

    invoke-direct {v2, p0, p1, v0}, Loj/h$a;-><init>(Loj/h;Ldj/c;Lkj/e;)V

    invoke-interface {v1, v2}, Ldj/d;->a(Ldj/c;)V

    return-void
.end method
